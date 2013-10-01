package ch.unige.cui.smv.stratagem.sigmadd

/**
 * Implements the identity strategy. Always return the identity.
 */
object IdentityRewriter extends SigmaDDRewriter {
	  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = Some(sigmaDD)
}