package ch.unige.cui.smv.sigmadd.impl.basic

import scala.collection.mutable.WeakHashMap

import ch.unige.cui.smv.stratagem.sigmadd.LatticeElement

/**
 * Represents a factory for our set wrappers. We use a factory because we are using interning with the sets to use less memory.
 */
abstract class SetWrapperFactory extends CanonicalFactory {
  
  type CanonicalType = SetWrapper

  /**
   * The type contained in the sets that we are wrapping.
   */
  type T

  /**
   * Represents a set in a SigmaDD. It just wraps a scala set.
   *
   * @author mundacho
   *
   */
  abstract class SetWrapper(val set: Set[T]) extends LatticeElement{

    type LatticeElementImplementationType = SetWrapper

    def v(that: SetWrapper): SetWrapper = {
      create(that.set ++ set)
    }

    def ^(that: SetWrapper): SetWrapper = {
      create(that.set.intersect(that.set))
    }

    def \(that: SetWrapper): SetWrapper = {
      null
    }

  }

}

object StringSetWrapperFactory extends SetWrapperFactory {
  type T = String

  class StringSetWrapper(set: Set[String]) extends SetWrapper(set)

  def makeFrom(set: Set[String]):StringSetWrapper = makeFrom(set.asInstanceOf[AnyRef])

  def makeFrom(set: AnyRef) = new StringSetWrapper(set.asInstanceOf[Set[String]])
  
}


