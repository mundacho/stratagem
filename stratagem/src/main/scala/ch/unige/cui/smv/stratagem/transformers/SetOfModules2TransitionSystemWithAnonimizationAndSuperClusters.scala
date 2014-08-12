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

import scala.language.implicitConversions
import ch.unige.cui.smv.stratagem.ts.RichTransitionSystem
import com.typesafe.scalalogging.slf4j.Logging
import ch.unige.cui.smv.stratagem.adt.PredefADT
import ch.unige.cui.smv.stratagem.adt.PredefADT.NAT_SORT_NAME
import ch.unige.cui.smv.stratagem.adt.PredefADT.define
import ch.unige.cui.smv.stratagem.petrinets._
import ch.unige.cui.smv.stratagem.petrinets.Arc
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT.PLACE_SORT_NAME
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.petrinets.Transition
import ch.unige.cui.smv.stratagem.transformers.SetOfModules2TransitionSystem.CLUSTER_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.SetOfModules2TransitionSystem.ENDCLUSTER
import ch.unige.cui.smv.stratagem.transformers.beem.State
import ch.unige.smv.cui.metamodel.adt.ATerm
import ch.unige.smv.cui.metamodel.adt.Equation
import ch.unige.smv.cui.metamodel.adt.ADT
import ch.unige.cui.smv.stratagem.util.StrategyDSL._
import ch.unige.smv.cui.metamodel.adt.Signature
import ch.unige.cui.smv.stratagem.adt.ATermHelper.term2RichTerm
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import ch.unige.cui.smv.metamodel.ts.TsFactory
import ch.unige.cui.smv.metamodel.ts.TransitionSystem
import ch.unige.cui.smv.metamodel.ts.Strategy
import ch.unige.cui.smv.metamodel.ts.NonVariableStrategy

/**
 * This object creates represents a function that takes a set of super clusters, a petri net and some sets that are to be encoded recursively and
 * transforms them into a transition system that reflects that.
 * @author mundacho
 *
 */
object SetOfModules2TransitionSystemWithAnonimizationAndSuperClusters extends Logging with ((List[List[List[Place]]], Set[Int], PetriNet) => TransitionSystem) {

  type Cluster = List[Place]
  type SuperCluster = List[Cluster]
  // the calculation state contains the following elements:
  // 1.- transition system, 
  // 2.- map from strategies bodies as string to strategies names,
  // 3.- map from superCluster to strategies working on that super cluster
  // 4.- map place to position in clusters 
  type CalculationState = (TransitionSystem, Map[String, String], Map[Int, Map[Int, Set[String]]], Map[Place, (Int, Int, Int)])

  def ___Saturation(v: Strategy) = DeclaredStrategyInstance("___Saturation", v)

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

  val SUPER_CLUSTER_SORT_NAME = "scluster"
  val END_SUPERCLUSTER = "endscluster"

  /**
   * A convenience method.
   */
  def ApplyOnceAndThen(s1: Strategy, s2: Strategy) = DeclaredStrategyInstance("applyOnceAndThen", s1, s2)
  def ApplyOnce(s1: Strategy) = DeclaredStrategyInstance("applyOnce", s1)
  def ApplyToPlaceAndThen(s: Strategy, q: Strategy, n: Int) = DeclaredStrategyInstance(s"applyForPlace$n", s, q)
  def ApplyToSClusterAndThen(s: Strategy, q: Strategy, n: Int) = DeclaredStrategyInstance(s"applyForSCluster$n", s, q)
  def ApplyToClusterAndThen(s: Strategy, q: Strategy, n: Int) = DeclaredStrategyInstance(s"applyForCluster$n", s, q)
  def SuperClusterFixPointAndThen(s: Strategy, q: Strategy, n: Int) = DeclaredStrategyInstance(s"superClusterFixPointAndThen$n", s, q)
  def ClusterFixPointAndThen(s: Strategy, q: Strategy, n: Int) = DeclaredStrategyInstance(s"clusterFixPointAndThen$n", s, q)

  /**
   * The signature we use for clustered petri nets.
   */
  def basicSignature = PetriNetADT.basicPetriNetSignature
    .withSort(CLUSTER_SORT_NAME)
    .withSort(SUPER_CLUSTER_SORT_NAME, CLUSTER_SORT_NAME)
    .withGenerator(ENDCLUSTER, CLUSTER_SORT_NAME)
    .withGenerator(END_SUPERCLUSTER, SUPER_CLUSTER_SORT_NAME)

  /**
   * Creates a signature containing all the necessary terms for the superclusters.
   * @param s the signature where all the clusters will be created.
   * @param modules list of super clusters.
   * @return the signature containing all the necessary modules and places
   *
   */
  def createSignatureSuperClusters(modules: List[List[List[Place]]], s: Signature) = {
    val modSize = if (modules.size > 1) modules.size else 2
    (for (i <- 0 to modSize) yield (sign: Signature) => sign.withGenerator(s"sc$i", SUPER_CLUSTER_SORT_NAME, CLUSTER_SORT_NAME, SUPER_CLUSTER_SORT_NAME)).reduceLeft(_ compose _)(s)
  }

