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
package ch.unige.cui.smv.stratagem.transformers.beem

import scala.language.implicitConversions

import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.beem.DivineArrayVariable
import ch.unige.cui.smv.stratagem.beem.DivineIntVariable
import ch.unige.cui.smv.stratagem.beem.DivineModel
import ch.unige.cui.smv.stratagem.beem.DivineProcess
import ch.unige.cui.smv.stratagem.beem.DivineTransition
import ch.unige.cui.smv.stratagem.beem.DivineVariable
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionExpressionHelper.createTransitionSystemForBinExp
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionExpressionHelper.createTransitionSystemForVoidExpressions
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.A1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_FUNCTOR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.BOOL_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.EMPTY_ARRAY_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.EMPTY_STATE_CONSTANT
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.I1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.I2_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.INT_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.INT_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.N1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.N2_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NAT_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NZ1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NZ2_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NZ3_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NZNAT_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.PROC_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.S1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.STACK_ELT_VARIABLE_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.STATECOMP_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.STATE_VAR_FUNCTOR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.SUC_FUNCTOR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.TOP_STACK_VARIABLE_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.V1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.VARIABLE_NAME_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ZERO_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.basicSignature
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.IfThenElse
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.Not
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.VariableStrategy

/**
 * Translates a Beem model to a transition system.
 * @author mundacho
 *
 */
object BEEMModel2TransitionSystem extends ((DivineModel) => TransitionSystem) {

  // Auxiliary functions
  def findProcStrategyName(procName: String) = "findProc_" + procName
  def checkForProcStrategyName(procName: String) = "checkForProc_" + procName
  def findVarStrategyName(varName: String) = "findVar_" + varName
  def checkForVarStrategyName(varName: String) = "checkForVar_" + varName
  def checkForArrStrategyName(varName: String) = "checkForArr_" + varName
  def findArrStrategyName(varName: String) = "findArr_" + varName

  /**
   * Transforms a string into its equivalent term for the implicit adt. 
   * @note Pre-condition: The string is a constant's name in the adt.
   * @param name the name of a constant in the adt.
   * @param adt the adt where the constant is define.
   * @return a term of the adt.
   */  
  implicit def string2VariableTerm(name: String)(implicit adt: ADT) = adt.term(name)
  
  /**
   * Transforms a number into its corresponding term.
   * @note Pre-condition: The adt contains a definition of terms.
   * @param n The integer to be converted.
   * @param adt the adt to which the newly created term will belong. 
   * @return a term of the adt
   */
  implicit def int2ATerm(n: Int)(implicit adt: ADT): ATerm = n match {
    case 0 => adt.term(ZERO_CONSTANT_NAME)
    case _ => if (n > 0) adt.term(SUC_FUNCTOR_NAME, int2ATerm(n - 1)) else adt.term("-", int2ATerm(-n))
  }

  def createInitialState(model: DivineModel)(implicit a: ADT) = {
    def createValuesForArray(ints: List[Int]): ATerm = ints match {
      case Nil => EMPTY_ARRAY_CONSTANT_NAME
      case i :: tail => a.term(ARRAY_FUNCTOR_NAME, i, createValuesForArray(tail))
    }
    def createVariables(globalVariables: List[DivineVariable], currentState: ATerm): ATerm = {
      globalVariables match {
        case Nil => currentState
        case variable :: tail => variable match {
          case DivineIntVariable(name, value) => a.term(INT_VAR_FUNCTOR, variable.name, value, createVariables(tail, currentState))
          case DivineArrayVariable(name, values) =>
            a.term(ARRAY_VAR_FUNCTOR,
              variable.name,
              createValuesForArray(values.toList),
              createVariables(tail, currentState))
        }
      }
    }
    def createProcessesState(processes: List[DivineProcess]): ATerm = processes match {
      case Nil => EMPTY_STATE_CONSTANT
      case proc :: tail => a.term(PROC_VAR_FUNCTOR, proc.name, createProcess(proc), createProcessesState(tail))
    }

    def createProcess(proc: DivineProcess): ATerm =
      a.term(STATE_VAR_FUNCTOR_NAME, proc.name, proc.initialState.name, createVariables(proc.variables.map(_._2).toList.sortBy(_.name), EMPTY_STATE_CONSTANT))
    createVariables(model.globalVariables.map(_._2).toList, createProcessesState(model.processes.sortBy(_.name)))
  }

