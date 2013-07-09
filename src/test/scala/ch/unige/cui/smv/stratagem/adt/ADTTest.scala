package ch.unige.cui.smv.stratagem.adt

import org.scalatest.FlatSpec

class ADTTest extends FlatSpec {
  "An ADT" should "not allow to declare the same variable twice" in {
    intercept[IllegalArgumentException] {
      val sign = (new Signature)
        .withSort("nat")
        .withSort("nznat", "nat")
        .withSort("zero", "nat")
        .withGenerator("0", "zero")
        .withGenerator("suc", "nznat", "nat")
      val adt = (new ADT("myADT", sign))
        .declareVariable("x", "nat")
        .declareVariable("x", "nat")
    }
  }
  
    "An ADT" should "not allow to declare a variable when the sort is not in the signature" in {
    intercept[IllegalArgumentException] {
      val sign = (new Signature)
        .withSort("nat")
        .withSort("nznat", "nat")
        .withSort("zero", "nat")
        .withGenerator("0", "zero")
        .withGenerator("suc", "nznat", "nat")
      val adt = (new ADT("myADT", sign))
        .declareVariable("x", "nat")
        .declareVariable("x", "bool")
    }
  }
}