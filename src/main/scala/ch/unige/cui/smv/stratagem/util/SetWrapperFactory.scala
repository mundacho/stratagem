/*
Stratagem is a model checker for transition systems described using rewriting
rules and strategies.
Copyright (C) 2013 - SMV@Geneva University.
Program written by Edmundo Lopez Bobeda <edmundo [at] lopezbobeda.net>.
This program is free software; you can redistribute it and/or modify
it under the  terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

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


