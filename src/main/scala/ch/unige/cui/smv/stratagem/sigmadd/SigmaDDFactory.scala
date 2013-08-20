package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.adt.ASort
import ch.unige.cui.smv.stratagem.adt.ATerm

/**
 * Represents a SigmaDD factory. Contains the factory methods to create SigmaDDs. This class is to be used as a module.
 * @author mundacho
 *
 */
abstract class SigmaDDFactory {

  /**
   * The that will be produced by this factory.
   */
  type ImplementationType <: SigmaDD

  /**
   * Creates a new SigmaDD.
   * @param term a term from which we are going to create a new SigmaDD.
   * @return a new SigmaDD that represents that term.
   */
  def createSigmaDD(term: ATerm): ImplementationType

}