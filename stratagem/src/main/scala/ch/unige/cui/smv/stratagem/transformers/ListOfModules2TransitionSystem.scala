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

import ch.unige.cui.smv.metamodel.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.util.StrategyMapKeyWrapper
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.util.StrategyDSL._
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT
import ch.unige.cui.smv.metamodel.ts.Strategy
import ch.unige.cui.smv.stratagem.transformers.SetOfModules2TransitionSystem.CLUSTER_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.SetOfModules2TransitionSystem.ENDCLUSTER
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT.PLACE_SORT_NAME
import ch.unige.smv.cui.metamodel.adt.Operation
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import ch.unige.smv.cui.metamodel.adt.Signature
import ch.unige.cui.smv.stratagem.adt.PredefADT.NAT_SORT_NAME
import ch.unige.smv.cui.metamodel.adt.ADT
import ch.unige.cui.smv.metamodel.ts.TsFactory
import ch.unige.smv.cui.metamodel.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.PredefADT
import ch.unige.cui.smv.metamodel.ts.VariableStrategy
import ch.unige.cui.smv.metamodel.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.transformers.AdtHelper.createAdt
import ch.unige.cui.smv.stratagem.transformers.AdtHelper.createInitialState
import ch.unige.cui.smv.stratagem.transformers.AdtHelper.term
import ch.unige.cui.smv.stratagem.adt.ATermHelper.term2RichTerm
import ch.unige.cui.smv.stratagem.petrinets.Transition
import ch.unige.cui.smv.stratagem.adt.PredefADT.define
import ch.unige.cui.smv.stratagem.petrinets.Arc
import com.typesafe.scalalogging.slf4j.Logging
import RecursiveHelper.calculateTransitionForRecursiveSuperCluster
import scala.collection.mutable

/**
 * @author mundacho
 *
 */
object ListOfModules2TransitionSystem extends Logging with ((List[List[List[Place]]], Set[Int], PetriNet) => TransitionSystem) {

  type ClusterType = List[Place]
  type SuperClusterType = List[ClusterType]

  val SUPER_CLUSTER_SORT_NAME = "scluster"
  val END_SUPERCLUSTER = "endscluster"

  case class ComputationState(
    ts: TransitionSystem,
    strat2Name: mutable.Map[StrategyMapKeyWrapper, String],
    place2Position: Map[Place, (Int, Int, Int)])

  abstract class StructureDef {
    def checkBiggerThanName: String
    def checkForName: String
    def applyForName: String
    def fixpointName: String
    def localStratName: String
    def levelStratName: String
    def prefix: String
    def $var(implicit adt: ADT): ATerm
    def $containedVar(implicit adt: ADT): ATerm
    def checkFor(i: Int) = DeclaredStrategyInstance(checkForName + i)
    def checkBiggerThan(i: Int) = DeclaredStrategyInstance(checkBiggerThanName + i)
    def applyFor(i: Int)(S: => Strategy, Q: => Strategy) = DeclaredStrategyInstance(s"${applyForName}$i", S, Q)
    def fixPointFor(i: Int)(S: => Strategy, Q: => Strategy) = DeclaredStrategyInstance(s"${fixpointName}$i", S, Q)
  }

  case object SClusterDef extends StructureDef {
    override val checkBiggerThanName = "checkBiggerThanSCluster"
    override val checkForName = "checkForSCluster"
    override val applyForName = "applyForSCluster"
    override val fixpointName = "SClusterFixPointAndThen"
    override val localStratName = "localSCluster"
    override val levelStratName = "levelSCluster"
    override val prefix = "sc"
    override def $var(implicit adt: ADT) = term("sc")
    override def $containedVar(implicit adt: ADT) = term("c")
    def levelStrat(sClusterLevel: Int) = DeclaredStrategyInstance(levelStratName + s"_${sClusterLevel}")
  }

  case object ClusterDef extends StructureDef {
    override val checkBiggerThanName = "checkBiggerThanCluster"
    override val checkForName = "checkForCluster"
    override val applyForName = "applyForCluster"
    override val fixpointName = "ClusterFixPointAndThen"
    override val localStratName = "localCluster"
    override val levelStratName = "levelCluster"
    override val prefix = "c"
    override def $var(implicit adt: ADT) = term("c")
    override def $containedVar(implicit adt: ADT) = term("p")
    def levelStrat(sClusterLevel: Int, clusterLevel: Int) = DeclaredStrategyInstance(levelStratName + s"_${sClusterLevel}_${clusterLevel}")
  }

