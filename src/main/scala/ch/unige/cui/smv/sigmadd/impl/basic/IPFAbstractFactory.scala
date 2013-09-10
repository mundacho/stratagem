package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.stratagem.sigmadd.LatticeElement
import scala.collection.immutable.HashMap

abstract class IPFAbstractFactory extends CanonicalFactory {

  type AbstractCanonicalType = IPF

  private [basic] abstract class IPF extends LatticeElement {
    type LatticeElementType = IPF 
  }

  /**
   * Represents an IPF (Injective Partitioned function).
   *
   * @author mundacho
   *
   */
  private [basic] abstract class InductiveIPF extends IPF {
    type DomainType <: LatticeElement { type LatticeElementType = DomainType }
    type ImageType <: LatticeElement { type LatticeElementType = ImageType }


    val alpha: Map[DomainType, ImageType]

    /**
     * Does the union of two alphas. We assume that Domain and Image type are canonical elements.
     * @param alpha1 the first operand
     * @param alpha2 the second operand
     */
    def alphaUnion(alpha1: Map[DomainType, ImageType], alpha2: Map[DomainType, ImageType]): Map[DomainType, ImageType] = {
      val W = squareUnion(alpha1, alpha2)
      val result = new scala.collection.mutable.HashMap[DomainType, ImageType]
      W.foreach(
        (entry1) => {
          val (tail1, key1) = entry1
          val existingMappings = new scala.collection.mutable.HashMap[ImageType, DomainType]
          var keyFromRemoving = key1
          W.view.filter(_ != entry1) // first we filter out the entry
            .foreach((entry2) => {
              val (tail2, key2) = entry2
              val keyIntersection = key1 ^ key2
              if (keyIntersection != key1.bottomElement) { // don't bother if the intersection is empty
                val tailUnion = tail1 v tail2
                if (existingMappings.isDefinedAt(tailUnion)) {
                  result(existingMappings(tailUnion) v (key1 ^ key2)) = tailUnion
                } else {
                  result(key1 ^ key2) = tailUnion
                  existingMappings(tailUnion) = keyIntersection
                }
              } else if (keyFromRemoving != key1.bottomElement) { // the intersection is not empty
                keyFromRemoving = keyFromRemoving \ key2
              }
            })
          if (keyFromRemoving != key1.bottomElement)
            result(keyFromRemoving) = tail1
        })
      HashMap(result.toArray : _*)
    }
    /**
     * Performs the square union between two alphas.
     * @param alpha1 the first operand
     * @param alpha2 the second operand
     */
    def squareUnion(alpha1: Map[DomainType, ImageType], alpha2: Map[DomainType, ImageType]) = {
      val result = new scala.collection.mutable.HashMap[ImageType, DomainType]
      alpha1.foreach((entry) => result(entry._2) = entry._1) // this makes result an inverted version of alpha1
      alpha2.foreach((entry) => {
        result(entry._2) = (result.getOrElse(entry._2, entry._1.bottomElement) v entry._1)
      })
      result
    }

  }
}