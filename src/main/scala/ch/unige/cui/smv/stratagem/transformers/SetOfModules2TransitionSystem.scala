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

import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.PredefADT.NAT_SORT_NAME
import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.petrinets.Arc
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT.PLACE_SORT_NAME
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.petrinets.Transition
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Fail
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.IfThenElse
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.VariableStrategy

/**
 * Takes a set of modules and transforms it to a transition system.
 * @author mundacho
 *
 */
object SetOfModules2TransitionSystem extends ((List[PTModule], PetriNet) => TransitionSystem) {

  /**
   * Name of endcluster constant of sort cluster.
   */
  val ENDCLUSTER = "endcluster"
  /**
   * Name of the sort cluster.
   */
  val CLUSTER_SORT_NAME = "cluster"

  /**
   * The signature we use for clustered petri nets.
   */
  val basicSignature = PetriNetADT.basicPetriNetSignature
    .withSort(CLUSTER_SORT_NAME)
    .withGenerator(ENDCLUSTER, CLUSTER_SORT_NAME)

  /**
   * A variable strategy to be used later.
   */
  val S = VariableStrategy("S")

  /**
   * A convenience method.
   */
  def ApplyOnce(s: Strategy) = DeclaredStrategyInstance("applyOnce", s)
  def ApplyToCluster(s: Strategy, n: Int) = DeclaredStrategyInstance(s"applyForCluster$n", s)

  /**
   * Creates a signature containing all the necessary terms for the clusters.
   * @param sign the signature where all the clusters will be created.
   * @param modules the list of modules, is needed to know the places' terms that will also be created in the signature
   * @param inititalClusterNumber first cluster that will be created will be called c + the this parameter
   * @return the signature containing all the necessary modules
   *
   */
  def createSignatureWithModules(sign: Signature, modules: List[PTModule], initialClusterNumber: Int): Signature = modules match {
    case Nil => sign
    case mod :: tail =>
      val signWithPlaces = PetriNet2TransitionSystem.createSignature(mod.net.places.toList, sign)
      createSignatureWithModules(signWithPlaces.withGenerator(s"c$initialClusterNumber", CLUSTER_SORT_NAME, PLACE_SORT_NAME, CLUSTER_SORT_NAME), tail, initialClusterNumber + 1)
  }

  def createTransitionSystem(transitions: List[Transition],
    adt: ADT,
    initialTransitionSystem: TransitionSystem,
    placeToModule: Map[Place, Int],
    localClusterStrat: Map[Int, Set[String]]): TransitionSystem =
    transitions match {
      case Nil => // for each localCluster we create a fixpoint strategy to be applied on that cluster
        var resTransSystem = initialTransitionSystem
        localClusterStrat.keys.view.toList.sortWith(_ < _).foreach { i =>
          resTransSystem = resTransSystem
            .declareStrategy(s"doFor${i}thCluster") {
              ApplyToCluster(FixPointStrategy(Union(Identity,
                localClusterStrat(i).view.map(s => Try(DeclaredStrategyInstance(s)): NonVariableStrategy).reduce((s1, s2) => Union(s1, s2)))), i)
            }(true)
        }
        resTransSystem
      case transition :: tail =>
        val (res, cluster) = createStrategyFor(transition, initialTransitionSystem, placeToModule)
        cluster match {
          case None => createTransitionSystem(tail, adt, res, placeToModule, localClusterStrat)
          case Some(n) => createTransitionSystem(tail, adt, res, placeToModule, localClusterStrat + (n -> (localClusterStrat.getOrElse(n, Set.empty) + transition.id)))
        }

    }

  private def buildInPutStrategy = (l: List[NonVariableStrategy]) => if (l.isEmpty) Identity else l.reduce((s1, s2) => Sequence(s1, s2))

