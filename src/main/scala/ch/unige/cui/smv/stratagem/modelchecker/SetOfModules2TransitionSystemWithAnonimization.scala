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

import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.PredefADT
import ch.unige.cui.smv.stratagem.adt.PredefADT.NAT_SORT_NAME
import ch.unige.cui.smv.stratagem.adt.PredefADT.define
import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.modelchecker.SetOfModules2TransitionSystem.CLUSTER_SORT_NAME
import ch.unige.cui.smv.stratagem.modelchecker.SetOfModules2TransitionSystem.ENDCLUSTER
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT.ENDPLACE
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT.PLACE_SORT_NAME
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.petrinets.Transition
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.petrinets.Arc
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import com.typesafe.scalalogging.slf4j.Logging
import ch.unige.cui.smv.stratagem.ts.IfThenElse

/**
 * @author mundacho
 *
 */
object SetOfModules2TransitionSystemWithAnonimization extends Logging {

  /**
   * A variable strategy to be used later.
   */
  val S = VariableStrategy("S")

  /**
   * A variable strategy to be used later.
   */
  val Q = VariableStrategy("Q")

  /**
   * A convenience method.
   */
  def ApplyOnceAndThen(s1: Strategy, s2: Strategy) = DeclaredStrategyInstance("applyOnceAndThen", s1, s2)
  def ApplyOnce(s1: Strategy) = DeclaredStrategyInstance("applyOnce", s1)
  def ApplyToCluster(s: Strategy, n: Int) = DeclaredStrategyInstance(s"applyForCluster$n", s)

  /**
   * The signature we use for clustered petri nets.
   */
  val basicSignature = PetriNetADT.basicPetriNetSignature
    .withSort(CLUSTER_SORT_NAME)
    .withGenerator(ENDCLUSTER, CLUSTER_SORT_NAME)

  /**
   * Creates a signature containing all the necessary terms for the clusters.
   * @param sign the signature where all the clusters will be created.
   * @param modules the list of modules, is needed to know the places' terms that will also be created in the signature
   * @param inititalClusterNumber first cluster that will be created will be called c + the this parameter
   * @return the signature containing all the necessary modules and places
   *
   */
  def createSignatureWithModules(sign: Signature, modules: List[PTModule], initialClusterNumber: Int, biggestModuleSize: Int): Signature = modules match {
    case Nil => addNumberedPlacesToSignature(sign, biggestModuleSize - 1)
    case mod :: tail =>
      createSignatureWithModules(sign.withGenerator(s"c$initialClusterNumber", CLUSTER_SORT_NAME, PLACE_SORT_NAME, CLUSTER_SORT_NAME), tail, initialClusterNumber + 1,
        if (mod.net.places.size > biggestModuleSize) mod.net.places.size else biggestModuleSize)
  }

  def addNumberedPlacesToSignature(sign: Signature, n: Int): Signature = n match {
    case 0 => sign.withGenerator("p0", PLACE_SORT_NAME, NAT_SORT_NAME, PLACE_SORT_NAME)
    case _ => addNumberedPlacesToSignature(sign.withGenerator(s"p${n}", PLACE_SORT_NAME, NAT_SORT_NAME, PLACE_SORT_NAME), n - 1)
  }

  def createInitialState(modules: List[PTModule], adt: ADT, endTerm: ATerm, initialModuleNumer: Int, placeToModuleAndPosition: Map[Place, (Int, Int)]): ATerm = modules match {
    case Nil => endTerm
    case mod :: tail =>
      adt.term(s"c$initialModuleNumer",
        createAnonimizedModuleInitialState(mod.net.places.toList.sortBy(p => (p.name, p.id)), adt, adt.term(ENDPLACE), 0),
        createInitialState(tail, adt, endTerm, initialModuleNumer + 1, placeToModuleAndPosition))
  }

  def createAnonimizedModuleInitialState(places: List[Place], adt: ADT, endTerm: ATerm, initialN: Int): ATerm = places match {
    case head :: tail => adt.term(s"p$initialN", PredefADT.define(head.initialMarking, adt.term(PredefADT.ZERO), adt), createAnonimizedModuleInitialState(tail, adt, endTerm, initialN + 1))
    case Nil => endTerm
  }

