
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

  /**
   * The union of two LatticeElements.
   * @param sigmaDD the LatticeElement to add to this LatticeElement.
   */
  def v (sigmaDD: LatticeElementImplementationType): LatticeElementImplementationType

  /**
   * The intersection of LatticeElements.
   * @param sigmaDD the LatticeElement to intersect with this LatticeElement.
   */
  def ^(sigmaDD: LatticeElementImplementationType): LatticeElementImplementationType

  /**
   * The difference of LatticeElements.
   * @param sigmaDD the LatticeElement to subtract from this LatticeElement.
   */
  def \(sigmaDD: LatticeElementImplementationType): LatticeElementImplementationType


}