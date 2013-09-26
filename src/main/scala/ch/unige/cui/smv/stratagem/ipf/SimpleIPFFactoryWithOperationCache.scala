package ch.unige.cui.smv.stratagem.ipf

import scala.collection.immutable.HashMap

import ch.unige.cui.smv.stratagem.util.OperationCache
import ch.unige.cui.smv.stratagem.util.StringSetWrapperFactory

/**
 * The same IPF factory but implementing an operation cache.
 */
class SimpleIPFFactoryWithOperationCache extends SimpleIPFFactory {

  override protected def makeFrom(alpha: AnyRef): SimpleIPFImplementation = alpha match {
    case a: HashMap[StringSetWrapperFactory.StringSetWrapper, StringSetWrapperFactory.StringSetWrapper] @unchecked => new SimpleIPFImplementation(a)  with OperationCache
    case _ => throw new IllegalArgumentException("Unable to create IPF")
  }

}