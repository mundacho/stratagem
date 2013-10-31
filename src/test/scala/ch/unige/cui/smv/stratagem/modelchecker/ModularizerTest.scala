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

/**
 * Tests the Modularizer object.
 * @author mundacho
 *
 */
class ModularizerTest extends FlatSpec {
  "Modularizer" should "find the right number of philosophers" in {
    val net = PNML2PetriNet(new File("resources/test/philo.pnml"))
    val modules = Modularizer(net)
    println(modules.size)
    assert(modules.size == 6)
  }

  it should "find the right number of kanban modules" in {
    val net = PNML2PetriNet(new File("resources/test/Kanban-5.pnml"))
    val modules = Modularizer(net)
    println(s"Number of modules ${modules.size}")
    println(modules.map(_.net.places.map(_.name).mkString(", ")).mkString("\n"))
    assert(modules.size == 5)
  }

  it should "find the right number of modules in..." in {
    val net = PNML2PetriNet(new File("resources/test/simple_lbs-5"))
    val modules = Modularizer(net)
    println(s"Number of modules ${modules.size}")
    assert(modules.size == 9)
  }

}