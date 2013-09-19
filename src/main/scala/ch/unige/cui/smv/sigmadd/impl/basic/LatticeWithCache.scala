package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.stratagem.sigmadd.LatticeElement
import scala.collection.mutable.HashMap

/**
 * This class should be used as a mixin. I adds cache functionality to a lattice
 * element.
 */
trait OperationCache extends LatticeElement {

  type LatticeElementType <: OperationCache

  /**
   * A map where we keep our cache.
   */
  val operationCache = new HashMap[(String, OperationCache, OperationCache), LatticeElementType]

  
  /**
   * We override the standard operation to perform a join with cache.
   * @param that the lattice element to join with.
   * @return the union of the this and that.
   */
  abstract override def v(that: LatticeElementType): LatticeElementType = {
    // order the parameters
    val key = if (this.hashCode > that.hashCode) ("union", this, that) else ("union", that, this)
    operationCache.getOrElseUpdate(key, super.v(that))
  }

  /**
   * We override the standard operation to perform a meet with cache.
   * @param that the lattice element to intersect with.
   * @retrun the intersection of this and that.
   */
  abstract override def ^(that: LatticeElementType): LatticeElementType = {
    // order the parameters
    val key = if (this.hashCode > that.hashCode) ("inter", this, that) else ("inter", that, this)
    operationCache.getOrElseUpdate(key, super.^(that))
  }

  /**
   * We override the standard operation to perform a difference with cache.
   * @that is the lattice element to subtract.
   * @return the difference of this minus that.
   */
  abstract override def \(that: LatticeElementType): LatticeElementType = {
    val key = ("diff", this, that)
    operationCache.getOrElseUpdate(key, super.v(that))
  }

}