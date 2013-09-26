package ch.unige.cui.smv.stratagem.ipf

import scala.collection.immutable.HashMap
import org.scalatest.BeforeAndAfter
import org.scalatest.FlatSpec
import ch.unige.cui.smv.stratagem.ipf.SimpleIPFFactoryWithOperationCache

class TestIPFOperationCache extends TestIPFOperations {
  override val factory = new SimpleIPFFactoryWithOperationCache
  
}