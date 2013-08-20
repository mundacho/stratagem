package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.adt.ASort

/**
 * Represents an a SigmaDD.
 * @author mundacho
 *
 */
trait SigmaDD extends LatticeElement {

  /**
   * The sort of this SigmaDD.
   */
  val sort: ASort

}