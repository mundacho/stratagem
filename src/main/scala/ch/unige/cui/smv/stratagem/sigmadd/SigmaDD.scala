package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.adt.ASort

/**
 * Represents an implementation of a SigmaDD.
 * @author mundacho
 *
 */
trait SigmaDD {
  /**
   * The type of this implementation of the SigmaDD.
   */
  type SigmaDDImplementationType

  /**
   * The sort of this SigmaDD.
   */
  val sort: ASort

  /**
   * The union of two SigmaDDs.
   * @param sigmaDD the SigmaDD to add to this SigmaDD.
   */
  def v(sigmaDD: SigmaDDImplementationType): SigmaDDImplementationType

  /**
   * The intersection of SigmaDDs.
   * @param sigmaDD the SigmaDD to intersect with this SigmaDD.
   */
  def ^(sigmaDD: SigmaDDImplementationType): SigmaDDImplementationType

  /**
   * The difference of SigmaDDs.
   * @param sigmaDD the SigmaDD to subtract from this SigmaDD.
   */
  def \(sigmaDD: SigmaDDImplementationType): SigmaDDImplementationType

  /**
   * The square union of SigmaDDs.
   * @param sigmaDD the SigmaDD that will be used (along with this one) to calculate the square union of both.
   */
  def squareUnion(sigmaDD: SigmaDDImplementationType): SigmaDDImplementationType

}