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
package ch.unige.cui.smv.stratagem.gal

import ch.unige.cui.smv.stratagem.gal.expressions.BoolExpression
import ch.unige.cui.smv.stratagem.gal.expressions.BoolExpressionFactory
import ch.unige.cui.smv.stratagem.gal.expressions.IntExpression
import ch.unige.cui.smv.stratagem.gal.expressions.IntExpressionFactory

/**
 * Represents a Guarded-Action Language model.
 * This ensures compatibility with ITS-tools.
 *
 * @author mcolange
 *
 * @TODO add checks in constructor, especially to ensure that all used variables have been declared
 */
case class GAL(val name: String) {
  var variables = scala.collection.mutable.Set[String]()
  var arrays = scala.collection.mutable.Set[String]()
  var arraySize = scala.collection.mutable.Map[String,Int]()
  var initValue = scala.collection.mutable.Map[String,Int]()
  var transientPredicate: BoolExpression = BoolExpressionFactory.createBoolConstant(false)
  var transitions = scala.collection.mutable.Set[Transition]()

  def addVariable(name: String, initVal: Int) {
    // a variable should not be defined twice
    require(!variables.contains(name))
    variables.add(name)
    initValue(name) = initVal
  }

  def addArray(name: String, init: Array[Int]) {
    // an array should not be defined twice
    require(!arrays.contains(name))
    arrays.add(name)
    arraySize(name) = init.length
    for (a <- 0 to init.length-1) {
      initValue(name + "[" + a + "]") = init(a)
    }
  }

  def addTransition(trans: Transition) {
    transitions.add(trans)
  }

  def setTransientPredicate(value: BoolExpression) {
    transientPredicate = value
  }

  def getVariables = variables
  def getArrays = arrays

  override def toString() = {
    var res = "GAL " + name + " {\n";
    // variables
    for (v <- variables)
      res += "\tint " + v + " = " + initValue(v) + ";\n"
    // arrays
    for (v <- arrays) {
      res += "\tarray[" + arraySize(v) + "] " + v + " = (";
      for (i <- 0 to arraySize(v)-1) {
        res += initValue(v + "[" + i + "]")
        if (i != arraySize(v)-1) {
          res += ","
        }
      }
      res += ");\n"
    }
    // transitions
    for (t <- transitions)
      res += t.toString() + "\n"
    res += "}"
    res
  }
}
