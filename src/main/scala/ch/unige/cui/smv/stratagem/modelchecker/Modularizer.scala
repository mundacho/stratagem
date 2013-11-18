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

import scala.annotation.migration
import com.typesafe.scalalogging.slf4j.Logging
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet

/**
 * This object encapsulates a method to transform a petri net in to a modular petri net automatically.
 * @author mundacho
 *
 */
object Modularizer extends Logging {

  /**
   * Transforms a petri net into a list of smaller petri nets with some places in common.
   * @param net the input petri net
   * @return a set of smaller petri nets such that the union of all places in the set is equal to all the places in the original petri net.
   */
  def apply(net: PetriNet) = {
    var modules: Set[PTModule] = Set.empty
    var newModules: Set[PTModule] = createInitialModules(net)
    logger.debug(s"Number of initial modules: ${newModules.size}")
    logger.debug(s"Number of places in initial modules ${newModules.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.debug(s"Number of transitions in intialModules ${newModules.map(_.net.transitions).reduce(_ ++ _).toSet.size}")
    newModules = bottomUpClustering(newModules) 
    logger.debug(s"Number places after bottom-up clusterization ${newModules.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.debug(s"Number transitions after bottom-up clusterization ${newModules.map(_.net.transitions).reduce(_ ++ _).toSet.size}")
    // now remove duplicates and fusion
    val (clustered, unclustered) = newModules.partition(s => ((s.outputPlaces.isEmpty) && (s.inputPlaces.isEmpty)))
    logger.debug(s"Clustered elements are ${clustered.size}")
    logger.debug(s"Unclustered elements are ${unclustered.size}")
    unclustered.foreach { n =>
      val clustersWithChoices = clustered.filter(m => n.net.places subsetOf m.net.places)
      if (!clustersWithChoices.isEmpty) {
        var workingNet = new PetriNet("", Set.empty, Set.empty)
        clustersWithChoices.foreach { m =>
          newModules -= m
          workingNet = new PetriNet("", workingNet.places ++ m.net.places, workingNet.transitions ++ m.net.transitions)
        }
        newModules += new PTModule(workingNet, Set.empty, Set.empty, workingNet.places)
        newModules -= n
      }
    }
    logger.debug(s"Number of modules after first pass ${newModules.size}")
    logger.debug(s"Number places after first pass ${newModules.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.debug(s"Number of transitions after first pass ${newModules.map(_.net.transitions).reduce(_ ++ _).toSet.size}")
    modules = newModules
    // second pass, remove duplicates
    modules.foreach { m =>
      val modulesToRemove = modules.filter(n => (n.net.places subsetOf m.net.places) && (n != m))
      modulesToRemove.foreach { n =>
        // FIXME: some transitions might be removed by this, we need to put them back where they belong
        if ((newModules - n).map(_.net.places).reduce(_ ++ _).toSet.size == newModules.map(_.net.places).reduce(_ ++ _).toSet.size) newModules -= n
      }
    }

    logger.debug(s"Number of modules after second pass ${newModules.size}")
    logger.debug(s"Number places after second pass ${newModules.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.debug(s"Number of transitions after second pass ${newModules.map(_.net.transitions).reduce(_ ++ _).toSet.size}")
    modules = newModules
    // after second pass we need to keep the minimum number of modules, we remove completely overlapping modules
    modules.foreach { m =>
      var placesInM = m.net.places
      modules.view.filter(_ != m).foreach { n =>
        placesInM --= n.net.places
      }
      if (placesInM.isEmpty && (newModules - m).map(_.net.places).reduce(_ ++ _).toSet.size == newModules.map(_.net.places).reduce(_ ++ _).toSet.size) {
        newModules -= m
      }
    }

    logger.debug(s"Number places before returning ${newModules.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.debug(s"Number of modules before returning ${newModules.size}")
    newModules
  }

  private def bottomUpClustering(inputModules:Set[PTModule]) = {
    var newModules = inputModules
    var modules:Set[PTModule] = Set.empty
    while (modules != newModules) {
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
          newModules += m
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