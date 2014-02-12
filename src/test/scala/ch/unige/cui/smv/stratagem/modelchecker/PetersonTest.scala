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
package ch.unige.cui.smv.stratagem.modelchecker

import scala.language.implicitConversions
import org.scalatest.FlatSpec
import com.typesafe.scalalogging.slf4j.Logging
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SigmaDDRewriterFactory
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.Not
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy

/**
 * Test if we can create a transition system to represent the peterson problem as present in Divine.
 * @author mundacho
 *
 */
class PetersonTest extends FlatSpec with Logging {

  val signature = (new Signature)
    .withSort("bool")
    .withSort("int")
    .withSort("nat", "int")
    .withSort("zero", "nat")
    .withSort("nznat", "nat")
    .withSort("stateComponent")
    .withSort("arrayInt3")
    .withSort("process")
    .withSort("state")
    .withSort("intXstate")
    .withGenerator("true", "bool")
    .withGenerator("false", "bool")
    .withGenerator("zero", "zero")
    .withGenerator("suc", "nat", "nat")
    .withGenerator("-", "nznat", "int")
    .withGenerator("emptyState", "stateComponent")
    .withGenerator("pos", "stateComponent", "arrayInt3", "stateComponent")
    .withGenerator("step", "stateComponent", "arrayInt3", "stateComponent")
    .withGenerator("array", "arrayInt3", "int", "int", "int")
    .withGenerator("proc", "stateComponent", "process", "stateComponent")
    .withGenerator("emptyProcess", "process")
    .withGenerator("NCS", "state")
    .withGenerator("CS", "state")
    .withGenerator("wait", "state")
    .withGenerator("q2", "state")
    .withGenerator("q3", "state")
    .withGenerator("is", "intXstate", "int", "stateComponent")
    .withGenerator("state", "process", "state", "process")
    .withGenerator("j", "process", "int", "process")
    .withGenerator("k", "process", "int", "process")
    .withOperation("lt", "bool", "int", "int")
    .withOperation("testInt", "int", "bool", "int")
    .withOperation("doubleVar", "int", "int", "int", "int")
    .withOperation("doubleVarNeg", "int", "int", "int", "int")
    .withOperation("read", "intXstate", "stateComponent")
    .withOperation("readVal", "stateComponent", "int", "stateComponent")
    .withOperation("doubleReadVal", "stateComponent", "int", "int", "stateComponent")
    .withOperation("setPosToVal", "arrayInt3", "int", "int", "arrayInt3")
    .withOperation("ignore", "stateComponent", "stateComponent")
    .withOperation("getPosValAt", "arrayInt3", "nat", "arrayInt3")
    .withOperation("readValArray", "arrayInt3", "int", "arrayInt3")

  val adt = new ADT("peterson", signature)
    .declareVariable("n", "nat")
    .declareVariable("m", "nat")
    .declareVariable("o", "nat")
    .declareVariable("n1", "nat")
    .declareVariable("s", "stateComponent")
    .declareVariable("p", "process")
    .declareVariable("st", "state")
    .declareVariable("a", "arrayInt3")

  implicit def int2ATerm(n: Int): ATerm = n match {
    case 0 => adt.term("zero")
    case _ => if (n > 0) adt.term("suc", int2ATerm(n - 1)) else adt.term("-", int2ATerm(-n))
  }

