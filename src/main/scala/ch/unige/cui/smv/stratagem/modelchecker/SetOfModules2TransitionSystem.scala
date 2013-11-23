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
import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.petrinets.Arc
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.petrinets.Transition
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.Try
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy

/**
 * Takes a set of modules and transforms it to a transition system.
 * @author mundacho
 *
 */
object SetOfModules2TransitionSystem {

  val basicSignature = (new Signature)
    .withSort("place")
    .withSort("nat")
    .withSort("cluster")
    .withGenerator("zero", "nat")
    .withGenerator("suc", "nat", "nat")
    .withGenerator("endplace", "place")
    .withGenerator("endcluster", "cluster")

  /**
   * A variable strategy to be used later.
   */
  val S = VariableStrategy("S")

  /**
   * A convenience method.
   */
  def ApplyOnce(s: Strategy) = DeclaredStrategyInstance("applyOnce", s)
  def ApplyToCluster(s: Strategy, n: Int) = DeclaredStrategyInstance(s"applyForCluster$n", s)

  def createSignatureWithModules(sign: Signature, modules: List[PTModule], initialClusterNumber: Int): Signature = modules match {
    case Nil => sign
    case mod :: tail =>
      val signWithPlaces = PetriNet2TransitionSystem.createSignature(mod.net.places.toList, sign)
      createSignatureWithModules(signWithPlaces.withGenerator(s"c$initialClusterNumber", "cluster", "place", "cluster"), tail, initialClusterNumber + 1)
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
                localClusterStrat(i).view.map(DeclaredStrategyInstance(_): NonVariableStrategy).reduce((s1, s2) => Union(Try(s1), Try(s2))))), i)
            }(true)
        }
        resTransSystem
      case transition :: tail =>
        val (res, cluster) = createStrategyFor(transition, adt, initialTransitionSystem, placeToModule)
        cluster match {
          case None => createTransitionSystem(tail, adt, res, placeToModule, localClusterStrat)
          case Some(n) => createTransitionSystem(tail, adt, res, placeToModule, localClusterStrat + (n -> (localClusterStrat.getOrElse(n, Set.empty) + transition.id)))
        }

    }

  def createStrategyFor(transition: Transition, adt: ADT, ts: TransitionSystem, placeToModule: Map[Place, Int]): (TransitionSystem, Option[Int]) = {
    // we always need the equations for the arcs
    val tsWithInputArcs = PetriNet2TransitionSystem.createInputArcEquations(transition.inputArcs.toList, adt, ts)
    val tsWithAllArcs = PetriNet2TransitionSystem.createOutputArcEquations(transition.outputArcs.toList, adt, tsWithInputArcs)
    // first check that if the transition has places only in one cluster:
    val placesGroupedByModules = (transition.inputArcs.map(_.place) ++ transition.outputArcs.map(_.place)).groupBy(placeToModule(_))
    if (placesGroupedByModules.keys.size == 1) { // if this transition works in only one cluster, oh yeah!
      val inputStrategies: Set[NonVariableStrategy] = transition.inputArcs.map(a => ApplyOnce(DeclaredStrategyInstance(a.id)))
      val inputStrategy = if (inputStrategies.isEmpty) Identity else inputStrategies.reduce((s1, s2) => Sequence(s1, s2))
      val outputStrategies: Set[NonVariableStrategy] = transition.outputArcs.map(a => ApplyOnce(DeclaredStrategyInstance(a.id)))
      val outputStrategy = if (outputStrategies.isEmpty) Identity else outputStrategies.reduce((s1, s2) => Sequence(s1, s2))
      (tsWithAllArcs.declareStrategy(transition.id)(Sequence(inputStrategy, outputStrategy))(false), Some(placesGroupedByModules.keys.head))
    } else { // this transition works accross multiple modules
      val inputStrategies: Set[NonVariableStrategy] = transition.inputArcs.map(a => ApplyToCluster(ApplyOnce(DeclaredStrategyInstance(a.id)), placeToModule(a.place)))
      val inputStrategy = if (inputStrategies.isEmpty) Identity else inputStrategies.reduce((s1, s2) => Sequence(s1, s2))
      val outputStrategies: Set[NonVariableStrategy] = transition.outputArcs.map(a => ApplyToCluster(ApplyOnce(DeclaredStrategyInstance(a.id)), placeToModule(a.place)))
      val outputStrategy = if (outputStrategies.isEmpty) Identity else outputStrategies.reduce((s1, s2) => Sequence(s1, s2))
      (tsWithAllArcs.declareStrategy(transition.id)(Sequence(inputStrategy, outputStrategy))(true), None)
    }
  }

  def createInitialState(modules: List[PTModule], adt: ADT, endTerm: ATerm, initialModuleNumer: Int): ATerm = modules match {
    case Nil => endTerm
    case mod :: tail =>
      adt.term(s"c$initialModuleNumer",
        PetriNet2TransitionSystem.createInitialState(mod.net.places.toList.sortBy(p => (p.name, p.initialMarking)), adt),
        createInitialState(tail, adt, endTerm, initialModuleNumer + 1))
  }

  private def addStrategies(ts: TransitionSystem, n: Int) = ts
    .declareStrategy(s"checkForCluster$n", ts.adt.term(s"c$n", ts.adt.term("p"), ts.adt.term("c")) -> ts.adt.term(s"c$n", ts.adt.term("p"), ts.adt.term("c")))(false)
    .declareStrategy(s"applyForCluster$n", S) {
      Choice(
        Sequence(DeclaredStrategyInstance(s"checkForCluster$n"), One(S, 1)), // if we are in the right cluster, apply the strategy
        One(DeclaredStrategyInstance(s"applyForCluster$n", S), 2))
    }(false)

  def addApplytoCluster(ts: TransitionSystem, n: Int): TransitionSystem = n match {
    case 0 => addStrategies(ts, 0)
    case n => addApplytoCluster(addStrategies(ts, n), n - 1)
  }

  /**
   * Takes a list of petri net modules and transforms it to a transition system.
   * @param modules set of modules
   * @param net the original petri net that was transformed into modules.
   * @return a transition system for stratagem that calculates the state space of in input net.
   */
  def apply(modules: Set[PTModule], net: PetriNet) = {
    val initialModuleNumber = 0 // must be zero because of the indexes
    // first we get an ordered list of modules (by size)
    val sortedListOfModules = modules.toList.sortBy(_.net.places.size)
    // creates a map that maps each place to its cluster p1 -> c1, p2 -> c1, pn -> cm, etc
    val placeToModule = Map(sortedListOfModules.zipWithIndex.map(e => e._1.net.places.map(e1 => (e1, e._2))).flatten: _*)
    val signWithModules = createSignatureWithModules(basicSignature, sortedListOfModules, initialModuleNumber)
    val adt = new ADT(net.name, signWithModules)
      .declareVariable("p", "place")
      .declareVariable("x", "nat")
      .declareVariable("c", "cluster")
    val initialTransitionSystem = new TransitionSystem(adt, createInitialState(sortedListOfModules, adt, adt.term("endcluster"), initialModuleNumber))
      .declareStrategy("applyOnce", S)(Choice(S, One(ApplyOnce(S), 2)))(false)
    createTransitionSystem(net.transitions.toList, adt, addApplytoCluster(initialTransitionSystem, modules.size - 1), placeToModule, Map())
  }

}