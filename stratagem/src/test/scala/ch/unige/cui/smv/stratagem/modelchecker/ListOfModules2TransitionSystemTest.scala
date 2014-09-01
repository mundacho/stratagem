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
package ch.unige.cui.smv.stratagem.modelchecker

import org.scalatest.FlatSpec
import com.typesafe.scalalogging.slf4j.Logging
import ch.unige.cui.smv.stratagem.transformers.FileSuperModularizer
import org.scalatest.BeforeAndAfter
import ch.unige.cui.smv.stratagem.transformers.PNML2PetriNet
import org.eclipse.ocl.examples.pivot.OCL
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup
import org.eclipse.ocl.examples.xtext.oclstdlib.OCLstdlibStandaloneSetup
import java.io.File
import ch.unige.cui.smv.stratagem.transformers.ListOfModules2TransitionSystem
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl
import ch.unige.cui.smv.stratagem.util.StrategyDSL._
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.common.util.Diagnostic
import scala.collection.JavaConversions._
import org.eclipse.emf.ecore.EObject
import ch.unige.smv.cui.metamodel.adt.AdtPackage
import ch.unige.cui.smv.metamodel.ts.TsPackage
import ch.unige.cui.smv.stratagem.util.AuxFunctions

/**
 * Tests the ListOfModules2TransitionSystemTest object
 *
 * @author mundacho
 *
 */
class ListOfModules2TransitionSystemTest extends FlatSpec with Logging with BeforeAndAfter {

  before {
    AdtPackage.eINSTANCE.eClass()
    TsPackage.eINSTANCE.eClass()
    OCL.initialize(null);
    org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
    org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain.initialize(null)
    OCLinEcoreStandaloneSetup.doSetup()
    OCLstdlibStandaloneSetup.doSetup()
  }

  "A SetOfModules2TransitionSystemWithAnonimizationAndSuperClustersTest" should "be able to do Philo 500" in {
    val net = PNML2PetriNet(new File("resources/test/Philo-500.pnml"))
    println("Starting to modularize")
    val modularizer = new FileSuperModularizer(new File("resources/test/clustering-philo-500.txt"), true)
    val (modules, set) = modularizer(net)
    println("Modularizer finished")
    val ts = ListOfModules2TransitionSystem(modules, Set(0), net)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    logger.debug("Starting translation to SigmaDD")
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriterWithSaturation(ts, Identity, 2)
    logger.debug("Finished translation to SigmaDD")
    assert(rewriter(initialState).get.size == BigInt("36360291795869936842385267079543319118023385026001623040346035832580600191583895484198508262979388783308179702534403855752855931517013066142992430916562025780021771247847643450125342836565813209972590371590152578728008385990139795377610001"))
  }

  it should "be able to do philo 5" in {
    val net = PNML2PetriNet(new File("resources/test/Philosophers-5.pnml"))
    println("Starting to modularize")
    val modularizer = new FileSuperModularizer(new File("resources/test/clustering-philo-5.txt"), true)
    val (modules, set) = modularizer(net)
    println("Modularizer finished")
    val ts = ListOfModules2TransitionSystem(modules, Set(0), net)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    logger.debug("Starting translation to SigmaDD")
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriterWithSaturation(ts, Identity, 2)
    logger.debug("Finished translation to SigmaDD")
    assert(rewriter(initialState).get.size == 243)
  }

  it should "be able to do Kanban-5 without recursive activated" in {
    val net = PNML2PetriNet(new File("resources/test/Kanban-5.pnml"))
    val modularizer = new FileSuperModularizer(new File("resources/test/standard-kanban-sclustering.txt"), true)
    val (modules, set) = modularizer(net)
    val ts = ListOfModules2TransitionSystem(modules, Set(), net)
    AuxFunctions.doLinking(ts)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriterWithSaturation(ts, Identity, 2)
    assert(rewriter(initialState).get.size == 2546432)
  }

  it should "be able to do Kanban-5 with recursive activated" in {
    val net = PNML2PetriNet(new File("resources/test/Kanban-5.pnml"))
    val modularizer = new FileSuperModularizer(new File("resources/test/standard-kanban-sclustering.txt"), true)
    val (modules, set) = modularizer(net)
    val ts = ListOfModules2TransitionSystem(modules, Set(0), net)
    AuxFunctions.doLinking(ts)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriterWithSaturation(ts, Identity, 2)
    println(rewriter(initialState).get.size)
    assert(rewriter(initialState).get.size == 2546432)
  }

}