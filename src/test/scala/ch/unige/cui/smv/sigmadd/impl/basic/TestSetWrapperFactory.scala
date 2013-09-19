package ch.unige.cui.smv.sigmadd.impl.basic

import org.scalatest.FlatSpec

class TestSetWrapperFactory extends FlatSpec {
  "A string set wrapper factory" should "return the same reference to a set when creating it twice" in {
    val setWrapper = StringSetWrapperFactory.create(Set("test"))
    assert(setWrapper eq StringSetWrapperFactory.create(Set("test")))
    val setWrapper1 = StringSetWrapperFactory.create(Set("elt1"))
    val setWrapper12 = (setWrapper v setWrapper1)
    assert(setWrapper12 eq (StringSetWrapperFactory.create(Set("test")) v StringSetWrapperFactory.create(Set("elt1"))))
    val empty = setWrapper1 ^ setWrapper
    assert(empty eq setWrapper.bottomElement)
  }

  "A string set wrapper union" should "be conmutative and associative" in {
    val sets = List(StringSetWrapperFactory.create(Set("1")),
      StringSetWrapperFactory.create(Set("2")),
      StringSetWrapperFactory.create(Set("3")),
      StringSetWrapperFactory.create(Set("4")))

    val listOfUnions = (for (permutation <- sets.permutations) yield (sets(1).bottomElement /: permutation)(_ v _)).toList
    assert((true /: listOfUnions.tail.map(_ eq listOfUnions.head))(_ && _))
  }
}