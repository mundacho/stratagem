/*
Stratagem is a model checker for transition systems described using rewriting
rules and strategies.
Copyright (C) 2013 - SMV@Geneva University.
Program written by Edmundo Lopez Bobeda <edmundo [at] lopezbobeda.net>.
This program is free software; you can redistribute it and/or modify
it under the  terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package ch.unige.cui.smv.stratagem.ipf

import ch.unige.cui.smv.stratagem.util.LatticeElement
import scala.collection.immutable.HashMap
import ch.unige.cui.smv.stratagem.util.CanonicalFactory
import scala.Array.canBuildFrom
import ch.unige.cui.smv.stratagem.util.LightWeightWrapper

/**
 * This is a factory for IPF objects.
 */
abstract class IPFAbstractFactory extends CanonicalFactory {

  /**
   * IPF represents an injective partitioned function. Its main objective is to
   * define a mapping that represents a function (called alpha). It also defines
   *  how to combine the alphas of two or more functions to create a new IPF.
   */
  protected[ipf] abstract class IPF extends LatticeElement {

    override def hashCode: Int = throw new NotImplementedError("All subclasses of" + this.getClass().getName() + " should implement hashcode")

    override def equals(obj: Any): Boolean = throw new NotImplementedError("All subclasses of " + this.getClass().getName() + " should implement equals")

    /**
     * The number of elements encoded in this IPF.
     */
    val size: BigInt

    /**
     * The type of the domain elements of this IPF. When seeing this IPF as
     * a binary relation, it is the type of the first entry.
     */
    type DomainTypeElt

    /**
     * The type of the image elements of this IPFs. When seeing this IPF as a
     * binary relation, it is the type of the second entry.
     */
    type ImageTypeElt

    /**
     * @return a set containing this IPF as a binary relation.
     */
    def asBinaryRelation: Set[(DomainTypeElt, ImageTypeElt)]

    /**
     * The domain type is the type of the keys of the alpha. An element of this
     * type is a lattice element.
     */
    type DomainType <: LatticeElement { type LatticeElementType = DomainType }

    /**
     * The image type is the type of the values of the alpha. An element of this
     * type is a lattice element.
     */
    type ImageType <: LatticeElement { type LatticeElementType = ImageType }

    /**
     * It is the mapping encapsulated by this IPF.
     */
    val alpha: Map[DomainType, ImageType]

    override def toString = alpha.map((entry) => { entry._1 + " -> " + entry._2 }).mkString(",\n") + "\n"

    /**
     * Does the union of two alphas. The result is a canonical alpha
     * encapsulated in a HashMap.
     * @param alpha1 the first operand
     * @param alpha2 the second operand
     */
    def alphaUnion(alpha1: Map[DomainType, ImageType], alpha2: Map[DomainType, ImageType]): Map[DomainType, ImageType] = {
      val W = squareUnion(alpha1, alpha2)
      val result = new scala.collection.mutable.HashMap[LightWeightWrapper[DomainType], ImageType]
      val existingMappings = new scala.collection.mutable.HashMap[LightWeightWrapper[ImageType], DomainType] // keeps a log of elements with a mapping
      W.foreach(
        (entry1) => {
          val (tail1, key1) = entry1
          var keyFromRemoving = key1
          W.view.filter(_ != entry1) // first we filter out the entry itself
            .foreach((entry2) => {
              val (tail2, key2) = entry2
              val keyIntersection = key1 ^ key2
              if (keyIntersection != key1.bottomElement) { // if the intersection is not empty, then continue with the algorithm
                val tailUnion = LightWeightWrapper[ImageType](tail1.wrapped v tail2.wrapped)
                existingMappings.lift(tailUnion) match {
                  case Some(existingKey) =>
                    result -= LightWeightWrapper[DomainType](existingKey)
                    result(LightWeightWrapper[DomainType](existingKey v keyIntersection)) = tailUnion.wrapped
                    existingMappings(tailUnion) = existingKey v keyIntersection // and keep track of it
                  case None =>
                    result(LightWeightWrapper[DomainType](key1 ^ key2)) = tailUnion.wrapped
                    existingMappings(tailUnion) = keyIntersection
                }
                if (keyFromRemoving != key1.bottomElement) { // if there are still some elements in keyFromRemoving
                  keyFromRemoving = keyFromRemoving \ key2
                }
              }
            })
          if (keyFromRemoving != key1.bottomElement) {
            existingMappings.lift(tail1) match {
              case Some(existingKey) =>
                result -= LightWeightWrapper[DomainType](existingKey)
                result(LightWeightWrapper[DomainType](existingKey v keyFromRemoving)) = tail1.wrapped
                existingMappings(tail1) = existingKey v keyFromRemoving // and keep track of it
              case None =>
                result(LightWeightWrapper[DomainType](keyFromRemoving)) = tail1.wrapped
                existingMappings(tail1) = keyFromRemoving
            }
          }
        })
      HashMap(result.view.map((e) => (e._1.wrapped, e._2)).toArray: _*)
    }

    /**
     * Intersects to alphas.
     */
    def alphaIntersection(alpha1: Map[DomainType, ImageType], alpha2: Map[DomainType, ImageType]): Map[DomainType, ImageType] = {
      val existingMappings = new scala.collection.mutable.HashMap[LightWeightWrapper[ImageType], DomainType]
      alpha1.foreach(
        (entry1) => {
          val (key1, tail1) = entry1
          alpha2.foreach((entry2) => {
            val (key2, tail2) = entry2
            val keyIntersection = key1 ^ key2
            if (keyIntersection != key1.bottomElement) { // if the intersection is not empty, then continue with the algorithm
              val tailIntersection = LightWeightWrapper[ImageType](tail1 ^ tail2)
              if (tailIntersection.wrapped != tail1.bottomElement) {
                existingMappings(tailIntersection) = keyIntersection v existingMappings.getOrElse(tailIntersection, key1.bottomElement)
              }

            }
          })
        })
      HashMap(existingMappings.view.map((e) => (e._2, e._1.wrapped)).toArray: _*)
    }

    /**
     * Makes the difference between two alphas.
     */
    def alphaDifference(alpha1: Map[DomainType, ImageType], alpha2: Map[DomainType, ImageType]): Map[DomainType, ImageType] = {
      val result = new scala.collection.mutable.HashMap[LightWeightWrapper[ImageType], DomainType]
      alpha1.foreach(
        (entry1) => {
          val (key1, tail1) = entry1
          var keyFromRemove = key1
          alpha2.foreach((entry2) => {
            val (key2, tail2) = entry2
            val keyIntersection = key1 ^ key2
            if (keyIntersection != key1.bottomElement) { // if the intersection is not empty, then continue with the algorithm
              keyFromRemove = keyFromRemove \ key2
              val tailDifference = LightWeightWrapper[ImageType](tail1 \ tail2)
              if (tailDifference.wrapped != tail1.bottomElement) { // if the tail is not empty, then we continue with the algorithm
                result(tailDifference) = keyIntersection v (result.getOrElse(tailDifference, key1.bottomElement))
              }
            }
          })
          if (keyFromRemove != key1.bottomElement) {
            val key = LightWeightWrapper[ImageType](tail1)
            result(key) = keyFromRemove v (result.getOrElse(key, key1.bottomElement))
          }
        })
      HashMap(result.view.map((e) => (e._2, e._1.wrapped)).toArray: _*)
    }

    /**
     * Performs the square union between two alphas.
     * @param alpha1 the first operand
     * @param alpha2 the second operand
     */
    def squareUnion(alpha1: Map[DomainType, ImageType], alpha2: Map[DomainType, ImageType]) = {
      val result = new scala.collection.mutable.HashMap[LightWeightWrapper[ImageType], DomainType]
      alpha1.foreach((entry) => result(LightWeightWrapper[ImageType](entry._2)) = entry._1) // this makes result an inverted version of alpha1
      alpha2.foreach((entry) => {
        val key = LightWeightWrapper[ImageType](entry._2)
        result(key) = (result.getOrElse(key, entry._1.bottomElement) v entry._1)
      })
      result
    }
  }
}