  /**
   * Creates a strategy for a given transition.
   * @param transition the transition for which we are creating the strategies
   * @param ts the transition system where we create the transitions
   * @param placeToModule is a map that maps the places to the modules they are in
   * @result is a tuple consisting of the new transition system (with the new transitions) and an option type that contains either a module number
   */
  def createStrategyFor(transition: Transition, ts: TransitionSystem, placeToModule: Map[Place, Int]): (TransitionSystem, Option[Int]) = {
    // we always need the equations for the arcs
    val tsWithInputArcs = PetriNet2TransitionSystem.createInputArcEquations(transition.inputArcs.toList, ts)
    val tsWithAllArcs = PetriNet2TransitionSystem.createOutputArcEquations(transition.outputArcs.toList, tsWithInputArcs)
    // first check that if the transition has places only in one cluster:
    val placesGroupedByModules = (transition.inputArcs.map(_.place) ++ transition.outputArcs.map(_.place)).groupBy(placeToModule(_))
    val (strategyForArc, isTransition, localModuleNumber) = placesGroupedByModules.keys.size match {
      case 1 => ((a: Arc) => ApplyOnce(DeclaredStrategyInstance(a.id)), false, Some(placesGroupedByModules.keys.head))
      case _ => ((a: Arc) => ApplyToCluster(ApplyOnce(DeclaredStrategyInstance(a.id)), placeToModule(a.place)), true, None)
    }
    def sortedListOfArcs(arcs: Set[Arc]) = arcs.toList.sortBy(a => (a.place.name, a.place.id)).map(a => strategyForArc(a)): List[NonVariableStrategy]
    val (inputStrategies, outputStrategies) = (sortedListOfArcs(transition.inputArcs), sortedListOfArcs(transition.outputArcs))
    (tsWithAllArcs.declareStrategy(transition.id)(Sequence(buildInPutStrategy(inputStrategies), buildInPutStrategy(outputStrategies)))(isTransition), localModuleNumber)
  }

  def createInitialState(modules: List[PTModule], adt: ADT, endTerm: ATerm, initialModuleNumer: Int): ATerm = modules match {
    case Nil => endTerm
    case mod :: tail =>
      adt.term(s"c$initialModuleNumer",
        PetriNet2TransitionSystem.createInitialState(mod.net.places.toList.sortBy(p => (p.name, p.id)), adt),
        createInitialState(tail, adt, endTerm, initialModuleNumer + 1))
  }

  private def addStrategies(ts: TransitionSystem, n: Int, maxCluster: Int) = {
    val checkNotBiggerThanCluster = (for (i <- (n + 1) to maxCluster) yield DeclaredStrategyInstance(s"checkForCluster$i"): NonVariableStrategy)
    ts
      .declareStrategy(s"checkForCluster$n", ts.adt.term(s"c$n", ts.adt.term("p"), ts.adt.term("c")) -> ts.adt.term(s"c$n", ts.adt.term("p"), ts.adt.term("c")))(false)
      .declareStrategy(s"applyForCluster$n", S) {
        IfThenElse(
          DeclaredStrategyInstance(s"checkForCluster$n"),
          One(S, 1), // if we are in the right cluster, apply the strategy
          IfThenElse(if (checkNotBiggerThanCluster.isEmpty) Fail else checkNotBiggerThanCluster.reduce((a, b) => Choice(a, b)),
            Fail,
            One(DeclaredStrategyInstance(s"applyForCluster$n", S), 2))) // else we enter the recursion only if we are not bigger than the cluster
      }(false)
  }

  def addApplytoCluster(ts: TransitionSystem, n: Int, maxCluster: Int): TransitionSystem = n match {
    case 0 => addStrategies(ts, 0, maxCluster)
    case _ => addApplytoCluster(addStrategies(ts, n, maxCluster), n - 1, maxCluster)
  }

  /**
   * Takes a list of petri net modules and transforms it to a transition system.
   * @param modules set of modules
   * @param net the original petri net that was transformed into modules.
   * @return a transition system for stratagem that calculates the state space of in input net.
   */
  def apply(modules: List[PTModule], net: PetriNet) = {
    val initialModuleNumber = 0 // must be zero because of the indexes
    // first we get an ordered list of modules (by size)
    val sortedListOfModules = modules
    // creates a map that maps each place to its cluster p1 -> c1, p2 -> c1, pn -> cm, etc
    val placeToModule = Map(sortedListOfModules.zipWithIndex.map(e => e._1.net.places.map(e1 => (e1, e._2))).flatten: _*)
    val signWithModules = createSignatureWithModules(basicSignature, sortedListOfModules, initialModuleNumber)
    val adt = new ADT(net.name, signWithModules)
      .declareVariable("p", PLACE_SORT_NAME)
      .declareVariable("x", NAT_SORT_NAME)
      .declareVariable("c", CLUSTER_SORT_NAME)
    val initialTransitionSystem = new TransitionSystem(adt, createInitialState(sortedListOfModules, adt, adt.term(ENDCLUSTER), initialModuleNumber))
      .declareStrategy("applyOnce", S)(Choice(S, One(ApplyOnce(S), 2)))(false)
    createTransitionSystem(net.transitions.toList, adt, addApplytoCluster(initialTransitionSystem, modules.size - 1, modules.size - 2), placeToModule, Map())
  }

}