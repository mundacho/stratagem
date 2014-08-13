/*
Stratagem is a model checker for transition systems described using rewriting
rules and strategies.
Copyright (C) 2013 - SMV@Geneva University.
Program written by Edmundo Lopez Bobeda <edmundo [at] lopezbobeda.net>.
This program is free software; you can redistribute it and/or modify
it under the  terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package ch.unige.cui.smv.stratagem.sigmadd.rewriters

import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl
import ch.unige.cui.smv.metamodel.ts.TransitionSystem
import ch.unige.cui.smv.metamodel.ts.Strategy
import ch.unige.cui.smv.metamodel.ts.NonVariableStrategy
import ch.unige.cui.smv.metamodel.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.util.StrategyDSL.Try
import scala.collection.JavaConversions._
import ch.unige.cui.smv.stratagem.util.StrategyDSL.transitionSystem2RichTransitionSystem
import ch.unige.cui.smv.metamodel.ts.VariableStrategy
import ch.unige.cui.smv.metamodel.ts.Fail
import ch.unige.cui.smv.metamodel.ts.FixPointStrategy
import ch.unige.cui.smv.metamodel.ts.util.TsSwitch
import ch.unige.cui.smv.metamodel.ts.IfThenElse
import ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.util.StrategyDSL
import ch.unige.cui.smv.metamodel.ts.Not
import ch.unige.cui.smv.metamodel.ts.One
import ch.unige.cui.smv.metamodel.ts.Choice
import ch.unige.cui.smv.metamodel.ts.Sequence
import ch.unige.cui.smv.metamodel.ts.Identity
import ch.unige.cui.smv.metamodel.ts.Union
import ch.unige.cui.smv.metamodel.ts.Saturation
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Represents a factory of rewriters.
 */
class SigmaDDRewriterFactory private[sigmadd] (sigmaDDFactory: SigmaDDFactoryImpl) {

  /**
   * Resets the counters.
   */
  def resetCaches { SigmaDDRewritingCacheStats.callsCounter = 0; SigmaDDRewritingCacheStats.hitCounter = 0; this.resetOperationCaches }

  private var rewriterCache = scala.collection.mutable.HashMap[String, SigmaDDRewriter]()

  def resetOperationCaches { rewriterCache = scala.collection.mutable.HashMap[String, SigmaDDRewriter]() }

  /**
   * Transforms a strategy to a SigmaDD rewriter.
   * @param s the strategy to be transformed.
   * @param ts the transition system in which the strategies are (it is necessary to obtain the declarations of the strategies)
   */
  def strategyToRewriter(strategyToRewrite: Strategy)(implicit ts: TransitionSystem): SigmaDDRewriter = (new TsSwitch[SigmaDDRewriter] {
    override def caseSaturation(st: Saturation) = rewriterCache.getOrElseUpdate(st.toString(),
      strategyToRewriter(
        StrategyDSL.Sequence(
          StrategyDSL.Choice(
            StrategyDSL.One(StrategyDSL.Saturation(EcoreUtil.copy(st.getS()), st.getN()), st.getN()),
            StrategyDSL.FixPointStrategy(EcoreUtil.copy(st.getS))),
          StrategyDSL.FixPointStrategy(EcoreUtil.copy(st.getS)))))

    override def caseChoice(st: Choice) = rewriterCache.getOrElseUpdate(st.toString, new ChoiceRewriter(strategyToRewriter(st.getS1), strategyToRewriter(st.getS2), sigmaDDFactory) with SigmaDDRewritingCache)

    override def caseFail(strat: Fail) = FailRewriter(sigmaDDFactory)

    override def caseIdentity(strat: Identity) = IdentityRewriter(sigmaDDFactory)

    override def caseOne(st: One) = rewriterCache.getOrElseUpdate(st.toString(), new OneRewriter(strategyToRewriter(st.getS), st.getN(), sigmaDDFactory) with SigmaDDRewritingCache)

    override def caseNot(strat: Not) = {
      (new TsSwitch[SigmaDDRewriter] {
        override def caseNot(st: Not) = {
          strategyToRewriter(st.getS)
        }
        override def caseSimpleStrategy(st: SimpleStrategy) = {
          rewriterCache.getOrElseUpdate(strat.toString(), new SimpleSigmaDDRewriter(st, sigmaDDFactory, true) with SigmaDDRewritingCache) // we create the rewriter
        }
        override def caseDeclaredStrategyInstance(s: DeclaredStrategyInstance) = {
          strategyToRewriter(StrategyDSL.Not(unwindDeclaredStrategyInstance(s, ts)))
        }
      }).doSwitch(strat.getS())
    }

    override def caseFixPointStrategy(st: FixPointStrategy) = {
      rewriterCache.getOrElseUpdate(st.toString(), new FixpointRewriter(strategyToRewriter(st.getS), sigmaDDFactory) with SigmaDDRewritingCache)
    }

    override def caseSequence(st: Sequence) = rewriterCache.getOrElseUpdate(st.toString(), new SequenceRewriter(strategyToRewriter(st.getS1), strategyToRewriter(st.getS2), sigmaDDFactory) with SigmaDDRewritingCache)

    override def caseUnion(st: Union) = rewriterCache.getOrElseUpdate(st.toString(), new UnionRewriter(strategyToRewriter(st.getS1), strategyToRewriter(st.getS2), sigmaDDFactory) with SigmaDDRewritingCache)

    override def caseIfThenElse(st: IfThenElse) = rewriterCache.getOrElseUpdate(st.toString(), new IfThenElseRewriter(strategyToRewriter(st.getS1()), strategyToRewriter(st.getS2), strategyToRewriter(st.getS3()), sigmaDDFactory) with SigmaDDRewritingCache)

    override def caseSimpleStrategy(st: SimpleStrategy) = rewriterCache.getOrElseUpdate(st.toString(), new SimpleSigmaDDRewriter(st, sigmaDDFactory) with SigmaDDRewritingCache)

    override def caseDeclaredStrategyInstance(strategyInstance: DeclaredStrategyInstance) = 
      rewriterCache.getOrElseUpdate(strategyInstance.toString(), new DeclaredStrategyRewriter(strategyInstance, ts, sigmaDDFactory) with SigmaDDRewritingCache)

  }).doSwitch(EcoreUtil.copy(strategyToRewrite))

