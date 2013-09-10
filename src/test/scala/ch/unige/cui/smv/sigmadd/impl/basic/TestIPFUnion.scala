package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.sigmadd.impl.basic._
import java.util.HashMap

class TestIPFUnion {
  object InductiveIPFTestFactory extends IPFAbstractFactory {

    type CanonicalType = SimpleIPFImplementation

    type FromType = Map[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper]

    protected def makeFrom(alpha: AnyRef): SimpleIPFImplementation = alpha match {
      case a : Map[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper] @unchecked => new SimpleIPFImplementation(a) 
      case _ => throw new IllegalArgumentException("Unable to create IPF")
    }  
      
      
    class SimpleIPFImplementation private [InductiveIPFTestFactory] (
      val alpha: Map[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper] = Map[StringSetWrapperFactory.SetWrapper, StringSetWrapperFactory.SetWrapper]()
      ) extends InductiveIPF {

      type DomainType = StringSetWrapperFactory.SetWrapper
      type ImageType = StringSetWrapperFactory.SetWrapper

      def v(that: IPF): IPF = that match {
        case t: SimpleIPFImplementation => create(alphaUnion(this.alpha, t.alpha))
        case EmptyIPF => this 
      }

      def ^(that: IPF): IPF = {
        null // TODO
      }

      def \(that: IPF): IPF = {
        null // TODO
      }
      val bottomElement = EmptyIPF
    }

    object EmptyIPF extends IPF {

      def v(that: IPF): IPF = that

      def ^(that: IPF): IPF = EmptyIPF

      def \(that: IPF): IPF = EmptyIPF

      def bottomElement = this
    }

  } // end of InductiveIPFTestFactory
  
  
}