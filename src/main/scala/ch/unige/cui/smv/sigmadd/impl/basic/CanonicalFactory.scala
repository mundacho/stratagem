package ch.unige.cui.smv.sigmadd.impl.basic

import scala.collection.mutable.WeakHashMap


/**
 * Trait for canonical objects.
 * @param [CanonicalType] the type to be stored canonically.
 */
trait CanonicalFactory {
  
  
  /**
   * This is the concrete type created by this canonical factory.
   */
  type CanonicalType
  
  type FromType <: AnyRef
  
  /**
   * The canonical map.
   */
  val unicityTable = new WeakHashMap[CanonicalType, CanonicalType]
  
  
  /**
   * Create a new element from any object.
   * @param from the object that will be used to generate a new instance of your canonical object.
   */
  def create(from:FromType) = unicityTable.getOrElseUpdate(makeFrom(from), makeFrom(from))
  
  /**
   * Its implementation should be able to create a new instance of the canonical class.
   */
  protected def makeFrom(instance: AnyRef):CanonicalType
  
}