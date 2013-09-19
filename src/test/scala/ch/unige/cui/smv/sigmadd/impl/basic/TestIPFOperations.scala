package ch.unige.cui.smv.sigmadd.impl.basic

import org.scalatest.BeforeAndAfter
import org.scalatest.FlatSpec

class TestIPFOperations extends FlatSpec with BeforeAndAfter {
  
  val factory = new InductiveIPFFactory
  
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

    assert(fvg.asBinaryRelation == (f.asBinaryRelation ++ g.asBinaryRelation)) // the union of ipfs is equal to the union of their corresponding binary relations
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