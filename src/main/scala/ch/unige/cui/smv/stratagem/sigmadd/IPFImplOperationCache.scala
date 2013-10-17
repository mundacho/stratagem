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
package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.util.OperationCache
import scala.collection.mutable.HashMap

/**
 * Unifies the InductiveIPFImpl cache.
 * @author mundacho
 *
 */
trait IPFImplOperationCache extends SigmaDDIPFFactoryImpl.IPFImpl {


  type OperationType = OperationCache.OperationType
  val Union = OperationCache.Union
  val Inter = OperationCache.Inter
  val Difference = OperationCache.Difference

  /**
   * We override the standard operation to perform a join with cache.
   * @param that the lattice element to join with.
   * @return the union of the this and that.
   */
  abstract override def v(that: LatticeElementType): LatticeElementType = {
    // order the parameters
    val key: (OperationType, Any, Any) = if (this.hashCode > that.hashCode) (Union, this, that) else (Union, that, this)
    IPFImplOperationCache.globalOperationCache.getOrElseUpdate(key, super.v(that))
  }

  /**
   * We override the standard operation to perform a meet with cache.
   * @param that the lattice element to intersect with.
   * @return the intersection of this and that.
   */
  abstract override def ^(that: LatticeElementType): LatticeElementType = {
    // order the parameters
    val key: (OperationType, Any, Any) = if (this.hashCode > that.hashCode) (Inter, this, that) else (Inter, that, this)
    IPFImplOperationCache.globalOperationCache.getOrElseUpdate(key, super.^(that))
  }

  /**
   * We override the standard operation to perform a difference with cache.
   * @param that is the lattice element to subtract.
   * @return the difference of this minus that.
   */
  abstract override def \(that: LatticeElementType): LatticeElementType = {
    val key: (OperationType, Any, Any) = (Difference, this, that)
    IPFImplOperationCache.globalOperationCache.getOrElseUpdate(key, super.\(that))
  }
}

object IPFImplOperationCache {
  val globalOperationCache = new HashMap[(OperationCache.OperationType, Any, Any), SigmaDDIPFFactoryImpl.IPFImpl]
}