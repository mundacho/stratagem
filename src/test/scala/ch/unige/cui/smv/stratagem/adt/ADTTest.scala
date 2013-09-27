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

  "An ADT" should "not allow to declare the same variable twice, even if the sorts are different" in {
    intercept[IllegalArgumentException] {
      val sign = (new Signature)
        .withSort("nat")
        .withSort("nznat", "nat")
        .withSort("zero", "nat")
        .withGenerator("0", "zero")
        .withGenerator("suc", "nznat", "nat")
      val adt = (new ADT("myADT", sign))
        .declareVariable("x", "nat")
        .declareVariable("x", "nznat")
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

  "An ADT" should "allow to model the philosopher's problem" in {
    val signature = (new Signature)
      .withSort("ph")
      .withSort("state")
      .withSort("fork")
      .withGenerator("eating", "state")
      .withGenerator("thinking", "state")
      .withGenerator("waiting", "state")
      .withGenerator("waitingForLeftFork", "state")
      .withGenerator("waitingForRightFork", "state")
      .withGenerator("forkUsed", "fork")
      .withGenerator("forkFree", "fork")
      .withGenerator("emptytable", "ph")
      .withGenerator("philo", "ph", "state", "fork", "ph")

    val adt = new ADT("philoModel", signature)
    // definitions to simplify the reading of terms.
    def eating = adt.term("eating")
    def thinking = adt.term("thinking")
    def waiting = adt.term("waiting")
    def waitingLF = adt.term("waitingForLeftFork")
    def waitingRF = adt.term("waitingForRightFork")
    def forkUsed = adt.term("forkUsed")
    def forkFree = adt.term("forkFree")
    def emptytable = adt.term("emptytable")
    def philo(state: ATerm, fork: ATerm, ph: ATerm) = adt.term("philo", state, fork, ph)

    assert(philo(thinking, forkFree, philo(thinking, forkFree, philo(thinking, forkFree, emptytable))).toString == "philo(thinking, forkFree, philo(thinking, forkFree, philo(thinking, forkFree, emptytable)))")

  }

  "And ADT" should "not allow to build term that contains terms from another ADT" in {
    val signature = (new Signature)
      .withSort("ph")
      .withSort("state")
      .withSort("fork")
      .withGenerator("eating", "state")
      .withGenerator("thinking", "state")
      .withGenerator("waiting", "state")
      .withGenerator("waitingForLeftFork", "state")
      .withGenerator("waitingForRightFork", "state")
      .withGenerator("forkUsed", "fork")
      .withGenerator("forkFree", "fork")
      .withGenerator("emptytable", "ph")
      .withGenerator("philo", "ph", "state", "fork", "ph")

    val adt = new ADT("philoModel", signature)
    // definitions to simplify the reading of terms.
    def eating = adt.term("eating")
    def thinking = adt.term("thinking")
    def waiting = adt.term("waiting")
    def waitingLF = adt.term("waitingForLeftFork")
    def waitingRF = adt.term("waitingForRightFork")
    def forkUsed = adt.term("forkUsed")
    def forkFree = adt.term("forkFree")
    def emptytable = adt.term("emptytable")
    def philo(state: ATerm, fork: ATerm, ph: ATerm) = adt.term("philo", state, fork, ph)

    val strangeADT = new ADT("philoModel", signature)

    val thrown = intercept[IllegalArgumentException] {
      philo(thinking, forkFree, philo(thinking, forkFree, philo(thinking, forkFree, strangeADT.term("emptytable"))))
    }
    assert(thrown.getMessage().endsWith("It is not allowed to mix adts"))
  }
}