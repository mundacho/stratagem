package ch.unige.cui.smv.stratagem.sigmadd

/**
 * The parent class of all SigmaDD rewriters.
 */
abstract class SigmaDDRewriter {
  /**
   * An alias for the type of the rewriting type.
   */
  type SigmaDDImplType = SigmaDDFactoryImpl.SigmaDDImpl
  
  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType]
  
}