  case object PlaceDef extends StructureDef {
    override val checkBiggerThanName = "checkBiggerThanPlace"
    override val checkForName = "checkForPlace"
    override val applyForName = "applyForPlace"
    override val levelStratName = "levelPlace"
    override def fixpointName = throw new IllegalAccessError("Should not  create a fixpoint for places")
    override def localStratName = throw new IllegalAccessError("Should not  create a local strat for places")
    override val prefix = "p"
    override def $var(implicit adt: ADT) = term("p")
    override def $containedVar(implicit adt: ADT) = term("x")
    def levelStrat(sClusterLevel: Int, clusterLevel: Int, placeLevel: Int) = DeclaredStrategyInstance(levelStratName + s"_${sClusterLevel}_${clusterLevel}_${placeLevel}")
  }

  /**
   * Takes a list of petri net modules and transforms it to a transition system.
   * @param modules a list of super cluster. A super cluster is a list of clusters. A cluster is a list of places.
   * @param recursiveSet recursive set is the set of super clusters that are going to be encoded recursively.
   * @param net the original petri net that was transformed into modules.
   * @return a transition system for stratagem that calculates the state space of in input net.
   */
  def apply(modules: List[SuperClusterType], recursiveSet: Set[Int], net: PetriNet): TransitionSystem = {
    implicit val (adt, usefulVariables) = createAdt(modules, net)
    val (placeToSClusterClusterPosition, maxSClusters, maxClusters, maxPlaces) = usefulVariables
    implicit val ts = TsFactory.eINSTANCE.createTransitionSystem()
    ts.setAdt(adt)
    ts.setInitialState(createInitialState(modules, recursiveSet)(term(END_SUPERCLUSTER)))
    // add the check functions
    for (i <- 0 to maxSClusters) {
      addCheckFunction(SClusterDef)(i)
      addCheckBiggerFunction(SClusterDef)(i, maxSClusters)
      addApplyForStrategies(SClusterDef)(i)
      addFixPointStrategies(SClusterDef)(i)
    }
    for (i <- 0 to maxClusters) {
      addCheckFunction(ClusterDef)(i)
      addCheckBiggerFunction(ClusterDef)(i, maxClusters)
      addApplyForStrategies(ClusterDef)(i)
      addFixPointStrategies(ClusterDef)(i)
    }
    for (i <- 0 to maxPlaces) {
      addCheckFunction(PlaceDef)(i)
      addCheckBiggerFunction(PlaceDef)(i, maxPlaces)
      addApplyForStrategies(PlaceDef)(i)
    }
    val recursiveToSize = Map(recursiveSet.toList.view.map(n => (n -> modules(n).size)): _*)

    implicit val computationState = ComputationState(ts, mutable.Map[StrategyMapKeyWrapper, String](), placeToSClusterClusterPosition)
    // we create the strategies for the transitions
    val sCluster2Cluster = mutable.Map[Int, mutable.Map[Int, Set[(Int, String)]]]()
    val sClusterLevel2Transition = mutable.Map[Int, Set[String]]()
    for (transition <- net.transitions) {
      val placesGroupedBySuperClusters = transition.arcs.groupBy(a => computationState.place2Position(a.place)._1);
      val placesGroupedByClusters = transition.arcs.groupBy(a => computationState.place2Position(a.place)._2);
      val minimalPlace = transition.arcs.groupBy(a => computationState.place2Position(a.place)._3).keys.toList.sortWith(_ < _).head;
      val minimalClusterOrPlace = if (placesGroupedByClusters.keys.size == 1) minimalPlace else placesGroupedByClusters.keys.toList.sortWith(_ < _).head;
      // we give a normal name to the strategy
      val strategyName = if (placesGroupedBySuperClusters.keys.size == 1) { // the transition spans just one scluster
        if (placesGroupedByClusters.keys.size == 1) { // transition spans one cluster 
          val strategyBody = chainStrategiesFor(PlaceDef, arc2Strategies(transition.inputArcs, transition.outputArcs))
          saveStrategyWithName(transition.name, strategyBody, false)
        } else if (placesGroupedByClusters.keys.size > 1) { // more than one
          val superCluster = placesGroupedBySuperClusters.keys.head
          if (recursiveToSize.keySet contains superCluster) { // if this is a recursive cluster, we create a special strategy for it.
            RecursiveHelper.calculateTransitionForRecursiveSuperCluster(transition, recursiveToSize(superCluster))
          } else {
            val strategyList = createListOfStrategiesForClusters(transition.inputArcs, transition.outputArcs)
            val strategyBody = chainStrategiesFor(ClusterDef, strategyList)
            saveStrategyWithName(transition.name, strategyBody, false)
          }
        } else throw new IllegalStateException
      } else { // multi super clustered transition
        val strategyList = createListOfStrategiesForSuperClusters(transition.inputArcs, transition.outputArcs, recursiveToSize)
        val strategyBody = chainStrategiesFor(SClusterDef, strategyList)
        sClusterLevel2Transition(strategyList.map(_._2).min) = sClusterLevel2Transition.getOrElse(strategyList.map(_._2).min, Set()) + transition.name
        saveStrategyWithName(transition.name, strategyBody, false)
      }
      // we put the strategy in a map
      val superCluster = placesGroupedBySuperClusters.keys.head
      if ((placesGroupedBySuperClusters.keys.size == 1) && (placesGroupedByClusters.keys.size == 1)) { // it is only in one cluster
        val cluster = placesGroupedByClusters.keys.head
        val subMap = sCluster2Cluster.getOrElseUpdate(superCluster, mutable.Map[Int, Set[(Int, String)]]())
        subMap(cluster) = subMap.getOrElseUpdate(cluster, Set()) + Tuple2(minimalClusterOrPlace, strategyName)
      } else if ((placesGroupedBySuperClusters.keys.size == 1) && (placesGroupedByClusters.keys.size > 1)) {
        val superCluster = placesGroupedBySuperClusters.keys.head
        val subMap = sCluster2Cluster.getOrElseUpdate(superCluster, mutable.Map[Int, Set[(Int, String)]]())
        subMap(-1) = subMap.getOrElseUpdate(-1, Set()) + Tuple2(minimalClusterOrPlace, strategyName) // transitions spanning several clusters go to the -1
      }
    }

    val possibleSClusterLevels = (sCluster2Cluster.keys ++ sClusterLevel2Transition.keys).toSet // to set to remove duplicates
    var lastCalculatedSClusterLevel = possibleSClusterLevels.max
    for (sClusterLevel <- possibleSClusterLevels.toList.sortWith(_ > _)) yield {
      val sClusterLevelName = SClusterDef.levelStratName + s"_${sClusterLevel}"
      val possibleClusterLevels = ((sCluster2Cluster.getOrElse(sClusterLevel, Map()).keys ++ sCluster2Cluster.getOrElse(sClusterLevel, Map[Int, Map[Int, String]]()).getOrElse(-1, Map[Int, String]()).map(_._1)).filter(_ != -1)).toSet // to set to remove duplicates
      var lastCalculatedClusterLevel = if (possibleClusterLevels.isEmpty) 0 else possibleClusterLevels.max
      val distance2nextSClusterLevel = lastCalculatedSClusterLevel - sClusterLevel
      val superClusterFixPointStrat = if (possibleClusterLevels.isEmpty) {
        None
      } else if (recursiveSet contains sClusterLevel) { // we have a recursive scluster
        // there are transitions in this cluster since possibleClusterLevels is not empty
        Some(RecursiveHelper.recursiveSuperClusterFixPointStrategy(sClusterLevel, sCluster2Cluster(sClusterLevel) - (-1), if (sCluster2Cluster(sClusterLevel).isDefinedAt(-1)) sCluster2Cluster(sClusterLevel)(-1).map(_._2) else Set(), recursiveToSize(sClusterLevel), ""))
      } else {
        for (clusterLevel <- possibleClusterLevels.toList.sortWith(_ > _)) yield {
          val clusterLevelName = ClusterDef.levelStratName + s"_${sClusterLevel}_${clusterLevel}"
          val distance2nextClusterLevel = lastCalculatedClusterLevel - clusterLevel
          val fixPointStratForThisLevel = for (
            setOfTuples <- sCluster2Cluster(sClusterLevel).lift(clusterLevel);
            result <- clusterFixpointStrategy(sClusterLevel, clusterLevel, setOfTuples)
          ) yield result
          val clusterLevelStrategies = sCluster2Cluster(sClusterLevel).getOrElse(-1, Set()).filter(_._1 == clusterLevel)
          val clusterLevelStrat = if (clusterLevelStrategies.isEmpty) None else Some(clusterLevelStrategies.map(e => Union(Identity, Try(DeclaredStrategyInstance(e._2)))).reduce((a, b) => Union(a, b)))
          if (fixPointStratForThisLevel == None && clusterLevelStrat == None) None
          else {
            val currentClusterStrat = if (clusterLevelStrat == None) {
              Union(Identity, One(fixPointStratForThisLevel.get, 1))
            } else if (fixPointStratForThisLevel == None) {
              Union(Identity, clusterLevelStrat.get)
            } else {
              Union(Union(Identity, One(fixPointStratForThisLevel.get, 1)), clusterLevelStrat.get)
            }
            if (distance2nextClusterLevel == 0) { // this is the last strategy
              declareStrategy(clusterLevelName) {
                currentClusterStrat
              }(false)
            } else {
              def nextClusterStrat = (for (i <- 0 to (distance2nextClusterLevel - 1)) yield (s: Strategy) => One(s, 2): NonVariableStrategy).reduce(_ compose _)(FixPointStrategy(ClusterDef.levelStrat(sClusterLevel, lastCalculatedClusterLevel)))
              declareStrategy(clusterLevelName) {
                Sequence(Sequence(nextClusterStrat, currentClusterStrat), Union(Identity, nextClusterStrat))
              }(false)
            }
            lastCalculatedClusterLevel = clusterLevel
          }
        }
        if (lastCalculatedClusterLevel == 0) Some(FixPointStrategy(Union(Identity, ClusterDef.levelStrat(sClusterLevel, lastCalculatedClusterLevel))))
        else Some((for (i <- 0 to (lastCalculatedClusterLevel - 1)) yield (s: Strategy) => One(s, 2): NonVariableStrategy).reduce(_ compose _)(FixPointStrategy(Union(Identity, ClusterDef.levelStrat(sClusterLevel, lastCalculatedClusterLevel)))))
      }
      val superClusterLevelStrat = sClusterLevel2Transition.lift(sClusterLevel) match {
        case None => None
        case Some(strategyNames) => Some(strategyNames.map(name => Union(Identity, Try(DeclaredStrategyInstance(name)))).reduce((a, b) => Union(a, b)))
      }
      val currentSClusterStrat = if (superClusterLevelStrat == None) {
        Union(Identity, One(superClusterFixPointStrat.get, 1))
      } else if (superClusterFixPointStrat == None) {
        Union(Identity, superClusterLevelStrat.get)
      } else {
        Union(Union(Identity, One(superClusterFixPointStrat.get, 1)), superClusterLevelStrat.get)
      }
      if (distance2nextSClusterLevel == 0) { // this is the last strategy
        declareStrategy(sClusterLevelName) {
          currentSClusterStrat
        }(false)
      } else {
        def nextSClusterStrat = (for (i <- 0 to (distance2nextSClusterLevel - 1)) yield (s: Strategy) => One(s, 2): NonVariableStrategy).reduce(_ compose _)(FixPointStrategy(SClusterDef.levelStrat(lastCalculatedSClusterLevel)))
        declareStrategy(sClusterLevelName) {
          Sequence(Sequence(nextSClusterStrat, currentSClusterStrat), Union(Identity, nextSClusterStrat))
        }(false)
        lastCalculatedSClusterLevel = sClusterLevel
      }
    }

    val startingSClusterStrategy = if (lastCalculatedSClusterLevel == 0) FixPointStrategy(Union(Identity, SClusterDef.levelStrat(0)))
    else (for (i <- 0 to (lastCalculatedSClusterLevel - 1)) yield (s: Strategy) => One(s, 2): NonVariableStrategy).reduce(_ compose _)(FixPointStrategy(Union(Identity, SClusterDef.levelStrat(lastCalculatedSClusterLevel))))
    declareStrategy("superClusterSaturation") {
      Sequence(SClusterDef.checkFor(0), startingSClusterStrategy)
    }(true)
    ts
  }

