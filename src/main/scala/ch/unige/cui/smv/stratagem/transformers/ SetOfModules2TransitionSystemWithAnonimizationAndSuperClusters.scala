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

import com.typesafe.scalalogging.slf4j.Logging

import ch.unige.cui.smv.stratagem.petrinets._
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.Equation
import ch.unige.cui.smv.stratagem.adt.PredefADT
import ch.unige.cui.smv.stratagem.adt.PredefADT.NAT_SORT_NAME
import ch.unige.cui.smv.stratagem.adt.PredefADT.define
import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.petrinets.Arc
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT.PLACE_SORT_NAME
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.petrinets.Transition
import ch.unige.cui.smv.stratagem.transformers.SetOfModules2TransitionSystem.CLUSTER_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.SetOfModules2TransitionSystem.ENDCLUSTER
import ch.unige.cui.smv.stratagem.transformers.beem.State
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Fail
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.IfThenElse
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Saturation
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.VariableStrategy

/**
 * @author mundacho
 *
 */
object SetOfModules2TransitionSystemWithAnonimizationAndSuperClusters extends Logging with ((List[List[List[Place]]], PetriNet) => TransitionSystem) {

  type Cluster = List[Place]
  type SuperCluster = List[Cluster]
  // the calculation state contains the following elements:
  // 1.- transition system, 
  // 2.- map from strategies bodies to strategies names,
  // 3.- map from superCluster to strategies working on that super cluster
  // 4.- map place to position in clusters 
  type CalculationState = (TransitionSystem, Map[NonVariableStrategy, String], Map[Int, Map[Int, Set[String]]], Map[Place, (Int, Int, Int)])

  /**
   * A variable strategy to be used later.
   */
  val S = VariableStrategy("S")

  /**
   * A variable strategy to be used later.
   */
  val Q = VariableStrategy("Q")

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
  val basicSignature = PetriNetADT.basicPetriNetSignature
    .withSort(CLUSTER_SORT_NAME)
    .withSort(SUPER_CLUSTER_SORT_NAME)
    .withGenerator(ENDCLUSTER, CLUSTER_SORT_NAME)
    .withGenerator(END_SUPERCLUSTER, SUPER_CLUSTER_SORT_NAME)