  def getPosValAt(n: ATerm, a: ATerm) = adt.term("getPosValAt", n, a)
  def readValArray(n: ATerm, a: ATerm) = adt.term("readValArray", n, a)
  def pos(n1: ATerm, proc: ATerm) = adt.term("pos", n1, proc)
  def step(n1: ATerm, proc: ATerm) = adt.term("step", n1, proc)
  def array(n1: ATerm, n2: ATerm, n3: ATerm) = adt.term("array", n1, n2, n3)
  def lt(n1: ATerm, n2: ATerm) = adt.term("lt", n1, n2)
  val emptyState = adt.term("emptyState")
  val NCS = adt.term("NCS")
  val CS = adt.term("CS")
  val waitT = adt.term("wait")
  val trueOp = adt.term("true")
  val falseOp = adt.term("false")
  def suc(n: ATerm) = adt.term("suc", n)
  def neg(n: ATerm) = adt.term("-", n)
  val q2 = adt.term("q2")
  val q3 = adt.term("q3")
  def testInt(b: ATerm, n: ATerm) = adt.term("testInt", b, n)
  def proc(state: ATerm, process: ATerm) = adt.term("proc", state, process)
  def state(state: ATerm, process: ATerm) = adt.term("state", state, process)
  def setPosToVal(n1: ATerm, n2: ATerm, array: ATerm) = adt.term("setPosToVal", n1, n2, array)
  def j(n: ATerm, proc: ATerm) = adt.term("j", n, proc)
  def k(n: ATerm, proc: ATerm) = adt.term("k", n, proc)
  def ignore(s: ATerm) = adt.term("ignore", s)
  val emptyProc = adt.term("emptyProcess")
  def doubleVar(n1: ATerm, n2: ATerm, n3: ATerm) = adt.term("doubleVar", n1, n2, n3)
  def doubleVarNeg(n1: ATerm, n2: ATerm, n3: ATerm) = adt.term("doubleVarNeg", n1, n2, n3)
  def readVal(n: ATerm, s: ATerm) = adt.term("readVal", n, s)
  def doubleReadVal(m: ATerm, n: ATerm, s: ATerm) = adt.term("doubleReadVal", m, n, s)

  val n = adt.term("n")
  val m = adt.term("m")
  val o = adt.term("o")
  val s = adt.term("s")
  val p = adt.term("p")
  val st = adt.term("st")
  val a = adt.term("a")
  val n1 = adt.term("n1")

  def ApplyToProcesses(s: NonVariableStrategy) = DeclaredStrategyInstance("applyToProcesses", s)
  def ApplyToAllProcesses(s: NonVariableStrategy) = DeclaredStrategyInstance("applyToAllProcesses", s)

  val V1 = VariableStrategy("V1")
  val V2 = VariableStrategy("V2")

  val LessThan = DeclaredStrategyInstance("lessThan")
  val DuplicateVar = DeclaredStrategyInstance("duplicateVar")
  def RewriteSetWith(s: Strategy) = DeclaredStrategyInstance("rewriteSetWith", s)
  def ApplyToJ(s: NonVariableStrategy) = DeclaredStrategyInstance("applyToJ", s)
  def ApplyToK(s: NonVariableStrategy) = DeclaredStrategyInstance("applyToK", s)

