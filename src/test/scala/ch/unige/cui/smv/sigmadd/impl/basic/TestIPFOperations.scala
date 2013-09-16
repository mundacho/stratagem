package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.sigmadd.impl.basic._
import java.util.HashMap
import org.scalatest.FlatSpec

class TestIPFUnion extends FlatSpec {

  object InductiveIPFTestFactory extends IPFAbstractFactory {

    type CanonicalType = SimpleIPFImplementation

    type FromType = Map[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper]

    protected def makeFrom(alpha: AnyRef): SimpleIPFImplementation = alpha match {
      case a: Map[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper] @unchecked => new SimpleIPFImplementation(a)
      case _ => throw new IllegalArgumentException("Unable to create IPF")
    }

    def create(elt: String, image: String): IPF = create(
      Map(StringSetWrapperFactory.create(Set(elt)) -> StringSetWrapperFactory.create(Set(image))))

    class SimpleIPFImplementation private[InductiveIPFTestFactory] (
      val alpha: Map[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper] = Map[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper]()) extends IPF {

      type DomainType = StringSetWrapperFactory.SetWrapper
      type ImageType = StringSetWrapperFactory.SetWrapper

      type DomainTypeElt = String
      type ImageTypeElt = String

      override lazy val hashCode = alpha ##

      def asBinaryRelation: Set[(DomainTypeElt, ImageTypeElt)] = for (
        (key, value) <- alpha.toSet;
        elt1 <- key.set;
        elt2 <- value.set
      ) yield (elt1, elt2)

      override def equals(obj: Any) = obj match {
        case o: SimpleIPFImplementation => (o eq this) || this.alpha == o.alpha
        case _ => false
      }

      def v(that: IPF): IPF = that match {
        case t: SimpleIPFImplementation => create(alphaUnion(this.alpha, t.alpha))
      }

      def ^(that: IPF): IPF = that match {
        case t: SimpleIPFImplementation => create(alphaIntersection(this.alpha, t.alpha))
      }

      def \(that: IPF): IPF = {
        null // TODO
      }
      def bottomElement = create(Map.empty)
    }

  } // end of InductiveIPFTestFactory

  "The union of IPFs" should "be equal to the union of the binary relations they represent" in {
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

  "The union of IPFs" should "be commutative and associative respecting reference equality" in {
    val ipfs = List(InductiveIPFTestFactory.create("1", "1"),
      InductiveIPFTestFactory.create("2", "3"),
      InductiveIPFTestFactory.create("3", "3"),
      InductiveIPFTestFactory.create("5", "4"),
      InductiveIPFTestFactory.create("6", "4"))

    val seqOfUnions = (for (permutation <- ipfs.permutations) yield permutation.reduce(_ v _)).toList // all possible unions of the elements in ipfs
    assert((true /: seqOfUnions.tail.map(_ eq seqOfUnions.head))(_ && _)) // all elements of the sequence of unions are equal to the first one
  }

  "The difference of IPFs" should "be commutative and associative respecting reference equality" in {
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
    
    println(fvg.squareUnion(fvg.alpha, f.alpha.asInstanceOf[Map[fvg.DomainType,fvg.ImageType]]))

  }

}