package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Fail
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Union
import scala.collection.mutable.HashMap

/**
 * Represents a factory of rewriters.
 */
object SigmaDDRewriterFactory {

  private val rewriterCache = HashMap[(Class[_ <: SimpleSigmaDDRewriter], Array[SigmaDDRewriter]), SigmaDDRewriter]()

  /**
   * Transforms a strategy to a SigmaDD rewriter.
   * @param s the strategy to be transformed.
   * @param ts the transition system in which the strategies are (it is necessary to obtain the declarations of the strategies)
   */
  def strategyToRewriter(s: Strategy)(implicit ts: TransitionSystem): SigmaDDRewriter = s match {
    case st: SimpleStrategy => new SimpleSigmaDDRewriter(st) with SigmaDDRewritingCache
    case Choice(s1, s2) => new ChoiceRewriter(strategyToRewriter(s1), strategyToRewriter(s2)) with SigmaDDRewritingCache
    case Fail => FailRewriter
    case Identity => IdentityRewriter
    case Union(s1, s2) => new UnionRewriter(strategyToRewriter(s1), strategyToRewriter(s2)) with SigmaDDRewritingCache
    case strategyInstance @ DeclaredStrategyInstance(name, actualParams @ _*) => new DeclaredStrategyRewriter(strategyInstance, ts)

  }

}