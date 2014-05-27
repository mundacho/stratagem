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
import ch.unige.smv.cui.metamodel.adt.ASort
import ch.unige.smv.cui.metamodel.adt.Sort
import ch.unige.smv.cui.metamodel.adt.SubSort
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import ch.unige.smv.cui.metamodel.adt.util.AdtValidator

object ASortHelper {

  /**
   * Creates an instance of a sort.
   */
  def apply(sortName: String) = {
    val s = AdtFactory.eINSTANCE.createSort()
    s.setName("myADT")
    s
  }

  def apply(sortName: String, superSort: ASort) = {
    val s = AdtFactory.eINSTANCE.createSubSort()
    s.setName("myADT")
    s.setSuperSort(superSort)
    if (!AdtValidator.INSTANCE.validateSubSort(s, null, null)) {
      throw new IllegalArgumentException(s"Sort $sortName cannot have null as super sort.")
    }
    s
  }

  def findSuperParentSort(sort: ASort): ASort =
    sort match {
      case a: Sort => a
      case e: SubSort => findSuperParentSort(e.getSuperSort())
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
        case e: SubSort => e :: buildList(e.getSuperSort())
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
  }
}