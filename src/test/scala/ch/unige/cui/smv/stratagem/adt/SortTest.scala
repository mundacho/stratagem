package ch.unige.cui.smv.stratagem.adt

import org.scalatest.FlatSpec

class SortTest extends FlatSpec {
  "A sort" should "not be instanciated with a null super sort" in {
    intercept[IllegalArgumentException] {
      val sort = new SubSort("bool", null)
    }
  }
}