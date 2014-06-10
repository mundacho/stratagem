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
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup
import org.eclipse.ocl.examples.xtext.oclstdlib.OCLstdlibStandaloneSetup
import org.eclipse.emf.ecore.util.EcoreUtil

class ADTTest extends FlatSpec with BeforeAndAfter {

  before {
    org.eclipse.ocl.examples.pivot.OCL.initialize(null);
    org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
    org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain.initialize(null)
    OCLinEcoreStandaloneSetup.doSetup()
    OCLstdlibStandaloneSetup.doSetup()
  }

  "An ADT" should "not allow to declare the same variable twice" in {
    intercept[java.lang.IllegalArgumentException] {
      val sign = (AdtFactory.eINSTANCE.createSignature())
        .withSort("nat")
        .withSort("nznat", "nat")
        .withSort("zero", "nat")
        .withGenerator("0", "zero")
        .withGenerator("suc", "nznat", "nat")
      val adt = { val a = AdtFactory.eINSTANCE.createADT(); a.setName("myADT"); a.setSignature(sign); a }
        .declareVariable("x", "nat")
        .declareVariable("x", "nat")
    }
  }

  "An ADT" should "not allow to declare the same variable twice, even if the sorts are different" in {
    intercept[IllegalArgumentException] {
      val sign = (AdtFactory.eINSTANCE.createSignature())
        .withSort("nat")
        .withSort("nznat", "nat")
        .withSort("zero", "nat")
        .withGenerator("0", "zero")
        .withGenerator("suc", "nznat", "nat")
      val adt = { val a = AdtFactory.eINSTANCE.createADT(); a.setName("myADT"); a.setSignature(sign); a }
        .declareVariable("x", "nat")
        .declareVariable("x", "nznat")
    }
  }

  "An ADT" should "not allow to declare a variable when the sort is not in the signature" in {
    intercept[IllegalArgumentException] {
      val sign = AdtFactory.eINSTANCE.createSignature()
        .withSort("nat")
        .withSort("nznat", "nat")
        .withSort("zero", "nat")
        .withGenerator("0", "zero")
        .withGenerator("suc", "nznat", "nat")
      val adt = { val a = AdtFactory.eINSTANCE.createADT(); a.setName("myADT"); a.setSignature(sign); a }
        .declareVariable("x", "nat")
        .declareVariable("x", "bool")
    }
  }

  "An ADT" should "allow to model the philosopher's problem" in {
    val signature = AdtFactory.eINSTANCE.createSignature()
      .withSort("ph")
      .withSort("state")
      .withSort("fork")
      .withGenerator("eating", "state")
      .withGenerator("thinking", "state")
      .withGenerator("waiting", "state")
      .withGenerator("waitingForLeftFork", "state")
      .withGenerator("waitingForRightFork", "state")
      .withGenerator("forkUsed", "fork")
      .withGenerator("forkFree", "fork")
      .withGenerator("emptytable", "ph")
      .withGenerator("philo", "ph", "state", "fork", "ph")

    val adt = { val a = AdtFactory.eINSTANCE.createADT(); a.setName("myADT"); a.setSignature(signature); a }
    // definitions to simplify the reading of terms.
    def eating = adt.term("eating")
    def thinking = adt.term("thinking")
    def waiting = adt.term("waiting")
    def waitingLF = adt.term("waitingForLeftFork")
    def waitingRF = adt.term("waitingForRightFork")
    def forkUsed = adt.term("forkUsed")
    def forkFree = adt.term("forkFree")
    def emptytable = adt.term("emptytable")
    def philo(state: ATerm, fork: ATerm, ph: ATerm) = adt.term("philo", state, fork, ph)

    // scalastyle:off
    assert(philo(thinking, forkFree, philo(thinking, forkFree, philo(thinking, forkFree, emptytable))).toString == "philo(thinking, forkFree, philo(thinking, forkFree, philo(thinking, forkFree, emptytable)))")
    // scalastyle:on

  }

  "And ADT" should "not allow to build term that contains terms from another ADT" in {
    val signature = AdtFactory.eINSTANCE.createSignature()
      .withSort("ph")
      .withSort("state")
      .withSort("fork")
      .withGenerator("eating", "state")
      .withGenerator("thinking", "state")
      .withGenerator("waiting", "state")
      .withGenerator("waitingForLeftFork", "state")
      .withGenerator("waitingForRightFork", "state")
      .withGenerator("forkUsed", "fork")
      .withGenerator("forkFree", "fork")
      .withGenerator("emptytable", "ph")
      .withGenerator("philo", "ph", "state", "fork", "ph")

    val adt = {
      val a = AdtFactory.eINSTANCE.createADT(); a.setName("myADT"); a.setSignature(signature);
      a
    }

    // definitions to simplify the reading of terms.
    def eating = adt.term("eating")
    def thinking = adt.term("thinking")
    def waiting = adt.term("waiting")
    def waitingLF = adt.term("waitingForLeftFork")
    def waitingRF = adt.term("waitingForRightFork")
    def forkUsed = adt.term("forkUsed")
    def forkFree = adt.term("forkFree")
    def emptytable = adt.term("emptytable")
    def philo(state: ATerm, fork: ATerm, ph: ATerm) = adt.term("philo", state, fork, ph)

    val strangeADT = { val a = AdtFactory.eINSTANCE.createADT(); a.setName("myADT"); a.setSignature(EcoreUtil.copy(signature)); a }
    intercept[IllegalArgumentException] {
      philo(thinking, forkFree, philo(thinking, forkFree, philo(thinking, forkFree, strangeADT.term("emptytable"))))
    }
  }
}