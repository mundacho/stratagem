package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.sigmadd.impl.basic._
import org.scalatest.FlatSpec
import org.scalatest.BeforeAndAfter
import ch.unige.cui.smv.stratagem.sigmadd.SynchronizedCache
import scala.collection.immutable.HashMap
import org.scalatest.OneInstancePerTest

class TestIPFUnion extends FlatSpec  {

  // we use a synchronized cache because otherwise, launching the test on eclipse launches the tests concurrently.
  object InductiveIPFTestFactory extends IPFAbstractFactory with SynchronizedCache {

    type CanonicalType = SimpleIPFImplementation

    type FromType = Map[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper]

    protected def makeFrom(alpha: AnyRef): SimpleIPFImplementation = alpha match {
      case a: HashMap[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper] @unchecked => new SimpleIPFImplementation(a)
      case _ => throw new IllegalArgumentException("Unable to create IPF")
    }

    def create(elt: String, image: String): SimpleIPFImplementation = create(
      HashMap(StringSetWrapperFactory.create(Set(elt)) -> StringSetWrapperFactory.create(Set(image))))

    class SimpleIPFImplementation private[InductiveIPFTestFactory] (
      val alpha: Map[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper]) extends IPF {

      type LatticeElementType = SimpleIPFImplementation
      type DomainType = StringSetWrapperFactory.SetWrapper
      type ImageType = StringSetWrapperFactory.SetWrapper

      type DomainTypeElt = String
      type ImageTypeElt = String

      override def hashCode = alpha ##

      def asBinaryRelation: Set[(DomainTypeElt, ImageTypeElt)] = for (
        (key, value) <- alpha.toSet;
        elt1 <- key.set;
        elt2 <- value.set
      ) yield (elt1, elt2)

      override def equals(obj: Any) = obj match {
        case o: SimpleIPFImplementation => (o eq this) || this.alpha == o.alpha
        case _ => false
      }

      def v(that: SimpleIPFImplementation): SimpleIPFImplementation = create(alphaUnion(this.alpha, that.alpha))

      def ^(that: SimpleIPFImplementation): SimpleIPFImplementation = create(alphaIntersection(this.alpha, that.alpha))

      def \(that: SimpleIPFImplementation): SimpleIPFImplementation = create(alphaDifference(this.alpha, that.alpha))

      def bottomElement = create(Map.empty)
    }

  } // end of InductiveIPFTestFactory
  
  "The union of IPFs" should "should always return the same reference" in {
    val ipfs1 = List(InductiveIPFTestFactory.create("1", "1"),
      InductiveIPFTestFactory.create("2", "3"),
      InductiveIPFTestFactory.create("3", "3"),
      InductiveIPFTestFactory.create("5", "4"),
      InductiveIPFTestFactory.create("6", "4"))

    val ipfs2 = List(InductiveIPFTestFactory.create("1", "1"),
      InductiveIPFTestFactory.create("3", "3"),
      InductiveIPFTestFactory.create("5", "4"),
      InductiveIPFTestFactory.create("6", "4"),
      InductiveIPFTestFactory.create("2", "3"))

    val f = ipfs1.reduce(_ v _)

    val g = ipfs2.reduce(_ v _)

    assert(f eq g)
  }

  it should "be equal to the union of the binary relations they represent" in {
    val ipfs1 = List(InductiveIPFTestFactory.create("1", "1"),
      InductiveIPFTestFactory.create("2", "3"),
      InductiveIPFTestFactory.create("3", "3"),
      InductiveIPFTestFactory.create("5", "4"),
      InductiveIPFTestFactory.create("6", "4"))

    val ipf123 = ipfs1(1) v ipfs1(2) v ipfs1(3)
    val ipf213 = ipfs1(2) v ipfs1(1) v ipfs1(3)

    val f = ipfs1.reduce(_ v _)

    val ipfs2 = List(InductiveIPFTestFactory.create("1", "2"),
      InductiveIPFTestFactory.create("3", "4"),
      InductiveIPFTestFactory.create("4", "4"),
      InductiveIPFTestFactory.create("5", "4"))

    val g = ipfs2.reduce(_ v _)

    val fvg = f v g

    assert(fvg.asBinaryRelation == (f.asBinaryRelation ++ g.asBinaryRelation)) // the union of ipfs is equal to the union of their corresponding binary relations
  }

  it should "be commutative and associative respecting reference equality" in {
    val ipfs = List(InductiveIPFTestFactory.create("1", "1"),
      InductiveIPFTestFactory.create("2", "3"),
      InductiveIPFTestFactory.create("3", "3"),
      InductiveIPFTestFactory.create("5", "4"),
      InductiveIPFTestFactory.create("6", "4"))

    val seqOfUnions = (for (permutation <- ipfs.permutations) yield permutation.reduce(_ v _)).toList // all possible unions of the elements in ipfs
    assert((true /: seqOfUnions.tail.map(_ eq seqOfUnions.head))(_ && _)) // all elements of the sequence of unions are equal to the first one
  }

  "The difference of IPFs" should "be the complementary to the union" in {
    val ipfs1 = List(InductiveIPFTestFactory.create("1", "1"),
      InductiveIPFTestFactory.create("2", "3"),
      InductiveIPFTestFactory.create("3", "3"),
      InductiveIPFTestFactory.create("5", "4"),
      InductiveIPFTestFactory.create("6", "4"))

    val ipf123 = ipfs1(1) v ipfs1(2) v ipfs1(3)
    val ipf213 = ipfs1(2) v ipfs1(1) v ipfs1(3)

    val f = ipfs1.reduce(_ v _)

    val ipfs2 = List(InductiveIPFTestFactory.create("1", "2"),
      InductiveIPFTestFactory.create("3", "4"),
      InductiveIPFTestFactory.create("4", "4"),
      InductiveIPFTestFactory.create("5", "4"))

    val g = ipfs2.reduce(_ v _)

    val fvg = f v g

    val fvgminusf = (fvg \ f)

    assert((fvg \ f).asBinaryRelation == fvg.asBinaryRelation -- f.asBinaryRelation)
    assert((fvg \ g).asBinaryRelation == fvg.asBinaryRelation -- g.asBinaryRelation)
    assert(fvgminusf eq g \ f)
    assert(fvg \ g eq f \ g)
  }

  "The intersection of IPFs" should "be equal to the intersection of the binary relations they represent" in {
    val ipfs1 = List(InductiveIPFTestFactory.create("1", "1"),
      InductiveIPFTestFactory.create("2", "3"),
      InductiveIPFTestFactory.create("3", "3"),
      InductiveIPFTestFactory.create("5", "4"),
      InductiveIPFTestFactory.create("6", "4"))

    val ipf123 = ipfs1(1) v ipfs1(2) v ipfs1(3)
    val ipf213 = ipfs1(2) v ipfs1(1) v ipfs1(3)

    val f = ipfs1.reduce(_ v _)

    val ipfs2 = List(InductiveIPFTestFactory.create("1", "2"),
      InductiveIPFTestFactory.create("3", "4"),
      InductiveIPFTestFactory.create("4", "4"),
      InductiveIPFTestFactory.create("5", "4"))

    val g = ipfs2.reduce(_ v _)

    val finterg = f ^ g
    val fintergbin = f.asBinaryRelation & g.asBinaryRelation

    assert(finterg.asBinaryRelation == (f.asBinaryRelation & g.asBinaryRelation)) // the intersection is equal to the corresponding binary relation
  }

}