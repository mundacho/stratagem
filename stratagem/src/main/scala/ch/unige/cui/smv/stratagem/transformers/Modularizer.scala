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
package ch.unige.cui.smv.stratagem.transformers
import com.typesafe.scalalogging.slf4j.Logging
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule

/**
 * This object encapsulates a method to transform a petri net in to a modular petri net automatically.
 * @author mundacho
 *
 */
object Modularizer extends Logging with ((PetriNet) => List[PTModule]) {

  /**
   * Transforms a petri net into a list of smaller petri nets with some places in common.
   * @param net the input petri net
   * @return a set of smaller petri nets such that the union of all places in the set is equal to all the places in the original petri net.
   */
  def apply(net: PetriNet) = {
    var modules: Set[PTModule] = Set.empty
    var newModules: Set[PTModule] = createInitialModules(net)
    logger.trace(s"Number of initial modules: ${newModules.size}")
    logger.trace(s"Number of places in initial modules ${newModules.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.trace(s"Number of transitions in intialModules ${newModules.map(_.net.transitions).reduce(_ ++ _).toSet.size}")
    newModules = bottomUpClustering(newModules)
    // now remove duplicates and fusion
    val (clustered, unclustered) = newModules.partition(s => ((s.outputPlaces.isEmpty) && (s.inputPlaces.isEmpty)))
    logger.trace(s"Clustered elements are ${clustered.size}")
    logger.trace(s"Unclustered elements are ${unclustered.size}")
    // this removes duplicated clusters where threre is a choice
    newModules = removeDuplicatedWithChoices(newModules, clustered, unclustered)
    modules = newModules
    // second pass, remove duplicates, i.e. modules that are already completely contained in other modules
    modules.foreach { m =>
      val modulesToRemove = modules.filter(n => (n.net.places subsetOf m.net.places) && (n != m))
      modulesToRemove.foreach { n =>
        val newModulesMinusN = (newModules - n)
        if (!newModulesMinusN.isEmpty && newModulesMinusN.map(_.net.places).reduce(_ ++ _).toSet.size == newModules.map(_.net.places).reduce(_ ++ _).toSet.size) newModules -= n
      }
    }
    logger.trace(s"Number of modules after removing clusters already contained by other clusters ${newModules.size}")
    logger.trace(s"Number places after removing clusters already contained by other clusters ${newModules.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.trace(s"Number of transitions after removing clusters already contained by other clusters ${newModules.map(_.net.transitions).reduce(_ ++ _).toSet.size}")
    modules = newModules
    // after second pass, we remove modules that completely overlap other modules
    modules.foreach { m =>
      var placesInM = m.net.places
      modules.view.filter(_ != m).foreach { n =>
        placesInM --= n.net.places
      }
      if (placesInM.isEmpty && (newModules - m).map(_.net.places).reduce(_ ++ _).toSet.size == newModules.map(_.net.places).reduce(_ ++ _).toSet.size) {
        newModules -= m
      }
    }
    logger.trace(s"Number of modules after removing overlapping modules ${newModules.size}")
    logger.trace(s"Number places after removing overlapping modules ${newModules.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.trace(s"Number of transitions after removing overlapping modules ${newModules.map(_.net.transitions).reduce(_ ++ _).toSet.size}")
    // for each place, we decide in which cluster it goes
    var unorderedResult = removeDuplicatedPlaces(net.places, newModules)
    logger.trace(s"Number places before returning ${unorderedResult.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.trace(s"Number of transitions before returning ${unorderedResult.map(_.net.transitions).reduce(_ ++ _).toSet.size}")
    logger.trace(s"Number of modules before returning ${unorderedResult.size}")
    // now we can sort the the result
    sortModules(unorderedResult, net)
  }

  def removeDuplicatedWithChoices(modules: Set[PTModule], clustered: Set[PTModule], unclustered: Set[PTModule]) = {
    var newModules = modules
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
    logger.trace(s"Number of modules after removing duplicated clusters with choice ${newModules.size}")
    logger.trace(s"Number places after removing duplicated clusters with choice ${newModules.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.trace(s"Number of transitions after removing duplicated clusters with choice ${newModules.map(_.net.transitions).reduce(_ ++ _).toSet.size}")
    newModules
  }

  private def sortModules(modules: Set[PTModule], net: PetriNet) = {
    var unorderedResult = modules

    val pairOfModules2ModuleDistance: Map[Set[PTModule], Int] = calculateModuleDistance(modules, net)

    // the last module has to be one that has an internal fireable 
    val firstModule = modules.find(m => isFireable(m, net)) match {
      case Some(s) => s
      case None => unorderedResult.head
    }

    var resultAsList = firstModule :: Nil
    unorderedResult -= firstModule
    val numberOfModules = unorderedResult.size + 1
    while (resultAsList.size != numberOfModules) {
      // the successor is the module with most connection to the last one
      val orderedListOfSuccessors = unorderedResult.view.map(m => (pairOfModules2ModuleDistance.getOrElse((Set(m, resultAsList.head)), 0), m)).toList.sortWith((a, b) => a._1 > b._1)
      resultAsList = orderedListOfSuccessors.head._2 :: resultAsList
      unorderedResult -= orderedListOfSuccessors.head._2 // we remove the module from unordered result
    }
    resultAsList
  }

  def calculateModuleDistance(modules: Set[PTModule], net: PetriNet) = Map((for (
    m1 <- modules;
    m2 <- modules;
    if (m1 != m2)
  ) yield if (net.transitions.exists(t => {
    val allArcs = (t.inputArcs ++ t.outputArcs)
    allArcs.exists(a => (m1.net.places contains a.place)) && allArcs.exists(a => (m2.net.places contains a.place))
  }))
    (Set(m1, m2), 1)
  else (Set(m1, m2), 0)).toList: _*)

  def isFireable(module: PTModule, net: PetriNet) = net.transitions.exists(t => t.inputArcs.forall(iArc => ((module.net.places contains iArc.place) && iArc.place.initialMarking >= iArc.annotation)))

  private def removeDuplicatedPlaces(places: Set[Place], modules: Set[PTModule]): (Set[PTModule]) = {
    var newModules = modules
    places.foreach { p =>
      // we group all the modules that share this place by their ranking of how good are they as modules
      val modulesForThisPlace = newModules.filter(_.net.places.contains(p)).groupBy(m => m.innerPlaces.size.toDouble / m.net.places.size).toList.sortWith(_._1 > _._1)
      // we take the first element
      if (modulesForThisPlace.size > 0) {
        // we remove the place from all elements of the first element's tail, if any
        modulesForThisPlace.head._2.tail.foreach { m =>
          newModules -= m
          val newPlaces = m.net.places - p
          val theNewModule = m.copy(net = m.net.copy(places = newPlaces), innerPlaces = m.innerPlaces - p, outputPlaces = m.outputPlaces - p, inputPlaces = m.inputPlaces - p)
          if (newPlaces != Set.empty) newModules += theNewModule
        }
        // we remove the places for all elements of the tail, if any
        modulesForThisPlace.tail.foreach { e =>
          e._2.foreach { m =>
            newModules -= m
            val newPlaces = m.net.places - p
            val theNewModule = m.copy(net = m.net.copy(places = newPlaces), innerPlaces = m.innerPlaces - p, outputPlaces = m.outputPlaces - p, inputPlaces = m.inputPlaces - p)
            val unorderedPairOfModules = Set(theNewModule, modulesForThisPlace.head._2.head)
            val oldDistancePair = Set(m, modulesForThisPlace.head._2.head)
            if (newPlaces != Set.empty) newModules += theNewModule
          }
        }
      }
    }
    newModules
  }

  private def bottomUpClustering(inputModules: Set[PTModule]) = {
    var newModules = inputModules
    var modules: Set[PTModule] = Set.empty
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
    logger.trace(s"Number places after bottom-up clusterization ${newModules.map(_.net.places).reduce(_ ++ _).toSet.size}")
    logger.trace(s"Number transitions after bottom-up clusterization ${newModules.map(_.net.transitions).reduce(_ ++ _).toSet.size}")
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