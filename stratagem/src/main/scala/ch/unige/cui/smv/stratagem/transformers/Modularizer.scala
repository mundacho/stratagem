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
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.petrinets.Transition
import ch.unige.cui.smv.stratagem.util.AlphaNumOrdering
import ch.unige.cui.smv.stratagem.util.AlphaNumOrderingModule

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
    var unorderedResult = removeDuplicatedPlaces(net, newModules)
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
    val firstModule = modules.toList.filter(m => isFireable(m, net)) match {
      case Nil => unorderedResult.toList.sorted(AlphaNumOrderingModule).reverse.head
      case l => l.sorted(AlphaNumOrderingModule).reverse.head
    }

    var resultAsList = firstModule :: Nil
    unorderedResult -= firstModule
    val numberOfModules = unorderedResult.size + 1
    var currentListOfSuccessors: List[PTModule] = Nil
    while (resultAsList.size != numberOfModules) {
      // the successor is the module with most connection to the last one
      if (currentListOfSuccessors.isEmpty) {
        currentListOfSuccessors = unorderedResult.view.map(m => (pairOfModules2ModuleDistance.getOrElse((Set(m, resultAsList.head)), 0), m)).toList.sortWith((a, b) => a._1 > b._1).filter(_._1 > 0).map(_._2).sorted(AlphaNumOrderingModule).reverse
        if (currentListOfSuccessors.isEmpty) {
          currentListOfSuccessors = unorderedResult.head :: Nil
        }
      }
      // for the successors that are directly connected

      resultAsList = currentListOfSuccessors.head :: resultAsList
      unorderedResult -= currentListOfSuccessors.head // we remove the module from unordered result
      currentListOfSuccessors = currentListOfSuccessors.tail
    }
    resultAsList
  }

  def calculateModuleDistance(modules: Set[PTModule], net: PetriNet) = {
    val transition2Modules = scala.collection.mutable.Map[Transition, Set[PTModule]]()
    for {
      t <- net.transitions
      allPlaces = t.arcs.map(_.place)
      m <- modules
      if (allPlaces.exists(p => m.net.places contains p))
    } {
      transition2Modules.update(t, transition2Modules.getOrElse(t, Set()) + m)
    }

    val result = scala.collection.mutable.Map[Set[PTModule], Int]()
    for (
      connectedModules <- transition2Modules.values;
      combination <- connectedModules.toList.combinations(2)
    ) {
      result.update(combination.toSet, 1)
    }
    Map(result.toList: _*)
  }

  def isFireable(module: PTModule, net: PetriNet) = net.transitions.exists(t => t.inputArcs.forall(iArc => ((module.net.places contains iArc.place) && iArc.place.initialMarking >= iArc.annotation)))

  private def removeDuplicatedPlaces(net: PetriNet, modules: Set[PTModule]): (Set[PTModule]) = {
    val places = net.places
    var newModules = modules
    val transition2Modules = scala.collection.mutable.Map[Transition, Set[PTModule]]()
    var module2Transition = scala.collection.mutable.Map[PTModule, Set[Transition]]()
    var function2Minimize = scala.collection.mutable.Map[PTModule, Set[PTModule]]()
    for {
      t <- net.transitions
      allPlaces = t.arcs.map(_.place)
      m <- modules
      if (allPlaces.exists(p => m.net.places contains p))
    } {
      transition2Modules.update(t, transition2Modules.getOrElse(t, Set()) + m)
      module2Transition.update(m, module2Transition.getOrElse(m, Set()) + t)
    }

    for (
      set <- transition2Modules.values;
      combination <- set.toList.combinations(2)
    ) {
      function2Minimize.update(combination.head, function2Minimize.getOrElse(combination.head, Set()) + combination.tail.head)
      function2Minimize.update(combination.tail.head, function2Minimize.getOrElse(combination.tail.head, Set()) + combination.head)
    }

    places.toList.sorted(AlphaNumOrdering).foreach { p =>
      // we group all the modules that share this place by their ranking of how good are they as modules
      val modForThisPlace = newModules.filter(_.net.places.contains(p))
      if (modForThisPlace.size > 1) {
        val modulesForThisPlace = modForThisPlace.groupBy(m => m.innerPlaces.size.toDouble / m.net.places.size).toList.sortWith(_._1 > _._1)
        // we take the first element
        if (modulesForThisPlace.size > 0) {
          // we need to find the best modules to keep the place
          var moduleToBeKept: PTModule = modulesForThisPlace.head._2.head
          var bestScore = Int.MaxValue
          var toBeKeptFunction2Minimize = function2Minimize
          var toBeKeptlModule2Transition = module2Transition
          //        var toBeKeptTransition2Module = scala.collection.mutable.Map[Transition, Set[PTModule]]()
          // we search the best module to keep the place
          for (updatableModule <- modulesForThisPlace.head._2) {
            val localFunction2Minimize = scala.collection.mutable.Map[PTModule, Set[PTModule]]() ++ function2Minimize
            val localModule2Transition = scala.collection.mutable.Map[PTModule, Set[Transition]]() ++ module2Transition
            //          val localTransition2Module = scala.collection.mutable.Map[Transition, Set[PTModule]]() ++ transition2Modules
            // we remove the place from all other possible modules and modify the function to optimize accordingly
            modulesForThisPlace.head._2.filter(_ != updatableModule).foreach { m =>
              val newPlaces = m.net.places - p
              val theNewModule = m.copy(net = m.net.copy(places = newPlaces), innerPlaces = m.innerPlaces - p, outputPlaces = m.outputPlaces - p, inputPlaces = m.inputPlaces - p)
              localFunction2Minimize.update(theNewModule, Set())
              // update the function to minimize to reflect that this m doesn't exist
              for (moduleConnectedToM <- localFunction2Minimize(m)) {
                // first we disconnect
                localFunction2Minimize.update(moduleConnectedToM, localFunction2Minimize(moduleConnectedToM) - m)
                // check if the module is still connected to theNewModule
                // we reconnect them only if they are still connected
                for (t <- localModule2Transition(moduleConnectedToM)) {
                  val allPlaces = t.arcs.map(_.place)
                  if (allPlaces.exists(p => theNewModule.net.places contains p)) { // if there is one transition that connects them
                    localFunction2Minimize.update(moduleConnectedToM, localFunction2Minimize(moduleConnectedToM) + theNewModule)
                    localFunction2Minimize.update(theNewModule, localFunction2Minimize.getOrElse(theNewModule, Set()) + moduleConnectedToM)
                    localModule2Transition.update(theNewModule, localModule2Transition.getOrElse(theNewModule, Set()) + t)
                  }
                }
              }
              localFunction2Minimize.remove(m)
            }
            val score = localFunction2Minimize.map(_._2.size).reduce(_ + _)
            if (score < bestScore) {
              bestScore = score
              toBeKeptFunction2Minimize = localFunction2Minimize
              toBeKeptlModule2Transition = localModule2Transition
              moduleToBeKept = updatableModule
            }
          }
          modulesForThisPlace.head._2.filter(_ != moduleToBeKept).foreach { m =>
            val newPlaces = m.net.places - p
            val theNewModule = m.copy(net = m.net.copy(places = newPlaces), innerPlaces = m.innerPlaces - p, outputPlaces = m.outputPlaces - p, inputPlaces = m.inputPlaces - p)
            newModules -= m
            newModules += theNewModule
          }
          modulesForThisPlace.tail.foreach { e =>
            e._2.foreach { m =>
              newModules -= m
              val newPlaces = m.net.places - p
              val theNewModule = m.copy(net = m.net.copy(places = newPlaces), innerPlaces = m.innerPlaces - p, outputPlaces = m.outputPlaces - p, inputPlaces = m.inputPlaces - p)
              val unorderedPairOfModules = Set(theNewModule, modulesForThisPlace.head._2.head)
              val oldDistancePair = Set(m, modulesForThisPlace.head._2.head)
              if (newPlaces != Set.empty) newModules += theNewModule

              for (moduleConnectedToM <- toBeKeptFunction2Minimize(m)) {
                // first we disconnect
                toBeKeptFunction2Minimize.update(moduleConnectedToM, toBeKeptFunction2Minimize(moduleConnectedToM) - m)
                // check if the module is still connected to theNewModule
                // we reconnect them only if they are still connected
                for (t <- toBeKeptlModule2Transition(moduleConnectedToM)) {
                  val allPlaces = t.arcs.map(_.place)
                  if (allPlaces.exists(p => theNewModule.net.places contains p)) { // if there is one transition that connects them
                    toBeKeptFunction2Minimize.update(moduleConnectedToM, toBeKeptFunction2Minimize(moduleConnectedToM) + theNewModule)
                    toBeKeptFunction2Minimize.update(theNewModule, toBeKeptFunction2Minimize.getOrElse(theNewModule, Set()) + moduleConnectedToM)
                    toBeKeptlModule2Transition.update(theNewModule, toBeKeptlModule2Transition.getOrElse(theNewModule, Set()) + t)
                  }
                }
              }
              toBeKeptFunction2Minimize.remove(m)

            }
          }
          function2Minimize = toBeKeptFunction2Minimize
          module2Transition = toBeKeptlModule2Transition
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