  def createListOfStrategiesForSuperClusters(inputArcs: Set[Arc], outputArcs: Set[Arc], recursiveSetToSize: Map[Int, Int])(implicit cs: ComputationState): List[(NonVariableStrategy, Int)] = {
    val groupedArcs = (inputArcs ++ outputArcs).groupBy(a => cs.place2Position(a.place)._1)
    for (superClusterIndex <- groupedArcs.keySet.toList.sortWith(_ < _)) yield {
      val (iArcs, oArcs) = groupedArcs(superClusterIndex) partition (a => inputArcs.contains(a))
      val listOfStrategiesForClusters = createListOfStrategiesForClusters(iArcs, oArcs)
      if (recursiveSetToSize.keySet contains superClusterIndex)
        (RecursiveHelper.chainRecursiveStrategiesForClusters(listOfStrategiesForClusters, recursiveSetToSize(superClusterIndex)), superClusterIndex)
      else
        (chainStrategiesFor(ClusterDef, listOfStrategiesForClusters), superClusterIndex)
    }
  }

  def createListOfStrategiesForClusters(inputArcs: Set[Arc], outputArcs: Set[Arc])(implicit cs: ComputationState): List[(NonVariableStrategy, Int)] = {
    val groupedArcs = (inputArcs ++ outputArcs).groupBy(a => cs.place2Position(a.place)._2)
    for (clusterIndex <- groupedArcs.keySet.toList.sortWith(_ < _)) yield {
      val (iArcs, oArcs) = groupedArcs(clusterIndex).partition(a => inputArcs.contains(a))
      (chainStrategiesFor(PlaceDef, arc2Strategies(iArcs, oArcs)), clusterIndex)
    }
  }

