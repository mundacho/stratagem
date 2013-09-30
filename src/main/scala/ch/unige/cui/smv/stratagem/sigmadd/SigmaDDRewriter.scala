package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.util.StringSetWrapperFactory
import ch.unige.cui.smv.stratagem.adt.Equation

abstract class SimpleSigmaDDRewriter(val simpleStrategy: SimpleStrategy) {
  
  val sigmaDDFactory: SigmaDDFactoryImpl
  
  type SigmaDDImplType = sigmaDDFactory.SigmaDDImpl

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

  private def matchIIPF(terms: List[ATerm])(iipf: sigmaDDFactory.ipfFactory.InductiveIPFType)(implicit map: SubstitutionMap, listOfMaps: List[SubstitutionMap]): Option[List[SubstitutionMap]] = {
    terms match {
      case Nil => Some(map :: listOfMaps) // we finished to match, we return the map we created in the list of maps
      case headTerm :: tail => iipf match { // we still have something to match
        case sigmaDDFactory.ipfFactory.inductiveIPFFactory.TopIPF => throw new IllegalStateException("Either a term or a SigmaDD is not well formed.") // the SigmaDD is not well formed
        case e: sigmaDDFactory.ipfFactory.inductiveIPFFactory.InductiveIPFImpl => {
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

  def apply(sigmaDD: SigmaDDImplType): SigmaDDImplType = {
    val firstListOfSubstitutions = simpleStrategy.equations.collectFirst((x: Equation) => matchSigmaDD(x.leftSide)(sigmaDD)(Map.empty, Nil) match { case Some(result) => result })
    firstListOfSubstitutions match {
      case None => sigmaDD // no possible substitutions, we return the same SigmaDD
      case Some(listOfSubstitutions) => {
        var sigmaDDToRemove = sigmaDD.bottomElement
        var sigmaDDToAdd = sigmaDD.bottomElement
        for (
          equation <- simpleStrategy.equations;
          substitution <- listOfSubstitutions
        ) {
          sigmaDDToRemove = sigmaDDToRemove v sigmaDDFactory.instantiate(equation.leftSide, substitution)
          sigmaDDToAdd = sigmaDDToAdd v sigmaDDFactory.instantiate(equation.rightSide, substitution)
        }
        (sigmaDD \ sigmaDDToRemove) v sigmaDDToAdd
      }
    }
  }
}

