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

package ch.unige.cui.smv.stratagem.ipf

import org.scalatest.FlatSpec
import ch.unige.cui.smv.stratagem.util.StringSetWrapperFactory

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