  def saveStrategyWithName(name: String, strategy: NonVariableStrategy, isTransition: Boolean)(implicit cs: ComputationState): String = {
    implicit val ts = cs.ts
    declareStrategy(name) { strategy }(isTransition)
    cs.strat2Name.put(StrategyMapKeyWrapper(strategy), name)
    name
  }

  def chainStrategiesFor(structure: StructureDef, strategies: List[(NonVariableStrategy, Int)]): NonVariableStrategy = strategies match {
    case Nil => Identity
    case (strat, n) :: tail =>
      structure.applyFor(n)(strat, chainStrategiesFor(structure, tail))
  }

  private def inputArcStrategyBody(arc: Arc)(implicit cs: ComputationState): NonVariableStrategy = {
    implicit val adt = cs.ts.getAdt()
    val placeId = s"p${cs.place2Position(arc.place)._3}"
    SimpleStrategy(
      (term(placeId, define(arc.annotation, term("x"), adt), term("p")) ->
        term(placeId, term("x"), term("p")) :: Nil))
  }

  private def outputArcStrategyBody(arc: Arc)(implicit cs: ComputationState): NonVariableStrategy = {
    implicit val adt = cs.ts.getAdt()
    val placeId = s"p${cs.place2Position(arc.place)._3}"
    SimpleStrategy(
      (term(placeId, term("x"), term("p")) ->
        term(placeId, define(arc.annotation, term("x"), adt), term("p")) :: Nil))
  }