  private def buildSequenceOfDependentStrategiesMonadic(l: List[State[CalculationState, NonVariableStrategy]]): State[CalculationState, NonVariableStrategy] =
    if (l.isEmpty) State.insert(Identity) else
      (if (l.size == 1) (State.insert[CalculationState, NonVariableStrategy](Identity) :: l).reverse
      else (State.insert[CalculationState, NonVariableStrategy](Identity) :: l.reverse).reverse).reduceRight((s1, s2) => s1.flatMap(a => State(cs => {
        (ApplyOnceAndThen(a, s2.eval(cs)._2), cs)
      })))

  private def inputArcStrategy(arc: Arc): State[CalculationState, NonVariableStrategy] =
    State(cs => {
      val (ts, strat2Name, superCluster2Strategies, place2Position) = cs
      val placeId = s"p${place2Position(arc.place)._3}"
      val res = SimpleStrategy(
        (ts.getAdt().term(placeId, define(arc.annotation, ts.getAdt().term("x"), ts.getAdt()), ts.getAdt().term("p")) ->
          ts.getAdt().term(placeId, ts.getAdt().term("x"), ts.getAdt().term("p")) :: Nil))
      (res, cs)
    })

  private def outputArcStrategy(arc: Arc): State[CalculationState, NonVariableStrategy] =
    State(cs => {
      val (ts, strat2Name, superCluster2Strategies, place2Position) = cs
      val placeId = s"p${place2Position(arc.place)._3}"
      val res = SimpleStrategy(
        (ts.getAdt().term(placeId, ts.getAdt().term("x"), ts.getAdt().term("p")) ->
          ts.getAdt().term(placeId, define(arc.annotation, ts.getAdt().term("x"), ts.getAdt()), ts.getAdt().term("p")) :: Nil))
      (res, cs)
    })

  def transitionStrategy(transition: Transition, recursiveSetToSize: Map[Int, Int]): State[CalculationState, Unit] = for (
    cs <- State.get((cs: CalculationState) => cs);
    (ts, strat2Name, superCluster2Strategies, place2Position) = cs;
    placesGroupedBySuperClusters = transition.arcs.groupBy(a => place2Position(a.place)._1);
    placesGroupedByClusters = transition.arcs.groupBy(a => place2Position(a.place)._2);
    res <- calculateTransitionStrategy(transition, placesGroupedBySuperClusters, placesGroupedByClusters, recursiveSetToSize);
    (tranStrategy, isTransition) = res;
    _ <- addStrategyToClusteringMapAtPosition(tranStrategy, placesGroupedBySuperClusters.keys.head,
      if (placesGroupedByClusters.keys.size == 1) placesGroupedByClusters.keys.head else -1) if (!isTransition)
  ) yield ()

  def saveStrategyWithName(name: String, strategy: NonVariableStrategy, isTransition: Boolean): State[CalculationState, String] = State((cs: CalculationState) => {
    val (ts, strat2Name, superCluster2Strategies, place2Position) = cs
    if (name.startsWith("__fixpoint_")) {
      logger.trace(s"Did redefine strategy $name in order to have it as a fixpoint")
      (name,
        (ts.declareStrategy(name) { strategy }(isTransition),
          strat2Name + (strategy.toString -> name),
          superCluster2Strategies,
          place2Position))
    } else if (strat2Name.isDefinedAt(strategy.toString)) {
      logger.trace(s"Did not redefine strategy $name because it was already defined")
      (strat2Name(strategy.toString),
        (ts,
          strat2Name,
          superCluster2Strategies,
          place2Position))
    } else {
      (name,
        (ts.declareStrategy(name) { strategy }(isTransition),
          strat2Name + (strategy.toString -> name),
          superCluster2Strategies,
          place2Position))
    }
  })

  def addStrategyToClusteringMapAtPosition(tranStrategy: NonVariableStrategy, sClusterIndex: Int, clusterIndex: Int) = State((cs: CalculationState) => {
    val (ts, strat2Name, superCluster2Strategies, place2Position) = cs
    ((),
      (ts,
        strat2Name,
        superCluster2Strategies.updated(sClusterIndex,
          superCluster2Strategies.getOrElse(sClusterIndex, Map()).updated(
            clusterIndex, superCluster2Strategies.getOrElse(sClusterIndex, Map()).getOrElse(clusterIndex, Set()) + strat2Name(tranStrategy.toString))),
          place2Position))
  })

