package ch.unige.cui.smv.stratagem.sigmadd

import org.scalatest.FlatSpec
import ch.unige.cui.smv.stratagem.adt.Sort
import scala.collection.immutable.HashMap
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.util.StringSetWrapperFactory
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy

class TestSigmaDD extends FlatSpec {

  val adt = {
    val sign = (new Signature)
      .withSort("bool")
      .withSort("nat")
      .withGenerator("zero", "nat")
      .withGenerator("suc", "nat", "nat")
      .withOperation("plus", "nat", "nat", "nat")
      .withGenerator("true", "bool")
      .withGenerator("false", "bool")
      .withOperation("and", "bool", "bool", "bool")

    new ADT("myAdt", sign).declareVariable("b", "bool").declareVariable("x", "nat").declareVariable("y", "nat")
  }

  val sigmaddFactoryVal = new SigmaDDFactoryImpl
  val boolSort = adt.signature.sorts("bool")
  val trueSigmaDD = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create("true", sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.TopIPF)))
  val falseSigmaDD = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create("false", sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.TopIPF)))
  val topIPF = sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.TopIPF
  val trueTuple = sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.create(HashMap(trueSigmaDD -> topIPF))
  val trueTrueTuple = sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.create(HashMap(trueSigmaDD -> trueTuple))
  val andTrueTrueSigmaDD = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create("and", trueTrueTuple)))

  // defs for defining terms
  def zero = adt.term("zero")
  def suc(term: ATerm) = adt.term("suc", term)
  def trueOp = adt.term("true")
  def falseOp = adt.term("false")
  def andOp(term1: ATerm, term2: ATerm) = adt.term("and", term1, term2)
  def plus(term1: ATerm, term2: ATerm) = adt.term("plus", term1, term2)
  def X = adt.term("x")
  def Y = adt.term("y")

  "A SigmaDD" should "be capable of representing a constant set of constants" in {
    val unionOfConstants = trueSigmaDD v falseSigmaDD
    val expectedResult = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create((HashMap(StringSetWrapperFactory.create(Set("true", "false")) -> sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.TopIPF)))))
    assert(unionOfConstants eq expectedResult)
  }

  it should "be capabe of representing the union of a constant and a composite term" in {
    val expectedResult = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create((HashMap(StringSetWrapperFactory.create(Set("true")) -> topIPF, StringSetWrapperFactory.create(Set("and")) -> trueTrueTuple)))))
    assert(expectedResult eq (andTrueTrueSigmaDD v trueSigmaDD))
  }

  it should "be capabe of representing the difference of two sets of terms" in {
    val expectedResult = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create((HashMap(StringSetWrapperFactory.create(Set("true")) -> topIPF, StringSetWrapperFactory.create(Set("and")) -> trueTrueTuple)))))
    assert(expectedResult eq ((andTrueTrueSigmaDD v trueSigmaDD) \ falseSigmaDD)) // We subtract an element that is not in the set
    assert(andTrueTrueSigmaDD eq ((andTrueTrueSigmaDD v trueSigmaDD) \ trueSigmaDD)) // we subtract an element that was already there
  }

  it should "be capabe of representing the intersection of two sets of terms" in {
    val expectedResult = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create((HashMap(StringSetWrapperFactory.create(Set("true")) -> topIPF, StringSetWrapperFactory.create(Set("and")) -> trueTrueTuple)))))
    assert(expectedResult == ((andTrueTrueSigmaDD v trueSigmaDD v falseSigmaDD) ^ (andTrueTrueSigmaDD v trueSigmaDD))) // We subtract an element that is not in the set
  }

  it should "not have this bug: Bug in IPF intersection" in {
    (andTrueTrueSigmaDD v trueSigmaDD v falseSigmaDD) ^ andTrueTrueSigmaDD // with the bug, doing this operation would throw an exception
  }

  it should "create the correct SigmaDD from the correct term" in {
    assert(sigmaddFactoryVal.create(andOp(trueOp, trueOp)) eq andTrueTrueSigmaDD)
    assert(sigmaddFactoryVal.create(trueOp) eq trueSigmaDD)
  }

  it should "not create a SigmaDD containing a variable" in {
    intercept[IllegalArgumentException](sigmaddFactoryVal.create(andOp(adt.term("x"), trueOp)))
  }

  it should "to rewrite integers" in {
    val simpleStrat1 = SimpleStrategy(List(plus(X, suc(Y)) -> suc(plus(X, Y))))
    val rewriter = new SimpleSigmaDDRewriter(simpleStrat1) {
      val sigmaDDFactory: sigmaddFactoryVal.type = sigmaddFactoryVal
    }
    val sigmadd1 = sigmaddFactoryVal.create(plus(suc(suc(zero)), suc(zero)))
    val sigmadd2 = sigmaddFactoryVal.create(plus(suc(zero), suc(suc(zero))))

    val sigmaddres1 = sigmaddFactoryVal.create(suc(plus(suc(suc(zero)), zero)))
    val sigmaddres2 = sigmaddFactoryVal.create(suc(plus(suc(zero), suc(zero))))
    assert(rewriter(sigmadd1 v sigmadd2) eq (sigmaddres1 v sigmaddres2))

    val simpleStrat2 = SimpleStrategy(List(plus(X, zero) -> X))
    val rewriter2 = new SimpleSigmaDDRewriter(simpleStrat2) {
      val sigmaDDFactory: sigmaddFactoryVal.type = sigmaddFactoryVal
    }

    val sigmadd3 = sigmaddFactoryVal.create(plus(suc(suc(zero)), zero))
    val sigmaddres3 = sigmaddFactoryVal.create(suc(suc(zero)))
    assert(rewriter2(sigmadd3) eq sigmaddres3)
  }

  it should "rewrite even if there are no variables" in {
    val simpleStrat1 = SimpleStrategy(List(suc(suc(suc(zero))) -> zero))
    val rewriter = new SimpleSigmaDDRewriter(simpleStrat1) {
      val sigmaDDFactory: sigmaddFactoryVal.type = sigmaddFactoryVal
    }
    val sigmadd1 = sigmaddFactoryVal.create(suc(suc(suc(zero))))
    val sigmaddres1 = sigmaddFactoryVal.create(zero)

    assert(rewriter(sigmadd1) eq sigmaddres1)
  }

  it should "be able to express large numbers (up to a 100)" in { 
    def define(n: Int): ATerm = n match {
      case 0 => zero
      case _ => suc(define(n - 1))
    }
    val sigmadd1 = sigmaddFactoryVal.create(plus(define(100), define(100)))
    val simpleStrat1 = SimpleStrategy(List(plus(X, suc(Y)) -> suc(plus(X, Y))))
    val rewriter = new SimpleSigmaDDRewriter(simpleStrat1) {
      val sigmaDDFactory: sigmaddFactoryVal.type = sigmaddFactoryVal
    }
    assert(rewriter(sigmadd1) eq sigmaddFactoryVal.create(suc(plus(define(100), define(99)))))
  }

}