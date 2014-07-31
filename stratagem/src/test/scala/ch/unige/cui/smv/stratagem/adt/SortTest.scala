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

import org.scalatest.FlatSpec

class SortTest extends FlatSpec {
  "A sort" should "not be instanciated with a null super sort" in {
    intercept[IllegalArgumentException] {
      // scalastyle:off
      val sort = ASortHelper("bool", null)
      // scalastyle:on
    }
  }

  "Two sorts" should "be able to find their common parend" in {
    val superParentSort = ASortHelper("s1")
    val someSubSort1 = ASortHelper("s2", superParentSort)
    val someSubSort2 = ASortHelper("s3", superParentSort)
    val someSubSort11 = ASortHelper("s4", someSubSort1)
    val someSubSort12 = ASortHelper("s5", someSubSort1)
    val someSubSort21 = ASortHelper("s6", someSubSort2)
    val someSubSort22 = ASortHelper("s7", someSubSort2)
    val someSubSort211 = ASortHelper("s8", someSubSort11)
    val someSubSort212 = ASortHelper("s9", someSubSort11)
    val someOtherSuperParentSort = ASortHelper("ss1")
    val someOtherSubSort1 = ASortHelper("ss1", someOtherSuperParentSort)

    assert(superParentSort equals ASortHelper.findCommonParent(someSubSort211, superParentSort).get)
    assert(someSubSort1 equals ASortHelper.findCommonParent(someSubSort211, someSubSort12).get)
    assert(ASortHelper.findCommonParent(someSubSort211, someOtherSuperParentSort) == None)

    assert((superParentSort isSubSortOf (someOtherSubSort1)) == false)
    assert(superParentSort isSubSortOf (superParentSort))
    assert(someSubSort22 isSubSortOf (superParentSort))
    assert(!(someOtherSuperParentSort isSubSortOf (superParentSort)))
    assert(someSubSort212 isSubSortOf (someSubSort1))
  }

}