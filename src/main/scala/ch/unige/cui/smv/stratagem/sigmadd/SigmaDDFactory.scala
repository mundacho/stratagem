package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.adt.ASort
import ch.unige.cui.smv.stratagem.adt.ATerm

/**
 * Represents a SigmaDD factory. Contains the factory methods to create SigmaDDs. This class is to be used as a module.
 * @author mundacho
 *
 */
abstract class SigmaDDFactory {
	
	type ImplementationType <:SigmaDD
  
  /**
   * Creates a new SigmaDD.
   * @param sort the sort for the SigmaDD
   * @param operationNames the names of the operations as strings.
   * @param tail the tail of the SigmaDD.
   */
	def createSigmaDD(sort:ASort, operationNames: Set[String], tail: ImplementationType):ImplementationType
	  /**
   * Creates a new SigmaDD.
   * @param sort the sort for the SigmaDD
   * @param operationNames the names of the operations as strings. They have to represent constants.
   */
	def createSigmaDD(sort:ASort, operationNames: Set[String]):ImplementationType
	
	/**
	 * Creates a new SigmaDD.
	 * @param term a term from which we are going to create a new SigmaDD.
	 * @return a new SigmaDD that represents that term. 
	 */
	def createSigmaDD(term: ATerm):ImplementationType
	
}