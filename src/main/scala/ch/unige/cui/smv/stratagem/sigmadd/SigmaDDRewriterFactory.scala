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
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy

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
    case strategyInstance @ DeclaredStrategyInstance(name, actualParams @ _*) => new DeclaredStrategyRewriter(strategyInstance, ts) with SigmaDDRewritingCache
    case FixPointStrategy(s) => new FixpointRewriter(strategyToRewriter(s))
  }

}