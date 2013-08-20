//package ch.unige.cui.smv.sigmadd.impl.basic
//
//import scala.collection.mutable.WeakHashMap
//import ch.unige.cui.smv.stratagem.adt.ASort
//import ch.unige.cui.smv.stratagem.adt.ATerm
//import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactory
//import ch.unige.cui.smv.stratagem.sigmadd.SigmaDD
//
///**
// * Represents the implementation of a factory to create SigmaDDs.
// * @author mundacho
// *
// */
//object SigmaDDBasicImplFactory extends SigmaDDFactory with CanonicalFactory {
//
//  type CanonicalType = SigmaDDBasicImpl
//
//  type ImplementationType = SigmaDDBasicImpl
//  
//  
//  def create(from:AnyRef) 
//
//  /**
//   * Represents a SigmaDD that encodes a set of constant terms.
//   * @param sort the sort of the SigmaDD.
//   * @param alphaRecursive the mapping for a inductive SigmaDD.
//   * @param constantOrVariable the set of constants represented by this SigmaDD.
//   */
//  abstract class SigmaDDBasicImpl(val sort: ASort, val alphaRecursive: Map[Set[String], SigmaDDBasicImpl], val constantOrVariable: Set[String]) extends SigmaDD {
//    type LatticeElementImplementationType = SigmaDDBasicImpl
//
//    type DomainType = StringSetWrapperFactory.StringSetWrapper
//    //type ImageType
//
//    def v(sigmaDD: SigmaDDBasicImpl): SigmaDDBasicImpl = {
//      null
//    }
//
//    def ^(sigmaDD: SigmaDDBasicImpl): SigmaDDBasicImpl = {
//      null
//    }
//
//    def \(sigmaDD: SigmaDDBasicImpl): SigmaDDBasicImpl = {
//      null
//    }
//
//    def squareUnion(sigmaDD: SigmaDDBasicImpl): SigmaDDBasicImpl = {
//      null
//    }
//  }
//
//  /**
//   * Creates a new SigmaDD.
//   * @param sort the sort for the SigmaDD
//   * @param operationNames the names of the operation as strings.
//   * @param tail the tail of the SigmaDD.
//   */
//  private def createSigmaDD(sort: ASort, operationName: String, tail: SigmaDDBasicImpl): SigmaDDBasicImpl = {
//    //val sdd = new SigmaDDBasicImpl(sort, Map(Set(operationName) -> tail), Set.empty)
//    null
//  }
//  /**
//   * Creates a new SigmaDD.
//   * @param sort the sort for the SigmaDD
//   * @param operationNames the names of the operations as strings. They have to represent constants.
//   */
//  private def createSigmaDD(sort: ASort, operationName: Set[String]): SigmaDDBasicImpl = {
//    null
//  }
//
//  def createSigmaDD(term: ATerm): SigmaDDBasicImpl = {
//    null
//  }
//}