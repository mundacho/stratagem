package ch.unige.cui.smv.stratagem.sigmadd

import org.scalatest.FlatSpec
import ch.unige.cui.smv.stratagem.adt.Sort
import scala.collection.immutable.HashMap
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.util.StringSetWrapperFactory

class TestSigmaDD extends FlatSpec {

  val adt = {
    val sign = (new Signature)
      .withSort("bool")
      .withSort("nat")
      .withGenerator("zero", "nat")
      .withGenerator("suc", "nat", "nat")
      .withGenerator("true", "bool")
      .withGenerator("false", "bool")
      .withOperation("and", "bool", "bool", "bool")

    new ADT("myAdt", sign).declareVariable("b", "bool").declareVariable("x", "nat")
  }

  def zero = adt.term("zero")
  def suc(term: ATerm) = adt.term("suc", term)
  def trueOp = adt.term("true")
  def falseOp = adt.term("false")

  "A SigmaDD" should "be capable of representing a constant set of constants" in {
    val sigmaddFactoryVal = new SigmaDDFactoryImpl
    val boolSort = adt.signature.sorts("bool")
    val trueSigmaDD = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create("true", sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.TopIPF)))
    val falseSigmaDD = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create("false", sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.TopIPF)))
    val unionOfConstants = trueSigmaDD v falseSigmaDD
    val expectedResult = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create((HashMap(StringSetWrapperFactory.create(Set("true", "false")) -> sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.TopIPF)))))
    assert(unionOfConstants eq expectedResult)
  }

  "A SigmaDD" should "be capabe of represent the union of a constant and a composite term" in {
    val sigmaddFactoryVal = new SigmaDDFactoryImpl
    val boolSort = adt.signature.sorts("bool")
    val trueSigmaDD = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create("true", sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.TopIPF)))
    val topIPF = sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.TopIPF
    val trueTuple = sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.create(HashMap(trueSigmaDD -> topIPF))
    val trueTrueTuple = sigmaddFactoryVal.ipfFactory.inductiveIPFFactory.create(HashMap(trueSigmaDD -> trueTuple))
    val andTrueTrueSigmaDD = sigmaddFactoryVal.create((boolSort, sigmaddFactoryVal.ipfFactory.create("and", trueTrueTuple)))
    
    println(andTrueTrueSigmaDD v trueSigmaDD)
  }
}