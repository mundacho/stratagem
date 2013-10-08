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
  // scalastyle:off
  require(superSort != null)
  // scalastyle:on
  override val toString: String = "(" + name + " < " + (superSort match {
    case a: SubSort => a.toString
    case a: Sort => a.toString
  })
}

/**
 * Represents a top level sort.
 * @param name the name of the sort
 */
case class Sort(name: String) extends ASort {
  override val toString = name
}

object ASort {
  /**
   * Finds the common parent of s1 and s2.
   * @param s1 some sort
   * @param s2 some other sort
   * @return the common parent sort of s1 and s2
   */
  def findCommonParent(s1: ASort, s2: ASort): Option[ASort] = {
    // build list of sorts until root sort
    def buildList(sort: ASort): List[ASort] = sort match {
      case a: Sort => List(a)
      case e: SubSort => e :: buildList(e.superSort)
    }
    if (s1 == s2) { Some(s1) } else {
      // from now on, s1 and s2 are different
      var list1 = buildList(s1).reverse
      var list2 = buildList(s2).reverse
      // prepare for very ugly and imperative part of the code
      var result = list1.head
      if (list1.head != list2.head) {
        None
      } else {
        while (list1.head == list2.head && (list1.tail != List.empty && list2.tail != List.empty)) {
          result = list1.head
          list1 = list1.tail
          list2 = list2.tail
        }
        Some(result)
      }
    }

  }
}