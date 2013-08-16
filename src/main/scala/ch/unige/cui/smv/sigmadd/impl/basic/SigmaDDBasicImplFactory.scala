package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactory
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDD
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.ASort

/**
 * Represents the implementation of a factory to create SigmaDDs.
 * @author mundacho
 *
 */
object SigmaDDBasicImplFactory extends SigmaDDFactory {

  type ImplementationType = SigmaDDBasicImpl

  /**
   * Represents a SigmaDD that encodes a set of constant terms.
   * @param sort the sort of the SigmaDD.
   * @param alphaRecursive the mapping for a inductive SigmaDD.
   * @param constantOrVariable the set of constants represented by this SigmaDD.
   */
  class SigmaDDBasicImpl(val sort: ASort, val alphaRecursive: Map[Set[String], SigmaDDBasicImpl], val constantOrVariable: Set[String]) extends SigmaDD {
    type SigmaDDImplementationType = SigmaDDBasicImpl

    def v(sigmaDD: SigmaDDBasicImpl): SigmaDDBasicImpl = {
      null
    }

    def ^(sigmaDD: SigmaDDBasicImpl): SigmaDDBasicImpl = {
      null
    }

    def \(sigmaDD: SigmaDDBasicImpl): SigmaDDBasicImpl = {
      null
    }

    def squareUnion(sigmaDD: SigmaDDBasicImpl): SigmaDDBasicImpl = {
      null
    }
  }

  def createSigmaDD(sort: ASort, operationNames: Set[String], tail: SigmaDDBasicImpl): SigmaDDBasicImpl = {
    null
  }

  def createSigmaDD(sort: ASort, operationNames: Set[String]): SigmaDDBasicImpl = {
    null
  }

  def createSigmaDD(term: ATerm): SigmaDDBasicImpl = {
    null
  }
}