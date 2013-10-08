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

class SignatureTest extends FlatSpec {
  "A signature" should "not allow to define the same sort twice" in {
    intercept[IllegalArgumentException] {
      (new Signature)
        .withSort("bool")
        .withSort("bool")
    }
    intercept[IllegalArgumentException] {
      (new Signature)
        .withSort("s1")
        .withSort("s2")
        .withSort("s1", "s2")
    }
  }

  "A signature" should "not allow to define a subsort of an unknown sort" in {
    intercept[IllegalArgumentException] {
      (new Signature)
        .withSort("s1", "s2")
    }
  }

  "A signature" should "not allow to define operations using unknown sorts" in {
    intercept[IllegalArgumentException] {
      (new Signature)
        .withSort("s1")
        .withGenerator("op", "s2")
    }
    intercept[IllegalArgumentException] {
      (new Signature)
        .withSort("s1")
        .withGenerator("op", "s1", "s2")
    }
    intercept[IllegalArgumentException] {
      (new Signature)
        .withSort("s1")
        .withGenerator("op", "s1", "s1", "s2")
    }
    intercept[IllegalArgumentException] {
      (new Signature)
        .withSort("s1")
        .withOperation("op", "s1", "s1", "s2")
    }
  }

  "An empty signature" should "not allow to define operations nor generators" in {
    intercept[IllegalArgumentException] {
      (new Signature)
        .withOperation("op", "s2")
    }
    intercept[IllegalArgumentException] {
      (new Signature)
        .withGenerator("op", "s2")
    }
  }

  "A signature" should "not allow to redefine generators and operations" in {
    intercept[IllegalArgumentException] {
      (new Signature)
        .withSort("nat")
        .withGenerator("zero", "nat")
        .withGenerator("zero", "nat", "nat")
        .withOperation("+", "nat", "nat", "nat")
    }
    intercept[IllegalArgumentException] {
      (new Signature)
        .withSort("nat")
        .withGenerator("zero", "nat")
        .withOperation("+", "nat", "nat", "nat")
        .withOperation("+", "nat", "nat")
    }
  }

  "A signature" should "allow to define peano's naturals" in {
    (new Signature)
      .withSort("nat")
      .withGenerator("zero", "nat")
      .withGenerator("suc", "nat")
      .withOperation("+", "nat", "nat", "nat")
  }

  "A signature" should "allow to define AADTs with subsorts" in {
    (new Signature)
      .withSort("nat")
      .withSort("nznat", "nat")
      .withSort("zero", "nat")
      .withGenerator("0", "zero")
      .withGenerator("suc", "nznat", "nat")
  }

  "A signature" should "not allow to define repreated sorts" in {
    intercept[IllegalArgumentException] {
      (new Signature)
        .withSort("nat")
        .withSort("nat")
    }
  }

}