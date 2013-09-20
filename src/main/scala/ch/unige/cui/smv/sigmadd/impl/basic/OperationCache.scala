package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.stratagem.sigmadd.LatticeElement
import scala.collection.mutable.HashMap

/**
 * This class should be used as a mixin. I adds cache functionality to a lattice
 * element.
 */
trait OperationCache extends LatticeElement {
  /**
   * A map where we keep our cache.
   */
  val operationCache = new HashMap[(OperationType, Any, Any), LatticeElementType]

  abstract class OperationType
  
  object Union extends OperationType
  object Inter extends OperationType
  object Difference extends OperationType
  
  /**
   * We override the standard operation to perform a join with cache.
   * @param that the lattice element to join with.
   * @return the union of the this and that.
   */
  abstract override def v(that: LatticeElementType): LatticeElementType = {
    // order the parameters
    val key:(OperationType, Any, Any) = if (this.hashCode > that.hashCode) (Union, this, that) else (Union, that, this)
    operationCache.getOrElseUpdate(key, super.v(that))
  }

  /**
   * We override the standard operation to perform a meet with cache.
   * @param that the lattice element to intersect with.
   * @retrun the intersection of this and that.
   */
  abstract override def ^(that: LatticeElementType): LatticeElementType = {
    // order the parameters
    val key:(OperationType, Any, Any) = if (this.hashCode > that.hashCode) (Inter, this, that) else (Inter, that, this)
    operationCache.getOrElseUpdate(key, super.^(that))
  }

  /**
   * We override the standard operation to perform a difference with cache.
   * @that is the lattice element to subtract.
   * @return the difference of this minus that.
   */
  abstract override def \(that: LatticeElementType): LatticeElementType = {
    val key:(OperationType, Any, Any) = (Difference, this, that)
    operationCache.getOrElseUpdate(key, super.\(that))
  }

}