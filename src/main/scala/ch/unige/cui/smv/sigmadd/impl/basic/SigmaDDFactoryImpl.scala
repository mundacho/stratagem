package ch.unige.cui.smv.sigmadd.impl.basic

import scala.collection.immutable.HashMap
import ch.unige.cui.smv.stratagem.adt.ASort
import ch.unige.cui.smv.stratagem.sigmadd.LatticeElement

class SigmaDDFactoryImpl extends CanonicalFactory {
  type CanonicalType = SigmaDDImplementation

  type FromType = (ASort, IPFType)

  val iipfFactory = new SigmaDDIPFFactoryImpl
  type IPFType = iipfFactory.IPFImplementation

  protected def makeFrom(tuple: AnyRef): SigmaDDImplementation = tuple match {
    case a: (ASort, IPFType) @unchecked => new SigmaDDImplementation(a._1, a._2) with OperationCache
    case _ => throw new IllegalArgumentException("Unable to create SigmaDD")
  }

  private[basic] class SigmaDDImplementation(
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