  /**
   * Creates a signature containing all the necessary terms for the superclusters.
   * @param s the signature where all the clusters will be created.
   * @param modules list of super clusters.
   * @return the signature containing all the necessary modules and places
   *
   */
  def createSignatureSuperClusters(modules: List[List[List[Place]]], s: Signature) = (modules.view.zipWithIndex.map(
    e1 => (sign: Signature) => sign.withGenerator(s"sc${e1._2}", SUPER_CLUSTER_SORT_NAME, CLUSTER_SORT_NAME, SUPER_CLUSTER_SORT_NAME)).reduce(_ compose _))(s)

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
        (ts.adt.term(placeId, define(arc.annotation, ts.adt.term("x"), ts.adt), ts.adt.term("p")) ->
          ts.adt.term(placeId, ts.adt.term("x"), ts.adt.term("p")) :: Nil))
      (res, cs)
    })

  private def outputArcStrategy(arc: Arc): State[CalculationState, NonVariableStrategy] =
    State(cs => {
      val (ts, strat2Name, superCluster2Strategies, place2Position) = cs
      val placeId = s"p${place2Position(arc.place)._3}"
      val res = SimpleStrategy(
        (ts.adt.term(placeId, ts.adt.term("x"), ts.adt.term("p")) ->
          ts.adt.term(placeId, define(arc.annotation, ts.adt.term("x"), ts.adt), ts.adt.term("p")) :: Nil))
      (res, cs)
    })

  def transitionStrategy(transition: Transition): State[CalculationState, Unit] = {
    for (
      _ <- createAllArcs(transition);
      _ <- createTransitionSpanningSeveralSuperClusters(transition)
    ) yield ()
  }

  def createAllArcs(transition: Transition) = for ( // we create the arc strategies
    _ <- {
      val listOfStates = (for (inputArc <- transition.inputArcs) yield arcStrategy(inputArc, inputArcStrategy _))
      if (listOfStates.isEmpty) State.get((_: CalculationState) => ()) else listOfStates.reduceLeft((s1, s2) => s1.flatMap(_ => s2));
    };
    _ <- {
      val listOfStates = (for (outputArc <- transition.outputArcs) yield arcStrategy(outputArc, outputArcStrategy _))
      if (listOfStates.isEmpty) State.get((_: CalculationState) => ()) else listOfStates.reduceLeft((s1, s2) => s1.flatMap(_ => s2));
    }
  ) yield ()

  def saveStrategyWithName(name: String, strategy: NonVariableStrategy, isTransition: Boolean): State[CalculationState, String] = State((cs: CalculationState) => {
    val (ts, strat2Name, superCluster2Strategies, place2Position) = cs
    if (strat2Name.isDefinedAt(strategy)) {
      logger.trace(s"Did not redefine strategy $name because it was already defined")
      (strat2Name(strategy), cs)
    } else {
      (name,
        (ts.declareStrategy(name) { strategy }(isTransition),
          strat2Name + (strategy -> name),
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
            clusterIndex, superCluster2Strategies.getOrElse(sClusterIndex, Map()).getOrElse(clusterIndex, Set()) + strat2Name(tranStrategy))),
          place2Position))
  })

  def createTransitionSpanningSeveralSuperClusters(transition: Transition): State[CalculationState, Unit] =
    for (
      cs <- State.get((cs: CalculationState) => cs);
      (ts, strat2Name, superCluster2Strategies, place2Position) = cs;
      placesGroupedBySuperClusters = transition.arcs.groupBy(a => place2Position(a.place)._1);
      placesGroupedByClusters = transition.arcs.groupBy(a => place2Position(a.place)._2);
      res <- calculateTransitionStrategy(transition, placesGroupedBySuperClusters, placesGroupedByClusters);
      (tranStrategy, isTransition) = res;
      _ <- addStrategyToClusteringMapAtPosition(tranStrategy, placesGroupedBySuperClusters.keys.head,
        if (placesGroupedByClusters.keys.size == 1) placesGroupedByClusters.keys.head else -1) if (!isTransition)
    ) yield ()

  private def inputArcStrategyBody(ts: TransitionSystem, placeToModuleAndPosition: Map[Place, (Int, Int, Int)])(arc: Arc): NonVariableStrategy = {
    val placeId = s"p${placeToModuleAndPosition(arc.place)._3}"
    SimpleStrategy(
      (ts.adt.term(placeId, define(arc.annotation, ts.adt.term("x"), ts.adt), ts.adt.term("p")) ->
        ts.adt.term(placeId, ts.adt.term("x"), ts.adt.term("p")) :: Nil))
  }

  private def outputArcStrategyBody(ts: TransitionSystem, placeToModuleAndPosition: Map[Place, (Int, Int, Int)])(arc: Arc): NonVariableStrategy = {
    val placeId = s"p${placeToModuleAndPosition(arc.place)._3}"
    SimpleStrategy(
      (ts.adt.term(placeId, ts.adt.term("x"), ts.adt.term("p")) ->
        ts.adt.term(placeId, define(arc.annotation, ts.adt.term("x"), ts.adt), ts.adt.term("p")) :: Nil))
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
        (Sequence(iArcs.map(inputArcStrategyBody(ts, place2Position)).reduce(Sequence(_, _)), oArcs.map(outputArcStrategyBody(ts, place2Position)).reduce(Sequence(_, _))), arcIndex)
      }
    }
  }

  def calculateTransitionStrategy(transition: Transition, placesGroupedBySuperClusters: Map[Int, Set[Arc]], placesGroupedByClusters: Map[Int, Set[Arc]]): State[CalculationState, (NonVariableStrategy, Boolean)] =
    if (placesGroupedBySuperClusters.keys.size == 1) {
      if (placesGroupedByClusters.keys.size == 1) {
        for {
          cs <- State.get((cs: CalculationState) => cs)
          (ts, strat2Name, superCluster2Strategies, place2Position) = cs
          strategyBody = chainStrategiesForPlaces(arc2Strategies(transition.inputArcs, transition.outputArcs, ts, place2Position))
          normalName <- saveStrategyWithName(transition.id, strategyBody, false)
        } yield {
          (strategyBody, false)
        }
      } else if (placesGroupedByClusters.keys.size > 1) { // more than one
        for {
          cs <- State.get((cs: CalculationState) => cs)
          (ts, strat2Name, superCluster2Strategies, place2Position) = cs
          strategyList = createListOfStrategiesForClusters(transition.inputArcs, transition.outputArcs, ts, place2Position)
          strategyBody = chainStrategiesForClusters(strategyList)
          normalName <- saveStrategyWithName(transition.id, strategyBody, false)
        } yield (strategyBody, false)
      } else {
        throw new IllegalStateException("Clusters must have at least one elt.")
      }
    } else { // multi super clustered transition
      for {
        cs <- State.get((cs: CalculationState) => cs)
        (ts, strat2Name, superCluster2Strategies, place2Position) = cs
        strategyList = createListOfStrategiesForSuperClusters(transition.inputArcs, transition.outputArcs, ts, place2Position)
        strategyBody = chainStrategiesForSuperClusters(strategyList)
        normalName <- saveStrategyWithName(transition.id, strategyBody, true)
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

  def createListOfStrategiesForSuperClusters(inputArcs: Set[Arc], outputArcs: Set[Arc], ts: TransitionSystem, place2Position: Map[Place, (Int, Int, Int)]): List[(NonVariableStrategy, Int)] = {
    val groupedArcs = (inputArcs ++ outputArcs).groupBy(a => place2Position(a.place)._1)
    for (superClusterIndex <- groupedArcs.keySet.toList.sortWith(_ < _)) yield {
      val (iArcs, oArcs) = groupedArcs(superClusterIndex).partition(a => inputArcs.contains(a))
      (chainStrategiesForClusters(createListOfStrategiesForClusters(iArcs, oArcs, ts, place2Position)), superClusterIndex)
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
        strat2Name.lift(strategyBody) match {
          case None =>
            (DeclaredStrategyInstance(arc.id), (ts.declareStrategy(arc.id) { strategyBody }(false), strat2Name + (strategyBody -> arc.id), superCluster2Strategies, place2Position))
          case Some(stratName) =>
            (DeclaredStrategyInstance(stratName), (ts, strat2Name, superCluster2Strategies, place2Position))
        }
      })
    ) yield res
  }

  /**
   * Takes a list of petri net modules and transforms it to a transition system.
   * @param modules set of modules
   * @param net the original petri net that was transformed into modules.
   * @return a transition system for stratagem that calculates the state space of in input net.
   */
  def apply(modules: List[SuperCluster], net: PetriNet): TransitionSystem = {
    val initialModuleNumber = 0 // must be zero because of the indexes
    // creates a map that maps each place to its cluster p1 -> c1, p2 -> c1, pn -> cm, etc
    // we obtain a mapping from places to their super cluster, cluster and position
    val placeToSClusterClusterPosition = Map(modules.zipWithIndex.flatMap(e1 => e1._1.zipWithIndex.flatMap(e2 => e2._1.zipWithIndex.map(p => (p._1, (e1._2, e2._2, p._2))))).toArray: _*)
    val signWithSuperClusters = createSignatureSuperClusters(modules, basicSignature)
    // find max number of clusters per supercluster
    val maxClusters = modules.map(_.size).max
    // we create a function here
    val createSignWithClusters = ((for (i <- 0 to (maxClusters - 1)) yield (s: Signature) => s.withGenerator(s"c$i", CLUSTER_SORT_NAME, PLACE_SORT_NAME, CLUSTER_SORT_NAME)).reduce(_ compose _))
    val maxPlaces = (for (cluster <- modules; places <- cluster) yield places.size).max
    // here we also create a function
    val createSignWithPlaces = ((for (i <- 0 to (maxPlaces - 1)) yield (s: Signature) => s.withGenerator(s"p$i", PLACE_SORT_NAME, NAT_SORT_NAME, PLACE_SORT_NAME)).reduce(_ compose _))
    implicit val adt = new ADT(net.name, createSignWithClusters(createSignWithPlaces(signWithSuperClusters)))
      .declareVariable("p", PLACE_SORT_NAME)
      .declareVariable("x", NAT_SORT_NAME)
      .declareVariable("c", CLUSTER_SORT_NAME)
      .declareVariable("sc", SUPER_CLUSTER_SORT_NAME)

    val initialTransitionSystem = new TransitionSystem(adt, createInitialState(modules)(adt.term(END_SUPERCLUSTER)))
      .declareStrategy("applyOnce", S)(Choice(S, One(ApplyOnce(S), 2)))(false)
      .declareStrategy("applyOnceAndThen", S, Q)(IfThenElse(S, One(Q, 2), One(ApplyOnceAndThen(S, Q), 2)))(false)
    // add apply to scluster

    println("Add basic strategies")
    val transSystemState = for {
      _ <- addApplyToSCluster(modules.size)
      _ <- addApplyToCluster(maxClusters)
      _ <- addApplyToPlace(maxPlaces)
      _ <- addSuperClusterFixPointAndThen(modules.size)
      _ <- addClusterFixPointAndThen(maxClusters)
    } yield ()
    println("End adding basic strategies")
    println("Starting calculation of computation initial state")

    val computationInitialState = (
      transSystemState.eval(initialTransitionSystem)._1,
      Map[NonVariableStrategy, String](),
      Map[Int, Map[Int, Set[String]]](),
      placeToSClusterClusterPosition)

    println("end computation initial state modules")
    val computation = (for (
      _ <- calculateTransitionSystem(net.transitions);
      _ <- calculateSClusterSaturationStrategies
    ) yield ())
    println("Finished calculating computation")
    computation.eval(computationInitialState)._1._1
  }

  def calculateSClusterSaturationStrategies: State[CalculationState, Unit] = for {
    cs <- State.get((cs: CalculationState) => cs)
    (ts, strat2Name, superCluster2LocalStrategies, place2Position) = cs
    strategyBody = createFixpointStrategieForSuperClusters(superCluster2LocalStrategies)
    _ <- saveStrategyWithName("superClusterSaturationStrategy", strategyBody, true)
  } yield ()

  def createFixpointStrategieForSuperClusters(superCluster2LocalStrategies: Map[Int, Map[Int, Set[String]]]): NonVariableStrategy = {
    val listOfSuperClusterFixPointStrategies = for (superClusterIndex <- superCluster2LocalStrategies.keys.toList.sortWith(_ < _)) yield (superClusterFixPointStrategy(superCluster2LocalStrategies(superClusterIndex)), superClusterIndex)
    chainSuperClusterFixPointStrategies(listOfSuperClusterFixPointStrategies)
  }

  def superClusterFixPointStrategy(cluster2localStrategies: Map[Int, Set[String]]): NonVariableStrategy = {
    val listOfClusterFixPointStrategies = for (clusterIndex <- cluster2localStrategies.keys.toList.sortWith(_ < _) if (clusterIndex != -1)) yield (clusterFixPointStrategy(cluster2localStrategies(clusterIndex)), clusterIndex)
    if (cluster2localStrategies.isDefinedAt(-1)) {
      val superClusterStrategies: NonVariableStrategy = (for (stratName <- cluster2localStrategies(-1)) yield FixPointStrategy(Union(Identity, Try(DeclaredStrategyInstance(stratName)))): NonVariableStrategy).reduce((a, b) => Union(a, b))
      FixPointStrategy(Union(Identity, Union(chainClusterFixPointStrategies(listOfClusterFixPointStrategies), Saturation(Union(superClusterStrategies, Identity), 2))))
      //      Saturation(Union(Identity, Union(chainClusterFixPointStrategies(listOfClusterFixPointStrategies), superClusterStrategies)), 2)
    } else
      FixPointStrategy(Union(Identity, chainClusterFixPointStrategies(listOfClusterFixPointStrategies)))
  }

  def clusterFixPointStrategy(strategyNames: Set[String]): NonVariableStrategy = FixPointStrategy(Union(Identity, strategyNames.map(a => FixPointStrategy(Union(Identity, Try(DeclaredStrategyInstance(a)))): NonVariableStrategy).reduce((a, b) => Union(a, b))))

  def chainClusterFixPointStrategies(strategies: List[(NonVariableStrategy, Int)]): NonVariableStrategy = strategies match {
    case Nil => Identity
    case (strat, n) :: tail => Choice(ClusterFixPointAndThen(strat, chainClusterFixPointStrategies(tail), n), chainClusterFixPointStrategies(tail))
  }

  def chainSuperClusterFixPointStrategies(strategies: List[(NonVariableStrategy, Int)]): NonVariableStrategy = strategies match {
    case Nil => Identity
    case (strat, n) :: tail => //Choice(
      SuperClusterFixPointAndThen(strat, chainSuperClusterFixPointStrategies(tail), n)
    //        , chainSuperClusterFixPointStrategies(tail))
  }

  def calculateTransitionSystem(transitions: Set[Transition]): State[CalculationState, Unit] =
    transitions.map(t => transitionStrategy(t)).reduceLeft((s1, s2) => s1.flatMap(_ => s2))

  def createInitialStatePlaces(places: Cluster)(endTerm: ATerm)(implicit adt: ADT) =
    ((for (placesWithIndex <- places.zipWithIndex) yield (t: ATerm) => adt.term(s"p${placesWithIndex._2}", PredefADT.define(placesWithIndex._1.initialMarking, adt.term(PredefADT.ZERO), adt), t)).reduceLeft(_ compose _))(endTerm)

  def createInitialStateClusters(clusters: List[Cluster])(endTerm: ATerm)(implicit adt: ADT) =
    ((for (clustersWithIndex <- clusters.zipWithIndex) yield (t: ATerm) => adt.term(s"c${clustersWithIndex._2}", createInitialStatePlaces(clustersWithIndex._1)(adt.term(PetriNetADT.ENDPLACE)), t)).reduceLeft(_ compose _))(endTerm)

  def createInitialState(modules: List[SuperCluster])(endTerm: ATerm)(implicit adt: ADT) =
    ((for (clustersWithIndex <- modules.zipWithIndex) yield (t: ATerm) => adt.term(s"sc${clustersWithIndex._2}", createInitialStateClusters(clustersWithIndex._1)(adt.term(ENDCLUSTER)), t)).reduceLeft(_ compose _))(endTerm)

  implicit def equation2SimpleStrategy(eq: Equation) = SimpleStrategy(List(eq))

  private def addApplyToPlace(maxPlace: Int): State[TransitionSystem, Unit] = State((ts: TransitionSystem) => {
    val checkForSClusterName = "checkForPlace"
    val checkBiggerThanSClusterName = "checkBiggerThanPlace"
    val applyForSClusterName = "applyForPlace"
    val elementPrefix = "p"
    val elementVariable = ts.adt.term("p")
    val containedElementVariable = ts.adt.term("x")
    // this function adds the checks
    ((), modifyTSForApplyFor(maxPlace, checkForSClusterName, checkBiggerThanSClusterName, applyForSClusterName, elementPrefix, elementVariable, containedElementVariable)(ts))
  })

  private def addApplyToSCluster(maxSCluster: Int): State[TransitionSystem, Unit] = State((ts: TransitionSystem) => {
    val checkForSClusterName = "checkForSCluster"
    val checkBiggerThanSClusterName = "checkBiggerThanSCluster"
    val applyForSClusterName = "applyForSCluster"
    val elementPrefix = "sc"
    val elementVariable = ts.adt.term("sc")
    val containedElementVariable = ts.adt.term("c")
    // this function adds the checks
    ((), modifyTSForApplyFor(maxSCluster, checkForSClusterName, checkBiggerThanSClusterName, applyForSClusterName, elementPrefix, elementVariable, containedElementVariable)(ts))
  })

  private def addApplyToCluster(maxCluster: Int): State[TransitionSystem, Unit] = State((ts: TransitionSystem) => {
    val checkForName = "checkForCluster"
    val checkBiggerThanName = "checkBiggerThanCluster"
    val applyForName = "applyForCluster"
    val elementPrefix = "c"
    val elementVariable = ts.adt.term("c")
    val containedElementVariable = ts.adt.term("p")
    // this function adds the checks
    ((), modifyTSForApplyFor(maxCluster, checkForName, checkBiggerThanName, applyForName, elementPrefix, elementVariable, containedElementVariable)(ts))
  })

  def addSuperClusterFixPointAndThen(maxSCluster: Int) = State((ts: TransitionSystem) => {
    val checkForSClusterName = "checkForSCluster"
    val checkBiggerThanSClusterName = "checkBiggerThanSCluster"
    val applyForSClusterName = "superClusterFixPointAndThen"
    val elementPrefix = "sc"
    val elementVariable = ts.adt.term("sc")
    val containedElementVariable = ts.adt.term("c")
    // this function adds the checks
    ((), modifyTSForApplyFor(maxSCluster, checkForSClusterName, checkBiggerThanSClusterName, applyForSClusterName, elementPrefix, elementVariable, containedElementVariable, true)(ts))
  })

  def addClusterFixPointAndThen(maxCluster: Int) = State((ts: TransitionSystem) => {
    val checkForName = "checkForCluster"
    val checkBiggerThanName = "checkBiggerThanCluster"
    val applyForName = "clusterFixPointAndThen"
    val elementPrefix = "c"
    val elementVariable = ts.adt.term("c")
    val containedElementVariable = ts.adt.term("p")
    // this function adds the checks
    ((), modifyTSForApplyFor(maxCluster, checkForName, checkBiggerThanName, applyForName, elementPrefix, elementVariable, containedElementVariable, true)(ts))
  })

  private def modifyTSForApplyFor(maxElt: Int, checkForName: String, checkBiggerThanName: String, applyForName: String, eltPrefix: String, eltVariable: ATerm, containedVariable: ATerm, fixpoint: Boolean = false) = (for (i <- (0 to (maxElt - 1))) yield {
    (ts: TransitionSystem) =>
      // first we declare the checkForSCluster
      (if (fixpoint) {
        ts
      } else { // we declare it only when we are not declare the fixpoint strategies, because the are supposed to be defined before
        ts.declareStrategy(checkForName + i, ts.adt.term(s"$eltPrefix$i", containedVariable, eltVariable) -> ts.adt.term(s"$eltPrefix$i", containedVariable, eltVariable))(false)
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
                if (eltPrefix == "p") S else One(S, 1), One(Q, 2)), // if we are in the right cluster, apply the strategy
            IfThenElse(DeclaredStrategyInstance(checkBiggerThanName + i),
              Fail,
              One(DeclaredStrategyInstance(s"$applyForName$i", S, Q), 2))) // else we enter the recursion only if we are not bigger than the cluster          
        }(false)
  }).reduceLeft(_ compose _)

}

