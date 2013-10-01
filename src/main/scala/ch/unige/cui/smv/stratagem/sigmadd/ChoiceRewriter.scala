package ch.unige.cui.smv.stratagem.sigmadd

/**
 * Implements the choice strategy.
 * @param rewriter1 is the rewriter created by the first strategy of the original choice strategy.
 * @param rewriter2 is the rewriter created by the second strategy of the original choice strategy.
 */
class ChoiceRewriter(rewriter1: SigmaDDRewriter, rewriter2: SigmaDDRewriter) extends SigmaDDRewriter {

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = rewriter1(sigmaDD) match {
    case None => rewriter2(sigmaDD)
    case Some(result) => Some(result)
  }
}