  private def inputArcStrategyBody(ts: TransitionSystem, placeToModuleAndPosition: Map[Place, (Int, Int, Int)])(arc: Arc): NonVariableStrategy = {
    val placeId = s"p${placeToModuleAndPosition(arc.place)._3}"
    SimpleStrategy(
      (ts.getAdt().term(placeId, define(arc.annotation, ts.getAdt().term("x"), ts.getAdt()), ts.getAdt().term("p")) ->
        ts.getAdt().term(placeId, ts.getAdt().term("x"), ts.getAdt().term("p")) :: Nil))
  }

  private def outputArcStrategyBody(ts: TransitionSystem, placeToModuleAndPosition: Map[Place, (Int, Int, Int)])(arc: Arc): NonVariableStrategy = {
    val placeId = s"p${placeToModuleAndPosition(arc.place)._3}"
    SimpleStrategy(
      (ts.getAdt().term(placeId, ts.getAdt().term("x"), ts.getAdt().term("p")) ->
        ts.getAdt().term(placeId, define(arc.annotation, ts.getAdt().term("x"), ts.getAdt()), ts.getAdt().term("p")) :: Nil))
  }

  def arc2Strategies(inputArcs: Set[Arc], outputArcs: Set[Arc], ts: TransitionSystem, place2Position: Map[Place, (Int, Int, Int)]) = {
    val groupedArcs = (inputArcs ++ outputArcs).groupBy(a => place2Position(a.place)._3)
    for (arcIndex <- groupedArcs.keySet.toList.sortWith(_ < _)) yield {
      if (groupedArcs(arcIndex).size == 1) {
        val a = groupedArcs(arcIndex).head
        if (inputArcs.contains(a)) (inputArcStrategyBody(ts, place2Position)(a), arcIndex) else
          (outputArcStrategyBody(ts, place2Position)(a), place2Position(a.place)._3)
      } else { // we have several arcs for the same place
        val (iArcs, oArcs) = groupedArcs(arcIndex).partition(inputArcs.contains)
        (Sequence(iArcs.map(inputArcStrategyBody(ts, place2Position)).reduceLeft(Sequence(_, _)), oArcs.map(outputArcStrategyBody(ts, place2Position)).reduceLeft(Sequence(_, _))), arcIndex)
      }
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
      ApplyToClusterAndThen(strategies.head._1, Identity, 0)
    } else {
      val divisionNumber = if (closestPowerOfTwo(maxCluster) == maxCluster) maxCluster / 2 else closestPowerOfTwo(maxCluster)
      val (list1, list2) = strategies partition (_._2 < divisionNumber)
      if (list1.isEmpty) ApplyToSClusterAndThen(chainRecursiveStrategiesForClusters(list2.map(e => (e._1, e._2 - divisionNumber)), maxCluster - divisionNumber), Identity, 1)
      else if (list2.isEmpty) ApplyToSClusterAndThen(chainRecursiveStrategiesForClusters(list1, divisionNumber), Identity, 0)
      else ApplyToSClusterAndThen(chainRecursiveStrategiesForClusters(list1, divisionNumber), ApplyToSClusterAndThen(chainRecursiveStrategiesForClusters(list2.map(e => (e._1, e._2 - divisionNumber)), maxCluster - divisionNumber), Identity, 1), 0)
    }
  }

  def getMinimalRecursiveStrategyName(strategies: List[(NonVariableStrategy, Int)], maxCluster: Int): String = {
    assert(strategies.size > 1)
    val divisionNumber = if (closestPowerOfTwo(maxCluster) == maxCluster) maxCluster / 2 else closestPowerOfTwo(maxCluster)
    val (list1, list2) = strategies partition (_._2 < divisionNumber)
    if (list1.isEmpty) "1" + getMinimalRecursiveStrategyName(list2.map(e => (e._1, e._2 - divisionNumber)), maxCluster - divisionNumber)
    else if (list2.isEmpty) "0" + getMinimalRecursiveStrategyName(list1, divisionNumber)
    else "_end"
  }

