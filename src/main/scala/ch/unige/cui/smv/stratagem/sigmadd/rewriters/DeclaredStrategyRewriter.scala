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

import com.typesafe.scalalogging.slf4j.Logging
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Fail
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.IfThenElse
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.Not

/**
 * Implements a rewriter for a declared strategy.
 * @param declaredStrategy the strategy to transform.
 * @param ts the transition system where this declared strategy is used.
 * It is needed to find other declared strategies in its body.
 */
private[sigmadd] case class DeclaredStrategyRewriter(declaredStrategy: DeclaredStrategyInstance, ts: TransitionSystem) extends SigmaDDRewriter with Logging {

  override lazy val toString = (new StringBuilder("DeclaredStrategyRewriter(") append declaredStrategy.toString append ")").toString

  override lazy val hashCode = (this.getClass(), declaredStrategy, ts).hashCode

  override def equals(obj: Any): Boolean = obj match {
    case that @ DeclaredStrategyRewriter(decStrat, transSys) => (this eq that) || ((declaredStrategy == decStrat) && (ts == transSys))
    case _ => false
  }

  /**
   * A map containing the values of the parameters.
   */
  lazy val formalToActualParameterMap = Map((ts.strategyDeclarations(declaredStrategy.name).declaredStrategy.formalParameters zip declaredStrategy.actualParams).toArray: _*)

  /**
   * The actual rewriter that this strategy uses.
   */
  lazy val rewriter = SigmaDDRewriterFactory.strategyToRewriter(instanciate(ts.strategyDeclarations(declaredStrategy.name).declaredStrategy.body))(ts)

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
    logger.trace(s"Entering strategy ${declaredStrategy.name}")
//    if(declaredStrategy.name.startsWith("checkForProc_P_0")) logger.trace(sigmaDD.toString)
    rewriter(sigmaDD) match {
      case Some(r) =>
        logger.trace(s"Strategy ${declaredStrategy.name} succeeded")
        Some(r)
      case None =>
        logger.trace(s"Strategy ${declaredStrategy.name} failed")
        None
    }
  }
  /**
   * We instanciate the variables of a strategy with variables.
   * @oaram strategy the strategy that we are intanciating.
   * @return strategy with a concrete strategy in each parameter.
   */
  private def instanciate(strategy: Strategy): Strategy = strategy match {
    case Choice(s1, s2) => Choice(instanciate(s1), instanciate(s2))
    case Try(s) => instanciate(Choice(s, Identity))
    case Fail => Fail
    case Identity => Identity
    case One(s, n) => One(instanciate(s), n)
    case Not(s @ SimpleStrategy(List(_, _*))) => Not(s)
    case Not(s @ DeclaredStrategyInstance(_)) => Not(s)
    case Not(v: VariableStrategy) => Not(formalToActualParameterMap(v))
    case FixPointStrategy(s) => FixPointStrategy(instanciate(s))
    case Sequence(s1, s2) => Sequence(instanciate(s1), instanciate(s2))
    case Union(s1, s2) => Union(instanciate(s1), instanciate(s2))
    case IfThenElse(s1, s2, s3) => IfThenElse(instanciate(s1), instanciate(s2), instanciate(s3))
    case v: VariableStrategy => formalToActualParameterMap(v)
    case s @ SimpleStrategy(List(_, _*)) => s
    case strategyInstance @ DeclaredStrategyInstance(name, actualParams @ _*) => DeclaredStrategyInstance(name, actualParams.map(instanciate(_)).toArray: _*)
  }

}