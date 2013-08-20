package ch.unige.cui.smv.sigmadd.impl.basic

import scala.collection.mutable.WeakHashMap
import scala.collection.convert.Wrappers.SetWrapper

/**
 * Trait for canonical objets.
 */
trait CanonicalFactory {
  
  type CanonicalType
  
  /**
   * The unicity table.
   */
  val unicityTable = new WeakHashMap[CanonicalType, CanonicalType]
  
  /**
   * Create a new element from any object.
   * @param from the object that will be used to generate a new instance of your canonical object.
   */
  def create(from:AnyRef) = unicityTable.getOrElseUpdate(makeFrom(from), makeFrom(from))
  
  /**
   * Its implementation should be able to create a new instance of the canonical class.
   */
  protected def makeFrom(instance:AnyRef):CanonicalType
  
}