package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.sigmadd.impl.basic.CanonicalFactory
import scala.collection.mutable.WeakHashMap
import scala.collection.mutable.SynchronizedMap
import scala.collection.mutable.HashMap

/**
 * This class should be used as a mixin. By using the stackable modification
 * pattern it is used to add a synchonized unicity table to a canonical table.
 */
trait SynchronizedCache extends CanonicalFactory {
  /**
   * The unicity table. We use a var because we have to reset it sometimes.
   */
  var syncedUnicityTable = new HashMap[CanonicalType, CanonicalType] with SynchronizedMap[CanonicalType, CanonicalType]

  abstract override def create(from: FromType) = {
    syncedUnicityTable.getOrElseUpdate(makeFrom(from), makeFrom(from))
  }

  abstract override def cleanUnicityTable { syncedUnicityTable = new HashMap[CanonicalType, CanonicalType] with SynchronizedMap[CanonicalType, CanonicalType] }

}