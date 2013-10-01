package ch.unige.cui.smv.stratagem.sigmadd

import scala.collection.mutable.HashMap

/**
 * This class should be used as a mixin.
 */
trait SigmaDDRewritingCache extends SigmaDDRewriter {
  /**
   * A map where we keep our cache.
   */
  val operationCache = new HashMap[(Class[_ <: SigmaDDRewriter],SigmaDDImplType), Option[SigmaDDImplType]]
  
  /**
   * This function adds cache functionality to the SigmaDD rewriter.
   */
  abstract override def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
	  operationCache.getOrElseUpdate((this.getClass(), sigmaDD), super.apply(sigmaDD))
  }

}