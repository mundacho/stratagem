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

import org.scalatest.BeforeAndAfter
import org.scalatest.FlatSpec

class TestIPFOperations extends FlatSpec with BeforeAndAfter {

  val factory = new SimpleIPFFactory

  before {
    factory.cleanUnicityTable
  }

  "The union of IPFs" should "should always return the same reference" in {
    val ipfs1 = List(factory.create("1", "1"),
      factory.create("2", "3"),
      factory.create("3", "3"),
      factory.create("5", "4"),
      factory.create("6", "4"))

    val ipfs2 = List(factory.create("1", "1"),
      factory.create("3", "3"),
      factory.create("5", "4"),
      factory.create("6", "4"),
      factory.create("2", "3"))

    val f = ipfs1.reduce(_ v _)

    val g = ipfs2.reduce(_ v _)

    assert(f eq g)
  }

  "The union of IPFs" should "allow to join the same thing" in {
    val ipfs1 = factory.create("1", "1")

    val ipfs2 = factory.create("1", "1")

    assert((ipfs1 v ipfs2) eq ipfs1)
  }

  it should "be equal to the union of the binary relations they represent" in {
    val ipfs1 = List(factory.create("1", "1"),
      factory.create("2", "3"),
      factory.create("3", "3"),
      factory.create("5", "4"),
      factory.create("6", "4"))

    val ipf123 = ipfs1(1) v ipfs1(2) v ipfs1(3)
    val ipf213 = ipfs1(2) v ipfs1(1) v ipfs1(3)

    val f = ipfs1.reduce(_ v _)

    val ipfs2 = List(factory.create("1", "2"),
      factory.create("3", "4"),
      factory.create("4", "4"),
      factory.create("5", "4"))

    val g = ipfs2.reduce(_ v _)

    val fvg = f v g
    // the union of ipfs is equal to the union of their corresponding binary relations
    assert(fvg.asBinaryRelation == (f.asBinaryRelation ++ g.asBinaryRelation))
  }

  it should "be commutative and associative respecting reference equality" in {
    val ipfs = List(factory.create("1", "1"),
      factory.create("2", "3"),
      factory.create("3", "3"),
      factory.create("5", "4"),
      factory.create("6", "4"))

    val seqOfUnions = (for (permutation <- ipfs.permutations) yield permutation.reduce(_ v _)).toList // all possible unions of the elements in ipfs
    assert((true /: seqOfUnions.tail.map(_ eq seqOfUnions.head))(_ && _)) // all elements of the sequence of unions are equal to the first one
  }

  "The difference of IPFs" should "be the complementary to the union" in {
    val ipfs1 = List(factory.create("1", "1"),
      factory.create("2", "3"),
      factory.create("3", "3"),
      factory.create("5", "4"),
      factory.create("6", "4"))

    val ipf123 = ipfs1(1) v ipfs1(2) v ipfs1(3)
    val ipf213 = ipfs1(2) v ipfs1(1) v ipfs1(3)

    val f = ipfs1.reduce(_ v _)

    val ipfs2 = List(factory.create("1", "2"),
      factory.create("3", "4"),
      factory.create("4", "4"),
      factory.create("5", "4"))

    val g = ipfs2.reduce(_ v _)

    val fvg = f v g

    val fvgminusf = (fvg \ f)

    assert((fvg \ f).asBinaryRelation == fvg.asBinaryRelation -- f.asBinaryRelation)
    assert((fvg \ g).asBinaryRelation == fvg.asBinaryRelation -- g.asBinaryRelation)
    assert(fvgminusf eq g \ f)
    assert(fvg \ g eq f \ g)
  }

  "The intersection of IPFs" should "be equal to the intersection of the binary relations they represent" in {
    val ipfs1 = List(factory.create("1", "1"),
      factory.create("2", "3"),
      factory.create("3", "3"),
      factory.create("5", "4"),
      factory.create("6", "4"))

    val ipf123 = ipfs1(1) v ipfs1(2) v ipfs1(3)
    val ipf213 = ipfs1(2) v ipfs1(1) v ipfs1(3)

    val f = ipfs1.reduce(_ v _)

    val ipfs2 = List(factory.create("1", "2"),
      factory.create("3", "4"),
      factory.create("4", "4"),
      factory.create("5", "4"))

    val g = ipfs2.reduce(_ v _)

    val finterg = f ^ g
    val fintergbin = f.asBinaryRelation & g.asBinaryRelation

    assert(finterg.asBinaryRelation == (f.asBinaryRelation & g.asBinaryRelation)) // the intersection is equal to the corresponding binary relation
  }

}