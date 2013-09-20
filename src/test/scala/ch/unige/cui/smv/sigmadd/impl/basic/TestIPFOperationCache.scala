package ch.unige.cui.smv.sigmadd.impl.basic

import scala.collection.immutable.HashMap
import org.scalatest.BeforeAndAfter
import org.scalatest.FlatSpec

class TestIPFOperationCache extends TestIPFOperations {
  override val factory = new SimpleIPFFactoryWithOperationCache
  
}