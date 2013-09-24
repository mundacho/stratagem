package ch.unige.cui.smv.stratagem.sigmadd

import scala.collection.immutable.HashMap
import ch.unige.cui.smv.stratagem.ipf.IPFAbstractFactory
import ch.unige.cui.smv.stratagem.util.OperationCache
import ch.unige.cui.smv.stratagem.util.StringSetWrapperFactory
import ch.unige.cui.smv.stratagem.util.Element


/**
 * This class implements an IPF factory to be embedded in SigmaDDs.
 * The IPFs produced by this factory can have other IPFs as value.
 */
abstract class SigmaDDIPFFactoryImpl extends IPFAbstractFactory {
  
  /**
   * The inductive IPF factory.
   */
  val inductiveIPFFactory:SigmaDDInductiveIPFFactoryImpl
  
  type InductiveIPFType = inductiveIPFFactory.InductiveIPFImpl
  
  type CanonicalType = IPFImpl

  type FromType = Map[StringSetWrapperFactory.StringSetWrapper, InductiveIPFType]

  protected def makeFrom(alpha: AnyRef): IPFImpl = alpha match {
    case a: HashMap[StringSetWrapperFactory.StringSetWrapper, InductiveIPFType] @unchecked => new IPFImpl(a) with OperationCache
    case _ => throw new IllegalArgumentException("Unable to create IPF")
  }
  
  
  def create(operator:String, iipf:InductiveIPFType):IPFImpl = create(HashMap(StringSetWrapperFactory.create(Set(operator)) -> iipf))

  /**
   * This class implements an inductive injective partitioned function. It is 
   * meant to encode n-ary relation of terms of a SigmaDD, i.e. the set of 
   * arguments.
   * @param alpha the mapping of this IPF.
   */
  private [sigmadd] class IPFImpl private[sigmadd] (
    val alpha: Map[StringSetWrapperFactory.StringSetWrapper, InductiveIPFType]) extends IPF {
    type LatticeElementType = IPFImpl
    type DomainType = StringSetWrapperFactory.StringSetWrapper
    type ImageType = InductiveIPFType

    type DomainTypeElt = String
    type ImageTypeElt = String

    override val hashCode = alpha ##

    def asBinaryRelation: Set[(DomainTypeElt, ImageTypeElt)] = throw new NotImplementedError
    
    def asElements = {
      alpha.map((e) => {Element.elem(e._1.toString) beside Element.elem("-->") beside e._2.asElements })
    }.reduce(_ above Element.elem(" ") above  _)

    override def equals(obj: Any) = obj match {
      case o: IPFImpl => (o eq this) || this.alpha == o.alpha
      case _ => false
    }

    def v(that: IPFImpl): IPFImpl = create(alphaUnion(this.alpha, that.alpha))

    def ^(that: IPFImpl): IPFImpl = create(alphaIntersection(this.alpha, that.alpha))

    def \(that: IPFImpl): IPFImpl = create(alphaDifference(this.alpha, that.alpha))

    def bottomElement = create(HashMap.empty)
  }
}