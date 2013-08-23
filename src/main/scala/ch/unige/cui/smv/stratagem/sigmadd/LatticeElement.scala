
package ch.unige.cui.smv.stratagem.sigmadd

/**
 * Represents a lattice element. Lattice elements support union, intersection and difference.
 * @author mundacho
 *
 */
trait LatticeElement {

   /**
   * The type of this implementation of the LatticeElement.
   */
  type LatticeElementImplementationType <: AnyRef
  
  def bottomElement: LatticeElementImplementationType

  /**
   * The union of two LatticeElements.
   * @param that the LatticeElement to add to this LatticeElement.
   */
  def v (that: LatticeElementImplementationType): LatticeElementImplementationType

  /**
   * The intersection of LatticeElements.
   * @param that the LatticeElement to intersect with this LatticeElement.
   */
  def ^(that: LatticeElementImplementationType): LatticeElementImplementationType

  /**
   * The difference of LatticeElements.
   * @param that the LatticeElement to subtract from this LatticeElement.
   */
  def \(that: LatticeElementImplementationType): LatticeElementImplementationType


}