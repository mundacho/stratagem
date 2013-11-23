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
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SigmaDDRewriterFactory
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl
import ch.unige.cui.smv.stratagem.ts.Identity

/**
 * Tests the SetOfModules2TransitionSystem object
 *
 * @author mundacho
 *
 */
class SetOfModules2TransitionSystemTest extends FlatSpec {
  "A SetOfModules2TransitionSystem" should "be able to calculare Kanban" in {
    val net = PNML2PetriNet(new File("resources/test/Kanban-5.pnml"))
    val modules = Modularizer(net)
    val ts = SetOfModules2TransitionSystem(modules, net)
    val initialState = SigmaDDFactoryImpl.create(ts.initialState)
    val rewriter = SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts) //(ts, Identity, 2)
    assert(rewriter(initialState).get.size == 2546432)
  }

}