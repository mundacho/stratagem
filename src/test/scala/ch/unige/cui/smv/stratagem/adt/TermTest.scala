package ch.unige.cui.smv.stratagem.adt

import org.scalatest.BeforeAndAfter
import org.scalatest.FlatSpec

class TermTest extends FlatSpec with BeforeAndAfter {

  val adt = {
    val sign = (new Signature)
      .withSort("bool")
      .withSort("nat")
      .withGenerator("zero", "nat")
      .withGenerator("suc", "nat", "nat")
      .withGenerator("true", "bool")
      .withGenerator("false", "bool")
      .withOperation("and", "bool", "bool", "bool")

    new ADT("myAdt", sign).declareVariable("b", "bool").declareVariable("x", "nat")
  }

  def zero = adt.term("zero")
  def suc(term:ATerm) = adt.term("suc", term)
  def trueOp = adt.term("true")
  def falseOp = adt.term("false")


  "A term" should "throw an exception if its parameters' sorts do not correspond to its arity" in {

    intercept[IllegalArgumentException] {
      adt.term("and", trueOp)
    }
    intercept[IllegalArgumentException] {
      adt.term("and", trueOp, falseOp, trueOp)
    }
    intercept[IllegalArgumentException] {
      adt.term("and", trueOp, zero)
    }
  }

  "A term" should "write itself pretty" in {
    assert(adt.term("and", trueOp, falseOp).toString == "and(true, false)")
    assert(suc(suc(zero)).toString == "suc(suc(zero))")
    assert(adt.term("and", trueOp, adt.term("b")).toString == "and(true, b)")
    assert(suc(suc(adt.term("x"))).toString == "suc(suc(x))")
  }

  "A term" should "allow to build well formed ground terms" in {
    adt.term("and", adt.term("true"), adt.term("false"))

    suc(suc(zero))
  }

  "A term" should "allow to build well formed terms with variables" in {
    adt.term("and", trueOp, adt.term("b"))
    suc(suc(adt.term("x")))
  }

}