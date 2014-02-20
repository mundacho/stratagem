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

import ch.unige.cui.smv.stratagem.beem.DivineProcess
import ch.unige.cui.smv.stratagem.beem.expressions.Darray
import ch.unige.cui.smv.stratagem.beem.expressions.IntegerExpression
import ch.unige.cui.smv.stratagem.beem.expressions.Minus
import ch.unige.cui.smv.stratagem.beem.expressions.Plus
import ch.unige.cui.smv.stratagem.beem.expressions.Value
import ch.unige.cui.smv.stratagem.beem.expressions.Var
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper._
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_FUNCTOR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.FALSE_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.GET_ARR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.I1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.I2_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.INT_VAR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.MINUS_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.N1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.N2_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NZ1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NZ2_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NZ3_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.PLUS_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.S1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.STACK_ELT_VARIABLE_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.TOP_STACK_VARIABLE_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.TRUE_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.V1_VAR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.doubleVar
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.doubleVarNeg
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.lt
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.minus
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.myEq
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.neg
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.neq
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.plus
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.suc
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.RewriteSetWith
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.V1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.checkForVarStrategyName
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.findVarStrategyName
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.ifNotContained
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.int2ATerm
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.string2VariableTerm
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.IfThenElse
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.beem.expressions.LeftExpression
import ch.unige.cui.smv.stratagem.beem.expressions.VoidExpression
import ch.unige.cui.smv.stratagem.beem.expressions.Noop
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.beem.expressions.Assign
import ch.unige.cui.smv.stratagem.beem.expressions.True
import ch.unige.cui.smv.stratagem.beem.expressions.LessThan
import ch.unige.cui.smv.stratagem.beem.expressions.IsEqual
import ch.unige.cui.smv.stratagem.beem.expressions.IsDifferent
import ch.unige.cui.smv.stratagem.beem.expressions.And
import ch.unige.cui.smv.stratagem.beem.expressions.BooleanExpression
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.beem.expressions.Or
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy

/**
 * Helper containing all expression related operations.
 * @author mundacho
 *
 */