  def calculateTransitionStrategy(transition: Transition, placesGroupedBySuperClusters: Map[Int, Set[Arc]], placesGroupedByClusters: Map[Int, Set[Arc]], recursiveSetToSize: Map[Int, Int]): State[CalculationState, (NonVariableStrategy, Boolean)] =
    if (placesGroupedBySuperClusters.keys.size == 1) {
      if (placesGroupedByClusters.keys.size == 1) { // this transition is completely contained in one cluster
        for {
          cs <- State.get((cs: CalculationState) => cs)
          (ts, strat2Name, superCluster2Strategies, place2Position) = cs
          strategyBody = chainStrategiesForPlaces(arc2Strategies(transition.inputArcs, transition.outputArcs, ts, place2Position))
          normalName <- saveStrategyWithName(transition.name, strategyBody, false)
        } yield {
          (strategyBody, false)
        }
      } else if (placesGroupedByClusters.keys.size > 1) { // more than one
        val superCluster = placesGroupedBySuperClusters.keys.head
        if (recursiveSetToSize.keySet contains superCluster) {
          for {
            cs <- State.get((cs: CalculationState) => cs)
            (ts, strat2Name, superCluster2Strategies, place2Position) = cs
            strategyList = createListOfStrategiesForClusters(transition.inputArcs, transition.outputArcs, ts, place2Position)
            strategyBody = getMinimalRecursiveStrategy(strategyList, recursiveSetToSize(superCluster))
            name = "__fixpoint_" + getMinimalRecursiveStrategyName(strategyList, recursiveSetToSize(superCluster)) + "_" + transition.name
            normalName <- saveStrategyWithName(name, strategyBody, false)
          } yield (strategyBody, false)
        } else
          for {
            cs <- State.get((cs: CalculationState) => cs)
            (ts, strat2Name, superCluster2Strategies, place2Position) = cs
            strategyList = createListOfStrategiesForClusters(transition.inputArcs, transition.outputArcs, ts, place2Position)
            strategyBody = chainStrategiesForClusters(strategyList)
            normalName <- saveStrategyWithName(transition.name, strategyBody, false)
          } yield (strategyBody, false)
      } else {
        throw new IllegalStateException("Clusters must have at least one elt.")
      }
    } else { // multi super clustered transition
      for {
        cs <- State.get((cs: CalculationState) => cs)
        (ts, strat2Name, superCluster2Strategies, place2Position) = cs
        strategyList = createListOfStrategiesForSuperClusters(transition.inputArcs, transition.outputArcs, ts, place2Position, recursiveSetToSize)
        strategyBody = chainStrategiesForSuperClusters(strategyList)
        normalName <- saveStrategyWithName(transition.name, strategyBody, true)
      } yield {
        (strategyBody, true)
      }
    }

  def chainStrategiesForSuperClusters(strategies: List[(NonVariableStrategy, Int)]): NonVariableStrategy = strategies match {
    case Nil => Identity
    case (strat, n) :: tail =>
      ApplyToSClusterAndThen(strat, chainStrategiesForSuperClusters(tail), n)
  }

  def chainStrategiesForClusters(strategies: List[(NonVariableStrategy, Int)]): NonVariableStrategy = strategies match {
    case Nil => Identity
    case (strat, n) :: tail =>
      ApplyToClusterAndThen(strat, chainStrategiesForClusters(tail), n)
  }

  def chainStrategiesForPlaces(strategies: List[(NonVariableStrategy, Int)]): NonVariableStrategy = strategies match {
    case Nil => Identity
    case (strat, n) :: tail =>
      ApplyToPlaceAndThen(strat, chainStrategiesForPlaces(tail), n)
  }

  def createListOfStrategiesForSuperClusters(inputArcs: Set[Arc], outputArcs: Set[Arc], ts: TransitionSystem, place2Position: Map[Place, (Int, Int, Int)], recursiveSetToSize: Map[Int, Int]): List[(NonVariableStrategy, Int)] = {
    val groupedArcs = (inputArcs ++ outputArcs).groupBy(a => place2Position(a.place)._1)
    for (superClusterIndex <- groupedArcs.keySet.toList.sortWith(_ < _)) yield {
      val (iArcs, oArcs) = groupedArcs(superClusterIndex) partition (a => inputArcs.contains(a))
      val listOfStrategiesForClusters = createListOfStrategiesForClusters(iArcs, oArcs, ts, place2Position)
      if (recursiveSetToSize.keySet contains superClusterIndex)
        (chainRecursiveStrategiesForClusters(listOfStrategiesForClusters, recursiveSetToSize(superClusterIndex)), superClusterIndex)
      else
        (chainStrategiesForClusters(listOfStrategiesForClusters), superClusterIndex)
    }
  }

  def createListOfStrategiesForClusters(inputArcs: Set[Arc], outputArcs: Set[Arc], ts: TransitionSystem, place2Position: Map[Place, (Int, Int, Int)]): List[(NonVariableStrategy, Int)] = {
    val groupedArcs = (inputArcs ++ outputArcs).groupBy(a => place2Position(a.place)._2)
    for (clusterIndex <- groupedArcs.keySet.toList.sortWith(_ < _)) yield {
      val (iArcs, oArcs) = groupedArcs(clusterIndex).partition(a => inputArcs.contains(a))
      (chainStrategiesForPlaces(arc2Strategies(iArcs, oArcs, ts, place2Position)), clusterIndex)
    }
  }

  def arcStrategy(arc: Arc, arcStrategyB: (Arc => State[CalculationState, NonVariableStrategy])): State[CalculationState, NonVariableStrategy] = {
    for (
      strategyBody <- arcStrategyB(arc);
      res <- State((cs: CalculationState) => {
        val (ts, strat2Name, superCluster2Strategies, place2Position) = cs
        strat2Name.lift(strategyBody.toString) match {
          case None =>
            (DeclaredStrategyInstance(arc.id), (ts.declareStrategy(arc.id) { strategyBody }(false), strat2Name + (strategyBody.toString -> arc.id), superCluster2Strategies, place2Position))
          case Some(stratName) =>
            (DeclaredStrategyInstance(stratName), (ts, strat2Name, superCluster2Strategies, place2Position))
        }
      })
    ) yield res
  }