  val ts = new TransitionSystem(adt,
    pos(array(0, 0, 0),
      step(array(0, 0, 0),
        proc(state(NCS, j(0, k(0, emptyProc))),
          proc(state(NCS, j(0, k(0, emptyProc))),
            proc(state(NCS, j(0, k(0, emptyProc))),
              emptyState))))))
    .declareStrategy("j=1", j(n, p) -> j(1, p))(false)
    .declareStrategy("NCS->wait", state(NCS, p) -> state(waitT, p))(false)
    .declareStrategy("wait->q2", state(waitT, p) -> state(q2, p))(false)
    .declareStrategy("procT1") { One(Sequence(DeclaredStrategyInstance("NCS->wait"), One(DeclaredStrategyInstance("j=1"), 2)), 1) }(false)
    .declareStrategy("lessThan", List(
      lt(0, 0) -> falseOp,
      lt(0, neg(n)) -> falseOp,
      lt(suc(n), 0) -> falseOp,
      lt(neg(n), 0) -> trueOp,
      lt(0, suc(n)) -> trueOp,
      lt(neg(n), suc(m)) -> trueOp,
      lt(suc(n), suc(m)) -> lt(n, m),
      lt(neg(n), neg(m)) -> lt(m, n),
      lt(suc(n), neg(m)) -> falseOp))(false)
    .declareStrategy("doubleVar", List(
      suc(n) -> doubleVar(0, 0, suc(n)),
      0 -> doubleVar(0, 0, 0),
      neg(n) -> doubleVar(0, 0, neg(n))))(false)
    .declareStrategy("duplicateVar", List(
      doubleVar(m, n, suc(o)) -> doubleVar(suc(m), suc(n), o),
      doubleVar(m, n, neg(o)) -> doubleVarNeg(m, n, o),
      doubleVarNeg(m, n, suc(o)) -> doubleVarNeg(suc(m), suc(n), o),
      doubleVarNeg(m, n, 0) -> doubleVar(neg(m), neg(n), 0)))(false)
    .declareStrategy("testLT3", doubleVar(m, n, 0) -> testInt(lt(m, 3), n))(false)
    .declareStrategy("applyTest", testInt(trueOp, n) -> n)(false)
    .declareStrategy("rewriteSetWith", V1) { Union(Choice(V1, Not(V1)), Choice(Not(V1), V1)) }(false)
    .declareStrategy("applyToJ", V1) { One(One(V1, 1), 2) }(false) // enter proc term and apply strategy V1 to the variable J
    .declareStrategy("checkGuardProcT2") { // applies on the state subterm
      ApplyToJ(
        Sequence(Sequence(Sequence(Sequence(
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))), // apply duplicate operation
          FixPointStrategy(RewriteSetWith(DuplicateVar))), // duplicate 
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("testLT3")))), // transform to test form
          One(FixPointStrategy(RewriteSetWith(LessThan)), 1)), DeclaredStrategyInstance("applyTest"))) // do the calculation
    }(false)
    .declareStrategy("applyToProcesses", V1) { One(One(V1, 2), 2) }(false)
    .declareStrategy("testEmpty", emptyState -> emptyState)(false)
    .declareStrategy("applyToAllProcesses", V1) {
      Choice(Union(
        Sequence(V1, Try(
          One(
            DeclaredStrategyInstance("applyToAllProcesses", V1), 2))),
        One(DeclaredStrategyInstance("applyToAllProcesses", V1), 2)),
        Choice( // if the union doesn't work, choose one of its two elements.
          Sequence(V1, Try(
            One(
              DeclaredStrategyInstance("applyToAllProcesses", V1), 2))),
          One(DeclaredStrategyInstance("applyToAllProcesses", V1), 2)))
    }(false)
    .declareStrategy("T1") { ApplyToProcesses(ApplyToAllProcesses(DeclaredStrategyInstance("procT1"))) }(true)
    .declareStrategy("extractJ", proc(state(st, j(doubleVar(m, n, 0), p)), s) -> readVal(m, ignore(proc(state(st, j(n, p)), s))))(false)
    .declareStrategy("extractK", proc(state(st, j(n1, k(doubleVar(m, n, 0), emptyProc))), s) -> readVal(m, ignore(proc(state(st, j(n1, k(n, emptyProc))), s))))(false)
    .declareStrategy("testProc", proc(p, s) -> proc(p, s))(false)
    .declareStrategy("unignore", ignore(s) -> s)(false)
    .declareStrategy("getJFromProc") {
      Sequence(
        One(ApplyToJ( // first One puts the cursor at the term state(..)
          Sequence(
            FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))),
            FixPointStrategy(RewriteSetWith(DuplicateVar)))), 1), // apply duplicate operation
        DeclaredStrategyInstance("extractJ"))
    }(false)
    .declareStrategy("applyToK", V1) { One(One(One(V1, 1), 2), 2) }(false)
    .declareStrategy("getKFromProc") {
      Sequence(
        One(ApplyToK( // first One puts the cursor at the term state(..)
          Sequence(
            FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))),
            FixPointStrategy(RewriteSetWith(DuplicateVar)))), 1), // apply duplicate operation
        DeclaredStrategyInstance("extractK"))
    }(false)
    .declareStrategy("procT2") {
      Choice(DeclaredStrategyInstance("unignore"),
        Sequence(
          One(
            Sequence(
              DeclaredStrategyInstance("checkGuardProcT2"),
              DeclaredStrategyInstance("wait->q2")), 1),
          DeclaredStrategyInstance("getJFromProc")))
    }(false)
    .declareStrategy("up", V1) {
      Sequence(
        Try(One(DeclaredStrategyInstance("up", V1), 2)),
        Union(Choice(V1, Not(V1)), Choice(Not(V1), V1)))
    }(false) // applies its strategy bottom up in the state vector
    .declareStrategy("swap", List(proc(p, readVal(n, s)) -> readVal(n, proc(p, s)),
      pos(a, readVal(n, s)) -> readVal(n, pos(a, s)),
      step(a, readVal(n, s)) -> readVal(n, step(a, s))))(false)
    .declareStrategy("doubleSwap", List(proc(p, doubleReadVal(m, n, s)) -> doubleReadVal(m, n, proc(p, s)),
      pos(a, doubleReadVal(m, n, s)) -> doubleReadVal(m, n, pos(a, s)),
      step(a, doubleReadVal(m, n, s)) -> doubleReadVal(m, n, step(a, s))))(false)
    .declareStrategy("readVal2DoubleReadVal", readVal(m, readVal(n, s)) -> doubleReadVal(m, n, s))(false)
    .declareStrategy("array[0]<-readVal", readVal(n1, pos(array(m, n, o), s)) -> pos(array(n1, n, o), s))(false)
    .declareStrategy("T2") {
      Choice(DeclaredStrategyInstance("unignore"),
        Sequence(
          Sequence(ApplyToProcesses(ApplyToAllProcesses(DeclaredStrategyInstance("procT2"))), DeclaredStrategyInstance("up", DeclaredStrategyInstance("swap"))),
          DeclaredStrategyInstance("array[0]<-readVal")))
    }(true)
    .declareStrategy("q2->q3", state(q2, p) -> state(q3, p))(false)
    .declareStrategy("setPosToVal", List(
      setPosToVal(0, m, array(n, o, n1)) -> array(m, o, n1),
      setPosToVal(1, m, array(n, o, n1)) -> array(n, m, n1),
      setPosToVal(2, m, array(n, o, n1)) -> array(n, o, m)))(false)
    .declareStrategy("readJ") {
      Sequence(
        ApplyToProcesses(ApplyToAllProcesses(
          Choice(DeclaredStrategyInstance("unignore"), DeclaredStrategyInstance("getJFromProc")))),
        One(DeclaredStrategyInstance("up", DeclaredStrategyInstance("swap")), 2)) // gets the readval to the right position, just before step
    }(false)
    .declareStrategy("applyOpToReadVal", readVal(suc(n), step(a, s)) -> step(setPosToVal(n, 0, a), s))(false)
    .declareStrategy("k=0", k(n, p) -> k(0, p))(false)
    .declareStrategy("procT3") { // we are appying the rules to a term of form proc(...)
      Choice(DeclaredStrategyInstance("unignore"),
        Sequence(
          One( // enter the proc term, now in a term of form state(...)
            Sequence(
              DeclaredStrategyInstance("q2->q3"), // change state
              One(One(DeclaredStrategyInstance("k=0"), 2), 2) // modify k
              ), 1),
          DeclaredStrategyInstance("getJFromProc")))
    }(false)
    .declareStrategy("T3") {
      Sequence(Sequence(
        ApplyToProcesses(ApplyToAllProcesses(DeclaredStrategyInstance("procT3"))), // we do local operations
        One(DeclaredStrategyInstance("up", DeclaredStrategyInstance("swap")), 2)),
        One(
          Sequence(
            DeclaredStrategyInstance("applyOpToReadVal"),
            One(FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("setPosToVal"))), 1)), 2))
    }(true)
    .declareStrategy("CS->NCS", state(CS, p) -> state(NCS, p))(false)
    .declareStrategy("pos[0]<-0", pos(array(n, m, o), s) -> pos(array(0, m, o), s))(false)
    .declareStrategy("procT7") {
      One(DeclaredStrategyInstance("CS->NCS"), 1)
    }(false)
    .declareStrategy("T7") {
      Sequence(
        ApplyToProcesses(ApplyToAllProcesses(DeclaredStrategyInstance("procT7"))),
        DeclaredStrategyInstance("pos[0]<-0"))
    }(true)
    .declareStrategy("wait->CS", state(waitT, p) -> state(CS, p))(false)
    .declareStrategy("testEQ3", doubleVar(3, 3, 0) -> 3)(false)
    .declareStrategy("testEQ0", doubleVar(0, 0, 0) -> 0)(false)
    .declareStrategy("checkGuardProcT6") { // applies on the state subterm
      ApplyToJ(
        Sequence(Sequence(
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))), // apply duplicate operation
          FixPointStrategy(RewriteSetWith(DuplicateVar))), // duplicate 
          DeclaredStrategyInstance("testEQ3"))) // do the test
    }(false)
    .declareStrategy("T6") {
      ApplyToProcesses(ApplyToAllProcesses(One(Sequence(
        DeclaredStrategyInstance("checkGuardProcT6"),
        DeclaredStrategyInstance("wait->CS")), 1)))
    }(true)
    .declareStrategy("q3->q3", state(q3, p) -> state(q3, p))(true)
    .declareStrategy("checkK<3") {
      ApplyToK(
        Sequence(Sequence(Sequence(Sequence(
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))), // apply duplicate operation
          FixPointStrategy(RewriteSetWith(DuplicateVar))), // duplicate 
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("testLT3")))), // transform to test form
          One(FixPointStrategy(RewriteSetWith(LessThan)), 1)), DeclaredStrategyInstance("applyTest"))) // do the calculation
    }(false)
    .declareStrategy("inc1", n -> suc(n))(false)
    .declareStrategy("checkK==0") {
      ApplyToK(
        Sequence(Sequence(
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))), // apply duplicate operation
          FixPointStrategy(RewriteSetWith(DuplicateVar))), // duplicate 
          DeclaredStrategyInstance("testEQ0"))) // do the test
    }(false)
    .declareStrategy("T4a") {
      ApplyToProcesses(ApplyToAllProcesses(
        One(
          Sequence(Sequence(Sequence(
            DeclaredStrategyInstance("q3->q3"),
            DeclaredStrategyInstance("checkK<3")),
            DeclaredStrategyInstance("checkK==0")),
            ApplyToK(DeclaredStrategyInstance("inc1"))), 1)))
    }(true)
    .declareStrategy("test0getPostValAt", getPosValAt(0, a) -> a)(false)
    .declareStrategy("test1getPostValAt", getPosValAt(1, a) -> a)(false)
    .declareStrategy("test2getPostValAt", getPosValAt(2, a) -> a)(false)
    .declareStrategy("read0getPostValAt", array(doubleVar(m, n, 0), o, n1) -> readValArray(m, array(n, o, n1)))(false)
    .declareStrategy("read1getPostValAt", array(m, doubleVar(n, o, 0), n1) -> readValArray(n, array(m, o, n1)))(false)
    .declareStrategy("read2getPostValAt", array(m, n, doubleVar(o, n1, 0)) -> readValArray(n1, array(m, n, o)))(false)
    .declareStrategy("doubleReadVal2getPostValAt", doubleReadVal(m, n, pos(a, s)) -> readVal(m, pos(getPosValAt(n, a), s)))(false)
    .declareStrategy("getPosValAt0") {
      Sequence(Sequence(
        DeclaredStrategyInstance("test0getPostValAt"),
        One(Sequence(
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))), // apply duplicate operation
          FixPointStrategy(RewriteSetWith(DuplicateVar))), 1)),
        DeclaredStrategyInstance("read0getPostValAt"))
    }(false)
    .declareStrategy("getPosValAt1") {
      Sequence(Sequence(
        DeclaredStrategyInstance("test1getPostValAt"),
        One(Sequence(
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))), // apply duplicate operation
          FixPointStrategy(RewriteSetWith(DuplicateVar))), 2)),
        DeclaredStrategyInstance("read1getPostValAt"))
    }(false)
    .declareStrategy("getPosValAt2") {
      Sequence(Sequence(
        DeclaredStrategyInstance("test2getPostValAt"),
        One(Sequence(
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))), // apply duplicate operation
          FixPointStrategy(RewriteSetWith(DuplicateVar))), 3)),
        DeclaredStrategyInstance("read2getPostValAt"))
    }(false)
    .declareStrategy("getPosValAt") {
      Choice(Choice(Union(DeclaredStrategyInstance("getPosValAt0"), Not(DeclaredStrategyInstance("test0getPostValAt"))), DeclaredStrategyInstance("getPosValAt0")),
        Choice(Choice(Union(DeclaredStrategyInstance("getPosValAt1"), Not(DeclaredStrategyInstance("test1getPostValAt"))), DeclaredStrategyInstance("getPosValAt1")),
          Choice(Union(DeclaredStrategyInstance("getPosValAt2"), Not(DeclaredStrategyInstance("test2getPostValAt"))), DeclaredStrategyInstance("getPosValAt2"))))
    }(false)
    .declareStrategy("procT4b") {
      Choice(DeclaredStrategyInstance("unignore"),
        Sequence(Sequence(
          One(
            Sequence(
              DeclaredStrategyInstance("q3->q3"),
              DeclaredStrategyInstance("checkK<3")), 1),
          DeclaredStrategyInstance("getJFromProc")),
          Sequence(One(Sequence(
            DeclaredStrategyInstance("unignore"),
            DeclaredStrategyInstance("getKFromProc")), 2),
            DeclaredStrategyInstance("readVal2DoubleReadVal"))))
    }(false)
