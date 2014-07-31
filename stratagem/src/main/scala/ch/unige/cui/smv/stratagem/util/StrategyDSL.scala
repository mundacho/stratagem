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
package ch.unige.cui.smv.stratagem.util

import ch.unige.cui.smv.metamodel.ts.TsFactory
import ch.unige.cui.smv.metamodel.ts.Strategy
import ch.unige.cui.smv.metamodel.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.RichTransitionSystem
import ch.unige.smv.cui.metamodel.adt.Equation
import ch.unige.smv.cui.metamodel.adt.ADT
import ch.unige.smv.cui.metamodel.adt.ATerm

/**
 * @author mundacho
 *
 */
object StrategyDSL {

  implicit def transitionSystem2RichTransitionSystem(ts: TransitionSystem) = new RichTransitionSystem(ts)

  def Identity = TsFactory.eINSTANCE.createIdentity();
  def Fail = TsFactory.eINSTANCE.createFail();
  def Choice(S1: Strategy, S2: Strategy) = {
    val strat = TsFactory.eINSTANCE.createChoice()
    strat.setS1(S1)
    strat.setS2(S2)
    strat
  }
  def Sequence(S1: Strategy, S2: Strategy) = {
    val strat = TsFactory.eINSTANCE.createSequence()
    strat.setS1(S1)
    strat.setS2(S2)
    strat
  }

  def VariableStrategy(name: String) = {
    val strat = TsFactory.eINSTANCE.createVariableStrategy()
    strat.setName(name)
    strat
  }

  def Union(S1: Strategy, S2: Strategy) = {
    val strat = TsFactory.eINSTANCE.createUnion()
    strat.setS1(S1)
    strat.setS2(S2)
    strat
  }

  def Not(S: Strategy) = {
    val strat = TsFactory.eINSTANCE.createNot()
    strat.setS(S)
    strat
  }

  def FixPointStrategy(S: Strategy) = {
    val strat = TsFactory.eINSTANCE.createFixPointStrategy()
    strat.setS(S)
    strat
  }

  def One(S: Strategy, n: Int) = {
    val strat = TsFactory.eINSTANCE.createOne()
    strat.setS(S)
    strat.setN(n)
    strat
  }

  def One(S: Strategy) = {
    val strat = TsFactory.eINSTANCE.createOne()
    strat.setS(S)
    strat.setN(0)
    strat
  }

  def Saturation(S: Strategy, n: Int) = {
    val strat = TsFactory.eINSTANCE.createSaturation()
    strat.setS(S)
    strat.setN(n)
    strat
  }

  def Try(S: Strategy) = {
    Choice(S, Identity)
  }

  def DeclaredStrategyInstance(name: String, params: Strategy*) = {
    val strat = TsFactory.eINSTANCE.createDeclaredStrategyInstance()
    strat.setName(name)
    for (st <- params) strat.getActualParams().add(st)
    strat
  }

  def IfThenElse(S1: Strategy, S2: Strategy, S3: Strategy) = {
    val strat = TsFactory.eINSTANCE.createIfThenElse()
    strat.setS1(S1)
    strat.setS2(S2)
    strat.setS3(S3)
    strat
  }

  def SimpleStrategy(equations: List[Equation]) = {
    val strat = TsFactory.eINSTANCE.createSimpleStrategy()
    for (eq <- equations) strat.getEquations().add(eq)
    strat
  }

  def TransitionSystem(adt: ADT, initialState: ATerm) = {
    require(initialState.getAdt() eq adt)
    val myTS = TsFactory.eINSTANCE.createTransitionSystem()
    myTS.setAdt(adt)
    myTS.setInitialState(initialState)
    myTS
  }

}