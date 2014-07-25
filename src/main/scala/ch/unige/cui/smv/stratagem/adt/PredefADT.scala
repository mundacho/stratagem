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

import ch.unige.smv.cui.metamodel.adt.impl.SignatureImpl
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import ch.unige.smv.cui.metamodel.adt.ATerm
import ch.unige.smv.cui.metamodel.adt.ADT
import scala.collection.JavaConversions._


/**
 * This object define basic adts and some useful functions.
 * @author mundacho
 *
 */
object PredefADT {
  val NAT_SORT_NAME = "nat"
  val ZERO = "zero"
  val SUC = "suc"

  def basicNatSignature = (AdtFactory.eINSTANCE.createSignature())
    .withSort(NAT_SORT_NAME)
    .withGenerator(ZERO, NAT_SORT_NAME)
    .withGenerator(SUC, NAT_SORT_NAME, NAT_SORT_NAME)

  /**
   * Defines n succesors of a given term.
   * @param n is the number of sucs before the initialterm
   * @param initialTerm is the initial term in this sequence
   * @param a is the adt where the terms are.
   * @return a term from the given adt with the form suc(suc(... <n times> suc(initialTerm)))
   */
  def define(n: Int, initialTerm: ATerm, a: ADT): ATerm = n match {
    case 0 => initialTerm
    case _ => a.term(SUC, ((define(n - 1, initialTerm, a))::Nil).toArray:_*)
  }
}