  def arc2Strategies(inputArcs: Set[Arc], outputArcs: Set[Arc])(implicit cs: ComputationState) = {
    val groupedArcs = (inputArcs ++ outputArcs).groupBy(a => cs.place2Position(a.place)._3)
    for (arcIndex <- groupedArcs.keySet.toList.sortWith(_ < _)) yield {
      if (groupedArcs(arcIndex).size == 1) {
        val a = groupedArcs(arcIndex).head
        if (inputArcs.contains(a)) (inputArcStrategyBody(a), arcIndex) else
          (outputArcStrategyBody(a), cs.place2Position(a.place)._3)
      } else { // we have several arcs for the same place
        val (iArcs, oArcs) = groupedArcs(arcIndex).partition(inputArcs.contains)
        (Sequence(iArcs.map(inputArcStrategyBody).reduceLeft(Sequence(_, _)), oArcs.map(outputArcStrategyBody).reduceLeft(Sequence(_, _))), arcIndex)
      }
    }
  }

  def addFixPointStrategies(structure: StructureDef)(i: Int)(implicit ts: TransitionSystem) =
    // we declare the applyForClusterStrategy
    declareStrategy(s"${structure.fixpointName}$i", S, Q) {
      IfThenElse(
        structure.checkFor(i),
        Union(Try(One(S, 1)), Try(One(Q, 2))), // if we are in the right cluster, apply the strategy
        IfThenElse(structure.checkBiggerThan(i),
          Fail,
          One(structure.fixPointFor(i)(S, Q), 2))) // else we enter the recursion only if we are not bigger than the cluster          
    }(false)

  def addApplyForStrategies(structure: StructureDef)(i: Int)(implicit ts: TransitionSystem) =
    // we declare the applyForClusterStrategy
    declareStrategy(s"${structure.applyForName}$i", S, Q) {
      IfThenElse(
        structure.checkFor(i),
        Sequence(
          structure match {
            case PlaceDef => S
            case _ => One(S, 1)
          },
          One(Q, 2)), // if we are in the right structure, apply the strategy
        IfThenElse(structure.checkBiggerThan(i),
          Fail,
          One(structure.applyFor(i)(S, Q), 2))) // else we enter the recursion only if we are not bigger than the cluster          
    }(false)

