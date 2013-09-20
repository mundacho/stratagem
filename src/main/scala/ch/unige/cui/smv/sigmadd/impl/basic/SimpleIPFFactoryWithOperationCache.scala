package ch.unige.cui.smv.sigmadd.impl.basic

import scala.collection.immutable.HashMap

class SimpleIPFFactoryWithOperationCache extends SimpleIPFFactory {

  override protected def makeFrom(alpha: AnyRef): SimpleIPFImplementation = alpha match {
    case a: HashMap[StringSetWrapperFactory.StringSetWrapper, StringSetWrapperFactory.StringSetWrapper] @unchecked => new SimpleIPFImplementation(a)  with OperationCache
    case _ => throw new IllegalArgumentException("Unable to create IPF")
  }

} // end of InductiveIPFFactory