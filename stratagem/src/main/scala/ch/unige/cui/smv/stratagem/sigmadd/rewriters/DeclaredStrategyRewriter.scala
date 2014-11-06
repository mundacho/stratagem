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
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl
import ch.unige.cui.smv.metamodel.ts.VariableStrategy
import ch.unige.cui.smv.metamodel.ts.Fail
import ch.unige.cui.smv.metamodel.ts.FixPointStrategy
import ch.unige.cui.smv.metamodel.ts.IfThenElse
import ch.unige.cui.smv.metamodel.ts.Choice
import ch.unige.cui.smv.metamodel.ts.Sequence
import ch.unige.cui.smv.metamodel.ts.Union
import ch.unige.cui.smv.metamodel.ts.TransitionSystem
import ch.unige.cui.smv.metamodel.ts.Strategy
import ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.metamodel.ts.Not
import ch.unige.cui.smv.metamodel.ts.Saturation
import ch.unige.cui.smv.metamodel.ts.SimpleStrategy
import ch.unige.cui.smv.metamodel.ts.util.TsSwitch
import ch.unige.cui.smv.stratagem.util.StrategyDSL
import ch.unige.cui.smv.metamodel.ts.One
import ch.unige.cui.smv.metamodel.ts.Identity
import scala.collection.JavaConversions._
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Implements a rewriter for a declared strategy.
 * @param declaredStrategy the strategy to transform.
 * @param ts the transition system where this declared strategy is used.
 * It is needed to find other declared strategies in its body.
 */
private[sigmadd] case class DeclaredStrategyRewriter(declaredStrategy: DeclaredStrategyInstance, ts: TransitionSystem, override val sigmaDDFactory: SigmaDDFactoryImpl) extends SigmaDDRewriter(sigmaDDFactory) with Logging {

  override lazy val toString = (new StringBuilder("DeclaredStrategyRewriter(") append declaredStrategy.toString append ")").toString

  override lazy val hashCode = (this.getClass(), declaredStrategy, ts).hashCode

  override def equals(obj: Any): Boolean = obj match {
    case that @ DeclaredStrategyRewriter(decStrat, transSys, _) => (this eq that) || ((declaredStrategy == decStrat) && (ts == transSys))
    case _ => false
  }

  /**
   * A map containing the values of the parameters.
   */
  lazy val formalToActualParameterMap = {
    val initialList = ts.getDeclaredStrategyByName(declaredStrategy.getName()).getFormalParams().map(_.getName()) zip declaredStrategy.getActualParams()
    Map(initialList.toArray: _*)
  }

  /**
   * The actual rewriter that this strategy uses.
   */
  lazy val rewriter = sigmaDDFactory.rewriterFactory.strategyToRewriter(instanciate(
    ts.getDeclaredStrategyByName(declaredStrategy.getName()).getBody()))(ts)

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
    rewriter(sigmaDD) match {
      case Some(r) =>
        logger.trace(s"Entered strategy ${declaredStrategy.toString}")
        logger.trace("List of input terms:")
        logger.trace(sigmaDD.listOfTermsAsString.mkString("\n"))
        logger.trace(s"Strategy ${declaredStrategy.toString} succeeded.")
        logger.trace("List of produced terms:")
        logger.trace(r.listOfTermsAsString.mkString("\n"))
        Some(r)
      case None =>
        logger.trace(s"Entered strategy ${declaredStrategy.toString}")
        logger.trace("List of input terms:")
        logger.trace(sigmaDD.listOfTermsAsString.mkString("\n"))
        logger.trace(s"Strategy ${declaredStrategy.toString} failed")
        None
    }
  }

  /**
   * We instanciate the variables of a strategy with variables.
   * @oaram strategy the strategy that we are intanciating.
   * @return strategy with a concrete strategy in each parameter.
   */
  private def instanciate(strategy: Strategy): Strategy = (new TsSwitch[Strategy] {

    override def caseSaturation(strat: Saturation) = StrategyDSL.Saturation(doSwitch(strat.getS()), strat.getN())

    override def caseChoice(strat: Choice) = StrategyDSL.Choice(doSwitch(strat.getS1()), doSwitch(strat.getS2()))

    override def caseFail(strat: Fail) = StrategyDSL.Fail

    override def caseIdentity(strat: Identity) = StrategyDSL.Identity

    override def caseOne(strat: One) = StrategyDSL.One(doSwitch(strat.getS()), strat.getN())

    override def caseNot(strat: Not) = (new TsSwitch[Strategy] {
      override def caseSimpleStrategy(s: SimpleStrategy) = StrategyDSL.Not(s)
      override def caseDeclaredStrategyInstance(s: DeclaredStrategyInstance) = StrategyDSL.Not(s)
      override def caseVariableStrategy(v: VariableStrategy) = StrategyDSL.Not(EcoreUtil.copy(formalToActualParameterMap(v.getName())))
    }).doSwitch(strat.getS())

    override def caseFixPointStrategy(strat: FixPointStrategy) = {
      if (strat.getS() == null) {
        println()
      }
      StrategyDSL.FixPointStrategy(doSwitch(strat.getS()))
    }

    override def caseSequence(strat: Sequence) = StrategyDSL.Sequence(doSwitch(strat.getS1()), doSwitch(strat.getS2()))

    override def caseUnion(strat: Union) = StrategyDSL.Union(doSwitch(strat.getS1()), doSwitch(strat.getS2()))

    override def caseIfThenElse(strat: IfThenElse) = StrategyDSL.IfThenElse(doSwitch(strat.getS1()), doSwitch(strat.getS2()), doSwitch(strat.getS3()))

    override def caseVariableStrategy(v: VariableStrategy) = EcoreUtil.copy(formalToActualParameterMap(v.getName()))

    override def caseSimpleStrategy(strat: SimpleStrategy) = strat

    override def caseDeclaredStrategyInstance(strat: DeclaredStrategyInstance) = StrategyDSL.DeclaredStrategyInstance(strat.getName(), strat.getActualParams().map(instanciate(_)).toArray: _*)
  }).doSwitch(strategy)

}