package ch.unige.cui.smv.sigmadd.impl.basic

import scala.collection.immutable.HashMap

/**
 * This class implements an IPF factory to be embedded in SigmaDDs.
 * The IPFs produced by this factory can have other IPFs as value.
 */
class SigmaDDIPFFactoryImpl extends IPFAbstractFactory {

  type CanonicalType = IPFImplementation

  type FromType = Map[StringSetWrapperFactory.StringSetWrapper, IPFImplementation]

  protected def makeFrom(alpha: AnyRef): IPFImplementation = alpha match {
    case a: HashMap[StringSetWrapperFactory.StringSetWrapper, IPFImplementation] @unchecked => new IPFImplementation(a) with OperationCache
    case _ => throw new IllegalArgumentException("Unable to create IPF")
  }

  /**
   * This class implements an inductive injective partitioned function. It is 
   * meant to encode n-ary relation of terms of a SigmaDD, i.e. the set of 
   * arguments.
   */
  private [basic] class IPFImplementation private[basic] (
    val alpha: Map[StringSetWrapperFactory.StringSetWrapper, IPFImplementation]) extends IPF {
    type LatticeElementType = IPFImplementation
    type DomainType = StringSetWrapperFactory.StringSetWrapper
    type ImageType = IPFImplementation

    type DomainTypeElt = String
    type ImageTypeElt = String

    override val hashCode = alpha ##

    def asBinaryRelation: Set[(DomainTypeElt, ImageTypeElt)] = throw new NotImplementedError

    override def equals(obj: Any) = obj match {
      case o: IPFImplementation => (o eq this) || this.alpha == o.alpha
      case _ => false
    }

    def v(that: IPFImplementation): IPFImplementation = create(alphaUnion(this.alpha, that.alpha))

    def ^(that: IPFImplementation): IPFImplementation = create(alphaIntersection(this.alpha, that.alpha))

    def \(that: IPFImplementation): IPFImplementation = create(alphaDifference(this.alpha, that.alpha))

    def bottomElement = create(Map.empty)
  }
}