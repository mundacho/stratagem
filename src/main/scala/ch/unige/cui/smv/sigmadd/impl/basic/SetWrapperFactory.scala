package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.stratagem.sigmadd.LatticeElement
import ch.unige.cui.smv.stratagem.sigmadd.SynchronizedCache

/**
 * Represents a factory for our set wrappers. We use a factory because we are using interning with the sets to use less memory.
 */
abstract class SetWrapperFactory extends CanonicalFactory {

  /**
   * The type contained in the sets that we are wrapping.
   */
  type T

  type CanonicalType <: SetWrapper

  type FromType = Set[T]

  /**
   * Represents a set in a SigmaDD. It just wraps a scala set. It
   *
   * @author mundacho
   *
   */
  abstract class SetWrapper(val set: Set[T]) extends LatticeElement {

    type LatticeElementType = SetWrapper

    override def hashCode: Int = throw new NotImplementedError("All subclasses of" + this.getClass().getName() + " should implement hashcode")

    override def equals(obj: Any): Boolean = throw new NotImplementedError("All subclasses of " + this.getClass().getName() + " should implement equals")

    override def toString = set.mkString("{", ", ", "}")

    def v(that: SetWrapper): SetWrapper = create(this.set ++ that.set)

    def ^(that: SetWrapper): SetWrapper = create(this.set intersect that.set)

    def \(that: SetWrapper): SetWrapper = create(this.set -- that.set)

    def bottomElement = create(Set.empty)

  }

}

object StringSetWrapperFactory extends SetWrapperFactory with SynchronizedCache {
  type T = String

  type CanonicalType = StringSetWrapper

  class StringSetWrapper private[StringSetWrapperFactory] (set: Set[String]) extends SetWrapper(set) {

    override def hashCode = set.hashCode 
    
    override def equals(obj: Any) = obj match {
      case o: StringSetWrapper => (o eq this) || o.set == this.set
      case _ => false
    }
  }

  def makeFrom(set: AnyRef) = new StringSetWrapper(set.asInstanceOf[Set[String]])

}


