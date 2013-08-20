package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.stratagem.sigmadd.LatticeElement
import scala.collection.mutable.WeakHashMap

/**
 * Represents a factory for our set wrappers. We use a factory because we are using interning with the sets to use less memory.
 */
abstract class SetWrapperFactory {

  /**
   * The type contained in the sets that we are wrapping.
   */
  type T

  /**
   * The unicity table.
   */
  val unicityTable = new WeakHashMap[SetWrapper, SetWrapper]

  /**
   * Creates a set and returns it. It must put it in a cache to spare memory.
   */
  def create(set: Set[T]): SetWrapper = unicityTable.getOrElseUpdate(makeFrom(set), makeFrom(set))

  /**
   * Has to be provided by the implementing object.
   */
  protected def makeFrom(set: Set[T]): SetWrapper

  /**
   * Represents a set in a SigmaDD. It just wraps a scala set.
   *
   * @author mundacho
   *
   */
  abstract class SetWrapper(val set: Set[T]) extends LatticeElement {

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

    override def equals(that: AnyRef) = this eq that

  }

}

object StringSetWrapperFactory extends SetWrapperFactory {
  type T = String

  class StringSetWrapper(set: Set[String]) extends SetWrapper(set)
  
  def makeFrom(set: Set[String]) = new StringSetWrapper(set)

}


