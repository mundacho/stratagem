
package ch.unige.cui.smv.stratagem.sigmadd

/**
 * Represents a lattice element. Lattice elements support union, intersection and difference.
 * @param T
 * @author mundacho
 *
 */
trait LatticeElement {

  /**
   * This is the lattice element type. All lattice  operations are done between elements of this type and they return an element of this type.
   */
  type LatticeElementType

  def bottomElement: LatticeElementType

  /**
   * The union of two LatticeElements.
   * @param that the LatticeElement to add to this LatticeElement.
   */
  def v(that: LatticeElementType): LatticeElementType

  /**
   * The intersection of LatticeElements.
   * @param that the LatticeElement to intersect with this LatticeElement.
   */
  def ^(that: LatticeElementType): LatticeElementType

  /**
   * The difference of LatticeElements.
   * @param that the LatticeElement to subtract from this LatticeElement.
   */
  def \(that: LatticeElementType): LatticeElementType

}