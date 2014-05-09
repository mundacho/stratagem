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

package ch.unige.cui.smv.stratagem.adt

import scala.collection.immutable.Nil

/**
 * Represents an abstract sort.
 */
abstract class ASort {

  val name: String

  /**
   * @return true if s is a super sort or the same sort as this. Otherwise returns false.
   */
  def isSubsortOf(s: ASort): Boolean
}

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
  // scalastyle:off
  require(superSort != null)
  // scalastyle:on
  override val toString: String = "(" + name + " < " + (superSort match {
    case a: SubSort => a.toString
    case a: Sort => a.toString
  }) + ")"

  def isSubsortOf(s: ASort) = if (s == this) true else superSort isSubsortOf s
}

/**
 * Represents a top level sort.
 * @param name the name of the sort
 */
case class Sort(name: String) extends ASort {
  def isSubsortOf(s: ASort) = s == this
  override val toString = name
}

object ASort {

  def findSuperParentSort(sort: ASort): ASort =
    sort match {
      case a: Sort => a
      case e: SubSort => findSuperParentSort(e.superSort)
    }

  /**
   * Finds the common parent of s1 and s2.
   * @param sorts a list of sorts
   * @return the common parent sort of all those sorts.
   */
  def findCommonParent(sorts: ASort*): Option[ASort] = {

    if (sorts.size == 1) Some(sorts(0))
    else {

      // build list of sorts until root sort
      def buildList(sort: ASort): List[ASort] = sort match {
        case a: Sort => List(a)
        case e: SubSort => e :: buildList(e.superSort)
      }

      def buildResult(list: List[ASort], listOfReverseLists: List[List[ASort]]): List[ASort] = list match {
        case Nil => Nil
        case head :: tail =>
          val listOfFirstElements = listOfReverseLists.map(_.headOption)
          if (listOfFirstElements.contains(None)) Nil
          else if (!listOfFirstElements.filter(Some(head) != _).isEmpty) { // there is at least one element that is not equal to the first one
            Nil
          } else {
            head :: buildResult(tail, listOfReverseLists.map(_.tail))
          }
      }

      val listOfReverseLists = for (list <- for (sort <- sorts) yield buildList(sort).reverse) yield list
      val listOfFirstElements = listOfReverseLists.map(_.head)
      if (!listOfFirstElements.filter(listOfFirstElements.head != _).isEmpty) { // there is at least one element that is not equal to the first one
        None
      } else {
        Some(buildResult(listOfReverseLists.head, listOfReverseLists.tail.toList).reverse.head)
      }
    }
    //    if (s1 == s2) { Some(s1) } else {
    //      // from now on, s1 and s2 are different
    //      var list1 = buildList(s1).reverse
    //      var list2 = buildList(s2).reverse
    //      // prepare for very ugly and imperative part of the code
    //      var result = list1.head
    //      if (list1.head != list2.head) {
    //        None
    //      } else {
    //        while ((list1 != List.empty && list2 != List.empty) && list1.head == list2.head) {
    //          result = list1.head
    //          list1 = list1.tail
    //          list2 = list2.tail
    //        }
    //        Some(result)
    //      }
    //    }
  }
}