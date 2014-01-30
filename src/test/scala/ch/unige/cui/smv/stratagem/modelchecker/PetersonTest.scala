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
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.Not
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.VariableStrategy

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
  def j(n: ATerm, proc: ATerm) = adt.term("j", n, proc)
  def k(n: ATerm, proc: ATerm) = adt.term("k", n, proc)
  val emptyProc = adt.term("emptyProcess")
  val n = adt.term("n")
  val m = adt.term("m")
  val o = adt.term("o")
  val s = adt.term("s")
  val p = adt.term("p")
  val st = adt.term("st")
  val a = adt.term("a")
  val n1 = adt.term("n1")
  def doubleVar(n1: ATerm, n2: ATerm, n3: ATerm) = adt.term("doubleVar", n1, n2, n3)
  def doubleVarNeg(n1: ATerm, n2: ATerm, n3: ATerm) = adt.term("doubleVarNeg", n1, n2, n3)
  def readVal(n: ATerm, s: ATerm) = adt.term("readVal", n, s)

  def ApplyToProcesses(s: NonVariableStrategy) = DeclaredStrategyInstance("applyToProcesses", s)
  def ApplyToAllProcesses(s: NonVariableStrategy) = DeclaredStrategyInstance("applyToAllProcesses", s)

  val V1 = VariableStrategy("V1")
  val V2 = VariableStrategy("V2")

  val LessThan = DeclaredStrategyInstance("lessThan")
  val DuplicateVar = DeclaredStrategyInstance("duplicateVar")
  def RewriteSetWith(s: Strategy) = DeclaredStrategyInstance("rewriteSetWith", s)
  def ApplyToJ(s: NonVariableStrategy) = DeclaredStrategyInstance("applyToJ", s)

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
    .declareStrategy("checkGuardProcT2") {
      ApplyToJ(
        Sequence(Sequence(Sequence(Sequence(
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))), // apply duplicate operation
          FixPointStrategy(RewriteSetWith(DuplicateVar))), // duplicate 
          FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("testLT3")))), // transform to test form
          One(FixPointStrategy(RewriteSetWith(LessThan)), 1)), DeclaredStrategyInstance("applyTest"))) // do the calculation
    }(false)
    .declareStrategy("applyToProcesses", V1) { One(One(V1, 2), 2) }(false)
    .declareStrategy("testEmpty", emptyState -> emptyState)(false)
    .declareStrategy("applyToAllProcesses", V1) { Union(Try(V1), Try(One(DeclaredStrategyInstance("applyToAllProcesses", V1), 2))) }(false)
    .declareStrategy("T1") { ApplyToProcesses(ApplyToAllProcesses(DeclaredStrategyInstance("procT1"))) }(true)
    .declareStrategy("extractJ", proc(state(st, j(doubleVar(m, n, 0), p)), s) -> readVal(m, proc(state(st, j(n, p)), s)))(false)
    .declareStrategy("procT2") {
      Sequence(One(DeclaredStrategyInstance("checkGuardProcT2"), 1),
        Sequence(
          One(ApplyToJ(
            Sequence(
              FixPointStrategy(RewriteSetWith(DeclaredStrategyInstance("doubleVar"))),
              FixPointStrategy(RewriteSetWith(DuplicateVar)))), 1), // apply duplicate operation
          DeclaredStrategyInstance("extractJ")))
    }(false)
    .declareStrategy("up", V1) {
      Sequence(
        Try(One(DeclaredStrategyInstance("up", V1), 2)),
        Union(Choice(V1, Not(V1)), Choice(Not(V1), V1)))
    }(false) // applies its strategy bottom up in the state vector
    .declareStrategy("swap", List(proc(p, readVal(n, s)) -> readVal(n, proc(p, s)),
      pos(a, readVal(n, s)) -> readVal(n, pos(a, s)),
      step(a, readVal(n, s)) -> readVal(n, step(a, s))))(false)
    .declareStrategy("array[0]<-readVal", readVal(n1, pos(array(m, n, o), s)) -> pos(array(n1, n, o), s))(false)
    .declareStrategy("T2") {
      Sequence(
        Sequence(ApplyToProcesses(ApplyToAllProcesses(DeclaredStrategyInstance("procT2"))), DeclaredStrategyInstance("up", DeclaredStrategyInstance("swap"))),
        DeclaredStrategyInstance("array[0]<-readVal"))
    }(true)

  "The Peterson problem" should "should have the right number of states" in {
    println(signature.toString)

    val rewriter = SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val rewriter2 = SigmaDDRewriterFactory.strategyToRewriter(DeclaredStrategyInstance("T2"))(ts)
    val result = rewriter(SigmaDDFactoryImpl.create(ts.initialState)).get
    //    val result = rewriter2(rewriter(SigmaDDFactoryImpl.create(ts.initialState)).get).get
    println(result)
    println("Total number of states: " + result.size)
    //    assert(rewriter(SigmaDDFactoryImpl.create(ts.initialState)).get.size == 12498)
  }

}