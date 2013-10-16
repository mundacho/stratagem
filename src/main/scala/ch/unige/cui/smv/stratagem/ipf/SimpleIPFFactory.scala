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

package ch.unige.cui.smv.stratagem.ipf

import scala.collection.immutable.HashMap

import scala.language.postfixOps

import ch.unige.cui.smv.stratagem.util.StringSetWrapperFactory

class SimpleIPFFactory extends IPFAbstractFactory {

  type CanonicalType = SimpleIPFImplementation

  type FromType = Map[StringSetWrapperFactory.StringSetWrapper, StringSetWrapperFactory.StringSetWrapper]

  protected def makeFrom(alpha: AnyRef): SimpleIPFImplementation = alpha match {
    case a: HashMap[StringSetWrapperFactory.StringSetWrapper, StringSetWrapperFactory.StringSetWrapper] @unchecked => new SimpleIPFImplementation(a)
    case _ => throw new IllegalArgumentException("Unable to create IPF")
  }

  def create(elt: String, image: String): SimpleIPFImplementation = create(
    HashMap(StringSetWrapperFactory.create(Set(elt)) -> StringSetWrapperFactory.create(Set(image))))

  /**
   * Tgus class is a simple implementation of the IPF. It maps sets of strings
   * to sets of strings.
   */
  class SimpleIPFImplementation protected[ipf] (
    val alpha: Map[StringSetWrapperFactory.StringSetWrapper, StringSetWrapperFactory.StringSetWrapper]) extends IPF {

    type LatticeElementType = SimpleIPFImplementation
    type DomainType = StringSetWrapperFactory.StringSetWrapper
    type ImageType = StringSetWrapperFactory.StringSetWrapper

    type DomainTypeElt = String
    type ImageTypeElt = String

    lazy val size = throw new NotImplementedError

    override val hashCode = alpha ##

    def asBinaryRelation: Set[(DomainTypeElt, ImageTypeElt)] = for (
      (key, value) <- alpha.toSet;
      elt1 <- key.set;
      elt2 <- value.set
    ) yield (elt1, elt2)

    override def equals(obj: Any) = obj match {
      case o: SimpleIPFImplementation => (o eq this) || this.alpha == o.alpha
      case _ => false
    }

    def v(that: SimpleIPFImplementation): SimpleIPFImplementation = create(alphaUnion(this.alpha, that.alpha))

    def ^(that: SimpleIPFImplementation): SimpleIPFImplementation = create(alphaIntersection(this.alpha, that.alpha))

    def \(that: SimpleIPFImplementation): SimpleIPFImplementation = create(alphaDifference(this.alpha, that.alpha))

    def bottomElement = create(Map.empty)
  }

} // end of InductiveIPFFactory