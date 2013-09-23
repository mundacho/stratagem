package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.adt.ASort
import ch.unige.cui.smv.stratagem.util.CanonicalFactory
import ch.unige.cui.smv.stratagem.util.LatticeElement
import ch.unige.cui.smv.stratagem.util.OperationCache

/**
 * This factory creates SigmaDDs.
 */
class SigmaDDFactoryImpl extends CanonicalFactory {
  type CanonicalType = SigmaDDImpl

  type FromType = (ASort, IPFType)

  val ipfFactory = new SigmaDDIPFFactoryImpl
  type IPFType = ipfFactory.IPFImpl

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

    def v(that: SigmaDDImpl): SigmaDDImpl = {
      val newSort = ASort.findCommonParent(this.sort, that.sort)
      create(newSort, this.iipf v that.iipf)
    }
    def ^(that: SigmaDDImpl): SigmaDDImpl = {
      val newSort = ASort.findCommonParent(this.sort, that.sort)
      create(newSort, this.iipf ^ that.iipf)
    }
    def \(that: SigmaDDImpl): SigmaDDImpl = {
      val newSort = ASort.findCommonParent(this.sort, that.sort)
      create(newSort, this.iipf \ that.iipf)
    }
    
    def bottomElement = create(sort, this.iipf.bottomElement)

  }
}