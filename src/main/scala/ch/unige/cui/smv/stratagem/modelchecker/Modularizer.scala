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

import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import com.typesafe.scalalogging.slf4j.Logging

/**
 * This object encapsulates a method to transform a petri net in to a modular petri net automatically.
 * @author mundacho
 *
 */
object Modularizer extends Logging {
  def apply(net: PetriNet) = {
    var modules: Set[PTModule] = Set.empty
    var newModules: Set[PTModule] = createInitialModules(net)
    logger.debug(s"Number of initial modules: ${newModules.size}")
    var i = 0
    while (modules != newModules) {
      println(s"Iteration $i")
      i = i + 1
      modules = newModules
      newModules = Set.empty
      modules.foreach { m =>
        var workingNet = m.net
        var newOutputPlaces: Set[Place] = Set.empty
        var newInnerPlaces = m.innerPlaces
        var didCombine = false
        modules.foreach { n =>
          if ((m != n) && !m.outputPlaces.isEmpty && m.outputPlaces == n.inputPlaces) {
            workingNet = new PetriNet("", workingNet.places ++ n.net.places, workingNet.transitions ++ n.net.transitions)
            newOutputPlaces ++= n.outputPlaces
            newInnerPlaces ++= n.innerPlaces ++ n.inputPlaces
            didCombine = true
          }
        }
        if (didCombine) {
          newInnerPlaces ++= (m.inputPlaces intersect newOutputPlaces)
          newModules += new PTModule(workingNet, m.inputPlaces -- (newOutputPlaces ++ newInnerPlaces), newOutputPlaces -- (m.inputPlaces ++ newInnerPlaces), newInnerPlaces)
        } else {
          // we only add it if its places are not elsewhere
          if (newModules.isEmpty) {
            newModules += m
          } else {
            val allPlaces = newModules.map(_.net.places).reduce(_ ++ _)
            if (!(m.net.places subsetOf allPlaces)) { // we only add it if it is not already there
              newModules += m
            }
          }
        }
      }
    }
    newModules
  }

  def createInitialModules(net: PetriNet): Set[PTModule] = (for (t <- net.transitions) yield {
    val setOfInputPlaces = t.inputArcs.map(_.place).toSet
    val setOfOutputPlaces = t.outputArcs.map(_.place).toSet
    val allPlaces = setOfInputPlaces union setOfOutputPlaces
    val petriNet = new PetriNet("", allPlaces, Set(t))
    new PTModule(petriNet, setOfInputPlaces -- setOfOutputPlaces, setOfOutputPlaces -- setOfInputPlaces, setOfInputPlaces intersect setOfOutputPlaces)
  }).toSet
}