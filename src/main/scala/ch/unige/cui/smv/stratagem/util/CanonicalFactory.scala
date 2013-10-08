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

import scala.collection.mutable.WeakHashMap

/**
 * Trait for canonical objects. Classes and objects mixing this trait are mainly factories that will create canonical objects.
 *
 */
trait CanonicalFactory {

  /**
   * This is the concrete type created by this canonical factory.
   */
  type CanonicalType

  /**
   * This is the type that will be used as argument of the create function.
   */
  type FromType <: AnyRef

  /**
   * The canonical map.
   */
  var unicityTable = new WeakHashMap[CanonicalType, CanonicalType]

  /**
   * Create a new element from any object.
   * @param from the object that will be used to generate a new instance of your canonical object.
   */
  def create(from: FromType) = {
    val newElt = makeFrom(from)
    unicityTable.getOrElseUpdate(newElt, newElt)
  }

  /**
   *  Cleans the unicity table.
   */
  def cleanUnicityTable { unicityTable = new WeakHashMap[CanonicalType, CanonicalType] }

  /**
   * Its implementation should be able to create a new instance of the canonical
   * class. Normally, the implementation of this method should call the
   * new method of the object it is creating.
   * @param instance the object that will be used to create the canonical type.
   */
  protected def makeFrom(instance: AnyRef): CanonicalType

}
