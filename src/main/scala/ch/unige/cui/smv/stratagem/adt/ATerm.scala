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
 * Represents a term.
 */
abstract class ATerm(val adt: ADT) {
  /**
   * @return the sort of the term.
   */
  def sort: ASort

  /**
   * @return the operation symbol for a normal term and the variable name for
   * a variable.
   */
  def symbol: String

  /**
   * @return true if the term is a variable
   */
  val isVariable = false

  def ->(rightTerm: ATerm) = {
    Equation(this, rightTerm)
  }

}

object ATerm {

  /**
   * Extractor that takes a term and extracts the string representation of its
   * operator (for example: it would extract the "and" from the term
   * and(true, true)) and the list of arguments of the term (if any).
   *
   * @param term the term
   */
  def unapply(term: ATerm): Option[(String, List[ATerm])] = term match {
    case t: Term => Some(t.operationSymbol.name, t.subterms)
    case t: Variable => Some(t.declaration.name, Nil)
    case _ => None
  }
}

/**
 * Represents a non variable term. A constant or a term with parameters.
 *
 * @param operationSymbol the operation symbol.
 * @param subterms the list of subterms
 * @param theAdt the adt this terms uses.
 */
private case class Term(val operationSymbol: Operation, val subterms: List[ATerm], theAdt: ADT) extends ATerm(theAdt) {
  require(operationSymbol.arity.corresponds(subterms.map(_.sort))((l,r) => ASort.findCommonParent(l, r).get == l), "Invalid parameter")
  require((adt.signature.operations ++ adt.signature.generators)(operationSymbol.name) == operationSymbol) // the adt contains the operation
  // scalastyle:off
  require(if (!subterms.isEmpty) subterms.map(_.adt eq theAdt).reduce(_ && _) else true, "It is not allowed to mix adts") // require that each adt in the subterms is the same that the parent term adt
  // scalastyle:on

  override val symbol = operationSymbol.name

  val sort = operationSymbol.returnType;
  override val toString = operationSymbol.name + (if (subterms.isEmpty) "" else subterms.mkString("(", ", ", ")"))
}

/**
 * Represents a variable in a term.
 * @param declaration link to the the declaration
 * @param theAdt the adt this terms uses.
 */
private case class Variable(val declaration: VariableDeclaration, theAdt: ADT) extends ATerm(theAdt) {
  require(adt.variables(declaration.name) == declaration)
  override val isVariable = true
  val sort = declaration.sort
  override def toString = declaration.name
  override val symbol = declaration.name
}