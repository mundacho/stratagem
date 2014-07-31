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

package ch.unige.cui.smv.stratagem.ts

import ch.unige.cui.smv.metamodel.ts.VariableStrategy
import scala.collection.JavaConversions._
import ch.unige.cui.smv.metamodel.ts.Fail
import ch.unige.cui.smv.metamodel.ts.FixPointStrategy
import ch.unige.cui.smv.metamodel.ts.IfThenElse
import ch.unige.cui.smv.metamodel.ts.TransitionSystem
import ch.unige.cui.smv.metamodel.ts.Strategy
import ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.metamodel.ts.Not
import ch.unige.cui.smv.metamodel.ts.NonVariableStrategy
import ch.unige.cui.smv.metamodel.ts.Saturation
import ch.unige.cui.smv.metamodel.ts.SimpleStrategy
import ch.unige.cui.smv.metamodel.ts.One
import ch.unige.cui.smv.metamodel.ts.Choice
import ch.unige.cui.smv.metamodel.ts.Sequence
import ch.unige.cui.smv.metamodel.ts.Identity
import ch.unige.cui.smv.metamodel.ts.Union
import ch.unige.cui.smv.metamodel.ts.util.TsSwitch
import ch.unige.cui.smv.stratagem.util.StrategyDSL
import org.eclipse.emf.ecore.EObject
import ch.unige.cui.smv.metamodel.ts.DeclaredStrategy

/**
 * Represents a declared strategy. It knows how to check if it
 * is syntactically correct collaborating with the TransitionSystem class.
 *
 * @param label the name of this strategy.
 * @param body a non variable strategy the body of this declared strategy.
 * @param params the parameters of this declared strategy.
 *
 * @author mundacho
 *
 */
