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

import ch.unige.cui.smv.metamodel.ts.DeclaredStrategy
import ch.unige.cui.smv.metamodel.ts.NonVariableStrategy
import ch.unige.cui.smv.metamodel.ts.TransitionSystem
import ch.unige.cui.smv.metamodel.ts.TsFactory
import ch.unige.cui.smv.metamodel.ts.VariableStrategy
import ch.unige.smv.cui.metamodel.adt.Equation

/**
 * Adds a rich and more scala-idiomtic interface to the standard transition system.
 *
 * @author mundacho
 *
 */
class RichTransitionSystem(val ts: TransitionSystem) {

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
    val st = TsFactory.eINSTANCE.createSimpleStrategy()
    for (eq <- equations) st.getEquations().add(eq)
    val declaredStrat = TsFactory.eINSTANCE.createDeclaredStrategy()
    declaredStrat.setName(label)
    declaredStrat.setBody(st)
    addDeclaredStrategy(declaredStrat)(isTransition)
  }

  private def addDeclaredStrategy(declaredStrategy: DeclaredStrategy)(isTransition: Boolean) = {
    require(ts.getDeclaredStrategyByName(declaredStrategy.getName()) == null, s"A strategy with the name ${declaredStrategy.getName()} is already defined in this transition system")
    require(!isTransition || declaredStrategy.getFormalParams().isEmpty) // being a transition implies that there are no formal parameters.
    if (isTransition) ts.getTransitions().add(declaredStrategy) else ts.getAuxiliary().add(declaredStrategy)
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
    val declaredStrat = TsFactory.eINSTANCE.createDeclaredStrategy()
    declaredStrat.setName(label)
    for (param <- params) declaredStrat.getFormalParams().add(param)
    declaredStrat.setBody(body)
    addDeclaredStrategy(declaredStrat)(isTransition)
  }

}