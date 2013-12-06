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

import ch.unige.cui.smv.stratagem.ts.GALAssignment
import ch.unige.cui.smv.stratagem.ts.GALPredicate

import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Fail
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Saturation
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.IfThenElse
/**
 * Represents a factory of rewriters.
 */
object SigmaDDRewriterFactory {

  private var rewriterCache = scala.collection.mutable.HashMap[Strategy, SigmaDDRewriter]()

  def resetOperationCaches { rewriterCache = scala.collection.mutable.HashMap[Strategy, SigmaDDRewriter]() }

  /**
   * Transforms a strategy to a SigmaDD rewriter.
   * @param s the strategy to be transformed.
   * @param ts the transition system in which the strategies are (it is necessary to obtain the declarations of the strategies)
   */
  def strategyToRewriter(s: Strategy)(implicit ts: TransitionSystem): SigmaDDRewriter = s match {
    case st: SimpleStrategy => rewriterCache.getOrElseUpdate(st, new SimpleSigmaDDRewriter(st))
    case st @ Choice(s1, s2) => rewriterCache.getOrElseUpdate(st, new ChoiceRewriter(strategyToRewriter(s1), strategyToRewriter(s2)))
    case Fail => FailRewriter
    case Identity => IdentityRewriter
    case st @ Union(s1, s2) => rewriterCache.getOrElseUpdate(st, new UnionRewriter(strategyToRewriter(s1), strategyToRewriter(s2)) with SigmaDDRewritingCache)
    case strategyInstance @ DeclaredStrategyInstance(name, actualParams @ _*) =>
      rewriterCache.getOrElseUpdate(strategyInstance, new DeclaredStrategyRewriter(strategyInstance, ts) with SigmaDDRewritingCache)
    case st @ One(s1, n) => rewriterCache.getOrElseUpdate(st, new OneRewriter(strategyToRewriter(s1), n))
    case st @ FixPointStrategy(s) => rewriterCache.getOrElseUpdate(st, new FixpointRewriter(strategyToRewriter(s)))
    case st @ Sequence(s1, s2) => rewriterCache.getOrElseUpdate(st, new SequenceRewriter(strategyToRewriter(s1), strategyToRewriter(s2)))
    case st @ Try(s1) => rewriterCache.getOrElseUpdate(st, strategyToRewriter(Choice(s1, Identity)))
    case st @ IfThenElse(s1, s2, s3) => rewriterCache.getOrElseUpdate(st, new IfThenElseRewriter(strategyToRewriter(s1), strategyToRewriter(s2), strategyToRewriter(s3)) )
    case st @ Saturation(s, n) => rewriterCache.getOrElseUpdate(st, strategyToRewriter(Sequence(Choice(One(Saturation(s, n), n), FixPointStrategy(s)), FixPointStrategy(s))))
    case st @ GALAssignment(l, r) => rewriterCache.getOrElseUpdate(st, new GALAssignmentRewriter(l, r, ts))
    case st @ GALPredicate(b) => rewriterCache.getOrElseUpdate(st, new Predicate(b, ts))
  }

  /**
   * Transforms a transition system to a rewriter for SigmaDDs.
   */
  def transitionSystemToStateSpaceRewriter(ts: TransitionSystem): SigmaDDRewriter =
    strategyToRewriter(
      FixPointStrategy(
        Union(Identity,
          ts.strategyDeclarations
            .filter(_._2.isTransition) // takes only the strategies that are transitions
            .map(s => Try(s._2.declaredStrategy.body))
            .reduce(
              (s1: Strategy, s2: Strategy) => Union(s1, s2)))))(ts)

  /**
   * Transforms a transition system to a rewriter for SigmaDDs with saturation.
   */
  def transitionSystemToStateSpaceRewriterWithSaturation(ts: TransitionSystem, firstStrat: NonVariableStrategy, n: Integer): SigmaDDRewriter = {
    val fullStateSpaceCaculation = Union(Identity, ts.strategyDeclarations.filter(_._2.isTransition).map(s => Try(s._2.declaredStrategy.body))
      .reduce((s1: Strategy, s2: Strategy) => Union(s1, s2)))
    strategyToRewriter(Union(Saturation(fullStateSpaceCaculation, n),
      FixPointStrategy(Union(firstStrat, Saturation(fullStateSpaceCaculation, n)))))(ts)
  }

}