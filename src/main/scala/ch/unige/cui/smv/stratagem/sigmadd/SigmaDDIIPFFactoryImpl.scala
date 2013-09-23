package ch.unige.cui.smv.stratagem.sigmadd

import scala.collection.immutable.HashMap

import ch.unige.cui.smv.stratagem.ipf.IPFAbstractFactory
import ch.unige.cui.smv.stratagem.util.OperationCache

class SigmaDDIIPFFactoryImpl extends IPFAbstractFactory{

  type CanonicalType = IIPFImplementation
  
  val sigmaDDFactory = new SigmaDDFactoryImpl
  
  type SigmaDDType = sigmaDDFactory.SigmaDDImplementation
  

  type FromType = Map[SigmaDDType, IIPFImplementation]

  protected def makeFrom(alpha: AnyRef): IIPFImplementation = alpha match {
    case a: HashMap[SigmaDDType, IIPFImplementation] @unchecked => new IIPFImplementation(a) with OperationCache
    case _ => throw new IllegalArgumentException("Unable to create IPF")
  }

  /**
   * This class implements an inductive injective partitioned function. It is 
   * meant to encode n-ary relation of terms of a SigmaDD, i.e. the set of 
   * arguments.
   */
  private [sigmadd] class IIPFImplementation private[sigmadd] (
    val alpha: Map[SigmaDDType, IIPFImplementation]) extends IPF {
    type LatticeElementType = IIPFImplementation
    type DomainType = SigmaDDType
    type ImageType = IIPFImplementation

    type DomainTypeElt = String
    type ImageTypeElt = String

    override val hashCode = alpha ##

    def asBinaryRelation: Set[(DomainTypeElt, ImageTypeElt)] = throw new NotImplementedError

    override def equals(obj: Any) = obj match {
      case o: IIPFImplementation => (o eq this) || this.alpha == o.alpha
      case _ => false
    }

    def v(that: IIPFImplementation): IIPFImplementation = create(alphaUnion(this.alpha, that.alpha))

    def ^(that: IIPFImplementation): IIPFImplementation = create(alphaIntersection(this.alpha, that.alpha))

    def \(that: IIPFImplementation): IIPFImplementation = create(alphaDifference(this.alpha, that.alpha))

    def bottomElement = create(Map.empty)
  }
}