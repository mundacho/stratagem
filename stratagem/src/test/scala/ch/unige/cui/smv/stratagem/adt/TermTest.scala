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

import org.scalatest.BeforeAndAfter
import org.scalatest.FlatSpec
import ch.unige.smv.cui.metamodel.adt.ATerm
import ch.unige.smv.cui.metamodel.adt.ADT
import ch.unige.smv.cui.metamodel.adt.Signature
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import org.eclipse.ocl.examples.pivot.OCL
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup
import org.eclipse.ocl.examples.xtext.oclstdlib.OCLstdlibStandaloneSetup

class TermTest extends FlatSpec with BeforeAndAfter {
  
    before {
    OCL.initialize(null);
    org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
    org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain.initialize(null)
    OCLinEcoreStandaloneSetup.doSetup()
    OCLstdlibStandaloneSetup.doSetup()

  }

  val adt = {
    val sign = AdtFactory.eINSTANCE.createSignature()
      .withSort("bool")
      .withSort("nat")
      .withGenerator("zero", "nat")
      .withGenerator("suc", "nat", "nat")
      .withGenerator("true", "bool")
      .withGenerator("false", "bool")
      .withOperation("and", "bool", "bool", "bool")

    {val a = AdtFactory.eINSTANCE.createADT(); a.setName("myADT"); a.setSignature(sign); a}.declareVariable("b", "bool").declareVariable("x", "nat")
  }

  def zero = adt.term("zero")
  def suc(term: ATerm) = adt.term("suc", term)
  def trueOp = adt.term("true")
  def falseOp = adt.term("false")

  "A term" should "throw an exception if its parameters' sorts do not correspond to its arity" in {

    intercept[IllegalArgumentException] {
      adt.term("and", trueOp)
    }
    intercept[IllegalArgumentException] {
      adt.term("and", trueOp, falseOp, trueOp)
    }
    intercept[IllegalArgumentException] {
      adt.term("and", trueOp, zero)
    }
  }

  "A term" should "write itself pretty" in {
    assert(adt.term("and", trueOp, falseOp).toString == "and(true, false)")
    assert(suc(suc(zero)).toString == "suc(suc(zero))")
    assert(adt.term("and", trueOp, adt.term("b")).toString == "and(true, $b)")
    assert(suc(suc(adt.term("x"))).toString == "suc(suc($x))")
  }

  "A term" should "allow to build well formed ground terms" in {
    adt.term("and", adt.term("true"), adt.term("false"))

    suc(suc(zero))
  }

  "A term" should "allow to build well formed terms with variables" in {
    adt.term("and", trueOp, adt.term("b"))
    suc(suc(adt.term("x")))
  }

}