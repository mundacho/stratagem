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

package ch.unige.cui.smv.stratagem.adt

/**
 * Represents an ADT object. This object is inmutable.
 *
 * @param name the name of the adt.
 * @param signature the signature.
 * @param variable a variable using sorts of this ADT.
 * @author mundacho
 */
class ADT private (val name: String, val signature: Signature, val variables: Map[String, VariableDeclaration], val equations: Set[Equation]) {

  override def toString =
    s"Adt $name\n" +
    "Signature\n" +
    signature + "\n" +
    "Variables\n" +
    variables.map(v => s"${v._1}: ${v._2.sort}").mkString("   ", "\n   ", "\n") +
    "Equations\n" +
    equations.mkString("   ", "\n   ", "\n") 
    
    
  
  /**
   * Creates an empty ADT.
   * @param name the name of this ADT.
   * @param signature a signature.
   */
  def this(name: String, signature: Signature) = {
    this(name, signature, Map.empty, Set.empty)
  }

  /**
   * Declares a variable in this ADT.
   *
   * @param name the variable's name
   * @param sortName its sort.
   * @return an ADT with the variable.
   */
  def declareVariable(name: String, sortName: String): ADT = {
    require(!variables.isDefinedAt(name), "A variable with the name \"" + name + "\" exists already")
    require(signature.sorts.isDefinedAt(sortName), "The sort \"" + sortName + "\" is not in the signature of this ADT")
    new ADT(name, signature, variables + (name -> new VariableDeclaration(signature.sorts(sortName), name)), Set.empty)
  }

  /**
   * Creates a term from this ADT.
   *
   * @param op the operation string or variable name
   * @param params list of parameter terms.
   */
  def term(op: String, params: ATerm*): ATerm = {
    val operator = signature.generators ++ signature.operations // we fusion both maps, by construction their intersection is empty
    require(operator.isDefinedAt(op) || variables.isDefinedAt(op), "Operation: \"" + op + "\" is not a valid operation nor variable in adt \"" + name + "\".")
    if (operator.isDefinedAt(op)) {
      Term(operator(op), params.toList, this)
    } else {
      Variable(variables(op), this)
    }
  }

  /**
   * Returns a new ADT where the equation is included.
   *
   * @param leftSide the left side of the equation.
   * @param rightSide the right side of the equation.
   *
   */
  def withEquation(leftSide: ATerm, rightSide: ATerm) = {
    require(leftSide.adt eq this)
    require(rightSide.adt eq this)

    new ADT(name, signature, variables, equations + new Equation(leftSide, rightSide))
  }

}
