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

/**
 * Represents a declared strategy.
 *
 * @param label the name of this strategy.
 * @param body a non variable strategy the body of this declared strategy.
 * @param params the parameters of this declared strategy.
 *
 * @author mundacho
 *
 */
case class DeclaredStrategy(label: String, body: NonVariableStrategy, formalParameters: VariableStrategy*) {

  /**
   * Checks the syntax of the body.
   */
  def syntaxCheck(ts: TransitionSystem): (Boolean, String) = {
    checkSyntax(body, formalParameters: _*)(ts)
  }

  /**
   * Does the dirty work for syntaxCheck.
   * @param strategy the strategy to syntax check. In the first call should be the body.
   * @param params the formal parameters of the declared strategy
   * @return true if the declared strategy's body is syntax correct. Otherwise returns false and gives no indication of where is the fault.
   */
  private def checkSyntax(strategy: Strategy, params: VariableStrategy*)(implicit ts: TransitionSystem): (Boolean, String) = {
    strategy match {
      case Choice(s1, s2) => {
        val (result1, message1) = checkSyntax(s1, params: _*)
        val (result2, message2) = checkSyntax(s2, params: _*)
        (result1 && result2, message1 + message2)
      }
      case Fail => (true, "")
      case Identity => (true, "")
      case One(s) => checkSyntax(s, params: _*)
      case FixPointStrategy(s) => checkSyntax(s, params: _*)
      case Sequence(s1, s2) => {
        val (result1, message1) = checkSyntax(s1, params: _*)
        val (result2, message2) = checkSyntax(s2, params: _*)
        (result1 && result2, message1 + message2)
      }
      case Union(s1, s2) => {
        val (result1, message1) = checkSyntax(s1, params: _*)
        val (result2, message2) = checkSyntax(s2, params: _*)
        (result1 && result2, message1 + message2)
      }
      case v: VariableStrategy => if (params.toList.exists(elt => elt eq v)) (true, "") else {
        (false, DeclaredStrategy.errorInvalidVariable.format(v.name))
      }
      case SimpleStrategy(List(_, _*)) => (true, "")
      case strategyInstance @ DeclaredStrategyInstance(name, _*) => {
        // check if the strategy is already defined
        if (ts.strategyDeclarations.isDefinedAt(name)) {
          val theDeclaredStrategy = ts.strategyDeclarations(name).declaredStrategy
          // first check that the number of formal parameters is correct
          if (theDeclaredStrategy.formalParameters.size == strategyInstance.actualParams.size) {
            var (res, mes) = (true, "")
            for (param <- strategyInstance.actualParams) {
              val (result, message) = checkSyntax(param, params: _*)
              res &&= result
              mes += message
            }
            (res, mes)
          } else {
            (false, DeclaredStrategy.errorBadNumberOfParameters.format(
              theDeclaredStrategy.label, theDeclaredStrategy.formalParameters.size, strategyInstance.actualParams.size))
          }
        } else {
          (false, DeclaredStrategy.errorMessageStringNotDefined.format(name))
        }
      }
    }
  }
}

object DeclaredStrategy {
  val errorMessageStringNotDefined = "\nStrategy \"%s\" is not defined in the transition system"
  val errorBadNumberOfParameters = "\nStrategy %s does not have the good number of parameters. Expected %d and found %d"
  val errorInvalidVariable = "\nVariable %s does not reference the same variable in the parameters"
}
