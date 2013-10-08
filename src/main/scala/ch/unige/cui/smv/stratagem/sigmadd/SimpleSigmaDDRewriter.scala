/*
Stratagem is a model checker for transition systems described using rewriting
rules and strategies.
Copyright (C) 2013 - SMV@Geneva University.
Program written by Edmundo Lopez Bobeda <edmundo [at] lopezbobeda.net>.
This program is free software; you can redistribute it and/or modify
it under the  terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.util.StringSetWrapperFactory
import ch.unige.cui.smv.stratagem.adt.Equation

/**
 * This class implements a SigmaDDRewriter for simple strategies.
 */
private[sigmadd] class SimpleSigmaDDRewriter(val simpleStrategy: SimpleStrategy) extends SigmaDDRewriter {

  type SubstitutionMap = Map[String, SigmaDDImplType]

  private def matchSigmaDD(term: ATerm)(sigmaDD: SigmaDDImplType)(implicit workingMap: SubstitutionMap, listOpMaps: List[SubstitutionMap]): Option[List[SubstitutionMap]] = {
    if (term.isVariable) {
      assert(!workingMap.isDefinedAt(term.symbol)) // working map does not have that variable yet
      // successful variable match, the working map is added to the list only
      // when we finish parsing the term, i.e. we get to Nil in the list of subterms.
      val newWorkingMap = workingMap + (term.symbol -> sigmaDD)
      Some(newWorkingMap :: listOpMaps)
    } else {
      // we separate the term
      val (operationSymbol, listOfSubTerms) = ATerm.unapply(term).get
      // we find the first key in alpha s.t. the operator of the term matches
      // one of the operators in the SigmaDD, this translates to a non-empty
      // intersection. This works because the set of keys of alpha is a
      // partition
      sigmaDD.iipf.alpha.find((entry) => (entry._1 ^ StringSetWrapperFactory.create(Set(operationSymbol))) != entry._1.bottomElement) match {
        // for that key we try to match its tail
        case Some(entry) => matchIIPF(listOfSubTerms)(entry._2) // entry is the element where we can do some further matching.
        case None => None
      }
    }
  }

  private def matchIIPF(terms: List[ATerm])(iipf: SigmaDDFactoryImpl.ipfFactory.InductiveIPFType)(implicit map: SubstitutionMap, listOfMaps: List[SubstitutionMap]): Option[List[SubstitutionMap]] = {
    terms match {
      case Nil => Some(map :: listOfMaps) // we finished to match, we return the map we created in the list of maps
      case headTerm :: tail => iipf match { // we still have something to match
        case SigmaDDFactoryImpl.ipfFactory.inductiveIPFFactory.TopIPF => throw new IllegalStateException("Either a term or a SigmaDD is not well formed.") // the SigmaDD is not well formed
        case e: SigmaDDFactoryImpl.ipfFactory.inductiveIPFFactory.InductiveIPFImpl => {
          // A pattern can span several elements of the partition formed by the key elements, so we need to collect different maps for each path

          // this line collects all elements of the alpha of e where the match
          // succeeded (i.e. returned something) on the SigmaDD of the map's key
          val listOfMatchedIPFAndReturnedListOfMap = e.alpha.view.toList.collect((entry) => matchSigmaDD(headTerm)(entry._1) match { case Some(returnedListOfMap) => (entry, returnedListOfMap) })
          // on the elements that matched we do the following
          val listOfMapsToReturn = listOfMatchedIPFAndReturnedListOfMap.flatMap((element) => {
            val (entryOfIPF, returnedListOfMaps) = element
            val tailOfIPF = entryOfIPF._2
            // we take the list of maps returned for each branch of the SigmaDD
            // and collect all the elements where the matching function matches the tail
            // each time we use one of the substitution maps that we had obtained before.
            returnedListOfMaps.view.collect((x) => matchIIPF(tail)(tailOfIPF)(x, listOfMaps) match { case Some(result) => result }).flatten
          })
          listOfMapsToReturn match {
            case Nil => None
            case _ => Some(listOfMapsToReturn) // finally, if the list is not empty, we return it
          }
        }
      }
    }
  }

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
    val firstListOfSubstitutions = simpleStrategy.equations.collectFirst((x: Equation) => matchSigmaDD(x.leftSide)(sigmaDD)(Map.empty, Nil) match { case Some(result) => result })
    firstListOfSubstitutions match {
      case None => None // no possible substitutions, we return the same SigmaDD
      case Some(listOfSubstitutions) => {
        var sigmaDDToRemove = sigmaDD.bottomElement
        var sigmaDDToAdd = sigmaDD.bottomElement
        for (
          equation <- simpleStrategy.equations;
          substitution <- listOfSubstitutions
        ) {
          sigmaDDToRemove = sigmaDDToRemove v SigmaDDFactoryImpl.instantiate(equation.leftSide, substitution)
          sigmaDDToAdd = sigmaDDToAdd v SigmaDDFactoryImpl.instantiate(equation.rightSide, substitution)
        }
        Some((sigmaDD \ sigmaDDToRemove) v sigmaDDToAdd)
      }
    }
  }
}