case class RichDeclaredStrategy(ds: DeclaredStrategy) {

  /**
   * Checks the syntax of the body.
   */
  def syntaxCheck(ts: TransitionSystem): (Boolean, String) = {
    checkSyntax(ds.getBody(), ds.getFormalParams(): _*)(ts)
  }

  /**
   * Does the dirty work for syntaxCheck.
   * @param strategy the strategy to syntax check. In the first call should be the body.
   * @param params the formal parameters of the declared strategy
   * @return true if the declared strategy's body is syntax correct. Otherwise returns false and gives no indication of where is the fault.
   */
  private def checkSyntax(strategy: Strategy, params: VariableStrategy*)(implicit ts: TransitionSystem): (Boolean, String) = (new TsSwitch[(Boolean, String)] {
    override def caseSaturation(strat: Saturation) = checkSyntax(strat.getS())
    override def caseChoice(strat: Choice) = {
      val (result1, message1) = checkSyntax(strat.getS1(), params: _*)
      val (result2, message2) = checkSyntax(strat.getS2(), params: _*)
      (result1 && result2, message1 + message2)
    }
    override def caseNot(strat: Not) = (new TsSwitch[(Boolean, String)] {
      override def caseSimpleStrategy(s1: SimpleStrategy) = (true, "")
      override def caseNot(s1: Not) = checkSyntax(StrategyDSL.Not(s1.getS), params: _*)
      override def caseVariableStrategy(s1: VariableStrategy) = (true, "")
      override def caseDeclaredStrategyInstance(strategyInstance: DeclaredStrategyInstance) = checkDeclaredStrategyCanBeAfterNot(strategyInstance.getName(), strategyInstance, params: _*)
      override def defaultCase(s1: EObject) = (false, RichDeclaredStrategy.errorNotStrategy.format(s1.toString()))
    }).doSwitch(strat.getS)
    override def caseFail(s1: Fail) = (true, "")
    override def caseIdentity(s1: Identity) = (true, "")
    override def caseOne(s1: One) = checkSyntax(s1.getS, params: _*)
    override def caseFixPointStrategy(s1: FixPointStrategy) = checkSyntax(s1.getS, params: _*)
    override def caseSequence(strat: Sequence) = {
      val (result1, message1) = checkSyntax(strat.getS1(), params: _*)
      val (result2, message2) = checkSyntax(strat.getS2(), params: _*)
      (result1 && result2, message1 + message2)
    }
    override def caseUnion(strat: Union) = {
      val (result1, message1) = checkSyntax(strat.getS1(), params: _*)
      val (result2, message2) = checkSyntax(strat.getS2(), params: _*)
      (result1 && result2, message1 + message2)
    }
    override def caseIfThenElse(strat: IfThenElse) = {
      val (result1, message1) = checkSyntax(strat.getS1(), params: _*)
      val (result2, message2) = checkSyntax(strat.getS2(), params: _*)
      val (result3, message3) = checkSyntax(strat.getS3(), params: _*)
      (result1 && result2 && result3, message1 + message2 + message3)
    }
    override def caseVariableStrategy(strat: VariableStrategy) = if (params.toList.exists(elt => (elt.getName() == strat.getName()))) (true, "") else {
      (false, RichDeclaredStrategy.errorInvalidVariable.format(strat.getName()))
    }
    override def caseSimpleStrategy(s1: SimpleStrategy) = (true, "")
    override def caseDeclaredStrategyInstance(strategyInstance: DeclaredStrategyInstance) = checkSyntaxForDeclaredStrategy(strategyInstance.getName(), strategyInstance, params: _*)
    
  }).doSwitch(strategy)

  def checkDeclaredStrategyCanBeAfterNot(name: String, strategyInstance: DeclaredStrategyInstance, params: VariableStrategy*)(implicit ts: TransitionSystem): (Boolean, String) = {
    // check if the strategy is already defined
    if (ts.getDeclaredStrategyByName(name) != null) {
      val theDeclaredStrategy = ts.getDeclaredStrategyByName(name)
      // first check that the number of formal parameters is correct
      if (theDeclaredStrategy.getFormalParams().size == 0) { // we require no params for strategies in a Not
        (new TsSwitch[(Boolean, String)] {
                override def caseSimpleStrategy(s1: SimpleStrategy) = (true, "")
                override def caseNot(s1: Not) = checkSyntax(StrategyDSL.Not(s1.getS), params: _*) // we have a double not, we check the syntax of Not(s), just to be sure that declared strategies are treated right
                    override def caseDeclaredStrategyInstance(strategyInstance: DeclaredStrategyInstance) = checkDeclaredStrategyCanBeAfterNot(strategyInstance.getName(), strategyInstance, params: _*)
                 override def defaultCase(s1: EObject) =  (false, RichDeclaredStrategy.errorNotStrategy.format(s1))   
        }).doSwitch(theDeclaredStrategy.getBody())
      } else {
        (false, RichDeclaredStrategy.errorDeclareedStrategyInvalidParamsAfterNot.format(
          theDeclaredStrategy.getName()))
      }
    } else {
      (false, RichDeclaredStrategy.errorMessageStringNotDefined.format(name))
    }
  }

  def checkSyntaxForDeclaredStrategy(name: String, strategyInstance: DeclaredStrategyInstance, params: VariableStrategy*)(implicit ts: TransitionSystem) = {
    // check if the strategy is already defined
    if (ts.getDeclaredStrategyByName(name) != null) {
      val theDeclaredStrategy = ts.getDeclaredStrategyByName(name)
      // first check that the number of formal parameters is correct
      if (theDeclaredStrategy.getFormalParams().size == strategyInstance.getActualParams().size) {
        var (res, mes) = (true, "")
        for (param <- strategyInstance.getActualParams()) {
          val (result, message) = checkSyntax(param, params: _*)
          res &&= result
          mes += message
        }
        (res, mes)
      } else {
        (false, RichDeclaredStrategy.errorBadNumberOfParameters.format(
          theDeclaredStrategy.getName(), theDeclaredStrategy.getFormalParams().size, strategyInstance.getActualParams().size))
      }
    } else {
      (false, RichDeclaredStrategy.errorMessageStringNotDefined.format(name))
    }
  }
}

object RichDeclaredStrategy {
  val errorMessageStringNotDefined = "\nStrategy \"%s\" is not defined in the transition system"
  val errorBadNumberOfParameters = "\nStrategy %s does not have the good number of parameters. Expected %d and found %d"
  val errorNotStrategy = "\nStrategy Not only accepts SimpleStrategy and Not strategies as parameters. Found %s"
  val errorDeclareedStrategyInvalidParamsAfterNot = "\nStrategy Not only accepts declared strategies with no parameters as argument. Found %s"
  val errorInvalidVariable = "\nVariable %s does not reference the same variable in the parameters"
}
