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

import ListOfModules2TransitionSystem._
import ch.unige.cui.smv.stratagem.petrinets.Arc
import ch.unige.cui.smv.metamodel.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.petrinets.Transition
import ch.unige.cui.smv.stratagem.util.StrategyDSL._
import ch.unige.cui.smv.stratagem.transformers.ListOfModules2TransitionSystem.clusterFixpointStrategy
import ch.unige.cui.smv.metamodel.ts.TransitionSystem

/**
 * @author mundacho
 *
 */
object RecursiveHelper {

  def getMinimalRecursiveStrategyName(strategies: List[(NonVariableStrategy, Int)], maxCluster: Int): String = {
    assert(strategies.size > 1)
    val divisionNumber = if (closestPowerOfTwo(maxCluster) == maxCluster) maxCluster / 2 else closestPowerOfTwo(maxCluster)
    val (list1, list2) = strategies partition (_._2 < divisionNumber)
    if (list1.isEmpty) "1" + getMinimalRecursiveStrategyName(list2.map(e => (e._1, e._2 - divisionNumber)), maxCluster - divisionNumber)
    else if (list2.isEmpty) "0" + getMinimalRecursiveStrategyName(list1, divisionNumber)
    else "_end"
  }

  // n > 0
  private def closestPowerOfTwo(n: Int): Int = {
    assert(n > 0)
    if (n == 1) 1 else if (n == 2) 2 else {
      2 * closestPowerOfTwo(n / 2)
    }
  }

  def getMinimalRecursiveStrategy(strategies: List[(NonVariableStrategy, Int)], maxCluster: Int): NonVariableStrategy = {
    assert(strategies.size > 1)
    val divisionNumber = if (closestPowerOfTwo(maxCluster) == maxCluster) maxCluster / 2 else closestPowerOfTwo(maxCluster)
    val (list1, list2) = strategies partition (_._2 < divisionNumber)
    if (list1.isEmpty) getMinimalRecursiveStrategy(list2.map(e => (e._1, e._2 - divisionNumber)), maxCluster - divisionNumber)
    else if (list2.isEmpty) getMinimalRecursiveStrategy(list1, divisionNumber)
    else chainRecursiveStrategiesForClusters(strategies, maxCluster)
  }

  def chainRecursiveStrategiesForClusters(strategies: List[(NonVariableStrategy, Int)], maxCluster: Int): NonVariableStrategy = {
    if ((strategies.size == 1) && (strategies.head._2 == 0) && (maxCluster == 1)) {
      ClusterDef.applyFor(0)(strategies.head._1, Identity)
    } else {
      val divisionNumber = if (closestPowerOfTwo(maxCluster) == maxCluster) maxCluster / 2 else closestPowerOfTwo(maxCluster)
      val (list1, list2) = strategies partition (_._2 < divisionNumber)
      if (list1.isEmpty) SClusterDef.applyFor(1)(chainRecursiveStrategiesForClusters(list2.map(e => (e._1, e._2 - divisionNumber)), maxCluster - divisionNumber), Identity)
      else if (list2.isEmpty) SClusterDef.applyFor(0)(chainRecursiveStrategiesForClusters(list1, divisionNumber), Identity)
      else SClusterDef.applyFor(0)(chainRecursiveStrategiesForClusters(list1, divisionNumber), SClusterDef.applyFor(1)(chainRecursiveStrategiesForClusters(list2.map(e => (e._1, e._2 - divisionNumber)), maxCluster - divisionNumber), Identity))
    }
  }

  def recursiveSuperClusterFixPointStrategy(sClusterLevel: Int,
    cluster2localStrategies: scala.collection.mutable.Map[Int, Set[(Int, String)]],
    fixPointStrategies: Set[String],
    maxCluster: Int, superClusterName: String)(implicit ts: TransitionSystem): NonVariableStrategy = {
    val clusterFixPointNameStart = "__fixpoint_" + superClusterName + "_end"
    val (currentFixPointStrategies, removedCurrentFixPointStrategies) = fixPointStrategies.partition(_.startsWith(clusterFixPointNameStart))
    // fixPointsForSuperClusterStrategies is the fixpoint for the current superCluster FIXME: go higher even when there is no local cluster up there
    val currentSuperClusterStrategies = currentFixPointStrategies.map(name => FixPointStrategy(Union(Identity, Try(DeclaredStrategyInstance(name)))): NonVariableStrategy)
    if (maxCluster == 1) {
      if (cluster2localStrategies.size == 1 && cluster2localStrategies.head._1 == 0)
        ClusterDef.fixPointFor(0)(clusterFixpointStrategy(sClusterLevel, cluster2localStrategies.head._1, cluster2localStrategies.head._2).get, Identity)
      else Identity
    } else {
      assert(maxCluster != 0)
      val splitNumber = if (closestPowerOfTwo(maxCluster) == maxCluster) maxCluster / 2 else closestPowerOfTwo(maxCluster)
      val (map1, map2) = cluster2localStrategies.partition(e => e._1 < splitNumber)
      val (filteredMap1, filteredMap2) = (
        map1, map2.map(e => (e._1 - splitNumber, e._2)))
      // innerFixPoint has to be done in the sub clusters of this superSluster

      val innerFixPoint = if (fixPointStrategies.filter(_.startsWith("__fixpoint_" + superClusterName)).isEmpty && cluster2localStrategies.isEmpty) Identity else
        SClusterDef.fixPointFor(0)(FixPointStrategy(Union(Identity, recursiveSuperClusterFixPointStrategy(sClusterLevel, filteredMap1, removedCurrentFixPointStrategies, splitNumber, superClusterName + "0"))),
          SClusterDef.fixPointFor(1)(FixPointStrategy(Union(Identity, recursiveSuperClusterFixPointStrategy(sClusterLevel, filteredMap2, removedCurrentFixPointStrategies, maxCluster - splitNumber, superClusterName + "1"))), Identity))
      if (currentFixPointStrategies.isEmpty) {
        innerFixPoint
      } else {
        Union(currentSuperClusterStrategies.reduceLeft(Union(_, _)), innerFixPoint)
      }
    }
  }

  def calculateTransitionForRecursiveSuperCluster(transition: Transition, superClusterSize: Int)(implicit cs: ComputationState) = {
    val strategyList = createListOfStrategiesForClusters(transition.inputArcs, transition.outputArcs)
    val strategyBody = getMinimalRecursiveStrategy(strategyList, superClusterSize)
    val name = "__fixpoint_" + getMinimalRecursiveStrategyName(strategyList, superClusterSize) + "_" + transition.name
    saveStrategyWithName(name, strategyBody, false)
  }
}