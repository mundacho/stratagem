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
package ch.unige.cui.smv.stratagem.sigmadd

import org.scalatest.FlatSpec
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.DeclaredStrategyRewriter
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.OneRewriter
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SimpleSigmaDDRewriter
import ch.unige.smv.cui.metamodel.adt.ATerm
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import ch.unige.cui.smv.stratagem.adt.ATermHelper.term2RichTerm
import ch.unige.cui.smv.stratagem.util.StrategyDSL._
import ch.unige.cui.smv.metamodel.ts.Strategy

/**
 * This class tests the strategies.
 * @author mundacho
 *
 */
class TestStrategies extends FlatSpec {
  val adt = {
    val sign = AdtFactory.eINSTANCE.createSignature()
      .withSort("bool")
      .withSort("nat")
      .withGenerator("zero", "nat")
      .withGenerator("suc", "nat", "nat")
      .withOperation("plus", "nat", "nat", "nat")
      .withGenerator("true", "bool")
      .withGenerator("false", "bool")
      .withOperation("and", "bool", "bool", "bool")
      .withOperation("not", "bool", "bool")

    {val a = AdtFactory.eINSTANCE.createADT(); a.setName("myADT"); a.setSignature(sign); a}.declareVariable("b", "bool").declareVariable("x", "nat").declareVariable("y", "nat")
  }

  // defs for defining terms
  def zero = adt.term("zero")
  def suc(term: ATerm) = adt.term("suc", term)
  def trueOp = adt.term("true")
  def falseOp = adt.term("false")
  def andOp(term1: ATerm, term2: ATerm) = adt.term("and", term1, term2)
  def not(term1: ATerm) = adt.term("not", term1)
  def plus(term1: ATerm, term2: ATerm) = adt.term("plus", term1, term2)
  def X = adt.term("x")
  def Y = adt.term("y")
  def B = adt.term("b")

  def S1 = VariableStrategy("S1")
  def S2 = VariableStrategy("S2")

  def MyTry(s: Strategy) = DeclaredStrategyInstance("try", s)
  def Fixpoint(s: Strategy) = DeclaredStrategyInstance("fixpoint", s)
  def Repeat(s: Strategy) = DeclaredStrategyInstance("repeat", s)

  def booleanStrategy = SimpleStrategy(List(not(trueOp) -> falseOp, not(falseOp) -> trueOp, andOp(trueOp, B) -> B, andOp(falseOp, B) -> falseOp))

  val sigmaDDFactory = SigmaDDFactoryImpl(adt.getSignature())

  val booleanRewriter = new SimpleSigmaDDRewriter(booleanStrategy, sigmaDDFactory)

  "OneStrategyRewriter" should "be able to rewrite simple booleans" in {
    val oneRewriter = new OneRewriter(booleanRewriter, 0, sigmaDDFactory)

    // sigmaDDToRewrite1 = {not(true), and(true, false), and(true, not(false)}}
    val sigmaDDToRewrite1 = sigmaDDFactory.create(not(trueOp)) v sigmaDDFactory.create(andOp(trueOp, falseOp)) v sigmaDDFactory.create(andOp(trueOp, not(falseOp)))
    val rewrittenSigmaDD1 = oneRewriter(sigmaDDToRewrite1).get
    assert(rewrittenSigmaDD1 eq sigmaDDFactory.create(andOp(trueOp, trueOp)))

    val sigmaDDToRewrite2 = sigmaDDFactory.create(not(trueOp)) v sigmaDDFactory.create(andOp(trueOp, not(trueOp))) v sigmaDDFactory.create(andOp(trueOp, not(falseOp)))
    val rewrittenSigmaDD2 = oneRewriter(sigmaDDToRewrite2).get
    assert(rewrittenSigmaDD2 eq (sigmaDDFactory.create(andOp(trueOp, falseOp))))

    val sigmaDDToRewrite3 = sigmaDDFactory.create(not(trueOp)) v sigmaDDFactory.create(andOp(not(trueOp), falseOp)) v sigmaDDFactory.create(andOp(trueOp, not(trueOp)))
    val rewrittenSigmaDD3 = oneRewriter(sigmaDDToRewrite3).get
    assert(rewrittenSigmaDD3 eq (sigmaDDFactory.create(andOp(falseOp, falseOp)) v sigmaDDFactory.create(andOp(trueOp, falseOp))))

    val sigmaDDToRewrite4 = sigmaDDFactory.create(not(trueOp)) v sigmaDDFactory.create(andOp(trueOp, falseOp)) v sigmaDDFactory.create(andOp(falseOp, trueOp))
    val rewrittenSigmaDD4 = oneRewriter(sigmaDDToRewrite4)
    assert(rewrittenSigmaDD4 == None)
  }