private[beem] object BEEMModel2TransitionExpressionHelper {
  def createEvalStrategyForBinaryIntOperation(
    proc: DivineProcess,
    initialTS: TransitionSystem,
    n1: IntegerExpression,
    n2: IntegerExpression,
    opFunctor: String)(specificFunction: (String, TransitionSystem, String) => (TransitionSystem, NonVariableStrategy)): (TransitionSystem, NonVariableStrategy) = {
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

    val stackToEvalFunctor = "stackTo" + opFunctor
    currenTS = ifNotContained(stackToEvalFunctor, currenTS) {
      // we transform the top of the stack to a test.
      currenTS.declareStrategy(stackToEvalFunctor,
        // intVar(topStack, $i1, intVar(stackElt, $i2, $s1)) -> test(lt($i1, $i2), $s1)
        a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I2_VAR_NAME, S1_VAR_NAME)) ->
          a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, a.term(opFunctor, I1_VAR_NAME, I2_VAR_NAME), S1_VAR_NAME))(false)
    }

    val (functorEvaluationTS, fuctorEvaluationStrat) = specificFunction(proc, currenTS, opFunctor)

    val evalFunctor = "eval" + opFunctor
    currenTS = ifNotContained(evalFunctor, functorEvaluationTS) {
      // we transform the top of the stack to a test.
      functorEvaluationTS.declareStrategy(evalFunctor) {
        Sequence(Sequence(
          DeclaredStrategyInstance(readIntegersStrategyName), // we read the integers
          DeclaredStrategyInstance(stackToEvalFunctor)), // we pop them from the stack and obtain a test
          One(FixPointStrategy(Try(fuctorEvaluationStrat)), 2)) // we rewrite the inner test
      }(false)
    }
    (currenTS, DeclaredStrategyInstance(evalFunctor))
  }

  def createStrategiesForIsEqual(procName: String, initialTS: TransitionSystem, testFunctor: String): (TransitionSystem, NonVariableStrategy) = {
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

  def createStrategiesForNotEqual(procName: String, initialTS: TransitionSystem, testFunctor: String): (TransitionSystem, NonVariableStrategy) = {
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

  def createStrategiesForLessThan(procName: String, initialTS: TransitionSystem, testFunctor: String): (TransitionSystem, NonVariableStrategy) = {
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

  def createStrategiesForPlus(procName: String, initialTS: TransitionSystem, testFunctor: String): (TransitionSystem, NonVariableStrategy) = {
    implicit val a = initialTS.adt
    val plusStrategyInstance = testFunctor + "Strat"
    var currenTS = ifNotContained(plusStrategyInstance, initialTS) {
      // we transform the top of the stack to a test.
      initialTS.declareStrategy(plusStrategyInstance, List(
        plus(I1_VAR_NAME, 0) -> I1_VAR_NAME,
        plus(0, I1_VAR_NAME) -> I1_VAR_NAME,
        neg(neg(I1_VAR_NAME)) -> I1_VAR_NAME,
        neg(0) -> 0,
        plus(suc(NZ1_VAR_NAME), suc(NZ2_VAR_NAME)) -> plus(suc(suc(NZ1_VAR_NAME)), NZ2_VAR_NAME),
        plus(neg(NZ1_VAR_NAME), neg(NZ2_VAR_NAME)) -> neg(plus(NZ1_VAR_NAME, NZ2_VAR_NAME)),
        plus(neg(NZ1_VAR_NAME), suc(NZ2_VAR_NAME)) -> minus(suc(NZ2_VAR_NAME), NZ1_VAR_NAME),
        plus(suc(NZ1_VAR_NAME), neg(NZ2_VAR_NAME)) -> minus(suc(NZ1_VAR_NAME), NZ1_VAR_NAME),
        minus(I1_VAR_NAME, 0) -> I1_VAR_NAME,
        minus(0, suc(NZ1_VAR_NAME)) -> neg(suc(NZ1_VAR_NAME)),
        minus(suc(NZ1_VAR_NAME), suc(NZ2_VAR_NAME)) -> minus(NZ1_VAR_NAME, NZ2_VAR_NAME),
        minus(neg(NZ1_VAR_NAME), neg(NZ2_VAR_NAME)) -> neg(plus(NZ1_VAR_NAME, NZ2_VAR_NAME)),
        minus(neg(NZ1_VAR_NAME), suc(NZ2_VAR_NAME)) -> minus(suc(NZ2_VAR_NAME), NZ1_VAR_NAME),
        minus(I1_VAR_NAME, neg(NZ2_VAR_NAME)) -> plus(I1_VAR_NAME, NZ2_VAR_NAME)))(false)
    }

    (currenTS, (DeclaredStrategyInstance("bottomUp", DeclaredStrategyInstance(plusStrategyInstance))))
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
      case Plus(n1, n2) => createEvalStrategyForBinaryIntOperation(proc, initialTS, n1, n2, PLUS_FUNCTOR)(createStrategiesForPlus)
      case Minus(n1, n2) => createEvalStrategyForBinaryIntOperation(proc, initialTS, n1, n2, MINUS_FUNCTOR)(createStrategiesForPlus)
      case Darray(name, n) => // two cases: global and local variables TODO array
        val (readNTS, readNStrat) = createReadIntExpressionStrategy(proc, n, initialTS)
        if (proc.container.get.globalVariables.contains(name)) { // global variable
          // use the value in the stack to go and search for the value
          val insertStrategyName = "insertGet_" + name
          var currentTS = ifNotContained(insertStrategyName, readNTS) {
            initialTS.declareStrategy(insertStrategyName,
              a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, a.term(ARRAY_VAR_FUNCTOR, name, A1_VAR_NAME, S1_VAR_NAME))
                -> a.term(ARRAY_VAR_FUNCTOR, name, a.term(GET_ARR_FUNCTOR, I1_VAR_NAME, A1_VAR_NAME), S1_VAR_NAME))(false)
          }
          val downSwapStratName = "downSwapGet"
          currentTS = ifNotContained(downSwapStratName, currentTS) {
            currentTS.declareStrategy(downSwapStratName, List(
              a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, a.term(INT_VAR_FUNCTOR, V1_VAR_NAME, I2_VAR_NAME, S1_VAR_NAME))
                -> a.term(INT_VAR_FUNCTOR, V1_VAR_NAME, I2_VAR_NAME, a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, S1_VAR_NAME)),
              a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, a.term(ARRAY_VAR_FUNCTOR, V1_VAR_NAME, A1_VAR_NAME, S1_VAR_NAME))
                -> a.term(ARRAY_VAR_FUNCTOR, V1_VAR_NAME, A1_VAR_NAME, a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, S1_VAR_NAME))))(false)
          }

          val checkArray = "checkArray"
          currentTS = ifNotContained(checkArray, currentTS) {
            currentTS.declareStrategy(checkArray,
              a.term(GET_ARR_FUNCTOR, 0, a.term(ARRAY_FUNCTOR_NAME, I1_VAR_NAME, A1_VAR_NAME)) ->
                a.term(GET_ARR_FUNCTOR, 0, a.term(ARRAY_FUNCTOR_NAME, I1_VAR_NAME, A1_VAR_NAME)))(false)
          } // TODO finish here

          val downSwapInArrayName = "downSwapInArray"

          val readArray = "readArray_" + name
          currentTS = ifNotContained(readArray, currentTS) {
            currentTS.declareStrategy(readArray) {
              DeclaredStrategyInstance("downAndThen",
                DeclaredStrategyInstance(downSwapStratName), DeclaredStrategyInstance(insertStrategyName))
            }(false)
          }
          null
        } else
          (null, null) // TODO local array
      case Var(name) => // two cases: global and local variables
        if (proc.container.get.globalVariables.contains(name)) { // global variable
          var currentTS = ifNotContained(checkForVarStrategyName(name), initialTS) {
            initialTS.declareStrategy(checkForVarStrategyName(name),
              a.term(INT_VAR_FUNCTOR, name, I1_VAR_NAME, S1_VAR_NAME) -> a.term(INT_VAR_FUNCTOR, name, I1_VAR_NAME, S1_VAR_NAME))(false)
          }
          // strategy to find a variable
          currentTS = ifNotContained(findVarStrategyName(name), currentTS) {
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
    }
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

  def createTransitionSystemForVoidExpressions(proc: DivineProcess, initialTS: TransitionSystem, expressions: List[VoidExpression]): (TransitionSystem, NonVariableStrategy) = expressions match {
    case Nil => (initialTS, Identity)
    case exp :: tail =>
      val (ts, strat) = createTransitionSystemForVoidExpr(proc, exp, initialTS)
      val (resultTS, tailStrat) = createTransitionSystemForVoidExpressions(proc, ts, tail)
      (resultTS, Sequence(strat, tailStrat))
  }

  def createTransitionSystemForVoidExpr(proc: DivineProcess, exp: VoidExpression, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) = exp match {
    case Noop => (initialTS, Identity)
    case Assign(leftExpr, rightExp) =>
      val (readRightExpTS, readRightExpStrat) = createReadIntExpressionStrategy(proc, rightExp, initialTS)
      val (assignTopOfStackTS, assignTopOfStackStrat) = createTransitionSystemForLeftExpression(proc, leftExpr, readRightExpTS) // we need a strategy to put the head of the stack in a global variable
      (assignTopOfStackTS, Sequence(readRightExpStrat, assignTopOfStackStrat))
  }

  def createTransitionSystemForLeftExpression(proc: DivineProcess, exp: LeftExpression, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) = {
    implicit val a = initialTS.adt
    exp match {
      case Var(name) =>
        if (proc.container.get.globalVariables.contains(name)) { // global variable
          val insertStrategyName = "insert_" + name
          var currentTS = ifNotContained(insertStrategyName, initialTS) {
            initialTS.declareStrategy(insertStrategyName,
              a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, a.term(INT_VAR_FUNCTOR, name, I2_VAR_NAME, S1_VAR_NAME))
                -> a.term(INT_VAR_FUNCTOR, name, I1_VAR_NAME, S1_VAR_NAME))(false)
          }
          val downSwapStratName = "downSwap"
          currentTS = ifNotContained(downSwapStratName, currentTS) {
            currentTS.declareStrategy(downSwapStratName, List(
              a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, a.term(INT_VAR_FUNCTOR, name, I2_VAR_NAME, S1_VAR_NAME))
                -> a.term(INT_VAR_FUNCTOR, name, I2_VAR_NAME, a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, S1_VAR_NAME)),
              a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, a.term(ARRAY_VAR_FUNCTOR, name, A1_VAR_NAME, S1_VAR_NAME))
                -> a.term(ARRAY_VAR_FUNCTOR, name, A1_VAR_NAME, a.term(INT_VAR_FUNCTOR, STACK_ELT_VARIABLE_NAME, I1_VAR_NAME, S1_VAR_NAME))))(false)
          }
          val writeStrat = "writeVar_" + name
          currentTS = ifNotContained(writeStrat, currentTS) {
            currentTS.declareStrategy(writeStrat) {
              DeclaredStrategyInstance("downAndThen",
                DeclaredStrategyInstance(downSwapStratName), DeclaredStrategyInstance(insertStrategyName))
            }(false)
          }
          (currentTS, DeclaredStrategyInstance(writeStrat))
        } else // local variables
          null // TODO   
    }
  }
}