  def RewriteSetWith(s: Strategy) = DeclaredStrategyInstance("rewriteSetWith", s)
  val V1 = VariableStrategy("V1")
  val V2 = VariableStrategy("V2")

  private[beem] def ifNotContained(name: String, initialTS: TransitionSystem)(ts: => TransitionSystem) =
    if (initialTS.strategyDeclarations.isDefinedAt(name)) initialTS else ts

  def createTransitionSystemForProcesses(processes: List[DivineProcess], initialTS: TransitionSystem)(implicit a: ADT): TransitionSystem = processes match {
    case Nil => initialTS
    case head :: tail => createTransitionSystemForProcesses(tail, createTransitionSystemForProc(head, initialTS))
  }

  def createTransitionSystemForProc(proc: DivineProcess, initialTS: TransitionSystem)(implicit a: ADT) = {
    // create check for proc strategy
    val newTS = initialTS
      .declareStrategy(checkForProcStrategyName(proc.name),
        a.term(PROC_VAR_FUNCTOR, proc.name, "s1", "s2") -> a.term(PROC_VAR_FUNCTOR, proc.name, "s1", "s2"))(false)
      .declareStrategy(findProcStrategyName(proc.name), V1) { // finds term and applies V1 to it
        IfThenElse(DeclaredStrategyInstance(checkForProcStrategyName(proc.name)),
          V1,
          One(DeclaredStrategyInstance(findProcStrategyName(proc.name), V1), 3))
      }(false)
    createTransitionSystemForTransitions(proc, proc.transitions, 0, newTS)
  }

  def createTransitionSystemForTransitions(
    proc: DivineProcess,
    transitions: List[DivineTransition],
    transitionNumber: Int,
    initialTS: TransitionSystem)(implicit adt: ADT): TransitionSystem = transitions match {
    case Nil => initialTS
    case transition :: tail =>
      createTransitionSystemForTransitions(proc, tail, transitionNumber + 1, createTransitionSystemForTransition(proc, transition, transitionNumber, initialTS))
  }

  def createTransitionSystemForTransition(
    proc: DivineProcess,
    transition: DivineTransition,
    transitionNumber: Int,
    initialTS: TransitionSystem)(implicit adt: ADT): TransitionSystem = {
    implicit def proc2String(p: DivineProcess) = p.name
    val (transitionSystemWithStateChange, stratStateChange) = createTransitionSystemForStateChange(proc, transition, initialTS)
    val (transitionSystemWithGuard, stratGuard) = createTransitionSystemForBinExp(proc, transition.guard, transitionSystemWithStateChange)
    val (transitionSystemWithAssignment, stratAssignment) = createTransitionSystemForVoidExpressions(proc, transitionSystemWithGuard, transition.effects.toList)
    transitionSystemWithAssignment.declareStrategy(proc + s"_Transtion_$transitionNumber") {
      Sequence(Sequence(stratStateChange, stratGuard), stratAssignment)
    }(true)
  }

  //  def createTransitionSystemForIntExp(procName: String, exp: IntegerExpression, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) = exp match {
  //    case Var(name) => 
  //  }

  def createTransitionSystemForStateChange(procName: String, transition: DivineTransition, initialTS: TransitionSystem)(implicit adt: ADT): (TransitionSystem, NonVariableStrategy) = {
    // create transition system for state change
    val preTransitionState = transition.stateChange._1.name
    val postTransitionState = transition.stateChange._2.name
    val stateChangeStrategyName = s"$procName $preTransitionState -> $postTransitionState"
    var currentTS = initialTS
    currentTS = ifNotContained(stateChangeStrategyName, currentTS) {
      currentTS
        .declareStrategy(stateChangeStrategyName,
          adt.term(STATE_VAR_FUNCTOR_NAME, procName, preTransitionState, "s1") -> adt.term(STATE_VAR_FUNCTOR_NAME, procName, postTransitionState, "s1"))(false)
    }
    val globalStateChangeStrategyName = s"$procName" + "StateChange"
    currentTS = ifNotContained(globalStateChangeStrategyName, currentTS) {
      currentTS
        .declareStrategy(globalStateChangeStrategyName) {
          DeclaredStrategyInstance(findProcStrategyName(procName),
            One(DeclaredStrategyInstance(stateChangeStrategyName), 2))
        }(false)
    }
    (currentTS, DeclaredStrategyInstance(globalStateChangeStrategyName))
  }

