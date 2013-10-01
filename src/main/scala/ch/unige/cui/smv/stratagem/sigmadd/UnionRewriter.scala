package ch.unige.cui.smv.stratagem.sigmadd

/**
 * Implements the union strategy. 
 * @param rewriter1 represents one strategy (in rewriter form) of the original union strategy.
 * @param rewriter2 represents one strategy (in rewriter form) of the original union strategy.
 */
class UnionRewriter(rewriter1:SigmaDDRewriter, rewriter2:SigmaDDRewriter) extends SigmaDDRewriter {
  
  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = rewriter1(sigmaDD) match {
    case None => None
    case Some(result1) => rewriter2(sigmaDD) match {
      case None => None
      case Some(result2) => Some(result1 v result2) 
      }
  }
}