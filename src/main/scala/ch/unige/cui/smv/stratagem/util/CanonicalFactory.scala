package ch.unige.cui.smv.stratagem.util

import scala.collection.mutable.WeakHashMap

/**
 * Trait for canonical objects. Classes and objects mixing this trait are mainly factories that will create canonical objects.
 *
 */
trait CanonicalFactory {

  /**
   * This is the concrete type created by this canonical factory.
   */
  type CanonicalType

  /**
   * This is the type that will be used as argument of the create function.
   */
  type FromType <: AnyRef

  /**
   * The canonical map.
   */
  var unicityTable = new WeakHashMap[CanonicalType, CanonicalType]

  /**
   * Create a new element from any object.
   * @param from the object that will be used to generate a new instance of your canonical object.
   */
  def create(from: FromType) = {
    val newElt = makeFrom(from)
    unicityTable.getOrElseUpdate(newElt, newElt)
  }

  /**
   *  Cleans the unicity table.
   */
  def cleanUnicityTable { unicityTable = new WeakHashMap[CanonicalType, CanonicalType] }

  /**
   * Its implementation should be able to create a new instance of the canonical class. Normally, the implementation of this method should call the new method of the object it is creating.
   * @param instance the object that will be used to create the canonical type.
   */
  protected def makeFrom(instance: AnyRef): CanonicalType

}