  "NotStrategy" should "leave the elements that were not rewritten" in {
    var ts = TransitionSystem(adt, trueOp)
    // sigmaDDToRewrite1 = {not(true), and(true, false), and(true, not(false)}}
    val sigmaDDToRewrite1 = sigmaDDFactory.create(not(trueOp)) v sigmaDDFactory.create(andOp(trueOp, falseOp)) v sigmaDDFactory.create(andOp(trueOp, not(falseOp)))
    val notRewriter = sigmaDDFactory.rewriterFactory.strategyToRewriter(Not(booleanStrategy))(ts)
    val rewrittenSigmaDD = notRewriter(sigmaDDToRewrite1).get
    assert(rewrittenSigmaDD eq (sigmaDDFactory.create(andOp(trueOp, falseOp)) v sigmaDDFactory.create(andOp(trueOp, not(falseOp)))))

    val notRewriter1 = sigmaDDFactory.rewriterFactory.strategyToRewriter(FixPointStrategy(Union(Try(booleanStrategy), Try(Not(booleanStrategy)))))(ts)
    println(notRewriter1(sigmaDDToRewrite1).get)
    assert(notRewriter1(sigmaDDToRewrite1).get eq (sigmaDDFactory.create(trueOp) v sigmaDDFactory.create(falseOp)))
  }

  "SimpleStrat" should "rewrite everything that it matches" in {
    val ts = (TransitionSystem(adt, trueOp))
    val sigmaDD = sigmaDDFactory.create(plus(suc(zero), suc(zero))) v sigmaDDFactory.create(plus(suc(suc(zero)), suc(suc(zero))))
    println(sigmaDD.toString)
    val testStrategy = SimpleStrategy(List(plus(suc(X), suc(Y)) -> plus(X, Y)))
    val expected = sigmaDDFactory.create(plus(zero, zero)) v sigmaDDFactory.create(plus(suc(zero), suc(zero)))
    assert(sigmaDDFactory.rewriterFactory.strategyToRewriter(testStrategy)(ts)(sigmaDD).get == expected)
    
  }

  "DeclaredStrategyRewriter" should "be able to handle common strategies" in {
    var ts = (TransitionSystem(adt, trueOp))
      .declareStrategy("onebooleanStrategy") { One(booleanStrategy) }(false)
      .declareStrategy("booleanStrategy") { booleanStrategy }(false)
      .declareStrategy("try", S1) { Choice(S1, Identity) }(false)
      .declareStrategy("repeat", S1) { Choice(Sequence(S1, Repeat(S1)), Identity) }(false)
      .declareStrategy("fixpoint", S1) { FixPointStrategy(S1) }(false)
    def decOneBool = DeclaredStrategyInstance("onebooleanStrategy")
    def decBool = DeclaredStrategyInstance("booleanStrategy")
    val declaredStrategy = new DeclaredStrategyRewriter(MyTry(decOneBool), ts, sigmaDDFactory)
    val sigmaDDToRewrite1 = sigmaDDFactory.create(andOp(trueOp, falseOp)) v sigmaDDFactory.create(andOp(falseOp, trueOp))
    val rewrittenSigmaDD = declaredStrategy(sigmaDDToRewrite1).get
    assert(rewrittenSigmaDD eq sigmaDDToRewrite1)

    val sigmaDDToRewrite2 = sigmaDDFactory.create(not(trueOp)) v sigmaDDFactory.create(not(falseOp))
    val repeatRewriter = new DeclaredStrategyRewriter(Fixpoint(MyTry(decBool)), ts, sigmaDDFactory)
    assert(repeatRewriter(sigmaDDToRewrite2).get eq (sigmaDDFactory.create(falseOp)))

    val sigmaDDToRewrite3 = sigmaDDFactory.create(not(trueOp)) v sigmaDDFactory.create(andOp(not(trueOp), falseOp)) v
      sigmaDDFactory.create(andOp(trueOp, not(falseOp))) v sigmaDDFactory.create(not(falseOp))
    val repeatRewriter1 = new DeclaredStrategyRewriter(Fixpoint(MyTry(Choice(decBool, decOneBool))), ts, sigmaDDFactory) // tests fixpoint rewriter
    assert(repeatRewriter1(sigmaDDToRewrite3).get eq sigmaDDFactory.create(falseOp))

    val repeatRewriter2 = new DeclaredStrategyRewriter(Repeat(Choice(decBool, decOneBool)), ts, sigmaDDFactory) // tests repeat rewriter
    assert(repeatRewriter2(sigmaDDToRewrite3).get eq (sigmaDDFactory.create(falseOp)))
  }

}