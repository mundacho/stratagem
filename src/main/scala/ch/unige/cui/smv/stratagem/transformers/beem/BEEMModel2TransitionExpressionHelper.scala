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
import ch.unige.cui.smv.stratagem.beem.expressions.And
import ch.unige.cui.smv.stratagem.beem.expressions.Assign
import ch.unige.cui.smv.stratagem.beem.expressions.BooleanExpression
import ch.unige.cui.smv.stratagem.beem.expressions.Darray
import ch.unige.cui.smv.stratagem.beem.expressions.IntegerExpression
import ch.unige.cui.smv.stratagem.beem.expressions.IsDifferent
import ch.unige.cui.smv.stratagem.beem.expressions.IsEqual
import ch.unige.cui.smv.stratagem.beem.expressions.LeftExpression
import ch.unige.cui.smv.stratagem.beem.expressions.LessThan
import ch.unige.cui.smv.stratagem.beem.expressions.Minus
import ch.unige.cui.smv.stratagem.beem.expressions.Noop
import ch.unige.cui.smv.stratagem.beem.expressions.Or
import ch.unige.cui.smv.stratagem.beem.expressions.Plus
import ch.unige.cui.smv.stratagem.beem.expressions.True
import ch.unige.cui.smv.stratagem.beem.expressions.Value
import ch.unige.cui.smv.stratagem.beem.expressions.Var
import ch.unige.cui.smv.stratagem.beem.expressions.VoidExpression
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper._
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$i1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$i2
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$n1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$n2
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$nz1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$nz2
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$nz3
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$s1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$v1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.ARRAY_FUNCTOR_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.EQ_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.FALSE_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.GET_ARR_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.LESS_THAN_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.MINUS_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NEQ_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.PLUS_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.TEST_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.TOP_STACK_VARIABLE_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.TRUE_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.arrVar
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.doubleVar
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.doubleVarNeg
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.intVar
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.lt
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.minus
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.myEq
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.neg
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.neq
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.plus
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.stackElt
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
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.IfThenElse
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategy

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
        intVar(stackElt, $i1, intVar(stackElt, $i2, $s1)) ->
          intVar(stackElt, a.term(opFunctor, $i1, $i2), $s1))(false)
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
        myEq(suc($n1), suc($n2)) -> myEq($n1, $n2),
        myEq(neg($n1), neg($n2)) -> myEq($n1, $n2),
        myEq(0, suc($n1)) -> FALSE_CONSTANT_NAME,
        myEq(0, neg($n1)) -> FALSE_CONSTANT_NAME,
        myEq(suc($n1), 0) -> FALSE_CONSTANT_NAME,
        myEq(neg($n1), 0) -> FALSE_CONSTANT_NAME))(false)
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
        neq(suc($n1), suc($n2)) -> neq($n1, $n2),
        neq(neg($nz1), neg($nz2)) -> neq($nz1, $nz2),
        neq(0, suc($n1)) -> TRUE_CONSTANT_NAME,
        neq(0, neg($nz1)) -> TRUE_CONSTANT_NAME,
        neq(suc($n1), 0) -> TRUE_CONSTANT_NAME,
        neq(neg($nz1), 0) -> TRUE_CONSTANT_NAME))(false)
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
        lt(0, neg($nz1)) -> FALSE_CONSTANT_NAME,
        lt(suc($n1), 0) -> FALSE_CONSTANT_NAME,
        lt(neg($nz1), 0) -> TRUE_CONSTANT_NAME,
        lt(0, suc($n1)) -> TRUE_CONSTANT_NAME,
        lt(neg($nz1), suc($n2)) -> TRUE_CONSTANT_NAME,
        lt(suc($n1), suc($n2)) -> lt($n1, $n2),
        lt(neg($nz1), neg($nz2)) -> lt($nz2, $nz1),
        lt(suc($n1), neg($nz1)) -> FALSE_CONSTANT_NAME))(false)
    }

    (currenTS, DeclaredStrategyInstance(lessThanStrategyName))
  }

  def createStrategiesForPlus(procName: String, initialTS: TransitionSystem, testFunctor: String): (TransitionSystem, NonVariableStrategy) = {
    implicit val a = initialTS.adt
    val plusStrategyInstance = testFunctor + "Strat"
    var currenTS = ifNotContained(plusStrategyInstance, initialTS) {
      // we transform the top of the stack to a test.
      initialTS.declareStrategy(plusStrategyInstance, List(
        plus($i1, 0) -> $i1,
        plus(0, $i1) -> $i1,
        neg(neg($i1)) -> $i1,
        neg(0) -> 0,
        plus(suc($nz1), suc($nz2)) -> plus(suc(suc($nz1)), $nz2),
        plus(neg($nz1), neg($nz2)) -> neg(plus($nz1, $nz2)),
        plus(neg($nz1), suc($nz2)) -> minus(suc($nz2), $nz1),
        plus(suc($nz1), neg($nz2)) -> minus(suc($nz1), $nz1),
        minus($i1, 0) -> $i1,
        minus(0, suc($nz1)) -> neg(suc($nz1)),
        minus(suc($nz1), suc($nz2)) -> minus($nz1, $nz2),
        minus(neg($nz1), neg($nz2)) -> neg(plus($nz1, $nz2)),
        minus(neg($nz1), suc($nz2)) -> minus(suc($nz2), $nz1),
        minus($i1, neg($nz2)) -> plus($i1, $nz2)))(false)
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
            $s1 -> intVar(stackElt, n, $s1))(false)
        }
        (resultTS, DeclaredStrategyInstance(createConstantOnTopOfStack))
      case Plus(n1, n2) => createEvalStrategyForBinaryIntOperation(proc, initialTS, n1, n2, PLUS_FUNCTOR)(createStrategiesForPlus)
      case Minus(n1, n2) => createEvalStrategyForBinaryIntOperation(proc, initialTS, n1, n2, MINUS_FUNCTOR)(createStrategiesForPlus)
      case Darray(name, n) =>
        // two cases: global and local variables
        val (readNTS, readNStrat) = createReadIntExpressionStrategy(proc, n, initialTS)
        if (proc.container.get.globalVariables.contains(name)) {
          readGlobalArray(name, readNTS)
        } else
          (null, null) // TODO local array
      case Var(name) => // two cases: global and local variables
        if (proc.container.get.globalVariables.contains(name)) {
          readGlobalVar(name, initialTS)
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
        intVar(stackElt, $i1, intVar(stackElt, $i2, $s1)) ->
          _test(a.term(testFunctor, $i1, $i2), $s1))(false)
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
          SimpleStrategy((_test(TRUE_CONSTANT_NAME, $s1) -> $s1) :: Nil) // we keep the tests that were true
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
              intVar(stackElt, $i1, intVar(name, $i2, $s1))
                -> intVar(name, $i1, $s1))(false)
          }
          val downSwapStratName = "downSwap"
          currentTS = ifNotContained(downSwapStratName, currentTS) {
            currentTS.declareStrategy(downSwapStratName, List(
              intVar(stackElt, $i1, intVar(name, $i2, $s1))
                -> intVar(name, $i2, intVar(stackElt, $i1, $s1)),
              intVar(stackElt, $i1, arrVar(name, $a1, $s1))
                -> arrVar(name, $a1, intVar(stackElt, $i1, $s1))))(false)
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

  def declareCheckVarForStratVar(name: String)(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(checkForVarStrategyName(name), initialTS) {
      initialTS.declareStrategy(checkForVarStrategyName(name),
        intVar(name, $i1, $s1) -> intVar(name, $i1, $s1))(false)
    }
  }

  def declareFindVarStrategyName(name: String)(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(findVarStrategyName(name), initialTS) {
      initialTS.declareStrategy(findVarStrategyName(name), V1) {
        IfThenElse(DeclaredStrategyInstance(checkForVarStrategyName(name)),
          V1,
          One(DeclaredStrategyInstance(findVarStrategyName(name), V1), 3))
      }(false)
    }
  }

  private def doubleVarStrategy(implicit a: ADT): NonVariableStrategy = {
    SimpleStrategy(List(
      suc($n1) -> doubleVar(0, 0, suc($n1)),
      0 -> doubleVar(0, 0, 0),
      neg($nz1) -> doubleVar(0, 0, neg($nz1))))
  }

  private def duplicateVarStrategy(implicit a: ADT): NonVariableStrategy = {
    SimpleStrategy(List(
      doubleVar($nz1, $nz2, suc($nz3)) -> doubleVar(suc($nz1), suc($nz2), $nz3),
      doubleVar($nz1, $nz2, neg($nz3)) -> doubleVarNeg($nz1, $nz2, $nz3),
      doubleVarNeg($nz1, $nz2, suc($nz3)) -> doubleVarNeg(suc($nz1), suc($nz2), $nz3),
      doubleVarNeg($nz1, $nz2, 0) -> doubleVar(neg($nz1), neg($nz2), 0)))
  }

  def extractValueStratName(name: String) = "extractVar_" + name

  def extractValueStrat(name: String)(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt

    ifNotContained(extractValueStratName(name), initialTS) {
      initialTS
        .declareStrategy(extractValueStratName(name), List(
          intVar($v1, doubleVar($i1, $i2, 0), $s1) ->
            intVar(TOP_STACK_VARIABLE_NAME, $i1, intVar(name, $i2, $s1))) // extract copy
            )(false)
    }
  }

  def declareStrategy(name: String, strat: NonVariableStrategy, trans: Boolean)(initialTS: TransitionSystem) =
    ifNotContained(name, initialTS) {
      initialTS.declareStrategy(name)(strat)(trans)
    }

  private def readGlobalVar(name: String, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) = { // global variable
    implicit val a = initialTS.adt

    val resultingState = for (
      _ <- State.mod(declareCheckVarForStratVar(name));
      doubleVarStrat <- State.insert(doubleVarStrategy);
      duplicateVarStrat <- State.insert(duplicateVarStrategy);
      extractValueStrat <- for (_ <- State.mod(extractValueStrat(name))) yield DeclaredStrategyInstance(extractValueStratName(name));
      findVarStrat <- State.mod(declareFindVarStrategyName(name)) map ((_: Unit) => DeclaredStrategyInstance(findVarStrategyName(name), _: NonVariableStrategy));
      copyStratBody = Sequence(
        One(Sequence(
          doubleVarStrat,
          FixPointStrategy(RewriteSetWith(duplicateVarStrat))), 2),
        extractValueStrat);
      copyVarStrat <- for (theName <- State.insert("copyVar" + name); _ <- State.mod(declareStrategy(theName, copyStratBody, false))) yield DeclaredStrategyInstance(theName)
    ) yield Sequence(
      findVarStrat(copyVarStrat),
      DeclaredStrategyInstance("upVariable"))

    resultingState.eval(initialTS)

  }

  private def readGlobalArray(name: String, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) = { // global array
    implicit val a = initialTS.adt
        // use the value in the stack to go and search for the value
        val insertStrategyName = "insertGet_" + name // this strategy inserts the operation to extract some value in the array
        var currentTS = ifNotContained(insertStrategyName, initialTS) {
          initialTS.declareStrategy(insertStrategyName,
            intVar(stackElt, $i1, arrVar(name, $a1, $s1)) -> arrVar(name, getArr($i1, $a1), $s1))(false)
        }
    //    val downSwapStratName = "downSwapGet" // this strategy swaps two elements in the state space vector
    //    currentTS = ifNotContained(downSwapStratName, currentTS) {
    //      currentTS.declareStrategy(downSwapStratName, List(
    //        intVar(stackElt, $i1, intVar($v1, $i2, $s1)) -> intVar($v1, $i2, intVar(stackElt, $i1, $s1)),
    //        intVar(stackElt, $i1, arrVar($v1, $a1, $s1)) -> arrVar($v1, $a1, intVar(stackElt, $i1, $s1))))(false)
    //    }
    //    val checkForZero = "checkForZero" // we before we extract the value from the array, we want to check if we are at the right position
    //    currentTS = ifNotContained(checkForZero, currentTS) {
    //      currentTS.declareStrategy(checkForZero,
    //        getArr(0, arr($i1, $a1)) -> getArr(0, arr($i1, $a1)))(false)
    //    }
    //
    //    val readArray = "readArray_" + name
    //    currentTS = ifNotContained(readArray, currentTS) {
    //      currentTS.declareStrategy(readArray) {
    //        DeclaredStrategyInstance("downAndThen",
    //          DeclaredStrategyInstance(downSwapStratName), DeclaredStrategyInstance(insertStrategyName))
    //      }(false)
    //    }
    //
    //    val extractValueStratName = "extractArrVal"
    //    currentTS = ifNotContained(extractValueStratName, currentTS) {
    //      currentTS
    //        .declareStrategy(extractValueStratName, List(
    //          arr(doubleVar($i1, $i2, 0), $a1) ->
    //            readVal($i1, arr($i2, $a1))) // extract copy
    //            )(false)
    //    }
    //
    //    val (doubleVarTS, doubleVarStrat) = doubleVarStrategy(currentTS)
    //    val (duplicateVarTS, duplicateVarStrat) = duplicateVarStrategy(doubleVarTS)
    //
    //    val copyArrValStrat = "copyArrVal"
    //    currentTS = ifNotContained(copyArrValStrat, doubleVarTS) {
    //      doubleVarTS
    //        .declareStrategy(copyArrValStrat) {
    //          Sequence(
    //            One(Sequence(
    //              doubleVarStrat,
    //              FixPointStrategy(RewriteSetWith(duplicateVarStrat))), 1),
    //            DeclaredStrategyInstance(extractValueStratName))
    //        }(false)
    //    }
    //
    //    val arrDownStratName = "arrDown"
    //    currentTS = ifNotContained(arrDownStratName, currentTS) {
    //      currentTS
    //        .declareStrategy(arrDownStratName, getArr(suc($n1), arr($i1, $a1)) -> arr($i1, getArr($n1, $a1)))(false)
    //    }

    null
  }

}
