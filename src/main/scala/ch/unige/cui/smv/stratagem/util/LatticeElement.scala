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
 * Represents a lattice element. Lattice elements support union, intersection
 * and difference.
 *
 * @author mundacho
 *
 */
trait LatticeElement {

  /**
   * This is the lattice element type. All lattice  operations are done between
   * elements of this type and they return an element of this type.
   */
  type LatticeElementType <: AnyRef

  /**
   * @return the bottom element of the lattice.
   */
  def bottomElement: LatticeElementType

  /**
   * The union of two LatticeElements.
   * @param that the LatticeElement to add to this LatticeElement.
   * @return this union that
   */
  def v(that: LatticeElementType): LatticeElementType

  /**
   * The intersection of LatticeElements.
   * @param that the LatticeElement to intersect with this LatticeElement.
   * @return this intersection that
   */
  def ^(that: LatticeElementType): LatticeElementType

  /**
   * The difference of LatticeElements.
   * @param that the LatticeElement to subtract from this LatticeElement.
   * @return this minus that
   */
  def \(that: LatticeElementType): LatticeElementType
  
  def wrapped: LightWeightWrapper[LatticeElementType]

}