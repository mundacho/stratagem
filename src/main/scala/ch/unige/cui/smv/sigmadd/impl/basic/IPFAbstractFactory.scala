package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.stratagem.sigmadd.LatticeElement
import scala.collection.mutable.WeakHashMap

abstract class IPFAbstractFactory extends CanonicalFactory {

  type CanonicalType = IPF

  /**
   * Represents an IPF (Injective Partitioned function).
   *
   * @author mundacho
   *
   */
  abstract class IPF extends LatticeElement {
    type DomainType
    type ImageType

    val map: Map[DomainType, ImageType]

    

  }
}