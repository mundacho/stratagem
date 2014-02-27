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
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$a1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$i1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$i2
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$n1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$n2
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$nz1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$nz2
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$nz3
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$pn1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$s1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$s2
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$st1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.$v1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.EQ_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.FALSE_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.LESS_THAN_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.MINUS_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.NEQ_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.PLUS_FUNCTOR
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.TRUE_CONSTANT_NAME
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper._test
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.arr
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.arrVar
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.doubleVar
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.doubleVarNeg
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.getArr
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.intVar
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.lt
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.minus
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.myEq
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.neg
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.neq
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.plus
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.procVar
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.readVal
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.stackElt
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.statVar
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.suc
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.topStack
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSignatureHelper.valueAndIndex
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.RewriteSetWith
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.V1
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.checkForArrStrategyName
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.checkForVarStrategyName
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.checkForProcStrategyName
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem.findProcStrategyName
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

    val (readFirstIntTS, readFirstIntStrategy) = createReadIntExpressionStrategy(proc, n1)(initialTS)
    val (readSecondtIntTS, readSecondIntStrategy) = createReadIntExpressionStrategy(proc, n2)(readFirstIntTS)
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

    val evalFunctor = "eval_" + s"${proc.name}_${opFunctor}(${n1}, ${n2}) "
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
    val currenTS = ifNotContained(plusStrategyInstance, initialTS) {
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

  def createReadIntExpressionStrategy(proc: DivineProcess, exp: IntegerExpression)(initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) = {
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
        val (readNTS, readNStrat) = createReadIntExpressionStrategy(proc, n)(initialTS)
        if (proc.container.get.globalVariables.contains(name)) {
          val (resTS, readGArrayStrat) = readGlobalArray(name, readNTS)
          (resTS, Sequence(readNStrat, readGArrayStrat))
        } else
          (null, null) // TODO local array
      case Var(name) => // two cases: global and local variables
        if (proc.container.get.globalVariables.contains(name)) {
          readGlobalVar(name, initialTS)
        } else if (proc.variables.contains(name)) { // local variable
          (for {
            findProcStrat <- State.insert(DeclaredStrategyInstance(findProcStrategyName(proc.name), _: NonVariableStrategy))
            readGlobalVar <- State.modAndReturn(readGlobalVar(name, _: TransitionSystem))
            upVariable <- State.insert(DeclaredStrategyInstance("upVariable"))
            extractStrat <- State.modAndReturn(extractStackFromProc)
          } yield Sequence(findProcStrat(
            Sequence(One(readGlobalVar, 2),
              extractStrat) // here we extract the result 
              ), upVariable)
          ).eval(initialTS)
        } else {
          throw new IllegalArgumentException(s"Cannot create strategy for undefined variable $name") // this should not happen
        }
    }
  }

  def extractStackFromProc(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    val extractFromProcName = "extractFromProc"
    val res = ifNotContained(extractFromProcName, initialTS) {
      initialTS.declareStrategy(extractFromProcName, procVar($pn1, intVar(stackElt, $i1, $s1), $s2) -> intVar(topStack, $i1, procVar($pn1, $s1, $s2)))(false)
    }

    (res, DeclaredStrategyInstance(extractFromProcName))
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

    val (readFirstIntTS, readFirstIntStrategy) = createReadIntExpressionStrategy(proc, n1)(initialTS)
    val (readSecondtIntTS, readSecondIntStrategy) = createReadIntExpressionStrategy(proc, n2)(readFirstIntTS)
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

    val evalFunctor = "eval" + testFunctor + "_"  + proc.name + "_" + n1 + "_" + n2
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
      val (readRightExpTS, readRightExpStrat) = createReadIntExpressionStrategy(proc, rightExp)(initialTS)
      val (assignTopOfStackTS, assignTopOfStackStrat) = createTransitionSystemForLeftExpression(proc, leftExpr, readRightExpTS) // we need a strategy to put the head of the stack in a global variable
      (assignTopOfStackTS, Sequence(readRightExpStrat, assignTopOfStackStrat))
  }

  def insertStrategyName(name: String) = "insert_" + name

  def insertStrategy(name: String)(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(insertStrategyName(name), initialTS) {
      initialTS.declareStrategy(insertStrategyName(name),
        intVar(stackElt, $i1, intVar(name, $i2, $s1))
          -> intVar(name, $i1, $s1))(false)
    }
  }

  def packAddressAndData(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    (initialTS, SimpleStrategy(List(intVar(stackElt, $n1, intVar(stackElt, $n2, $s1)) -> intVar(stackElt, valueAndIndex($n2, $n1), $s1))))
  }
  
  def insertInProcessName(name:String) = "insertInProc_" + name
  
    def insertInProcess(name:String)(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    val resTS= ifNotContained(insertInProcessName(name), initialTS){
      initialTS.declareStrategy(insertInProcessName(name), intVar(stackElt, $i1, procVar(name, $s1, $s2)) -> procVar(name, intVar(stackElt, $i1, $s1), $s2))(false)
    }
    (resTS, DeclaredStrategyInstance(insertInProcessName(name)))
  }

  def createTransitionSystemForLeftExpression(proc: DivineProcess, exp: LeftExpression, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) = {
    implicit val a = initialTS.adt
    exp match {
      case Var(name) =>
        if (proc.container.get.globalVariables.contains(name)) { // global variable
          writeGlobalVariable(name).eval(initialTS)
        } else { // local variable
          (for {
            findProcStrat <- State.insert(DeclaredStrategyInstance(findProcStrategyName(proc.name), _: NonVariableStrategy))
            insertInProcess <- State.modAndReturn(insertInProcess(proc.name))
            downSwapStrat <- for (_ <- State.mod(downSwapStrat(name))) yield DeclaredStrategyInstance(downSwapStratName)
            writeVar <- writeGlobalVariable(name)
          } yield DeclaredStrategyInstance("downAndThen",
            downSwapStrat, Sequence(Sequence(
                One(DeclaredStrategyInstance(checkForProcStrategyName(proc.name)), 3),
                insertInProcess), One(writeVar, 2)))).eval(initialTS) // TODO
        }
      case Darray(name, n) =>
        val res = for {
          readValueStrat <- State.modAndReturn(createReadIntExpressionStrategy(proc, n))
          packStrategy <- State.modAndReturn(packAddressAndData)
          downSwapStrat <- for (_ <- State.mod(downSwapStrat(name))) yield DeclaredStrategyInstance(downSwapStratName)
          checkArray <- for (_ <- State.mod(declareCheckArrForStratVar(name))) yield DeclaredStrategyInstance(checkForArrStrategyName(name))
          insertWriteGet <- for (_ <- State.mod(insertWriteGetStrategy(name))) yield DeclaredStrategyInstance(insertWriteGetStrategyName(name))
          arrWriteDown <- for (_ <- State.mod(arrWriteDownStrat)) yield DeclaredStrategyInstance(arrWriteDownStratName)
          arrWrite <- for (_ <- State.mod(arrWriteStrat)) yield DeclaredStrategyInstance(arrWriteStratName)
        } yield Sequence(Sequence(
          readValueStrat, packStrategy),
          DeclaredStrategyInstance("downAndThen", downSwapStrat,
            Sequence(Sequence(
              checkArray,
              insertWriteGet),
              One(
                DeclaredStrategyInstance("arrayDownAndThen", arrWriteDown,
                  arrWrite), 2))))
        res.eval(initialTS)
    }
  }

  def declareCheckVarForStratVar(name: String)(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(checkForVarStrategyName(name), initialTS) {
      initialTS.declareStrategy(checkForVarStrategyName(name),
        intVar(name, $i1, $s1) -> intVar(name, $i1, $s1))(false)
    }
  }

  def declareCheckArrForStratVar(name: String)(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(checkForArrStrategyName(name), initialTS) {
      initialTS.declareStrategy(checkForArrStrategyName(name),
        intVar(stackElt, $i1, arrVar(name, $a1, $s1)) -> intVar(stackElt, $i1, arrVar(name, $a1, $s1)))(false)
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

  def declareFindArrStrategyName(name: String)(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(findVarStrategyName(name), initialTS) {
      initialTS.declareStrategy(findVarStrategyName(name), V1) {
        IfThenElse(DeclaredStrategyInstance(checkForArrStrategyName(name)),
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
            intVar(topStack, $i1, intVar(name, $i2, $s1))) // extract copy
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

  def insertGetStrategyName(name: String) = "insertGet_" + name

  def insertGetStrategy(name: String)(initialTS: TransitionSystem) = { // use the value in the stack to go and search for the value
    implicit val a = initialTS.adt
    val insertStrategyName = insertGetStrategyName(name) // this strategy inserts the operation to extract some value in the array
    ifNotContained(insertStrategyName, initialTS) {
      initialTS.declareStrategy(insertStrategyName,
        intVar(stackElt, $i1, arrVar(name, $a1, $s1)) -> arrVar(name, getArr($i1, $a1), $s1))(false)
    }
  }

  def insertWriteGetStrategyName(name: String) = "insertWriteGet_" + name

  def insertWriteGetStrategy(name: String)(initialTS: TransitionSystem) = { // use the value in the stack to go and search for the value
    implicit val a = initialTS.adt
    val insertStrategyName = insertWriteGetStrategyName(name) // this strategy inserts the operation to extract some value in the array
    ifNotContained(insertStrategyName, initialTS) {
      initialTS.declareStrategy(insertStrategyName,
        intVar(stackElt, valueAndIndex($i1, $n1), arrVar(name, $a1, $s1)) -> arrVar(name, getArr(valueAndIndex($i1, $n1), $a1), $s1))(false)
    }
  }

  def downSwapStratName = "downSwapGet"

  def downSwapStrat(name: String)(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    val downSwapStratName0 = downSwapStratName // this strategy swaps two elements in the state space vector
    ifNotContained(downSwapStratName0, initialTS) {
      initialTS.declareStrategy(downSwapStratName0, List(
        intVar(stackElt, $i1, intVar($v1, $i2, $s1)) -> intVar($v1, $i2, intVar(stackElt, $i1, $s1)),
        intVar(stackElt, $i1, arrVar($v1, $a1, $s1)) -> arrVar($v1, $a1, intVar(stackElt, $i1, $s1)),
        intVar(stackElt, $i1, statVar($pn1, $st1, $s1)) -> statVar($pn1, $st1, intVar(stackElt, $i1, $s1)),
        intVar(stackElt, $i1, procVar($pn1, $s1, $s2)) -> procVar($pn1, $s1, intVar(stackElt, $i1, $s2))))(false)
    }
  }

  val checkForZeroName = "checkForZero"

  def checkZero(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    // we before we extract the value from the array, we want to check if we are at the right position
    ifNotContained(checkForZeroName, initialTS) {
      initialTS.declareStrategy(checkForZeroName,
        getArr(0, arr($i1, $a1)) -> arr($i1, $a1))(false)
    }
  }

  def readArrayName(name: String) = "readArray_" + name

  def readArray(name: String, insertGet: NonVariableStrategy)(initialTS: TransitionSystem) = {

    ifNotContained(readArrayName(name), initialTS) {
      initialTS.declareStrategy(readArrayName(name)) {
        DeclaredStrategyInstance("downAndThen",
          DeclaredStrategyInstance(downSwapStratName), insertGet)
      }(false)
    }
  }

  val extractValueStratName = "extractArrVal"

  def extractArrVal(name: String)(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(extractValueStratName, initialTS) {
      initialTS
        .declareStrategy(extractValueStratName, List(
          arr(doubleVar($i1, $i2, 0), $a1) ->
            readVal($i1, arr($i2, $a1))) // extract copy
            )(false)
    }
  }
  val copyArrValStrat = "copyArrVal"
  def copyArrVal(doubleVarStrat: NonVariableStrategy, duplicateVarStrat: NonVariableStrategy)(initialTS: TransitionSystem) = {
    ifNotContained(copyArrValStrat, initialTS) {
      initialTS
        .declareStrategy(copyArrValStrat) {
          Sequence(
            One(Sequence(
              doubleVarStrat,
              FixPointStrategy(RewriteSetWith(duplicateVarStrat))), 1),
            DeclaredStrategyInstance(extractValueStratName))
        }(false)
    }
  }

  val arrDownStratName = "arrDown"

  def arrDownStrat(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(arrDownStratName, initialTS) {
      initialTS
        .declareStrategy(arrDownStratName, getArr(suc($n1), arr($i1, $a1)) -> arr($i1, getArr($n1, $a1)))(false)
    }
  }

  val arrWriteDownStratName = "arrWriteDown"

  def arrWriteDownStrat(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(arrWriteDownStratName, initialTS) {
      initialTS
        .declareStrategy(arrWriteDownStratName, getArr(valueAndIndex($i1, suc($n1)), arr($i2, $a1)) -> arr($i2, getArr(valueAndIndex($i1, $n1), $a1)))(false)
    }
  }

  val arrWriteStratName = "arrWrite"

  def arrWriteStrat(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(arrWriteStratName, initialTS) {
      initialTS
        .declareStrategy(arrWriteStratName, getArr(valueAndIndex($i1, 0), arr($i2, $a1)) -> arr($i1, $a1))(false)
    }
  }

  val arrUpStratName = "arrUp"

  def arrUpStrat(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(arrUpStratName, initialTS) {
      initialTS
        .declareStrategy(arrUpStratName, arr($i1, readVal($i2, $a1)) -> readVal($i2, arr($i1, $a1)))(false)
    }
  }

  val extractFromArrayStratName = "extractFromArray"

  def declareStratExtractFromArray(initialTS: TransitionSystem) = {
    implicit val a = initialTS.adt
    ifNotContained(extractFromArrayStratName, initialTS) {
      initialTS
        .declareStrategy(extractFromArrayStratName, arrVar($v1, readVal($i1, $a1), $s1) -> intVar(topStack, $i1, arrVar($v1, $a1, $s1)))(false)
    }
  }

  private def readGlobalArray(name: String, initialTS: TransitionSystem): (TransitionSystem, NonVariableStrategy) = { // global array
    implicit val a = initialTS.adt

    val intermediateState = for (
      checkArrVar <- State.mod(declareCheckArrForStratVar(name)) map ((_: Unit) => DeclaredStrategyInstance(checkForArrStrategyName(name)));
      insertGetStrategy <- for (_ <- State.mod(insertGetStrategy(name))) yield DeclaredStrategyInstance(insertGetStrategyName(name));
      downSwapStrat <- for (_ <- State.mod(downSwapStrat(name))) yield DeclaredStrategyInstance(downSwapStratName);
      checkForZero <- for (_ <- State.mod(checkZero)) yield DeclaredStrategyInstance(checkForZeroName);
      readArray <- for (_ <- State.mod(readArray(name, insertGetStrategy))) yield DeclaredStrategyInstance(readArrayName(name));
      extractArrVal <- for (_ <- State.mod(extractArrVal(name))) yield DeclaredStrategyInstance(extractValueStratName);
      doubleVarStrat <- State.insert(doubleVarStrategy);
      duplicateVarStrat <- State.insert(duplicateVarStrategy);
      copyArrStrat <- for (_ <- State.mod(copyArrVal(doubleVarStrat, duplicateVarStrat))) yield DeclaredStrategyInstance(copyArrValStrat);
      arrDown <- for (_ <- State.mod(arrDownStrat)) yield DeclaredStrategyInstance(arrDownStratName);
      arrUp <- for (_ <- State.mod(arrUpStrat)) yield DeclaredStrategyInstance(arrUpStratName);
      extractValFromArray <- State.mod(declareStratExtractFromArray) map ((_: Unit) => DeclaredStrategyInstance(extractFromArrayStratName))
    ) yield DeclaredStrategyInstance("downAndThen", downSwapStrat,
      Sequence(Sequence(
        checkArrVar,
        insertGetStrategy), // first sequence checks if we are at the right array and then inserts the get in the array
        Sequence(
          One( // we enter the array
            Sequence( // this sequence is applied on the array itself
              DeclaredStrategyInstance("arrayDownAndThen", // we go down the array
                arrDown,
                Sequence(
                  checkForZero, // if we get to zero
                  copyArrStrat)), // we apply the strategy copyArr which gives us a term of the form readVal($i, arr($i, $a))
              DeclaredStrategyInstance("upArr", arrUp)), 2) // up array is applied on top of the array
              ,
          extractValFromArray))) // finally we extract the value into an intVar
    val (resultTS, extractVar) = intermediateState.eval(initialTS)
    (resultTS, Sequence(extractVar, DeclaredStrategyInstance("upVariable")))
  }

  private def writeGlobalVariable(name: String): State[TransitionSystem, NonVariableStrategy] = {
    for (
      insertStrat <- for (_ <- State.mod(insertStrategy(name))) yield DeclaredStrategyInstance(insertStrategyName(name));
      downSwapStrat <- for (_ <- State.mod(downSwapStrat(name))) yield DeclaredStrategyInstance(downSwapStratName)
    ) yield DeclaredStrategyInstance("downAndThen",
      downSwapStrat, insertStrat)
  }

}
