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

import scala.collection.mutable.HashMap

/**
 * This class should be used as a mixin. I adds cache functionality to a lattice
 * element.
 */
trait OperationCache extends LatticeElement {
  /**
   * A map where we keep our cache.
   */
  val operationCache = new HashMap[(OperationType, Any, Any), LatticeElementType]

  abstract class OperationType

  object Union extends OperationType
  object Inter extends OperationType
  object Difference extends OperationType

  /**
   * We override the standard operation to perform a join with cache.
   * @param that the lattice element to join with.
   * @return the union of the this and that.
   */
  abstract override def v(that: LatticeElementType): LatticeElementType = {
    // order the parameters
    val key: (OperationType, Any, Any) = if (this.hashCode > that.hashCode) (Union, this, that) else (Union, that, this)
    operationCache.getOrElseUpdate(key, super.v(that))
  }

  /**
   * We override the standard operation to perform a meet with cache.
   * @param that the lattice element to intersect with.
   * @retrun the intersection of this and that.
   */
  abstract override def ^(that: LatticeElementType): LatticeElementType = {
    // order the parameters
    val key: (OperationType, Any, Any) = if (this.hashCode > that.hashCode) (Inter, this, that) else (Inter, that, this)
    operationCache.getOrElseUpdate(key, super.^(that))
  }

  /**
   * We override the standard operation to perform a difference with cache.
   * @that is the lattice element to subtract.
   * @return the difference of this minus that.
   */
  abstract override def \(that: LatticeElementType): LatticeElementType = {
    val key: (OperationType, Any, Any) = (Difference, this, that)
    operationCache.getOrElseUpdate(key, super.\(that))
  }

}