package ch.unige.cui.smv.stratagem.util

import scala.collection.mutable.SynchronizedMap
import scala.collection.mutable.WeakHashMap

/**
 * This class should be used as a mixin. By using the stackable modification
 * pattern it is used to add a synchonized unicity table to a canonical table.
 */
trait SynchronizedCache extends CanonicalFactory {
  /**
   * The unicity table. We use a var because we have to reset it sometimes.
   */
  var syncedUnicityTable = new WeakHashMap[CanonicalType, CanonicalType] with SynchronizedMap[CanonicalType, CanonicalType]

  abstract override def create(from: FromType) = {
    val newElt = makeFrom(from)
    syncedUnicityTable.getOrElseUpdate(newElt, newElt)
  }

  abstract override def cleanUnicityTable { syncedUnicityTable = new WeakHashMap[CanonicalType, CanonicalType] with SynchronizedMap[CanonicalType, CanonicalType] }

}