  /**
   * Takes a list of petri net modules and transforms it to a transition system.
   * @param modules a list of super cluster. A super cluster is a list of clusters. A cluster is a list of places.
   * @param recursiveSet recursive set is the set of super clusters that are going to be encoded recursively.
   * @param net the original petri net that was transformed into modules.
   * @return a transition system for stratagem that calculates the state space of in input net.
   */
  def apply(modules: List[SuperCluster], recursiveSet: Set[Int], net: PetriNet): TransitionSystem = {
    val initialModuleNumber = 0 // must be zero because of the indexes
    // creates a map that maps each place to its cluster p1 -> c1, p2 -> c1, pn -> cm, etc
    // we obtain a mapping from places to their super cluster, cluster and position
    val placeToSClusterClusterPosition = Map(modules.zipWithIndex.flatMap(e1 => e1._1.zipWithIndex.flatMap(e2 => e2._1.zipWithIndex.map(p => (p._1, (e1._2, e2._2, p._2))))).toArray: _*)
    val signWithSuperClusters = createSignatureSuperClusters(modules, basicSignature)
    // find max number of clusters per supercluster
    val maxClusters = modules.map(_.size).max
    // we create a function here
    val createSignWithClusters = ((for (i <- 0 to (maxClusters - 1)) yield (s: Signature) => s.withGenerator(s"c$i", CLUSTER_SORT_NAME, PLACE_SORT_NAME, CLUSTER_SORT_NAME)).reduceRight(_ compose _))
    val maxPlaces = (for (cluster <- modules; places <- cluster) yield places.size).max
    // here we also create a function
    val createSignWithPlaces = ((for (i <- 0 to (maxPlaces - 1)) yield (s: Signature) => s.withGenerator(s"p$i", PLACE_SORT_NAME, NAT_SORT_NAME, PLACE_SORT_NAME)).reduceRight(_ compose _))
    implicit val adt = { val a = AdtFactory.eINSTANCE.createADT(); a.setName(net.name); a.setSignature(createSignWithClusters(createSignWithPlaces(signWithSuperClusters))); a }
      .declareVariable("p", PLACE_SORT_NAME)
      .declareVariable("x", NAT_SORT_NAME)
      .declareVariable("c", CLUSTER_SORT_NAME)
      .declareVariable("sc", SUPER_CLUSTER_SORT_NAME)

    val initialTransitionSystem = TsFactory.eINSTANCE.createTransitionSystem() // new TransitionSystem(adt, createInitialState(modules, recursiveSet)(adt.term(END_SUPERCLUSTER)))
    initialTransitionSystem.setAdt(adt)
    initialTransitionSystem.setInitialState(createInitialState(modules, recursiveSet)(adt.term(END_SUPERCLUSTER)))

    initialTransitionSystem
      .declareStrategy("applyOnce", S)(Choice(S, One(ApplyOnce(S), 2)))(false)
      .declareStrategy("applyOnceAndThen", S, Q)(IfThenElse(S, One(Q, 2), One(ApplyOnceAndThen(S, Q), 2)))(false)
      .declareStrategy("___Saturation", S) {
        Sequence(
          Choice(
            One(___Saturation(S), 2),
            FixPointStrategy(S)),
          IfThenElse(FixPointStrategy(S), Identity, ___Saturation(S)))
      }(false)

    val recursiveToSize = Map(recursiveSet.toList.view.map(n => (n -> modules(n).size)): _*)

    val transSystemState = for {
      _ <- addApplyToSCluster(if (modules.size > 1) modules.size else 2)
      _ <- addApplyToCluster(maxClusters)
      _ <- addApplyToPlace(maxPlaces)
      _ <- addSuperClusterFixPointAndThen(if (modules.size > 1) modules.size else 2)
      _ <- addClusterFixPointAndThen(maxClusters)
    } yield ()

    val computationInitialState = (
      transSystemState.eval(initialTransitionSystem)._1,
      Map[String, String](),
      Map[Int, Map[Int, Set[String]]](),
      placeToSClusterClusterPosition)

    val computation = (for (
      _ <- calculateTransitionSystem(net.transitions, recursiveToSize);
      _ <- calculateSClusterSaturationStrategies(recursiveToSize)
    ) yield ())
    computation.eval(computationInitialState)._1._1
  }

