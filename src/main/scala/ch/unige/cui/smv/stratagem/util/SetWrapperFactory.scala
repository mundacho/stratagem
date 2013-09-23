package ch.unige.cui.smv.stratagem.util

/**
 * Represents a factory for our set wrappers. We use a factory because we are
 * using interning with the sets to use less memory. We use a canonical factory.
 */
abstract class SetWrapperFactory extends CanonicalFactory {

  /**
   * The type contained in the sets that we are wrapping.
   */
  type T

  type CanonicalType <: SetWrapper

  type FromType = Set[T]

  /**
   * Represents a set in a SigmaDD. It just wraps a scala set.
   *
   * @author mundacho
   *
   */
  abstract class SetWrapper(val set: Set[T]) extends LatticeElement {
    
    type LatticeElementType = CanonicalType

    override def hashCode: Int = throw new NotImplementedError("All subclasses of" + this.getClass().getName() + " should implement hashcode")

    override def equals(obj: Any): Boolean = throw new NotImplementedError("All subclasses of " + this.getClass().getName() + " should implement equals")

    override def toString = set.mkString("{", ", ", "}")

    def v(that: LatticeElementType): LatticeElementType = create(this.set ++ that.set)

    def ^(that: LatticeElementType): LatticeElementType = create(this.set intersect that.set)

    def \(that: LatticeElementType): LatticeElementType = create(this.set -- that.set)

  }

}

/**
 * This is a factory for sets of strings.
 */
object StringSetWrapperFactory extends SetWrapperFactory with SynchronizedCache {
  type T = String

  type CanonicalType = StringSetWrapper

  /**
   * Wraps a set of strings.
   */
  class StringSetWrapper private[StringSetWrapperFactory] (set: Set[String]) extends SetWrapper(set) {

   override type LatticeElementType = StringSetWrapper

    override val hashCode = set.hashCode

    override def equals(obj: Any) = obj match {
      case o: StringSetWrapper => (o eq this) || o.set == this.set
      case _ => false
    }

    override def v(that: StringSetWrapper): StringSetWrapper = super.v(that)

    override def ^(that: StringSetWrapper): StringSetWrapper = create(this.set intersect that.set)

    override def \(that: StringSetWrapper): StringSetWrapper = create(this.set -- that.set)

    def bottomElement = create(Set.empty)
  }

  def makeFrom(set: AnyRef) = new StringSetWrapper(set.asInstanceOf[Set[String]])

}


