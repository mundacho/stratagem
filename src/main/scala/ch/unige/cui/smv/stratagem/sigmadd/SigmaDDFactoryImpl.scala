package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.adt.ASort
import ch.unige.cui.smv.stratagem.util.CanonicalFactory
import ch.unige.cui.smv.stratagem.util.LatticeElement
import ch.unige.cui.smv.stratagem.util.OperationCache
import ch.unige.cui.smv.stratagem.util.Element
import ch.unige.cui.smv.stratagem.adt.ATerm

/**
 * This factory creates SigmaDDs.
 */
class SigmaDDFactoryImpl extends CanonicalFactory {

  lazy val ipfFactory = new SigmaDDIPFFactoryImpl {
    val inductiveIPFFactory = new SigmaDDInductiveIPFFactoryImpl {
      val sigmaDDFactory: SigmaDDFactoryImpl.this.type = SigmaDDFactoryImpl.this
    }
  }
  type CanonicalType = SigmaDDImpl

  type FromType = (ASort, IPFType)

  type IPFType = ipfFactory.IPFImpl
  
  def create(term: ATerm):SigmaDDImpl = {
    require(!term.isVariable, "Cannot create a SigmaDD containing a variable.")
    term match {
      case ATerm(opSymbol, terms) => create(term.sort, ipfFactory.create(opSymbol, ipfFactory.inductiveIPFFactory.create(terms)))
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

    override val hashCode = (sort, iipf) ##

    override def equals(that: Any) = that match {
      case o: SigmaDDImpl => (o eq this) || (ASort.findCommonParent(this.sort, o.sort) != None && this.iipf == o.iipf)
      case _ => false
    }
    
    def asElements =  Element.elem(sort.toString) beside Element.elem("--") beside iipf.asElements

    override def toString = asElements.toString

    def v(that: SigmaDDImpl): SigmaDDImpl = {
      val newSort = ASort.findCommonParent(this.sort, that.sort)
      newSort match {
        case Some(commonParent) => create(commonParent, this.iipf v that.iipf)
        case None => throw new IllegalStateException
      }

    }
    def ^(that: SigmaDDImpl): SigmaDDImpl = {
      val newSort = ASort.findCommonParent(this.sort, that.sort)
      newSort match {
        case Some(commonParent) => create(commonParent, this.iipf ^ that.iipf)
        case None => throw new IllegalStateException
      }
    }
    def \(that: SigmaDDImpl): SigmaDDImpl = {
      val newSort = ASort.findCommonParent(this.sort, that.sort)
      newSort match {
        case Some(commonParent) => create(commonParent, this.iipf \ that.iipf)
        case None => throw new IllegalStateException
      }
    }

    def bottomElement = create(sort, this.iipf.bottomElement)

  }
}