  def calculateSClusterSaturationStrategies(recursiveSetToSize: Map[Int, Int]): State[CalculationState, Unit] = for {
    cs <- State.get((cs: CalculationState) => cs)
    (ts, strat2Name, superCluster2LocalStrategies, place2Position) = cs
    strategyBody = createFixpointStrategieForSuperClusters(superCluster2LocalStrategies, recursiveSetToSize)
    _ <- saveStrategyWithName("superClusterSaturationStrategy", strategyBody, true)
  } yield ()

  def recursiveSuperClusterFixPointStrategy(cluster2localStrategies: Map[Int, Set[String]], fixPointStrategies: Set[String], maxCluster: Int, superClusterName: String): NonVariableStrategy = {
    val clusterFixPointNameStart = "__fixpoint_" + superClusterName + "_end"
    val (currentFixPointStrategies, removedCurrentFixPointStrategies) = fixPointStrategies.partition(_.startsWith(clusterFixPointNameStart))
    // fixPointsForSuperClusterStrategies is the fixpoint for the current superCluster FIXME: go higher even when there is no local cluster up there
    val currentSuperClusterStrategies = currentFixPointStrategies.map(name => FixPointStrategy(Union(Identity, Try(DeclaredStrategyInstance(name)))): NonVariableStrategy)
    if (maxCluster == 1) {
      if (cluster2localStrategies.size == 1 && cluster2localStrategies.head._1 == 0)
        ClusterFixPointAndThen(clusterFixPointStrategy(cluster2localStrategies.head._2), Identity, 0)
      else Identity
    } else {
      assert(maxCluster != 0)
      val splitNumber = if (closestPowerOfTwo(maxCluster) == maxCluster) maxCluster / 2 else closestPowerOfTwo(maxCluster)
      val (map1, map2) = cluster2localStrategies.partition(e => e._1 < splitNumber)
      val (filteredMap1, filteredMap2) = (
        map1, map2.map(e => (e._1 - splitNumber, e._2)))
      // innerFixPoint has to be done in the sub clusters of this superSluster

      val innerFixPoint = if (fixPointStrategies.filter(_.startsWith("__fixpoint_" + superClusterName)).isEmpty && cluster2localStrategies.isEmpty) Identity else
        SuperClusterFixPointAndThen(FixPointStrategy(Union(Identity, recursiveSuperClusterFixPointStrategy(filteredMap1, removedCurrentFixPointStrategies, splitNumber, superClusterName + "0"))),
          SuperClusterFixPointAndThen(FixPointStrategy(Union(Identity, recursiveSuperClusterFixPointStrategy(filteredMap2, removedCurrentFixPointStrategies, maxCluster - splitNumber, superClusterName + "1"))), Identity, 1), 0)
      if (currentFixPointStrategies.isEmpty) {
        innerFixPoint
      } else {
        Union(currentSuperClusterStrategies.reduceLeft(Union(_, _)), innerFixPoint)
      }
    }
  }

  def createFixpointStrategieForSuperClusters(superCluster2LocalStrategies: Map[Int, Map[Int, Set[String]]], recursiveSetToSize: Map[Int, Int]): NonVariableStrategy = {
    val listOfSuperClusterFixPointStrategies = for (superClusterIndex <- superCluster2LocalStrategies.keys.toList.sortWith(_ < _)) yield {
      val strat = if (recursiveSetToSize.keySet contains superClusterIndex) {
        recursiveSuperClusterFixPointStrategy(superCluster2LocalStrategies(superClusterIndex) - (-1),
          if (superCluster2LocalStrategies(superClusterIndex).isDefinedAt(-1)) superCluster2LocalStrategies(superClusterIndex)(-1) else Set(), recursiveSetToSize(superClusterIndex), "")
      } else {
        superClusterFixPointStrategy(superCluster2LocalStrategies(superClusterIndex))
      }
      (FixPointStrategy(Union(strat, Identity)), superClusterIndex)
    }
    chainSuperClusterFixPointStrategies(listOfSuperClusterFixPointStrategies)
  }

  def superClusterFixPointStrategy(cluster2localStrategies: Map[Int, Set[String]]): NonVariableStrategy = {
    // for each cluster in the super cluster we are treating we get a fixpoint strategy that works only in that cluster
    val listOfClusterFixPointStrategies = for (clusterIndex <- cluster2localStrategies.keys.toList.sortWith(_ < _) if (clusterIndex != -1)) yield (clusterFixPointStrategy(cluster2localStrategies(clusterIndex)), clusterIndex)
    if (cluster2localStrategies.isDefinedAt(-1)) {
      val superClusterStrategies: NonVariableStrategy = (for (stratName <- cluster2localStrategies(-1)) yield FixPointStrategy(Union(Identity, Try(DeclaredStrategyInstance(stratName)))): NonVariableStrategy).reduceLeft((a, b) => Union(a, b))
      ___Saturation(Union(Identity, Union(chainClusterFixPointStrategies(listOfClusterFixPointStrategies), superClusterStrategies)))
    } else
      FixPointStrategy(Union(Identity, chainClusterFixPointStrategies(listOfClusterFixPointStrategies)))
  }
  // TODO check if its better
  def clusterFixPointStrategy(strategyNames: Set[String]): NonVariableStrategy = {
    FixPointStrategy(Union(Identity, strategyNames.map(a => ___Saturation(Union(Identity, Try(DeclaredStrategyInstance(a)))): NonVariableStrategy).reduceLeft((a, b) => Union(a, b))))
  }

