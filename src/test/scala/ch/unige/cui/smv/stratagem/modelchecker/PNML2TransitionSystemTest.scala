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
import java.io.File
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SigmaDDRewriterFactory
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDInductiveIPFFactoryImpl
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDIPFFactoryImpl

/**
 * @author mundacho
 *
 */
class PNML2TransitionSystemTest extends FlatSpec {
  "PNML2TransitionSystemTest" should "read the name of a PT correctly" in {
    assert(PNML2PetriNet(new File("resources/test/philo.pnml")).name == "philo")
  }

  it should "obtain a valid network even if the inscription in the places are empty" in {
    PNML2PetriNet(new File("resources/test/Philosophers-5.pnml"))
  }

  it should "be able to generate a valid transition system generating the right number of states." in {
    val pt = PNML2PetriNet(new File("resources/test/Philosophers-5.pnml"))
    val ts = PetriNet2TransitionSystem(pt)
    val initialState = SigmaDDFactoryImpl.create(ts.initialState)
    val rewriter = SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    assert(rewriter(initialState).get.size == 243)

  }

  it should "be able to generate a valid transition system generating the right number of states for even larger sets" in {
    SigmaDDFactoryImpl.cleanAllCaches
    val pt = PNML2PetriNet(new File("resources/test/philo.pnml"))
    val ts1 = PetriNet2TransitionSystem(pt)
    val initialState1 = SigmaDDFactoryImpl.create(ts1.initialState)
    val rewriter1 = SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts1)
    assert(rewriter1(initialState1).get.size == 729)
  }

}