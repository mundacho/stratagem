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
package ch.unige.cui.smv.stratagem.transformers

import ch.unige.cui.smv.stratagem.beem.DivineModel
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.beem.DivineIntVariable
import ch.unige.cui.smv.stratagem.beem.DivineProcess
import ch.unige.cui.smv.stratagem.beem.DivineVariable
import ch.unige.cui.smv.stratagem.beem.DivineProcess
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.beem.DivineIntVariable
import ch.unige.cui.smv.stratagem.beem.expressions.Value
import ch.unige.cui.smv.stratagem.beem.DivineArrayVariable
import scala.language.implicitConversions
import ch.unige.cui.smv.stratagem.beem.DivineTransition
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.IfThenElse
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.beem.DivineProcess

/**
 *
 * @author mundacho
 *
 */
object BEEMModel2TransitionSystem extends ((DivineModel) => TransitionSystem) {

  val NAT_SORT_NAME = "nat"
  val NZNAT_SORT_NAME = "nznat"
  val BOOL_SORT_NAME = "bool"
  val INT_SORT_NAME = "int"
  val STATE_SORT_NAAME = "state"
  val STATECOMP_SORT_NAME = "stateComponent"
  val ZERO_SORT_NAME = "zero"
  val ARRAY_SORT_NAME = "array"
  val VARIABLE_NAME_SORT_NAME = "variableName"
  val PROCESS_NAME_SORT_NAME = "processName"

  val TRUE_CONSTANT_NAME = "true"
  val FALSE_CONSTANT_NAME = "false"
  val EMPTY_STATE_CONSTANT = "emptyState"
  val EMPTY_ARRAY_CONSTANT_NAME = "emptyArray"
  val ZERO_CONSTANT_NAME = "zero"

  val INT_VAR_FUNCTOR = "intVar"
  val ARRAY_VAR_FUNCTOR = "arrayVar"
  val PROC_VAR_FUNCTOR = "procVar"
  val SUC_FUNCTOR_NAME = "suc"
  val NEG_FUNCTOR_NAME = "-"
  val ARRAY_FUNCTOR_NAME = "arr"
  val STATE_VAR_FUNCTOR_NAME = "statVar"

  def createSignature(globalVariables: Map[String, DivineVariable], processes: List[DivineProcess], sign: Signature): Signature = globalVariables.toList.sortBy(_._1) match {
    case Nil => createSignature(processes, sign)
    case head :: tail =>
      if (!sign.generators.contains(head._2.name)) createSignature(tail.toMap, processes, sign.withGenerator(head._2.name, VARIABLE_NAME_SORT_NAME))
      else createSignature(tail.toMap, processes, sign) // skip the creation of the name
  }

  def createSignature(processes: List[DivineProcess], sign: Signature): Signature = processes match {
    case Nil => sign
    case proc :: tail => createSignature(tail, createSignatureForProces(proc, sign))
  }

  def createSignatureForProces(proc: DivineProcess, sign: Signature): Signature = {
    def createStatesInSignature(possibleStates: List[Symbol], sign: Signature): Signature = possibleStates match {
      case Nil => sign
      case s :: tail =>
        if (!sign.generators.contains(s.name)) createStatesInSignature(tail, sign.withGenerator(s.name, STATE_SORT_NAAME))
        else createStatesInSignature(tail, sign)
    }
    def createVariablesInSignature(variables: List[String], sign: Signature): Signature = variables match {
      case Nil => sign
      case s :: tail =>
        if (!sign.generators.contains(s)) createVariablesInSignature(tail, sign.withGenerator(s, VARIABLE_NAME_SORT_NAME))
        else createVariablesInSignature(tail, sign) // skip the creation of the name
    }
    val signWithProcesses = createStatesInSignature(proc.possibleStates.toList, sign.withGenerator(proc.name, PROCESS_NAME_SORT_NAME))
    createVariablesInSignature(proc.variables.keys.toList, signWithProcesses)
  }

  val basicSignature = (new Signature)
    .withSort(BOOL_SORT_NAME)
    .withSort(INT_SORT_NAME)
    .withSort(NAT_SORT_NAME, INT_SORT_NAME)
    .withSort(ZERO_SORT_NAME, NAT_SORT_NAME)
    .withSort(NZNAT_SORT_NAME, NAT_SORT_NAME)
    .withSort(STATECOMP_SORT_NAME)
    .withSort(STATE_SORT_NAAME)
    .withSort(VARIABLE_NAME_SORT_NAME)
    .withSort(ARRAY_SORT_NAME)
    .withSort(PROCESS_NAME_SORT_NAME)
    // Bool
    .withGenerator(TRUE_CONSTANT_NAME, BOOL_SORT_NAME)
    .withGenerator(FALSE_CONSTANT_NAME, BOOL_SORT_NAME)
    // Nat
    .withGenerator(ZERO_CONSTANT_NAME, ZERO_SORT_NAME)
    .withGenerator(SUC_FUNCTOR_NAME, NZNAT_SORT_NAME, NAT_SORT_NAME)
    // Int
    .withGenerator(NEG_FUNCTOR_NAME, INT_SORT_NAME, NZNAT_SORT_NAME)
    // state
    .withGenerator(EMPTY_STATE_CONSTANT, STATECOMP_SORT_NAME)

