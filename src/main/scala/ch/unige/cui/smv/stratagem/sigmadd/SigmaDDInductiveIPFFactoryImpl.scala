package ch.unige.cui.smv.stratagem.sigmadd

import scala.collection.immutable.HashMap

import ch.unige.cui.smv.stratagem.ipf.IPFAbstractFactory
import ch.unige.cui.smv.stratagem.util.OperationCache

/**
 * This factory represents the tail of a SigmaDD.
 */
class SigmaDDInductiveIPFFactoryImpl extends IPFAbstractFactory {

  type CanonicalType = InductiveIPFImpl
  
  /**
   * The factory producing SigmaDDs.
   */
  val sigmaDDFactory = new SigmaDDFactoryImpl
  
  type SigmaDDType = sigmaDDFactory.SigmaDDImpl
  

  type FromType = Map[SigmaDDType, InductiveIPFImpl]

  protected def makeFrom(alpha: AnyRef): InductiveIPFImpl = alpha match {
    case a: HashMap[SigmaDDType, InductiveIPFImpl] @unchecked => new InductiveIPFImpl(a) with OperationCache
    case _ => throw new IllegalArgumentException("Unable to create IPF")
  }

  /**
   * This class implements an inductive injective partitioned function. It is 
   * meant to encode n-ary relation of terms of a SigmaDD, i.e. the set of 
   * arguments.
   */
  private [sigmadd] class InductiveIPFImpl private[sigmadd] (
    val alpha: Map[SigmaDDType, InductiveIPFImpl]) extends IPF {
    type LatticeElementType = InductiveIPFImpl
    type DomainType = SigmaDDType
    type ImageType = InductiveIPFImpl

    type DomainTypeElt = String
    type ImageTypeElt = String

    override val hashCode = alpha ##

    def asBinaryRelation: Set[(DomainTypeElt, ImageTypeElt)] = throw new NotImplementedError

    override def equals(obj: Any) = obj match {
      case o: InductiveIPFImpl => (o eq this) || this.alpha == o.alpha
      case _ => false
    }

    def v(that: InductiveIPFImpl): InductiveIPFImpl = create(alphaUnion(this.alpha, that.alpha))

    def ^(that: InductiveIPFImpl): InductiveIPFImpl = create(alphaIntersection(this.alpha, that.alpha))

    def \(that: InductiveIPFImpl): InductiveIPFImpl = create(alphaDifference(this.alpha, that.alpha))

    def bottomElement = create(Map.empty)
  }
}