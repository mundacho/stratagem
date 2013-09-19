package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.sigmadd.impl.basic.CanonicalFactory
import scala.collection.mutable.WeakHashMap
import scala.collection.mutable.SynchronizedMap
import scala.collection.mutable.HashMap

trait SynchronizedCache extends CanonicalFactory {
  var syncedUnicityTable = new HashMap[CanonicalType, CanonicalType] with SynchronizedMap[CanonicalType, CanonicalType]

  /**
   * Create a new element from any object.
   * @param from the object that will be used to generate a new instance of your canonical object.
   */
  abstract override def create(from: FromType) = {
    syncedUnicityTable.getOrElseUpdate(makeFrom(from), makeFrom(from))
  }

  abstract override def cleanCache { syncedUnicityTable = new HashMap[CanonicalType, CanonicalType] with SynchronizedMap[CanonicalType, CanonicalType] }

}