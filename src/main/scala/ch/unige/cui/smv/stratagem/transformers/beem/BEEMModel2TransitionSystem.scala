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
import ch.unige.cui.smv.stratagem.beem.expressions.And
import ch.unige.cui.smv.stratagem.beem.expressions.BooleanExpression
import ch.unige.cui.smv.stratagem.beem.expressions.IntegerExpression
import ch.unige.cui.smv.stratagem.beem.expressions.IsDifferent
import ch.unige.cui.smv.stratagem.beem.expressions.IsEqual
import ch.unige.cui.smv.stratagem.beem.expressions.LessThan
import ch.unige.cui.smv.stratagem.beem.expressions.Or
import ch.unige.cui.smv.stratagem.beem.expressions.True
import ch.unige.cui.smv.stratagem.beem.expressions.Value
import ch.unige.cui.smv.stratagem.beem.expressions.Var
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_FUNCTOR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.BOOL_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.EMPTY_ARRAY_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.EMPTY_STATE_CONSTANT
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.EQ_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.FALSE_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.I1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.I2_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.INT_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.INT_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.INT_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.LESS_THAN_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.N1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.N2_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NAT_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NEQ_FUNCTOR
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
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.TEST_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.TOP_STACK_VARIABLE_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.TRUE_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.V1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.VARIABLE_NAME_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ZERO_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.basicSignature
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.doubleVar
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.doubleVarNeg
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.lt
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.myEq
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.neg
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.neq
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.suc
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.IfThenElse
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.Not
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.beem.expressions.VoidExpression
import ch.unige.cui.smv.stratagem.beem.expressions.VoidExpression
import ch.unige.cui.smv.stratagem.beem.expressions.Noop
import ch.unige.cui.smv.stratagem.beem.expressions.VoidExpression
import ch.unige.cui.smv.stratagem.beem.expressions.Assign
import ch.unige.cui.smv.stratagem.beem.expressions.LeftExpression

/**
 * Translates a Beem model to a transition system.
 * @author mundacho
 *
 */
object BEEMModel2TransitionSystem extends ((DivineModel) => TransitionSystem) {

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
  def findVarStrategyName(varName: String) = "findVar_" + varName
  def checkForVarStrategyName(varName: String) = "checkForVar_" + varName

  def RewriteSetWith(s: Strategy) = DeclaredStrategyInstance("rewriteSetWith", s)
  val V1 = VariableStrategy("V1")
  val V2 = VariableStrategy("V2")