  def addCheckFunction(structure: StructureDef)(i: Int)(implicit ts: TransitionSystem) {
    implicit val adt = ts.getAdt()
    declareStrategy(structure.checkForName + i) { SimpleStrategy((term(s"${structure.prefix}$i", structure.$containedVar, structure.$var) -> term(s"${structure.prefix}$i", structure.$containedVar, structure.$var)) :: Nil) }(false)
  }

  def addCheckBiggerFunction(structure: StructureDef)(i: Int, maxElt: Int)(implicit ts: TransitionSystem) {
    implicit val adt = ts.getAdt()
    declareStrategy(structure.checkBiggerThanName + i) {
      if (i == maxElt) Fail else
        Choice(structure.checkFor(i + 1), structure.checkBiggerThan(i + 1))
    }(false)
  }

  /**
   * Returns a transition system with a new declared strategy.
   * @param label the name of the declared strategy.
   * @param isTransition true if the declared strategy is going to be used as a transition.
   * @param params the list of parameters that it uses.
   * @param body the body of the declared strategy.
   */
  def declareStrategy(label: String, params: VariableStrategy*)(body: NonVariableStrategy)(isTransition: Boolean)(implicit ts: TransitionSystem) = {
    val declaredStrat = TsFactory.eINSTANCE.createDeclaredStrategy()
    declaredStrat.setName(label)
    for (param <- params) declaredStrat.getFormalParams().add(param)
    declaredStrat.setBody(body)
    if (isTransition) ts.getTransitions().add(declaredStrat)
    else ts.getAuxiliary().add(declaredStrat)
  }

  /**
   * A variable strategy to be used later.
   */
  def S = {
    val strat = TsFactory.eINSTANCE.createVariableStrategy()
    strat.setName("S")
    strat
  }
  /**
   * A variable strategy to be used later.
   */
  def Q = {
    val strat = TsFactory.eINSTANCE.createVariableStrategy()
    strat.setName("Q")
    strat
  }

  private[transformers] def clusterFixpointStrategy(sClusterLevel: Int, clusterLevel: Int, setOfTuples: Set[(Int, String)])(implicit ts: TransitionSystem) = {
    val groupedStrategies = setOfTuples.groupBy(_._1)
    var lastCalculatedPlaceLevel = groupedStrategies.keys.max
    for (placeLevel <- groupedStrategies.keys.toList.sortWith(_ > _)) {
      val distance2nextPlaceLevel = lastCalculatedPlaceLevel - placeLevel
      val placeLevelName = PlaceDef.levelStratName + s"_${sClusterLevel}_${clusterLevel}_${placeLevel}"
      if (distance2nextPlaceLevel == 0) { // this is the last strategy
        declareStrategy(placeLevelName) {
          groupedStrategies(placeLevel).map(e => Union(Identity, Try(DeclaredStrategyInstance(e._2)))).reduce((a, b) => Union(a, b))
        }(false)
      } else {
        val currentStrat = groupedStrategies(placeLevel).map(e => Union(Identity, Try(DeclaredStrategyInstance(e._2)))).reduce((a, b) => Union(a, b))
        def nextPlaceStrat = (for (i <- 0 to (distance2nextPlaceLevel - 1)) yield (s: Strategy) => One(s, 2): NonVariableStrategy).reduce(_ compose _)(FixPointStrategy(PlaceDef.levelStrat(sClusterLevel, clusterLevel, lastCalculatedPlaceLevel)))
        declareStrategy(placeLevelName) {
          Sequence(Sequence(nextPlaceStrat, currentStrat), Union(Identity, nextPlaceStrat))
        }(false)
      }
      lastCalculatedPlaceLevel = placeLevel
    }
    if (lastCalculatedPlaceLevel == 0) Some(FixPointStrategy(Union(Identity, PlaceDef.levelStrat(sClusterLevel, clusterLevel, lastCalculatedPlaceLevel))))
    else Some((for (i <- 0 to (lastCalculatedPlaceLevel - 1)) yield (s: Strategy) => One(s, 2): NonVariableStrategy).reduce(_ compose _)(FixPointStrategy(Union(Identity, PlaceDef.levelStrat(sClusterLevel, clusterLevel, lastCalculatedPlaceLevel)))))
  }

}