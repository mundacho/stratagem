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

import scala.language.postfixOps
import ch.unige.cui.smv.stratagem.util.CanonicalFactory
import ch.unige.cui.smv.stratagem.util.Element
import ch.unige.cui.smv.stratagem.util.LatticeElement
import ch.unige.cui.smv.stratagem.util.OperationCache
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SigmaDDRewriterFactory
import ch.unige.smv.cui.metamodel.adt.ATerm
import ch.unige.smv.cui.metamodel.adt.ASort
import ch.unige.smv.cui.metamodel.adt.Signature
import ch.unige.cui.smv.stratagem.adt.ATermHelper
import ch.unige.cui.smv.stratagem.adt.ASortHelper

/**
 * This factory creates SigmaDDs.
 */
case class SigmaDDFactoryImpl(signature: Signature) extends CanonicalFactory {

  lazy val sigmaDDIPFFactory = new SigmaDDIPFFactoryImpl(
    new SigmaDDInductiveIPFFactoryImpl(this))

  val sigmaDDInductiveIPFFactory = sigmaDDIPFFactory.sigmaDDInductiveFactory

  type CanonicalType = SigmaDDImpl

  type FromType = (ASort, IPFType)

  type IPFType = SigmaDDIPFFactoryImpl#IPFImpl

  lazy val rewriterFactory = new SigmaDDRewriterFactory(this)

  def cleanAllCaches {
    rewriterFactory.resetOperationCaches
    this.cleanUnicityTable
    sigmaDDInductiveIPFFactory.cleanUnicityTable
    sigmaDDIPFFactory.cleanUnicityTable
  }

  /**
   * Creates a SigmaDD from a term.
   * @param term the input term.
   * @return the SigmaDD representing the term.
   */
  def create(term: ATerm): SigmaDDFactoryImpl#SigmaDDImpl = {
    require(!term.isVariable, "Cannot create a SigmaDD containing a variable.")
    term match {
      case ATermHelper(opSymbol, terms) => create((term.getSort(), sigmaDDIPFFactory.create(opSymbol,
        sigmaDDInductiveIPFFactory.create(terms))))
    }
  }

  /**
   * Creates a SigmaDD from a term.
   * @param term the input term.
   * @param variables a map mapping variable string names to SigmaDDs.
   * @return the SigmaDD representing the term.
   */
  def instantiate(term: ATerm, variables: Map[String, SigmaDDFactoryImpl#SigmaDDImpl]): SigmaDDFactoryImpl#SigmaDDImpl = {
    if (term.isVariable) {
      variables(term.getSymbol())
    } else {
      term match {
        case ATermHelper(opSymbol, terms) => create((term.getSort(), sigmaDDIPFFactory.create(
          opSymbol, sigmaDDInductiveIPFFactory.instanciate(terms,
            variables))))
      }
    }

  }

  protected def makeFrom(tuple: AnyRef): SigmaDDImpl = tuple match {
    case a: (ASort, IPFType) @unchecked => new SigmaDDImpl(a._1, a._2) with OperationCache
    case _ => throw new IllegalArgumentException("Unable to create SigmaDD")
  }

  /**
   * The SigmaDDs created by this factory.
   * @param sort the sort of this SigmaDD
   * @param iipf the iipf that encodes the mapping of this SigmaDD.
   */
  private[sigmadd] class SigmaDDImpl(
    val sort: ASort,
    val iipf: IPFType) extends LatticeElement {
    type LatticeElementType = SigmaDDImpl

    def wrapped = createWrapped(this)

    override lazy val hashCode = (sort, iipf) ##

    lazy val size = iipf.size

    override def equals(that: Any) = that match {
      case o: SigmaDDImpl => (o eq this) || (ASortHelper.findCommonParent(this.sort, o.sort) != None && this.iipf == o.iipf)
      case _ => false
    }

    def asElements = Element.elem(sort.getName()) beside Element.elem("--") beside iipf.asElements

    override def toString = asElements.toString

    def v(that: SigmaDDImpl): SigmaDDImpl = {
      if (that != that.bottomElement) {
        //        val newSort = ASort.findCommonParent(this.sort, that.sort)
        val iipfUnion = this.iipf v that.iipf
        val allSorts = for (
          setWrapper <- iipfUnion.alpha.keySet;
          symbol <- setWrapper.set
        ) yield signature.getOperationByName(symbol).getReturnType()
        val newSort = ASortHelper.findCommonParent(allSorts.toArray: _*)
        newSort match {
          case Some(commonParent) => {
            if ((commonParent == this.sort) && (iipfUnion eq this.iipf)) this else create(commonParent, iipfUnion)
          }
          case None => throw new IllegalStateException("Invalid sort, trying to join SigmaDD of sort %s with SigmaDD of sort %s".format(this.sort.getName(), that.sort.getName()))
        }
      } else this
    }

    def ^(that: SigmaDDImpl): SigmaDDImpl = {
      if (that != that.bottomElement) {
        val iipfInter = this.iipf ^ that.iipf
        if (iipfInter != iipfInter.bottomElement) {
          val allSorts = for (
            setWrapper <- iipfInter.alpha.keySet;
            symbol <- setWrapper.set
          ) yield signature.getOperationByName(symbol).getReturnType()
          val newSort = ASortHelper.findCommonParent(allSorts.toArray: _*)
          newSort match {
            case Some(commonParent) => {
              if ((commonParent == this.sort) && (iipfInter eq this.iipf)) this else create(commonParent, iipfInter)
            }
            case None => throw new IllegalStateException
          }
        } else this.bottomElement
      } else this.bottomElement
    }
    def \(that: SigmaDDImpl): SigmaDDImpl = {
      if (that != that.bottomElement) {
        val iipfDiff = this.iipf \ that.iipf
        if (iipfDiff != iipfDiff.bottomElement) {
          val allSorts = for (
            setWrapper <- iipfDiff.alpha.keySet;
            symbol <- setWrapper.set
          ) yield signature.getOperationByName(symbol).getReturnType()
          val newSort = ASortHelper.findCommonParent(allSorts.toArray: _*)
          newSort match {
            case Some(commonParent) => {
              if ((commonParent == this.sort) && (iipfDiff eq this.iipf)) this else create(commonParent, iipfDiff)
            }
            case None => throw new IllegalStateException
          }
        } else this.bottomElement
      } else this
    }

    lazy val bottomElement = create(ASortHelper.findSuperParentSort(sort), this.iipf.bottomElement)

  }
}