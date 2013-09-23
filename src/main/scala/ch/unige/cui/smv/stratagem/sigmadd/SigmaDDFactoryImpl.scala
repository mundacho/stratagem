package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.adt.ASort
import ch.unige.cui.smv.stratagem.util.CanonicalFactory
import ch.unige.cui.smv.stratagem.util.LatticeElement
import ch.unige.cui.smv.stratagem.util.OperationCache


class SigmaDDFactoryImpl extends CanonicalFactory {
  type CanonicalType = SigmaDDImplementation

  type FromType = (ASort, IPFType)

  val iipfFactory = new SigmaDDIPFFactoryImpl
  type IPFType = iipfFactory.IPFImplementation

  protected def makeFrom(tuple: AnyRef): SigmaDDImplementation = tuple match {
    case a: (ASort, IPFType) @unchecked => new SigmaDDImplementation(a._1, a._2) with OperationCache
    case _ => throw new IllegalArgumentException("Unable to create SigmaDD")
  }

  private[sigmadd] class SigmaDDImplementation(
    val sort: ASort,
    val iipf: IPFType) extends LatticeElement {
    type LatticeElementType = SigmaDDImplementation

    def v(that: SigmaDDImplementation): SigmaDDImplementation = {
      val newSort = ASort.findCommonParent(this.sort, that.sort)
      create(newSort, this.iipf v that.iipf)
    }
    def ^(that: SigmaDDImplementation): SigmaDDImplementation = {
      val newSort = ASort.findCommonParent(this.sort, that.sort)
      create(newSort, this.iipf ^ that.iipf)
    }
    def \(that: SigmaDDImplementation): SigmaDDImplementation = {
      val newSort = ASort.findCommonParent(this.sort, that.sort)
      create(newSort, this.iipf \ that.iipf)
    }
    
    def bottomElement = create(sort, this.iipf.bottomElement)

  }
}