  private def ifNotContained(name: String, initialTS: TransitionSystem)(ts: => TransitionSystem) =
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
    transitionSystemWithGuard.declareStrategy(proc + s"_Transtion_$transitionNumber") {
      Sequence(stratStateChange, stratGuard)
    }(true)
  }
  
  def createTransitionSystemForVoidExpr(proc: DivineProcess, exp: VoidExpression, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) =  exp match {
    case Noop => (initialTS, Identity)   
    case Assign(leftExpr, rightExp) => 
      val (readRightExpTS, readRightExpStrat) = createReadIntExpressionStrategy(proc, rightExp, initialTS)
      val (assignTopOfStackTS, assignTopOfStackStrat) = createTransitionSystemForLeftExpression(proc, leftExpr, initialTS) // we need a strategy to put the head of the stack in a global variable
      (assignTopOfStackTS, Sequence(readRightExpStrat, assignTopOfStackStrat))
  }
  
  def createTransitionSystemForLeftExpression(proc: DivineProcess, exp: LeftExpression, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) =  exp match {
    case Var(name) => null// TODO
  }

  def createTransitionSystemForBinExp(proc: DivineProcess, exp: BooleanExpression, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) = {
    exp match {
      case True => (initialTS, Identity)
      case And(b1, b2) =>
        val (resultingTStemp, stra1) = createTransitionSystemForBinExp(proc, b1, initialTS)
        val (resultingTS, strat2) = createTransitionSystemForBinExp(proc, b2, resultingTStemp)
        (resultingTS, Sequence(stra1, strat2))
      case Or(b1, b2) =>
        val (resultingTStemp, stra1) = createTransitionSystemForBinExp(proc, b1, initialTS)
        val (resultingTS, strat2) = createTransitionSystemForBinExp(proc, b2, resultingTStemp)
        (resultingTS, Union(stra1, strat2))
      case LessThan(n1, n2) => createStrategyForBinaryIntOperation(proc, initialTS, n1, n2, LESS_THAN_FUNCTOR)(createStrategiesForLessThan)
      case IsEqual(n1, n2) => createStrategyForBinaryIntOperation(proc, initialTS, n1, n2, EQ_FUNCTOR)(createStrategiesForIsEqual)
      case IsDifferent(n1, n2) => createStrategyForBinaryIntOperation(proc, initialTS, n1, n2, NEQ_FUNCTOR)(createStrategiesForNotEqual)
    }
  }

  def createReadIntExpressionStrategy(proc: DivineProcess, exp: IntegerExpression, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) = {
    implicit val a = initialTS.adt
    exp match {
      case Value(n) =>
        val createConstantOnTopOfStack = "createConstantOnTopOfStack_" + n
        val resultTS = ifNotContained(createConstantOnTopOfStack, initialTS) {
          initialTS.declareStrategy(createConstantOnTopOfStack,
            S1_VAR_NAME -> a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, n, S1_VAR_NAME))(false)
        }
        (resultTS, DeclaredStrategyInstance(createConstantOnTopOfStack))
      case Var(name) => // two cases: global and local variables
        if (proc.container.get.globalVariables.contains(name)) { // global variable
          var currentTS = ifNotContained(checkForVarStrategyName(name), initialTS) {
            initialTS.declareStrategy(checkForVarStrategyName(name),
              a.term(INT_VAR_FUNCTOR, name, I1_VAR_NAME, S1_VAR_NAME) -> a.term(INT_VAR_FUNCTOR, name, I1_VAR_NAME, S1_VAR_NAME))(false)
          }
          // strategy to find a variable
          currentTS = ifNotContained(findVarStrategyName(name), initialTS) {
            currentTS.declareStrategy(findVarStrategyName(name), V1) {
              IfThenElse(DeclaredStrategyInstance(checkForVarStrategyName(name)),
                V1,
                One(DeclaredStrategyInstance(findVarStrategyName(name), V1), 3))
            }(false)

          }
          // strategy to duplicate the value of any int variable
          val doubleVarStrategyName = "doubleVar"
          currentTS = ifNotContained(doubleVarStrategyName, currentTS) {
            currentTS
              .declareStrategy(doubleVarStrategyName, List(
                suc(N1_VAR_NAME) -> doubleVar(0, 0, suc(N1_VAR_NAME)),
                0 -> doubleVar(0, 0, 0),
                neg(NZ1_VAR_NAME) -> doubleVar(0, 0, neg(NZ1_VAR_NAME))))(false)

          }
          val duplicateVarStrategyName = "duplicateVar"
          currentTS = ifNotContained(duplicateVarStrategyName, currentTS) {
            currentTS
              .declareStrategy(duplicateVarStrategyName, List(
                doubleVar(NZ1_VAR_NAME, NZ2_VAR_NAME, suc(NZ3_VAR_NAME)) -> doubleVar(suc(NZ1_VAR_NAME), suc(NZ2_VAR_NAME), NZ3_VAR_NAME),
                doubleVar(NZ1_VAR_NAME, NZ2_VAR_NAME, neg(NZ3_VAR_NAME)) -> doubleVarNeg(NZ1_VAR_NAME, NZ2_VAR_NAME, NZ3_VAR_NAME),
                doubleVarNeg(NZ1_VAR_NAME, NZ2_VAR_NAME, suc(NZ3_VAR_NAME)) -> doubleVarNeg(suc(NZ1_VAR_NAME), suc(NZ2_VAR_NAME), NZ3_VAR_NAME),
                doubleVarNeg(NZ1_VAR_NAME, NZ2_VAR_NAME, 0) -> doubleVar(neg(NZ1_VAR_NAME), neg(NZ2_VAR_NAME), 0)))(false)
          }

          val extractValueStratName = "extractVar_" + name
          currentTS = ifNotContained(extractValueStratName, currentTS) {
            currentTS
              .declareStrategy(extractValueStratName, List(
                a.term(INT_VAR_FUNCTOR, V1_VAR_NAME, doubleVar(I1_VAR_NAME, I2_VAR_NAME, 0), S1_VAR_NAME) ->
                  a.term(INT_VAR_FUNCTOR, TOP_STACK_VARIABLE_NAME, I1_VAR_NAME, a.term(INT_VAR_FUNCTOR, name, I2_VAR_NAME, S1_VAR_NAME))) // extract copy
                  )(false)
          }

          val copyVarStratName = "copyVar_" + name
          currentTS = ifNotContained(copyVarStratName, currentTS) {
            currentTS
              .declareStrategy(copyVarStratName) {
                Sequence(
                  One(Sequence(
                    DeclaredStrategyInstance(doubleVarStrategyName),
                    FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance(duplicateVarStrategyName)))), 2),
                  DeclaredStrategyInstance(extractValueStratName))
              }(false)
          }

          (currentTS,
            Sequence(
              DeclaredStrategyInstance(findVarStrategyName(name), DeclaredStrategyInstance(copyVarStratName)),
              DeclaredStrategyInstance("upVariable")))
        } else
          (null, null) // TODO local variable
    } // TODO arrays
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
      .declareStrategy(swapRuleName, a.term(INT_VAR_FUNCTOR, V1_VAR_NAME, I1_VAR_NAME, a.term(INT_VAR_FUNCTOR, TOP_STACK_VARIABLE_NAME, I2_VAR_NAME, S1_VAR_NAME))
        -> a.term(INT_VAR_FUNCTOR, TOP_STACK_VARIABLE_NAME, I2_VAR_NAME, a.term(INT_VAR_FUNCTOR, V1_VAR_NAME, I1_VAR_NAME, S1_VAR_NAME)))(false)
      .declareStrategy("upVariable") {
        Choice(DeclaredStrategyInstance(endUpRuleName),
          Sequence(
            DeclaredStrategyInstance("up", DeclaredStrategyInstance(swapRuleName)),
            DeclaredStrategyInstance(endUpRuleName)))
      }(false)

    createTransitionSystemForProcesses(model.processes, basicTransitionSystem)(a)
  }

  private def createStrategyForBinaryIntOperation(
    proc: DivineProcess,
    initialTS: TransitionSystem,
    n1: IntegerExpression,
    n2: IntegerExpression,
    testFunctor: String)(specificFunction: (String, TransitionSystem, String) => (TransitionSystem, NonVariableStrategy)): (TransitionSystem, NonVariableStrategy) = {
    implicit val a = initialTS.adt

    implicit def proc2String(p: DivineProcess) = p.name

    val (readFirstIntTS, readFirstIntStrategy) = createReadIntExpressionStrategy(proc, n1, initialTS)
    val (readSecondtIntTS, readSecondIntStrategy) = createReadIntExpressionStrategy(proc, n2, readFirstIntTS)
    val readIntegersStrategyName = proc + readFirstIntStrategy + "_" + readSecondIntStrategy

    var currenTS = ifNotContained(readIntegersStrategyName, readSecondtIntTS) {
      readSecondtIntTS.declareStrategy(readIntegersStrategyName) {
        Sequence(readSecondIntStrategy, readFirstIntStrategy) // since we have a stack, that will get them in the correct order
      }(false)
    }

    val stackToTestFcuntorName = "stackTo" + testFunctor
    currenTS = ifNotContained(stackToTestFcuntorName, currenTS) {
      // we transform the top of the stack to a test.
      currenTS.declareStrategy(stackToTestFcuntorName,
        // intVar(topStack, $i1, intVar(stackElt, $i2, $s1)) -> test(lt($i1, $i2), $s1)
        a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I2_VAR_NAME, S1_VAR_NAME)) ->
          a.term(TEST_FUNCTOR, a.term(testFunctor, I1_VAR_NAME, I2_VAR_NAME), S1_VAR_NAME))(false)
    }

    val (functorEvaluationTS, fuctorEvaluationStrat) = specificFunction(proc, currenTS, testFunctor)

    val evalFunctor = "eval" + testFunctor
    currenTS = ifNotContained(evalFunctor, functorEvaluationTS) {
      // we transform the top of the stack to a test.
      functorEvaluationTS.declareStrategy(evalFunctor) {
        Sequence(Sequence(Sequence(
          DeclaredStrategyInstance(readIntegersStrategyName), // we read the integers
          DeclaredStrategyInstance(stackToTestFcuntorName)), // we pop them from the stack and obtain a test
          One(FixPointStrategy(Try(fuctorEvaluationStrat)), 1)), // we rewrite the inner test
          SimpleStrategy((a.term(TEST_FUNCTOR, TRUE_CONSTANT_NAME, S1_VAR_NAME) -> S1_VAR_NAME) :: Nil) // we keep the tests that were true
          )
      }(false)
    }
    (currenTS, DeclaredStrategyInstance(evalFunctor))
  }

  private def createStrategiesForIsEqual(procName: String, initialTS: TransitionSystem, testFunctor: String): (TransitionSystem, NonVariableStrategy) = {
    implicit val a = initialTS.adt
    val isEqualStrategyName = testFunctor + "Strat"
    var currenTS = ifNotContained(isEqualStrategyName, initialTS) {
      // we transform the top of the stack to a test.
      initialTS.declareStrategy(isEqualStrategyName, List(
        myEq(0, 0) -> TRUE_CONSTANT_NAME,
        myEq(suc(N1_VAR_NAME), suc(N2_VAR_NAME)) -> myEq(N1_VAR_NAME, N2_VAR_NAME),
        myEq(neg(N1_VAR_NAME), neg(N2_VAR_NAME)) -> myEq(N1_VAR_NAME, N2_VAR_NAME),
        myEq(0, suc(N1_VAR_NAME)) -> FALSE_CONSTANT_NAME,
        myEq(0, neg(N1_VAR_NAME)) -> FALSE_CONSTANT_NAME,
        myEq(suc(N1_VAR_NAME), 0) -> FALSE_CONSTANT_NAME,
        myEq(neg(N1_VAR_NAME), 0) -> FALSE_CONSTANT_NAME))(false)
    }

    (currenTS, DeclaredStrategyInstance(isEqualStrategyName))
  }

  private def createStrategiesForNotEqual(procName: String, initialTS: TransitionSystem, testFunctor: String): (TransitionSystem, NonVariableStrategy) = {
    implicit val a = initialTS.adt
    val notEqualStrategyName = testFunctor + "Strat"
    var currenTS = ifNotContained(notEqualStrategyName, initialTS) {
      // we transform the top of the stack to a test.
      initialTS.declareStrategy(notEqualStrategyName, List(
        neq(0, 0) -> FALSE_CONSTANT_NAME,
        neq(suc(N1_VAR_NAME), suc(N2_VAR_NAME)) -> neq(N1_VAR_NAME, N2_VAR_NAME),
        neq(neg(NZ1_VAR_NAME), neg(NZ2_VAR_NAME)) -> neq(NZ1_VAR_NAME, NZ2_VAR_NAME),
        neq(0, suc(N1_VAR_NAME)) -> TRUE_CONSTANT_NAME,
        neq(0, neg(NZ1_VAR_NAME)) -> TRUE_CONSTANT_NAME,
        neq(suc(N1_VAR_NAME), 0) -> TRUE_CONSTANT_NAME,
        neq(neg(NZ1_VAR_NAME), 0) -> TRUE_CONSTANT_NAME))(false)
    }

    (currenTS, DeclaredStrategyInstance(notEqualStrategyName))
  }

  private def createStrategiesForLessThan(procName: String, initialTS: TransitionSystem, testFunctor: String): (TransitionSystem, NonVariableStrategy) = {
    implicit val a = initialTS.adt
    val lessThanStrategyName = testFunctor + "Strat"
    var currenTS = ifNotContained(lessThanStrategyName, initialTS) {
      // we transform the top of the stack to a test.
      initialTS.declareStrategy(lessThanStrategyName, List(
        lt(0, 0) -> FALSE_CONSTANT_NAME,
        lt(0, neg(NZ1_VAR_NAME)) -> FALSE_CONSTANT_NAME,
        lt(suc(N1_VAR_NAME), 0) -> FALSE_CONSTANT_NAME,
        lt(neg(NZ1_VAR_NAME), 0) -> TRUE_CONSTANT_NAME,
        lt(0, suc(N1_VAR_NAME)) -> TRUE_CONSTANT_NAME,
        lt(neg(NZ1_VAR_NAME), suc(N2_VAR_NAME)) -> TRUE_CONSTANT_NAME,
        lt(suc(N1_VAR_NAME), suc(N2_VAR_NAME)) -> lt(N1_VAR_NAME, N2_VAR_NAME),
        lt(neg(NZ1_VAR_NAME), neg(NZ2_VAR_NAME)) -> lt(NZ2_VAR_NAME, NZ1_VAR_NAME),
        lt(suc(N1_VAR_NAME), neg(NZ1_VAR_NAME)) -> FALSE_CONSTANT_NAME))(false)
    }

    (currenTS, DeclaredStrategyInstance(lessThanStrategyName))
  }
}