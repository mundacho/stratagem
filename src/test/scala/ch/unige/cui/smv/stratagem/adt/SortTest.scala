package ch.unige.cui.smv.stratagem.adt

import org.scalatest.FlatSpec

class SortTest extends FlatSpec {
  "A sort" should "not be instanciated with a null super sort" in {
    intercept[IllegalArgumentException] {
      val sort = new SubSort("bool", null)
    }
  }

  "Two sorts" should "be able to find their common parend" in {
    val superParentSort = Sort("s1")
    val someSubSort1 = SubSort("s2", superParentSort)
    val someSubSort2 = SubSort("s3", superParentSort)
    val someSubSort11 = SubSort("s4", someSubSort1)
    val someSubSort12 = SubSort("s5", someSubSort1)
    val someSubSort21 = SubSort("s6", someSubSort2)
    val someSubSort22 = SubSort("s7", someSubSort2)
    val someSubSort211 = SubSort("s8", someSubSort11)
    val someSubSort212 = SubSort("s9", someSubSort11)
    val someOtherSuperParentSort = Sort("ss1")
    val someOtherSubSort1 = SubSort("ss1", someOtherSuperParentSort)

    assert(superParentSort equals ASort.findCommonParent(someSubSort211, superParentSort))
    assert(someSubSort1 equals ASort.findCommonParent(someSubSort211, someSubSort12))
    intercept[IllegalStateException] {
      ASort.findCommonParent(someSubSort211, someOtherSuperParentSort)
    }

  }
}