//    .declareStrategy("T4bReadToTest", )
    .declareStrategy("T4b") {
      Sequence(Sequence(
        ApplyToProcesses(ApplyToAllProcesses(DeclaredStrategyInstance("procT4b"))),
        DeclaredStrategyInstance("up", DeclaredStrategyInstance("doubleSwap"))),
        Sequence(
            DeclaredStrategyInstance("doubleReadVal2getPostValAt"),
            One(One(DeclaredStrategyInstance("getPosValAt"), 1), 2)
            )
          )
    }(false)

  "T4b" should "rewrite only states where it can be applied" in {
    val initialState1 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(waitT, j(0, k(0, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val rewriter1 = SigmaDDRewriterFactory.strategyToRewriter(DeclaredStrategyInstance("T4b"))(ts)
    val result1 = rewriter1(SigmaDDFactoryImpl.create(initialState1))
    assert(result1 == None)

    val initialState2 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(q3, j(0, k(4, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val result2 = rewriter1(SigmaDDFactoryImpl.create(initialState2))
    assert(result2 == None)

    val initialState3 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(q3, j(0, k(0, emptyProc))),
          proc(state(q3, j(0, k(2, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val result3 = rewriter1(SigmaDDFactoryImpl.create(initialState3))
    val expectedResult3 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(q3, j(0, k(1, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    println(result3.get)
    assert(result3.get == SigmaDDFactoryImpl.create(expectedResult3))
  }

  "T4a" should "rewrite only states where it can be applied" in {
    val initialState1 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(waitT, j(0, k(0, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val rewriter1 = SigmaDDRewriterFactory.strategyToRewriter(DeclaredStrategyInstance("T4a"))(ts)
    val result1 = rewriter1(SigmaDDFactoryImpl.create(initialState1))
    assert(result1 == None)

    val initialState2 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(q3, j(0, k(4, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val result2 = rewriter1(SigmaDDFactoryImpl.create(initialState2))
    assert(result2 == None)

    val initialState3 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(q3, j(0, k(0, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val result3 = rewriter1(SigmaDDFactoryImpl.create(initialState3))
    val expectedResult3 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(q3, j(0, k(1, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    assert(result3.get == SigmaDDFactoryImpl.create(expectedResult3))
  }

  "T6" should "rewrite only states where it can be applied" in {
    val initialState1 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(waitT, j(0, k(0, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val rewriter1 = SigmaDDRewriterFactory.strategyToRewriter(DeclaredStrategyInstance("T6"))(ts)
    val result1 = rewriter1(SigmaDDFactoryImpl.create(initialState1))
    assert(result1 == None)

    val initialState2 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(waitT, j(3, k(0, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val expectedResult2 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(CS, j(3, k(0, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val result2 = rewriter1(SigmaDDFactoryImpl.create(initialState2))
    println(result2.get)
    println(result2.get.size)
    println(SigmaDDFactoryImpl.create(expectedResult2))
    assert(result2.get == SigmaDDFactoryImpl.create(expectedResult2))
  }

  "T7" should "rewrite only states where it can be applied" in {

    println(ts.strategyDeclarations("T7").declaredStrategy.body)

    val initialState1 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(waitT, j(3, k(0, emptyProc))),
          proc(state(CS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val rewriter1 = SigmaDDRewriterFactory.strategyToRewriter(DeclaredStrategyInstance("T7"))(ts)
    val result1 = rewriter1(SigmaDDFactoryImpl.create(initialState1))
    val expectedResult1 = pos(array(0, 0, 0),
      step(array(0, 0, 0),
        proc(state(waitT, j(3, k(0, emptyProc))),
          proc(state(NCS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    assert(result1.get == SigmaDDFactoryImpl.create(expectedResult1))

    val initialState2 = pos(array(1, 0, 0),
      step(array(0, 0, 0),
        proc(state(waitT, j(3, k(0, emptyProc))),
          proc(state(waitT, j(0, k(0, emptyProc))),
            proc(state(CS, j(0, k(0, emptyProc))),
              emptyState)))))
    val result2 = rewriter1(SigmaDDFactoryImpl.create(initialState1) v SigmaDDFactoryImpl.create(initialState2))
    val expectedResult21 = pos(array(0, 0, 0),
      step(array(0, 0, 0),
        proc(state(waitT, j(3, k(0, emptyProc))),
          proc(state(NCS, j(0, k(0, emptyProc))),
            proc(state(waitT, j(0, k(0, emptyProc))),
              emptyState)))))
    val expectedResult22 = pos(array(0, 0, 0),
      step(array(0, 0, 0),
        proc(state(waitT, j(3, k(0, emptyProc))),
          proc(state(waitT, j(0, k(0, emptyProc))),
            proc(state(NCS, j(0, k(0, emptyProc))),
              emptyState)))))
    assert(result2.get == (SigmaDDFactoryImpl.create(expectedResult21) v (SigmaDDFactoryImpl.create(expectedResult22))))
  }

  "T2" should "respect guards before rewriting" in {
    val initialState1 = pos(array(0, 0, 0),
      step(array(0, 0, 0),
        proc(state(waitT, j(3, k(0, emptyProc))),
          proc(state(NCS, j(0, k(0, emptyProc))),
            proc(state(NCS, j(0, k(0, emptyProc))),
              emptyState)))))
    val rewriter1 = SigmaDDRewriterFactory.strategyToRewriter(DeclaredStrategyInstance("T2"))(ts)
    val result1 = rewriter1(SigmaDDFactoryImpl.create(initialState1))
    assert(result1 == None)

    val initialState2 = pos(array(0, 0, 0), step(array(0, 0, 0),
      proc(state(NCS, j(1, k(0, emptyProc))),
        proc(state(waitT, j(2, k(3, emptyProc))),
          proc(state(NCS, j(0, k(0, emptyProc))),
            emptyState)))))
    val rewriter2 = SigmaDDRewriterFactory.strategyToRewriter(DeclaredStrategyInstance("T2"))(ts)
    val result2 = rewriter2(SigmaDDFactoryImpl.create(initialState1) v SigmaDDFactoryImpl.create(initialState2))
    val expectedResult2 = pos(array(2, 0, 0), step(array(0, 0, 0),
      proc(state(NCS, j(1, k(0, emptyProc))),
        proc(state(q2, j(2, k(3, emptyProc))),
          proc(state(NCS, j(0, k(0, emptyProc))),
            emptyState)))))
    // we give as input two terms, one that passes the rewriting and other that doesn't
    assert(result2.get == SigmaDDFactoryImpl.create(expectedResult2))
  }

  "T3" should "write in the right place in step" in {
    val initialState1 = pos(array(1, 2, 3),
      step(array(3, 2, 1),
        proc(state(q2, j(3, k(2, emptyProc))),
          proc(state(NCS, j(0, k(0, emptyProc))),
            proc(state(NCS, j(0, k(0, emptyProc))),
              emptyState)))))

    val expectedResult1 = pos(array(1, 2, 3),
      step(array(3, 2, 0),
        proc(state(q3, j(3, k(0, emptyProc))),
          proc(state(NCS, j(0, k(0, emptyProc))),
            proc(state(NCS, j(0, k(0, emptyProc))),
              emptyState)))))
    val rewriter1 = SigmaDDRewriterFactory.strategyToRewriter(DeclaredStrategyInstance("T3"))(ts)
    val result1 = rewriter1(SigmaDDFactoryImpl.create(initialState1))
    assert(result1.get == SigmaDDFactoryImpl.create(expectedResult1))
  }

  //  "The Peterson problem" should "have the right number of states" in {
  //    println(signature.toString)
  //
  //    val rewriter = SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts)
  //
  //    val result = rewriter(SigmaDDFactoryImpl.create(ts.initialState)).get
  //    println("Total number of states: " + result.size)
  //    //    assert(rewriter(SigmaDDFactoryImpl.create(ts.initialState)).get.size == 12498)
  //  }

}