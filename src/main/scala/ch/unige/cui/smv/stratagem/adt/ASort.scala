package ch.unige.cui.smv.stratagem.adt

import scala.collection.immutable.Nil

/**
 * Represents an abstract sort.
 */
abstract class ASort

/**
 * Represents a subsort.
 *
 * @constructor Creates a new sort.
 * @param name the name of the sort.
 * @param superSort the super sort for this sort.
 *
 * @author mundacho
 *
 */
case class SubSort(name: String, superSort: ASort) {
  require(superSort != null)
}

/**
 * Represents a top level sort.
 * @param name the name of the sort
 */
case class Sort(name:String)