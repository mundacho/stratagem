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

import scala.collection.JavaConversions._

import ch.unige.smv.cui.metamodel.adt.ATerm
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import ch.unige.smv.cui.metamodel.adt.Term
import ch.unige.smv.cui.metamodel.adt.Variable

object ATermHelper {

  /**
   * Extractor that takes a term and extracts the string representation of its
   * operator (for example: it would extract the "and" from the term
   * and(true, true)) and the list of arguments of the term (if any).
   *
   * @param term the term
   */
  def unapply(term: ATerm): Option[(String, List[ATerm])] = term match {
    case t: Term => Some((t.getOperationSymbol().getName(), t.getSubterms().toList))
    case t: Variable => Some(t.getDeclaration().getName(), Nil)
    case _ => None
  }
  
  implicit def term2RichTerm(term: ATerm) = new RichTerm(term)
}

class RichTerm(val wrappedTerm: ATerm) {
  def ->(rightHandSideTerm: ATerm) = {
    val eq = AdtFactory.eINSTANCE.createEquation()
    eq.setLeftHandTerm(wrappedTerm)
    eq.setRightHandTerm(rightHandSideTerm)
    eq
  }
}