  def createTransitionSystem(transitions: List[Transition],
    adt: ADT,
    initialTransitionSystem: TransitionSystem,
    placeToModuleAndPosition: Map[Place, (Int, Int)],
    localClusterStrat: Map[Int, Set[String]],
    pBodyToId: Map[NonVariableStrategy, String],
    pIdToNormalId: Map[String, String]): TransitionSystem =
    transitions match {
      case Nil => // for each localCluster we create a fixpoint strategy to be applied on that cluster
        var resTransSystem = initialTransitionSystem
        var bodyToCluster = scala.collection.mutable.Map[NonVariableStrategy, Int]()
        localClusterStrat.keys.view.toList.sortWith(_ < _).foreach { i =>
          val strategyBody = FixPointStrategy(Union(Identity,
            localClusterStrat(i).view.toList.sortWith(_ < _).map(s => Try(DeclaredStrategyInstance(s)): NonVariableStrategy).reduce((s1, s2) => Union(s1, s2))))
          bodyToCluster.lift(strategyBody) match {
            case Some(id) => logger.trace(s"Cluster $i has the same local transition relation than cluster $id")
            case None => bodyToCluster += (strategyBody -> i)
          }
          resTransSystem = resTransSystem
            .declareStrategy(s"doFor${i}thCluster") { ApplyToCluster(strategyBody, i) }(true)
        }
        resTransSystem
      case transition :: tail =>
        val (res, cluster, bodyToId, idToNormalId) = createStrategyFor(transition, initialTransitionSystem, placeToModuleAndPosition, pBodyToId, pIdToNormalId)
        cluster match {
          case None => createTransitionSystem(tail, adt, res, placeToModuleAndPosition, localClusterStrat, bodyToId, idToNormalId)
          case Some(n) =>
            createTransitionSystem(tail, adt, res, placeToModuleAndPosition, localClusterStrat + (n -> (localClusterStrat.getOrElse(n, Set.empty) + idToNormalId(transition.id))), bodyToId, idToNormalId)
        }

    }

  private def inputArcStrategyBody(ts: TransitionSystem, placeToModuleAndPosition: Map[Place, (Int, Int)])(arc: Arc) = {
    val placeId = s"p${placeToModuleAndPosition(arc.place)._2}"
    SimpleStrategy(
      (ts.adt.term(placeId, define(arc.annotation, ts.adt.term("x"), ts.adt), ts.adt.term("p")) ->
        ts.adt.term(placeId, ts.adt.term("x"), ts.adt.term("p")) :: Nil))
  }

  private def outputArcStrategyBody(ts: TransitionSystem, placeToModuleAndPosition: Map[Place, (Int, Int)])(arc: Arc) = {
    val placeId = s"p${placeToModuleAndPosition(arc.place)._2}"
    SimpleStrategy(
      (ts.adt.term(placeId, ts.adt.term("x"), ts.adt.term("p")) ->
        ts.adt.term(placeId, define(arc.annotation, ts.adt.term("x"), ts.adt), ts.adt.term("p")) :: Nil))
  }
  private def buildInPutStrategy = (l: List[NonVariableStrategy]) => if (l.isEmpty) Identity else l.reduce((s1, s2) => Sequence(s1, s2))

  private def buildSequenceOfDependentStrategies(l: List[NonVariableStrategy]): NonVariableStrategy = l match {
    case head :: tail => ApplyOnceAndThen(head, buildSequenceOfDependentStrategies(tail))
    case Nil => Identity
  }

  // TODO rewrite doc
  /**
   *
   * Creates a strategy for a given transition.
   * @param transition the transition for which we are creating the strategies
   * @param ts the transition system where we create the transitions
   * @param placeToModuleAndPosition is a map that maps the places to the modules they are in and their position insideit
   * @result is a tuple consisting of the new transition system (with the new transitions) and an option type that contains either a module number
   */
  def createStrategyFor(transition: Transition,
    ts: TransitionSystem,
    placeToModuleAndPosition: Map[Place, (Int, Int)],
    pBodyToId: Map[NonVariableStrategy, String],
    pIdToNormalId: Map[String, String]): (TransitionSystem, Option[Int], Map[NonVariableStrategy, String], Map[String, String]) = {
    // we always need the equations for the arcs
    val (tsWithInputArcs, bodyToId0, idToNormalId0) =
      createArcEquations(transition.inputArcs.toList.sortBy(a => pIdToNormalId.getOrElse(a.id, a.id)),
        ts, placeToModuleAndPosition, pBodyToId, pIdToNormalId, inputArcStrategyBody(ts, placeToModuleAndPosition)_)
    val (tsWithAllArcs, bodyToId, idToNormalId) = createArcEquations(transition.outputArcs.toList.sortBy(a => idToNormalId0.getOrElse(a.id, a.id)),
      tsWithInputArcs, placeToModuleAndPosition, bodyToId0, idToNormalId0, outputArcStrategyBody(ts, placeToModuleAndPosition)_)
    // first check that if the transition has places only in one cluster:
    val placesGroupedByModules = (transition.inputArcs ++ transition.outputArcs).groupBy(a => placeToModuleAndPosition(a.place)._1)
    if (placesGroupedByModules.keys.size == 1) { // we have one cluster
      val inputStrategies = buildSequenceOfDependentStrategies(transition.inputArcs.toList.sortBy(a => (a.place.name, a.place.id)).map(a => DeclaredStrategyInstance(idToNormalId(a.id))))
      val ouputStrategies = buildSequenceOfDependentStrategies(transition.outputArcs.toList.sortBy(a => (a.place.name, a.place.id)).map(a => DeclaredStrategyInstance(idToNormalId(a.id))))
      val strategyBody = Sequence(inputStrategies, ouputStrategies)
      bodyToId.lift(strategyBody) match {
        // there is already a transition doing exactly the same, we do not create a new transition
        case Some(id) =>
          logger.trace(s"Transition ${transition.id} does the same as transition ${id} we remove it.")
          (tsWithAllArcs, Some(placesGroupedByModules.keys.head), bodyToId, idToNormalId + (transition.id -> id))
        case None =>
          (tsWithAllArcs.declareStrategy(transition.id)(strategyBody)(false),
            Some(placesGroupedByModules.keys.head),
            bodyToId + (strategyBody -> transition.id),
            idToNormalId + (transition.id -> transition.id))
      }
    } else { // we have several clusters
      val inputArcsByModule = transition.inputArcs.toList.sortBy(a => (a.place.name, a.place.id)).groupBy(a => placeToModuleAndPosition(a.place)._1)
      val inputStrategies = buildSequenceOfDependentStrategies(
        for (i <- inputArcsByModule.keys.toList.sortWith(_ < _)) yield {
          ApplyToCluster(buildSequenceOfDependentStrategies(
            inputArcsByModule(i).toList.sortBy(a => (a.place.name, a.place.id)).map(a => DeclaredStrategyInstance(idToNormalId(a.id)))), i)
        })
      val outputArcsByModule = transition.outputArcs.toList.sortBy(a => (a.place.name, a.place.id)).groupBy(a => placeToModuleAndPosition(a.place)._1)
      val ouputStrategies = buildSequenceOfDependentStrategies(
        for (i <- outputArcsByModule.keys.toList.sortWith(_ < _)) yield {
          ApplyToCluster(buildSequenceOfDependentStrategies(
            outputArcsByModule(i).toList.sortBy(a => (a.place.name, a.place.id)).map(a => DeclaredStrategyInstance(idToNormalId(a.id)))), i)
        })
      val strategyBody = Sequence(inputStrategies, ouputStrategies)
      (tsWithAllArcs.declareStrategy(transition.id)(strategyBody)(true),
        None,
        bodyToId + (strategyBody -> transition.id),
        idToNormalId + (transition.id -> transition.id))
    }
  }

