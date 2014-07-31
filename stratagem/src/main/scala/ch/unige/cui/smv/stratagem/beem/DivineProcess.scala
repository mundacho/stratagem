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
package ch.unige.cui.smv.stratagem.beem

import ch.unige.cui.smv.stratagem.util.AuxFunctions
import ch.unige.cui.smv.stratagem.beem.expressions.BooleanExpression
import ch.unige.cui.smv.stratagem.beem.expressions.VoidExpression
import ch.unige.cui.smv.stratagem.beem.expressions.DivineExpression
import ch.unige.cui.smv.stratagem.beem.expressions.Var
import ch.unige.cui.smv.stratagem.beem.expressions.Darray
import ch.unige.cui.smv.stratagem.beem.expressions.LessThan
import ch.unige.cui.smv.stratagem.beem.expressions.And
import ch.unige.cui.smv.stratagem.beem.expressions.Or
import ch.unige.cui.smv.stratagem.beem.expressions.IsEqual
import ch.unige.cui.smv.stratagem.beem.expressions.IsDifferent
import ch.unige.cui.smv.stratagem.beem.expressions.True
import ch.unige.cui.smv.stratagem.beem.expressions.Plus
import ch.unige.cui.smv.stratagem.beem.expressions.Minus
import ch.unige.cui.smv.stratagem.beem.expressions.Value
import ch.unige.cui.smv.stratagem.beem.expressions.Assign
import ch.unige.cui.smv.stratagem.beem.expressions.Noop

/**
 * Represents a Divine process.
 *
 * @param name the process's name.
 * @param possibleStates the possible states of the process.
 * @param initialState the initial state of the process.
 * @param variables a map mapping variable names to variable declarations.
 * @param transition a list of model transitions.
 * @author mundacho
 *
 */
case class DivineProcess private (
  val name: String,
  val possibleStates: Set[Symbol],
  val initialState: Symbol,
  val variables: Map[String, DivineVariable],
  val transitions: List[DivineTransition],
  val container: Option[DivineModel] = None) {
  require((AuxFunctions.identifierPattern unapplySeq name) != None, s"Invalid name $name for process.")
  require(possibleStates.contains(initialState), "The initial state is not a possible state.")

  def this(name: String, possibleStates: Set[Symbol], initialState: Symbol) {
    this(name, possibleStates, initialState, Map.empty, Nil, None)
  }

  /**
   * Declares an int variable.
   * @param nameSymbol a symbol representing the name of the variable.
   * @param initialVauel the initial value of the variable, when omitted its value is 0.
   * @return a new divine model with the int variable declared.
   */
  def declareIntVariable(nameSymbol: Symbol, initialValue: Int = 0) = {
    require(!variables.contains(nameSymbol.name), s"There is a variable with name ${nameSymbol.name} already in the this process.")
    this.copy(variables = variables + DivineIntVariable(nameSymbol.name, initialValue).asTuple)
  }

  /**
   * Declares a new array variable. Declaration defines the value of the array to an array containing all values equal to zero.
   *
   * @param nameSymbol a symbol representing the name of the array.
   * @param size the size of the array
   * @return a new divine model with the array declared.
   *
   */
  def declareArrayVariable(nameSymbol: Symbol, size: Int) = {
    require(!variables.contains(nameSymbol.name), s"There is a variable with name ${nameSymbol.name} already in the this process.")
    require(size > 0, s"Invalid size $size for array ${nameSymbol}.name")
    this.copy(variables = variables + DivineArrayVariable(nameSymbol.name, Array(size)).asTuple)
  }

  /**
   * Declares a transition in the model.
   * @param stateChange is a tuple where the first entry is the process's state before the execution of the transition
   * and the second entry is the process's state after the execution of the transition.
   * @param guard represents the guard of the transition
   * @param effects a list of expressions representing the changes in the global variables and the process's variables
   * @result a new process with the corresponding transition.
   */
  def declareTransition(stateChange: (Symbol, Symbol), guard: BooleanExpression, effects: VoidExpression*) = {
    require(possibleStates.contains(stateChange._1), s"State ${stateChange._1} is not a valid state in process $name. Transition ${transitions.size + 1}")
    require(possibleStates.contains(stateChange._2), s"State ${stateChange._1} is not a valid state in process $name. Transition ${transitions.size + 1}")
    this.copy(transitions = (new DivineTransition(stateChange, guard, effects: _*)) :: transitions)
  }

  def checkVariables(expr: DivineExpression): (Boolean, String) = {
    def checkBinaryOp(m: DivineExpression, n: DivineExpression) = {
      val res1 = checkVariables(m)
      val res2 = checkVariables(n)
      (res1._1 && res2._1, res1._2 + "\n" + res2._2)
    }

    def checkName(name: String) = if (this.variables.contains(name) || this.container.get.globalVariables.contains(name)) (true, "") else (false, s"Variable $name is not defined in model.")

    expr match {
      case Var(name) => checkName(name)
      case Darray(name, _) => checkName(name)
      case LessThan(m, n) => checkBinaryOp(m, n)
      case And(m, n) => checkBinaryOp(m, n)
      case Or(m, n) => checkBinaryOp(m, n)
      case IsDifferent(m, n) => checkBinaryOp(m, n)
      case IsEqual(m, n) => checkBinaryOp(m, n)
      case Plus(m, n) => checkBinaryOp(m, n)
      case Minus(m, n) => checkBinaryOp(m, n)
      case Value(_) => (true, "")
      case True => (true, "")
      case Assign(m, n) => checkBinaryOp(m, n)
      case Noop => (true, "")
    }
  }

}