  def chainClusterFixPointStrategies(strategies: List[(NonVariableStrategy, Int)]): NonVariableStrategy = strategies match {
    case Nil => Identity
    case (strat, n) :: tail => ClusterFixPointAndThen(strat, chainClusterFixPointStrategies(tail), n)
  }

  def chainSuperClusterFixPointStrategies(strategies: List[(NonVariableStrategy, Int)]): NonVariableStrategy = strategies match {
    case Nil => Identity
    case (strat, n) :: tail => //Choice(
      SuperClusterFixPointAndThen(strat, chainSuperClusterFixPointStrategies(tail), n)
    //        , chainSuperClusterFixPointStrategies(tail))
  }

  def calculateTransitionSystem(transitions: Set[Transition], recursiveSetToSize: Map[Int, Int]): State[CalculationState, Unit] =
    transitions.map(t => transitionStrategy(t, recursiveSetToSize)).reduceLeft((s1, s2) => s1.flatMap(_ => s2))

  def createInitialStatePlaces(places: Cluster)(endTerm: ATerm)(implicit adt: ADT) =
    ((for (placesWithIndex <- places.zipWithIndex) yield (t: ATerm) => adt.term(s"p${placesWithIndex._2}", PredefADT.define(placesWithIndex._1.initialMarking, adt.term(PredefADT.ZERO), adt), t)).reduceLeft(_ compose _))(endTerm)

  def createInitialStateClusters(clusters: List[Cluster])(endTerm: ATerm)(implicit adt: ADT) =
    ((for (clustersWithIndex <- clusters.zipWithIndex) yield (t: ATerm) => adt.term(s"c${clustersWithIndex._2}", createInitialStatePlaces(clustersWithIndex._1)(adt.term(PetriNetADT.ENDPLACE)), t)).reduceLeft(_ compose _))(endTerm)

  // n > 0
  private def closestPowerOfTwo(n: Int): Int = {
    assert(n > 0)
    if (n == 1) 1 else if (n == 2) 2 else {
      2 * closestPowerOfTwo(n / 2)
    }
  }

  def createRecursiveInitialState(clusters: List[Cluster])(endTerm: ATerm)(implicit adt: ADT): ATerm = {
    require(clusters.size >= 1)
    if (clusters.size == 1) {
      createInitialStateClusters(clusters)(adt.term(ENDCLUSTER))
    } else {
      val splitNumber = if (closestPowerOfTwo(clusters.size) == clusters.size) clusters.size / 2 else closestPowerOfTwo(clusters.size)
      val (list1, list2) = clusters splitAt splitNumber
      adt.term("sc0", createRecursiveInitialState(list1)(adt.term(END_SUPERCLUSTER)), adt.term("sc1", createRecursiveInitialState(list2)(adt.term(END_SUPERCLUSTER)), endTerm))
    }
  }
  def createInitialState(modules: List[SuperCluster], recursiveList: Set[Int])(endTerm: ATerm)(implicit adt: ADT) =
    ((for (clustersWithIndex <- modules.zipWithIndex) yield (t: ATerm) => adt.term(s"sc${clustersWithIndex._2}",
      if (recursiveList.contains(clustersWithIndex._2)) {
        createRecursiveInitialState(clustersWithIndex._1)(adt.term(END_SUPERCLUSTER))
      } else
        createInitialStateClusters(clustersWithIndex._1)(adt.term(ENDCLUSTER)), t)).reduceLeft(_ compose _))(endTerm)

  implicit def equation2SimpleStrategy(eq: Equation) = SimpleStrategy(List(eq))

  private def addApplyToPlace(maxPlace: Int): State[TransitionSystem, Unit] = State((ts: TransitionSystem) => {
    val checkForSClusterName = "checkForPlace"
    val checkBiggerThanSClusterName = "checkBiggerThanPlace"
    val applyForSClusterName = "applyForPlace"
    val elementPrefix = "p"
    // We use def instead of val because our variables are based on EMF, i.e. they are mutable and we cannot use them in different terms
    def elementVariable = ts.getAdt().term("p")
    def containedElementVariable = ts.getAdt().term("x")
    // this function adds the checks
    ((), modifyTSForApplyFor(maxPlace, checkForSClusterName, checkBiggerThanSClusterName, applyForSClusterName, elementPrefix, elementVariable, containedElementVariable)(ts))
  })

