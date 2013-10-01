package ch.unige.cui.smv.stratagem.sigmadd

/**
 * Implements the fail strategy. Always fails.
 */
object FailRewriter extends SigmaDDRewriter {
	  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = None
}