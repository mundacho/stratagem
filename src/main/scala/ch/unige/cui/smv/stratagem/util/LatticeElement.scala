
package ch.unige.cui.smv.stratagem.util

/**
 * Represents a lattice element. Lattice elements support union, intersection 
 * and difference.

 * @author mundacho
 *
 */
trait LatticeElement {

  /**
   * This is the lattice element type. All lattice  operations are done between
   * elements of this type and they return an element of this type.
   */
  type LatticeElementType

  /**
   * @retun the bottom element of the lattice.
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

}