    // var functors
    .withGenerator(INT_VAR_FUNCTOR, STATECOMP_SORT_NAME, VARIABLE_NAME_SORT_NAME, INT_SORT_NAME, STATECOMP_SORT_NAME)
    .withGenerator(ARRAY_VAR_FUNCTOR, STATECOMP_SORT_NAME, VARIABLE_NAME_SORT_NAME, ARRAY_SORT_NAME, STATECOMP_SORT_NAME)
    .withGenerator(STATE_VAR_FUNCTOR_NAME, STATECOMP_SORT_NAME, PROCESS_NAME_SORT_NAME, STATE_SORT_NAAME, STATECOMP_SORT_NAME)
    .withGenerator(PROC_VAR_FUNCTOR, STATECOMP_SORT_NAME, PROCESS_NAME_SORT_NAME, STATECOMP_SORT_NAME, STATECOMP_SORT_NAME)
    // array generators
    .withGenerator(ARRAY_FUNCTOR_NAME, ARRAY_SORT_NAME, INT_SORT_NAME, ARRAY_SORT_NAME)
    .withGenerator(EMPTY_ARRAY_CONSTANT_NAME, ARRAY_SORT_NAME)

  implicit def string2VariableTerm(name: String)(implicit adt: ADT) = adt.term(name)
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

  def findProcStrategyName(procName: String) = "findProc_" + procName
  def checkForProcStrategyName(procName: String) = "checkForProc_" + procName
  val V1 = VariableStrategy("V1")
  val V2 = VariableStrategy("V2")

  def createTransitionSystemForProcesses(processes: List[DivineProcess], initialTS: TransitionSystem)(implicit a: ADT):TransitionSystem = processes match {
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
    createTransitionSystemForTransitions(proc.name, proc.transitions, newTS)
  }

  def createTransitionSystemForTransitions(procName: String, transitions: List[DivineTransition], initialTS: TransitionSystem)(implicit adt: ADT): TransitionSystem = transitions match {
    case Nil => initialTS
    case transition :: tail =>
      createTransitionSystemForTransitions(procName, tail, createTransitionSystemForTransition(procName, transition, initialTS))
  }

  def createTransitionSystemForTransition(procName: String, transition: DivineTransition, initialTS: TransitionSystem)(implicit adt: ADT): TransitionSystem = {
    // create transition system for state change
    val preTransitionState = transition.stateChange._1.name
    val postTransitionState = transition.stateChange._2.name
    val stateChangeStrategyName = s"$procName $preTransitionState -> $postTransitionState"
    var currentTS = initialTS
    if (!currentTS.strategyDeclarations.contains(stateChangeStrategyName)) {
      currentTS = currentTS
        .declareStrategy(stateChangeStrategyName,
          adt.term(STATE_VAR_FUNCTOR_NAME, procName, preTransitionState, "s1") -> adt.term(STATE_VAR_FUNCTOR_NAME, procName, postTransitionState, "s1"))(false)
    }
    val globalStateChangeStrategyName = s"$procName" + "StateChange"
    if (!currentTS.strategyDeclarations.contains(globalStateChangeStrategyName)) {
      currentTS = currentTS
        .declareStrategy(globalStateChangeStrategyName) {
          DeclaredStrategyInstance(findProcStrategyName(procName),
            One(DeclaredStrategyInstance(stateChangeStrategyName), 2))
        }(true)
    }
    currentTS
  }

  /**
   * Takes a divine model and creates a transition system.
   *
   * @param model the input BEEM model
   * @return a transition system that represents the input model
   */
  def apply(model: DivineModel): TransitionSystem = {

    val sign = BEEMModel2TransitionSystem.createSignature(model.globalVariables, model.processes, basicSignature)
    val adt = new ADT("peterson", sign) // we create a signature
      .declareVariable("n1", NAT_SORT_NAME)
      .declareVariable("n2", NAT_SORT_NAME)
      .declareVariable("n3", NAT_SORT_NAME)
      .declareVariable("i1", INT_SORT_NAME)
      .declareVariable("i2", INT_SORT_NAME)
      .declareVariable("i3", INT_SORT_NAME)
      .declareVariable("b1", BOOL_SORT_NAME)
      .declareVariable("b2", BOOL_SORT_NAME)
      .declareVariable("s1", STATECOMP_SORT_NAME)
      .declareVariable("s2", STATECOMP_SORT_NAME)

    val basicTransitionSystem = new TransitionSystem(adt, createInitialState(model)(adt))
    createTransitionSystemForProcesses(model.processes, basicTransitionSystem)(adt)
  }
}