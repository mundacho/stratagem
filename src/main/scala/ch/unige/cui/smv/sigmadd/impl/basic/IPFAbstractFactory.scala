package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.stratagem.sigmadd.LatticeElement
import scala.collection.immutable.HashMap

abstract class IPFAbstractFactory extends CanonicalFactory {

  type AbstractCanonicalType = IPF

  private[basic] abstract class IPF extends LatticeElement {

    type LatticeElementType = IPF

    override def hashCode: Int = throw new NotImplementedError("All subclasses of" + this.getClass().getName() + " should implement hashcode")

    override def equals(obj: Any): Boolean = throw new NotImplementedError("All subclasses of " + this.getClass().getName() + " should implement equals")

    /**
     * The type of the domain elements.
     */
    type DomainTypeElt

    /**
     * The type of the image elements.
     */
    type ImageTypeElt

    def asBinaryRelation: Set[(DomainTypeElt, ImageTypeElt)]

    type DomainType <: LatticeElement { type LatticeElementType = DomainType }
    type ImageType <: LatticeElement { type LatticeElementType = ImageType }

    val alpha: Map[DomainType, ImageType]

    override def toString = alpha.map((entry) => { entry._1 + " -> " + entry._2 }).mkString(",\n")

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
          val existingMappings = new scala.collection.mutable.HashMap[ImageType, DomainType] // keeps a log of elements with a mapping
          var keyFromRemoving = key1
          W.view.filter(_ != entry1) // first we filter out the entry itself
            .foreach((entry2) => {
              val (tail2, key2) = entry2
              val keyIntersection = key1 ^ key2
              if (keyIntersection != key1.bottomElement) { // if the intersection is not empty, then continue with the algorithm
                val tailUnion = tail1 v tail2
                existingMappings.lift(tailUnion) match {
                  case Some(existingKey) =>
                    result -= existingKey
                    result(existingKey v keyIntersection) = tailUnion
                    existingMappings(tailUnion) = existingKey v keyIntersection // and keep track of it
                  case None =>
                    result(key1 ^ key2) = tailUnion
                    existingMappings(tailUnion) = keyIntersection
                }
                if (keyFromRemoving != key1.bottomElement) { // if there are still some elements in keyFromRemoving
                  keyFromRemoving = keyFromRemoving \ key2
                }
              }
            })
          if (keyFromRemoving != key1.bottomElement) {
            result(keyFromRemoving) = tail1
          }
        })
      HashMap(result.toArray: _*)
    }

    def alphaIntersection(alpha1: Map[DomainType, ImageType], alpha2: Map[DomainType, ImageType]): Map[DomainType, ImageType] = {
      val W = squareUnion(alpha1, alpha2)
      val existingMappings = new scala.collection.mutable.HashMap[ImageType, DomainType]
      W.foreach(
        (entry1) => {
          val (tail1, key1) = entry1
          W.view.filter(_ != entry1) // first we filter out the entry itself
            .foreach((entry2) => {
              val (tail2, key2) = entry2
              val keyIntersection = key1 ^ key2
              if (keyIntersection != key1.bottomElement) { // if the intersection is not empty, then continue with the algorithm
                val tailIntersection = tail1 ^ tail2
                existingMappings.lift(tailIntersection) match {
                  case Some(existingKey) =>
                    existingMappings(tailIntersection) = existingKey v keyIntersection
                  case None =>
                    existingMappings(tailIntersection) = keyIntersection // and we keep track of it
                }
              }
            })
        })
      HashMap(existingMappings.toArray.map(_.swap): _*)
    }

    def alphaDifference(alpha1: Map[DomainType, ImageType], alpha2: Map[DomainType, ImageType]): Map[DomainType, ImageType] = {
      val existingMappings = scala.collection.mutable.HashMap(alpha1.toArray.map(_.swap): _*)
      alpha1.foreach(
        (entry1) => {
          val (key1, tail1) = entry1
          var keyFromRemove = key1
          alpha2.foreach((entry2) => {
            val (key2, tail2) = entry2
            val keyIntersection = key1 ^ key2
            if (keyIntersection != key1.bottomElement) { // if the intersection is not empty, then continue with the algorithm
              keyFromRemove = keyFromRemove \ key2
              val tailDifference = tail1 \ tail2
              if (tailDifference != tail1.bottomElement) { // if the tail is not empty, then we continue with the algorithm
                existingMappings.lift(tailDifference) match {
                  case Some(existingKey) =>
                    existingMappings(tailDifference) = keyIntersection v existingKey
                  case None =>
                    existingMappings(tailDifference) = keyIntersection // and we keep track of it
                }
              }
            }
          })
          if (keyFromRemove != key1.bottomElement)
            existingMappings(tail1) = keyFromRemove v existingMappings(tail1)
        })
      HashMap(existingMappings.toArray.map(_.swap): _*)
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