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

import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.Equation

/**
 * Represents a transition system.
 *
 * @param adt the adt from where the terms of this transition system are created.
 * @param initialState the initial state of this transition system.
 * @param strategyDeclarations the declared strategies of this transition system.
 * @author mundacho
 *
 */
class TransitionSystem private (val adt: ADT, val initialState: ATerm, val strategyDeclarations: Map[String, StrategyDeclaration]) {
  require(initialState.adt eq adt)
  
  override def toString = 
    s"Transition System\n${adt.toString}\n"+
    s"Initial State = $initialState\n" +
    s"Strategy Declarations\n" +
    strategyDeclarations.map(e => s"${e._1} = ${e._2.declaredStrategy.body} [${e._2.isTransition}]").mkString("   ", "\n   ", "\n") 

  /**
   * Constructor creates transition system with no global transitions.
   * @param adt cf. main constructor.
   * @param initialState cf. main constructor.
   *
   */
  def this(adt: ADT, initialState: ATerm) {
    this(adt, initialState, Map.empty)
  }

  /**
   * Returns a transition system with a declared strategy that uses this
   * equation.
   * @param label the label for the equation.
   * @param equation the equation
   * @param isTransition true if the declared strategy is going to be used as a transition.
   */
  def declareStrategy(label: String, equation: Equation)(isTransition: Boolean): TransitionSystem = {
    declareStrategy(label, equation :: Nil)(isTransition)
  }

  /**
   * Returns a transition system with a declared strategy that uses this
   * equation.
   * @param label the label for the equation.
   * @param equations the equations for the simple strategy.
   * @param isTransition true if the declared strategy is going to be used as a transition.
   */
  def declareStrategy(label: String, equations: List[Equation])(isTransition: Boolean): TransitionSystem = {
    addDeclaredStrategy(DeclaredStrategy(label, SimpleStrategy(equations)))(isTransition)
  }

  private def addDeclaredStrategy(declaredStrategy: DeclaredStrategy)(isTransition: Boolean) = {
    require(!strategyDeclarations.contains(declaredStrategy.label), "A strategy with that name is already defined in this transition system")
    require(!isTransition || declaredStrategy.formalParameters.isEmpty) // being a transition implies that there are no formal parameters.
    val ts = new TransitionSystem(adt, initialState, strategyDeclarations + (declaredStrategy.label -> StrategyDeclaration(declaredStrategy, isTransition)))
    val (result, message) = declaredStrategy.syntaxCheck(ts)
    require(result, "There is a syntax error in the declaration of strategy: " + message)
    ts
  }

  /**
   * Returns a transition system with a new declared strategy.
   * @param label the name of the declared strategy.
   * @param isTransition true if the declared strategy is going to be used as a transition.
   * @param params the list of parameters that it uses.
   * @param body the body of the declared strategy.
   */
  def declareStrategy(label: String, params: VariableStrategy*)(body: NonVariableStrategy)(isTransition: Boolean): TransitionSystem = {
    addDeclaredStrategy(DeclaredStrategy(label, body, params: _*))(isTransition)
  }

}