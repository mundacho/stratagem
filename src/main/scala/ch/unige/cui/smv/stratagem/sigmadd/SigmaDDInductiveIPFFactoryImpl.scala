package ch.unige.cui.smv.stratagem.sigmadd

import scala.collection.immutable.HashMap
import ch.unige.cui.smv.stratagem.ipf.IPFAbstractFactory
import ch.unige.cui.smv.stratagem.util.OperationCache
import ch.unige.cui.smv.stratagem.util.Element
import ch.unige.cui.smv.stratagem.adt.ATerm

/**
 * This factory represents the tail of a SigmaDD.
 */
abstract class SigmaDDInductiveIPFFactoryImpl extends IPFAbstractFactory {

  type CanonicalType = InductiveIPFImpl

  type SigmaDDType = SigmaDDFactoryImpl.SigmaDDImpl

  type FromType = Map[SigmaDDType, InductiveIPFImpl]

  protected def makeFrom(alpha: AnyRef): InductiveIPFImpl = alpha match {
    case a: HashMap[SigmaDDType, InductiveIPFImpl] @unchecked => new InductiveIPFImpl(a) with OperationCache
    case _ => throw new IllegalArgumentException("Unable to create IPF")
  }
  
  /**
   * Creates an inductive IPF from a list of terms.
   * 
   * @param terms the list of terms
   * @return the inductive IPF representing that set of terms n-ary relations.
   */
  def create(terms:List[ATerm]):InductiveIPFImpl = terms match {
    case Nil => TopIPF
    case x::tail => create(HashMap(SigmaDDFactoryImpl.create(x) -> create(tail)))
  }
  
    /**
   * Instanciate a list of terms with a set of variables.
   * 
   * @param terms the list of terms
   * @param variables the map containing the values for the instanciation of the variables.
   * @return the inductive IPF representing that set of terms n-ary relations.
   */
  def instanciate(terms:List[ATerm], variables:Map[String, SigmaDDType]):InductiveIPFImpl = terms match {
    case Nil => TopIPF
    case x::tail => create(HashMap(SigmaDDFactoryImpl.instantiate(x, variables) -> instanciate(tail, variables)))
  }
  

  /**
   * This class implements an inductive injective partitioned function. It is
   * meant to encode n-ary relation of terms of a SigmaDD, i.e. the set of
   * arguments.
   */
  private[sigmadd] class InductiveIPFImpl private[sigmadd] (
    val alpha: Map[SigmaDDType, InductiveIPFImpl]) extends IPF {
    type LatticeElementType = InductiveIPFImpl
    type DomainType = SigmaDDType
    type ImageType = InductiveIPFImpl

    type DomainTypeElt = String
    type ImageTypeElt = String

    override val hashCode = alpha ##

    def asBinaryRelation: Set[(DomainTypeElt, ImageTypeElt)] = throw new NotImplementedError

    def asElements:Element = alpha.map((e) => {
     (e._1.asElements above ( Element.elem("IIPF") beside (Element.elem('-', e._1.asElements.width, 1) beside Element.elem("-->")))  beside e._2.asElements )
    	}).reduce(_ above _)
 
    
    override def equals(obj: Any) = obj match {
      case o: InductiveIPFImpl => (o eq this) || this.alpha == o.alpha
      case _ => false
    }

    def v(that: InductiveIPFImpl): InductiveIPFImpl = that match {
      case TopIPF => TopIPF
      case _ => create(alphaUnion(this.alpha, that.alpha))
    }

    def ^(that: InductiveIPFImpl): InductiveIPFImpl = that match {
      case TopIPF => this
      case _ => create(alphaIntersection(this.alpha, that.alpha))
    }

    def \(that: InductiveIPFImpl): InductiveIPFImpl = that match {
      case TopIPF => TopIPF
      case _ => create(alphaDifference(this.alpha, that.alpha))
    }

    def bottomElement = create(HashMap.empty:FromType)
  }

  /**
   * This object represents the top element of the lattice of SigmaDDs. 
   * It is used as a terminal.
   */
  object TopIPF extends InductiveIPFImpl(HashMap.empty) {
    
    override def toString = "[1]"

    override def v(that: InductiveIPFImpl): InductiveIPFImpl = TopIPF

    override def ^(that: InductiveIPFImpl): InductiveIPFImpl = that

    override def \(that: InductiveIPFImpl): InductiveIPFImpl = that match {
      case TopIPF => bottomElement
      case _ => bottomElement
    }
    override val hashCode = (alpha ##) + 1

     override def asElements:Element = Element.elem("[1]") 
    
    override def equals(obj: Any) = obj match {
      case o:AnyRef => o eq this
      case _ => false
    }
  }
}