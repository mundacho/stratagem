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
      val sort = new SubSort("bool", null)
      // scalastyle:on
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

    assert(superParentSort equals ASort.findCommonParent(someSubSort211, superParentSort).get)
    assert(someSubSort1 equals ASort.findCommonParent(someSubSort211, someSubSort12).get)
    assert(ASort.findCommonParent(someSubSort211, someOtherSuperParentSort) == None)
  }
}