  def createArcEquations(arcs: List[Arc],
    ts: TransitionSystem,
    placeToModuleAndPosition: Map[Place, (Int, Int)],
    pBodyToId: Map[NonVariableStrategy, String],
    pIdToNormalId: Map[String, String],
    arcStrategy: (Arc => NonVariableStrategy)): (TransitionSystem, Map[NonVariableStrategy, String], Map[String, String]) = arcs match {
    case Nil => (ts, pBodyToId, pIdToNormalId)
    case arc :: tail =>
      val strategyBody = arcStrategy(arc)
      val arcRuleId = pBodyToId.lift(strategyBody)
      arcRuleId match {
        // we do not create a new rule, but we remember that this arc is equivalent to id
        case Some(id) => createArcEquations(tail, ts, placeToModuleAndPosition, pBodyToId, pIdToNormalId + (arc.id -> id), arcStrategy)
        // there is no rule like this one, we add it to the transition system
        case None =>
          createArcEquations(tail, ts.declareStrategy(arc.id) { strategyBody }(false), placeToModuleAndPosition, pBodyToId + (strategyBody -> arc.id), pIdToNormalId + (arc.id -> arc.id), arcStrategy)
      }
  }

  /**
   * Takes a list of petri net modules and transforms it to a transition system.
   * @param modules set of modules
   * @param net the original petri net that was transformed into modules.
   * @return a transition system for stratagem that calculates the state space of in input net.
   */
  def apply(modules: List[PTModule], net: PetriNet): TransitionSystem = {
    val initialModuleNumber = 0 // must be zero because of the indexes
    // first we get an ordered list of modules (by size)
    val sortedListOfModules = modules
    // creates a map that maps each place to its cluster p1 -> c1, p2 -> c1, pn -> cm, etc
    val placeToModuleAndPosition = Map(sortedListOfModules.zipWithIndex.map(e => e._1.net.places.toList.sortBy(p => (p.name, p.id)).zipWithIndex.map(e1 => (e1._1, (e._2, e1._2)))).flatten: _*)
    println(sortedListOfModules.map(_.net.places.toList.sortBy(p => (p.name, p.id)).map(_.name).mkString(", ")).mkString("\n"))
    val signWithModules = createSignatureWithModules(basicSignature, sortedListOfModules, initialModuleNumber, -1)
    val adt = new ADT(net.name, signWithModules)
      .declareVariable("p", PLACE_SORT_NAME)
      .declareVariable("x", NAT_SORT_NAME)
      .declareVariable("c", CLUSTER_SORT_NAME)

    val initialTransitionSystem = new TransitionSystem(adt, createInitialState(sortedListOfModules, adt, adt.term(ENDCLUSTER), initialModuleNumber, placeToModuleAndPosition))
      .declareStrategy("applyOnce", S)(Choice(S, One(ApplyOnce(S), 2)))(false)
      .declareStrategy("applyOnceAndThen", S, Q)(IfThenElse(S, One(Q, 2), One(ApplyOnceAndThen(S, Q), 2)))(false)
    createTransitionSystem(net.transitions.toList, adt, SetOfModules2TransitionSystem.addApplytoCluster(initialTransitionSystem, modules.size - 1, modules.size - 1), placeToModuleAndPosition, Map(), Map(), Map())
  }
}