  /**
   * Takes a divine model and creates a transition system.
   *
   * @param model the input BEEM model
   * @return a transition system that represents the input model
   */
  def apply(model: DivineModel): TransitionSystem = {

    val sign = BEEMModel2TransitionSignatureHelper.createSignature(model.globalVariables, model.processes, basicSignature)
    implicit val a = new ADT("BeemModel", sign) // we create a signature
      .declareVariable(N1_VAR_NAME, NAT_SORT_NAME)
      .declareVariable(N2_VAR_NAME, NAT_SORT_NAME)
      .declareVariable("n3", NAT_SORT_NAME)
      .declareVariable(I1_VAR_NAME, INT_SORT_NAME)
      .declareVariable(I2_VAR_NAME, INT_SORT_NAME)
      .declareVariable("i3", INT_SORT_NAME)
      .declareVariable("b1", BOOL_SORT_NAME)
      .declareVariable("b2", BOOL_SORT_NAME)
      .declareVariable(S1_VAR_NAME, STATECOMP_SORT_NAME)
      .declareVariable("s2", STATECOMP_SORT_NAME)
      .declareVariable(V1_VAR_NAME, VARIABLE_NAME_SORT_NAME)
      .declareVariable(NZ1_VAR_NAME, NZNAT_SORT_NAME)
      .declareVariable(NZ2_VAR_NAME, NZNAT_SORT_NAME)
      .declareVariable(NZ3_VAR_NAME, NZNAT_SORT_NAME)
      .declareVariable(A1_VAR_NAME, ARRAY_SORT_NAME)
    val swapRuleName = "swap"
    val endUpRuleName = "endUp"

    val basicTransitionSystem = new TransitionSystem(a, createInitialState(model)(a))
      .declareStrategy("rewriteSetWith", V1) { Union(Choice(V1, Not(V1)), Choice(Not(V1), V1)) }(false)
      .declareStrategy("up", V1) {
        Choice(V1,
          Sequence(One(DeclaredStrategyInstance("up", V1), 3), V1))
      }(false) // applies its strategy bottom up in the state vector     
      .declareStrategy(endUpRuleName, a.term(INT_VAR_FUNCTOR, TOP_STACK_VARIABLE_NAME, I1_VAR_NAME, S1_VAR_NAME)
        -> a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, S1_VAR_NAME))(false)
      .declareStrategy(swapRuleName,
        List(a.term(INT_VAR_FUNCTOR, V1_VAR_NAME, I1_VAR_NAME, a.term(INT_VAR_FUNCTOR, TOP_STACK_VARIABLE_NAME, I2_VAR_NAME, S1_VAR_NAME)) // we contemplate ints
          -> a.term(INT_VAR_FUNCTOR, TOP_STACK_VARIABLE_NAME, I2_VAR_NAME, a.term(INT_VAR_FUNCTOR, V1_VAR_NAME, I1_VAR_NAME, S1_VAR_NAME)),
          a.term(ARRAY_VAR_FUNCTOR, V1_VAR_NAME, A1_VAR_NAME, a.term(INT_VAR_FUNCTOR, TOP_STACK_VARIABLE_NAME, I2_VAR_NAME, S1_VAR_NAME)) // we contemplate array
            -> a.term(INT_VAR_FUNCTOR, TOP_STACK_VARIABLE_NAME, I2_VAR_NAME, a.term(ARRAY_VAR_FUNCTOR, V1_VAR_NAME, A1_VAR_NAME, S1_VAR_NAME))))(false)
      .declareStrategy("upVariable") {
        Choice(DeclaredStrategyInstance(endUpRuleName),
          Sequence(
            DeclaredStrategyInstance("up", DeclaredStrategyInstance(swapRuleName)),
            DeclaredStrategyInstance(endUpRuleName)))
      }(false)
      .declareStrategy("downAndThen", V1, V2) {
        Choice(V2, Sequence(V1,
          One(DeclaredStrategyInstance("downAndThen", V1, V2), 3)))
      }(false)
      .declareStrategy("bottomUp", V1) {
        Choice(One(DeclaredStrategyInstance("bottomUp", V1)), V1)
      }(false)

    createTransitionSystemForProcesses(model.processes, basicTransitionSystem)(a)
  }

}