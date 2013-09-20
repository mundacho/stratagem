package ch.unige.cui.smv.stratagem.adt

import scala.collection.immutable.Nil

/**
 * Represents an abstract sort.
 */
abstract class ASort

/**
 * Represents a subsort.
 *
 * @constructor Creates a new sort.
 * @param name the name of the sort.
 * @param superSort the super sort for this sort.
 *
 * @author mundacho
 *
 */
case class SubSort(name: String, superSort: ASort) extends ASort {
  require(superSort != null)
}

/**
 * Represents a top level sort.
 * @param name the name of the sort
 */
case class Sort(name: String) extends ASort

object ASort {
  /**
   * Finds the common parent of s1 and s2.
   * @param s1 some sort
   * @param s2 some other sort
   * @return the common parent sort of s1 and s2
   */
  def findCommonParent(s1: ASort, s2: ASort): ASort = {
    // build list of sorts until root sort
    def buildList(sort: ASort): List[ASort] = sort match {
      case a: Sort => List(a)
      case e: SubSort => e :: buildList(e.superSort)
    }
    if (s1 == s2) return s1
    // from now on, s1 and s2 are different
    var list1 = buildList(s1).reverse
    var list2 = buildList(s2).reverse
    // prepare for very ugly and imperative part of the code
    var result = list1.head
    if (list1.head != list2.head) {
      throw new IllegalStateException(s"Sorts $s1 and $s2 have no common parent sort")
    }
    while (list1.head == list2.head && (list1.tail != List.empty && list2.tail != List.empty)) {
      result = list1.head
      list1 = list1.tail
      list2 = list2.tail
    }
    result
  }
}