  def unwindDeclaredStrategyInstance(strategy: DeclaredStrategyInstance, ts: TransitionSystem): Strategy = (new TsSwitch[Strategy] {
    override def caseDeclaredStrategyInstance(strategyInstance: DeclaredStrategyInstance) = unwindDeclaredStrategyInstance(strategy, ts)
    override def caseSimpleStrategy(st: SimpleStrategy) = st
    override def caseNot(st: Not) = (new TsSwitch[Strategy] {
      override def caseNot(st1: Not) = st1.getS()
    }).doSwitch(st.getS())
    override def defaultCase(obj: EObject) = throw new IllegalStateException("Invalid declared strategy after Not: %s".format(strategy.getName()))
  }).doSwitch(EcoreUtil.copy(ts.getDeclaredStrategyByName(strategy.getName()).getBody()))

  /**
   * Transforms a transition system to a rewriter for SigmaDDs.
   */
  def transitionSystemToStateSpaceRewriter(ts: TransitionSystem): SigmaDDRewriter =
    strategyToRewriter(
      StrategyDSL.FixPointStrategy(
        StrategyDSL.Union(StrategyDSL.Identity,
          ts.getTransitions() // takes only the strategies that are transitions
            .map(s => Try(EcoreUtil.copy(StrategyDSL.DeclaredStrategyInstance(s.getName()))))
            .reduce(
              (s1: Strategy, s2: Strategy) => StrategyDSL.Union(s1, s2)))))(ts)

  /**
   * Transforms a transition system to a rewriter for SigmaDDs with saturation.
   */
  def transitionSystemToStateSpaceRewriterWithSaturation(ts: TransitionSystem, firstStrat: NonVariableStrategy, n: Integer): SigmaDDRewriter = {
    def fullStateSpaceCaculation = StrategyDSL.Union(StrategyDSL.Identity, ts.getTransitions().map(s => Try(EcoreUtil.copy(StrategyDSL.DeclaredStrategyInstance(s.getName()))))
      .reduce((s1: Strategy, s2: Strategy) => StrategyDSL.Union(s1, s2)))
    def S = StrategyDSL.VariableStrategy("S")
    def Saturation(myS: Strategy) = StrategyDSL.DeclaredStrategyInstance("___Internal_Saturation", myS)
    ts
    .declareStrategy("___Internal_Saturation", S) {
        StrategyDSL.Sequence(
          StrategyDSL.FixPointStrategy(
          StrategyDSL.Choice(
            StrategyDSL.One(Saturation(S), n),
            StrategyDSL.FixPointStrategy(S))),
          StrategyDSL.FixPointStrategy(S))
      }(false) 
      if (firstStrat.isInstanceOf[Identity]) {
        strategyToRewriter(Saturation(fullStateSpaceCaculation))(ts)
      } else 
    strategyToRewriter(StrategyDSL.FixPointStrategy(StrategyDSL.Union(StrategyDSL.Identity, StrategyDSL.Union(Saturation(fullStateSpaceCaculation), firstStrat))))(ts)
  }

}