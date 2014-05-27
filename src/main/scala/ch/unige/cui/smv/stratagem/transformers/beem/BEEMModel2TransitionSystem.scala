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
import ch.unige.cui.smv.stratagem.beem.DivineArrayVariable
import ch.unige.cui.smv.stratagem.beem.DivineIntVariable
import ch.unige.cui.smv.stratagem.beem.DivineModel
import ch.unige.cui.smv.stratagem.beem.DivineProcess
import ch.unige.cui.smv.stratagem.beem.DivineTransition
import ch.unige.cui.smv.stratagem.beem.DivineVariable
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionExpressionHelper.createTransitionSystemForBinExp
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionExpressionHelper.createTransitionSystemForVoidExpressions
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper._
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_FUNCTOR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.BOOL_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.EMPTY_ARRAY_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.EMPTY_STATE_CONSTANT
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$i1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$i2
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.INT_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.INT_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$n1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$n2
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NAT_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$nz1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$nz2
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$nz3
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NZNAT_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.PROC_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$s1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.stackElt
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.STATECOMP_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.STATE_VAR_FUNCTOR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.SUC_FUNCTOR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.topStack
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$v1
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
import ch.unige.cui.smv.stratagem.beem.DivineIntVariable
import ch.unige.smv.cui.metamodel.adt.ATerm
import ch.unige.cui.smv.stratagem.beem.DivineArrayVariable
import ch.unige.smv.cui.metamodel.adt.ADT
import ch.unige.cui.smv.stratagem.ts.Not
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import ch.unige.cui.smv.stratagem.ts.Not
import ch.unige.cui.smv.stratagem.beem.DivineArrayVariable
import ch.unige.cui.smv.stratagem.beem.DivineIntVariable
import ch.unige.cui.smv.stratagem.adt.ATermHelper.term2RichTerm

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
          case DivineIntVariable(name, value) => intVar(variable.name, value, createVariables(tail, currentState))
          case DivineArrayVariable(name, values) =>
            arrVar(
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

  def createTransitionSystemForProcesses(processes: List[DivineProcess], initialTS: TransitionSystem)(implicit a: ADT): TransitionSystem =
    processes.foldLeft(initialTS)(createTransitionSystemForProc)

  def createTransitionSystemForProc(initialTS: TransitionSystem, proc: DivineProcess)(implicit a: ADT) = {
    // create check for proc strategy
    val newTS = initialTS
      .declareStrategy(checkForProcStrategyName(proc.name),
        a.term(PROC_VAR_FUNCTOR, proc.name, $s1, $s2) -> a.term(PROC_VAR_FUNCTOR, proc.name, $s1, $s2))(false)
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
    initialTS: TransitionSystem)(implicit adt: ADT): TransitionSystem =
    // zipWithIndex gives us a list (0, t0), (1, t1), ... (n, tn)...
    // for each pair of that list we build a function with the right parameters
    // we then reduce the list composing all functions, and apply the resulting fct to the initial ts
    transitions.zipWithIndex.map(e => createTransitionSystemForTransition(proc, e._2, e._1)_).reduce(_ compose _)(initialTS)

  def createTransitionSystemForTransition(
    proc: DivineProcess,
    transitionNumber: Int,
    transition: DivineTransition)(initialTS: TransitionSystem)(implicit adt: ADT): TransitionSystem = {

    val (transitionSystemWithStateChange, stratStateChange) = createTransitionSystemForStateChange(proc.name, transition, initialTS)
    val (transitionSystemWithGuard, stratGuard) = createTransitionSystemForBinExp(proc, transition.guard, transitionSystemWithStateChange)
    val (transitionSystemWithAssignment, stratAssignment) = createTransitionSystemForVoidExpressions(proc, transitionSystemWithGuard, transition.effects.toList)
    transitionSystemWithAssignment.declareStrategy(proc.name + s"_Transtion_$transitionNumber") {
      Sequence(Sequence(stratStateChange, stratGuard), stratAssignment)
    }(true)
  }

  def createTransitionSystemForStateChange(procName: String, transition: DivineTransition, initialTS: TransitionSystem)(implicit adt: ADT): (TransitionSystem, NonVariableStrategy) = {
    // create transition system for state change
    val preTransitionState = transition.stateChange._1.name
    val postTransitionState = transition.stateChange._2.name
    val stateChangeStrategyName = s"$procName $preTransitionState -> $postTransitionState"
    var currentTS = initialTS
    currentTS = ifNotContained(stateChangeStrategyName, currentTS) {
      currentTS
        .declareStrategy(stateChangeStrategyName,
          statVar(procName, preTransitionState, $s1) -> statVar(procName, postTransitionState, $s1))(false)
    }
    val globalStateChangeStrategyName = stateChangeStrategyName + "StateChange"
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
    implicit val a = {val a = AdtFactory.eINSTANCE.createADT(); a.setName("beemmodel"); a.setSignature(sign); a} // we create a signature
      .declareVariable($n1, NAT_SORT_NAME)
      .declareVariable($n2, NAT_SORT_NAME)
      .declareVariable("n3", NAT_SORT_NAME)
      .declareVariable($i1, INT_SORT_NAME)
      .declareVariable($i2, INT_SORT_NAME)
      .declareVariable("i3", INT_SORT_NAME)
      .declareVariable("b1", BOOL_SORT_NAME)
      .declareVariable("b2", BOOL_SORT_NAME)
      .declareVariable($s1, STATECOMP_SORT_NAME)
      .declareVariable($s2, STATECOMP_SORT_NAME)
      .declareVariable($v1, VARIABLE_NAME_SORT_NAME)
      .declareVariable($nz1, NZNAT_SORT_NAME)
      .declareVariable($nz2, NZNAT_SORT_NAME)
      .declareVariable($nz3, NZNAT_SORT_NAME)
      .declareVariable($a1, ARRAY_SORT_NAME)
      .declareVariable($pn1, PROCESS_NAME_SORT_NAME)
      .declareVariable($st1, STATE_SORT_NAME)
    val swapRuleName = "swap"
    val endUpRuleName = "endUp"

    val basicTransitionSystem = new TransitionSystem(a, createInitialState(model)(a))
      .declareStrategy("rewriteSetWith", V1) { Choice(Choice(Union(Choice(V1, Not(V1)), Choice(Not(V1), V1)), V1), Not(V1)) }(false)
      .declareStrategy("up", V1) {
        Choice(V1,
          Sequence(One(DeclaredStrategyInstance("up", V1), 3), V1))
      }(false) // applies its strategy bottom up in the state vector     
      .declareStrategy(endUpRuleName, intVar(topStack, $i1, $s1)
        -> intVar(stackElt, $i1, $s1))(false)
      .declareStrategy(swapRuleName,
        List(intVar($v1, $i1, intVar(topStack, $i2, $s1)) // we contemplate ints
          -> intVar(topStack, $i2, intVar($v1, $i1, $s1)),
          arrVar($v1, $a1, intVar(topStack, $i2, $s1)) // we contemplate array
            -> intVar(topStack, $i2, arrVar($v1, $a1, $s1)),
          procVar($pn1, $s1, intVar(topStack, $i2, $s2)) ->
            intVar(topStack, $i2, procVar($pn1, $s1, $s2)),
          statVar($pn1, $st1, intVar(topStack, $i2, $s2)) -> intVar(topStack, $i2, statVar($pn1, $st1, $s2))))(false)
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
      .declareStrategy("arrayDownAndThen", V1, V2) {
        Choice(V2, Sequence(V1,
          One(DeclaredStrategyInstance("arrayDownAndThen", V1, V2), 2)))
      }(false)
      .declareStrategy("bottomUp", V1) {
        Choice(One(DeclaredStrategyInstance("bottomUp", V1)), V1)
      }(false)
      .declareStrategy("upArr", V1) {
        Choice(V1,
          Sequence(One(DeclaredStrategyInstance("upArr", V1), 2), V1))
      }(false)

    createTransitionSystemForProcesses(model.processes, basicTransitionSystem)(a)
  }

}