  private def addApplyToSCluster(maxSCluster: Int): State[TransitionSystem, Unit] = State((ts: TransitionSystem) => {
    val checkForSClusterName = "checkForSCluster"
    val checkBiggerThanSClusterName = "checkBiggerThanSCluster"
    val applyForSClusterName = "applyForSCluster"
    val elementPrefix = "sc"
    // We use def instead of val because our variables are based on EMF, i.e. they are mutable and we cannot use them in different terms
    def elementVariable = ts.getAdt().term("sc")
    def containedElementVariable = ts.getAdt().term("c")
    // this function adds the checks
    ((), modifyTSForApplyFor(maxSCluster, checkForSClusterName, checkBiggerThanSClusterName, applyForSClusterName, elementPrefix, elementVariable, containedElementVariable)(ts))
  })

  private def addApplyToCluster(maxCluster: Int): State[TransitionSystem, Unit] = State((ts: TransitionSystem) => {
    val checkForName = "checkForCluster"
    val checkBiggerThanName = "checkBiggerThanCluster"
    val applyForName = "applyForCluster"
    val elementPrefix = "c"
    // We use def instead of val because our variables are based on EMF, i.e. they are mutable and we cannot use them in different terms
    def elementVariable = ts.getAdt().term("c")
    def containedElementVariable = ts.getAdt().term("p")
    // this function adds the checks
    ((), modifyTSForApplyFor(maxCluster, checkForName, checkBiggerThanName, applyForName, elementPrefix, elementVariable, containedElementVariable)(ts))
  })

  def addSuperClusterFixPointAndThen(maxSCluster: Int) = State((ts: TransitionSystem) => {
    val checkForSClusterName = "checkForSCluster"
    val checkBiggerThanSClusterName = "checkBiggerThanSCluster"
    val applyForSClusterName = "superClusterFixPointAndThen"
    val elementPrefix = "sc"
    // We use def instead of val because our variables are based on EMF, i.e. they are mutable and we cannot use them in different terms
    def elementVariable = ts.getAdt().term("sc")
    def containedElementVariable = ts.getAdt().term("c")
    // this function adds the checks
    ((), modifyTSForApplyFor(maxSCluster, checkForSClusterName, checkBiggerThanSClusterName, applyForSClusterName, elementPrefix, elementVariable, containedElementVariable, true)(ts))
  })

  def addClusterFixPointAndThen(maxCluster: Int) = State((ts: TransitionSystem) => {
    val checkForName = "checkForCluster"
    val checkBiggerThanName = "checkBiggerThanCluster"
    val applyForName = "clusterFixPointAndThen"
    val elementPrefix = "c"
    // We use def instead of val because our variables are based on EMF, i.e. they are mutable and we cannot use them in different terms
    def elementVariable = ts.getAdt().term("c")
    def containedElementVariable = ts.getAdt().term("p")
    // this function adds the checks
    ((), modifyTSForApplyFor(maxCluster, checkForName, checkBiggerThanName, applyForName, elementPrefix, elementVariable, containedElementVariable, true)(ts))
  })

  private def modifyTSForApplyFor(maxElt: Int, checkForName: String, checkBiggerThanName: String, applyForName: String, eltPrefix: String, eltVariable: => ATerm, containedVariable: => ATerm, fixpoint: Boolean = false) = (for (i <- (0 to (maxElt - 1))) yield {
    (ts: TransitionSystem) =>
      // first we declare the checkForSCluster
      (if (fixpoint) {
        ts
      } else { // we declare it only when we are not declare the fixpoint strategies, because the are supposed to be defined before
        ts.declareStrategy(checkForName + i, ts.getAdt().term(s"$eltPrefix$i", containedVariable, eltVariable) -> ts.getAdt().term(s"$eltPrefix$i", containedVariable, eltVariable))(false)
          // We declare the strategy to check if we are bigger that some cluster
          .declareStrategy(checkBiggerThanName + i) {
            if (i == (maxElt - 1)) Fail else
              Choice(DeclaredStrategyInstance(checkForName + (i + 1)), DeclaredStrategyInstance(checkBiggerThanName + (i + 1)))
          }(false)
      })
        // we declare the applyForClusterStrategy
        .declareStrategy(s"$applyForName$i", S, Q) {
          IfThenElse(
            DeclaredStrategyInstance(checkForName + i),
            if (fixpoint) Union(Try(One(S, 1)), Try(One(Q, 2))) else
              Sequence(
                if (eltPrefix == "p") S else One(S, 1),
                One(Q, 2)), // if we are in the right cluster, apply the strategy
            IfThenElse(DeclaredStrategyInstance(checkBiggerThanName + i),
              if (fixpoint) {
                if ((i + 1) > (maxElt - 1)) {
                  Fail
                } else  Q
              }  else Fail,
              One(DeclaredStrategyInstance(s"$applyForName$i", S, Q), 2))) // else we enter the recursion only if we are not bigger than the cluster          
        }(false)
  }).reduceLeft(_ compose _)

}

