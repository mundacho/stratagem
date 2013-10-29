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
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.petrinets.Transition
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.petrinets.Arc
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.Identity

/**
 * Object that transforms a Petri net into a transition system.
 * @author mundacho
 *
 */
abstract class AbstractPetriNet2TransitionSystem {

  def define(n: Int, initialTerm: ATerm, a: ADT): ATerm = n match {
    case 0 => initialTerm
    case _ => a.term("suc", (define(n - 1, initialTerm, a)))
  }

  /**
   * A variable strategy to be used later.
   */
  val S = VariableStrategy("S")

  /**
   * A convenience method.
   */
  def ApplyOnce(s: Strategy) = DeclaredStrategyInstance("applyOnce", s)

  val basicSignature = (new Signature)
    .withSort("place")
    .withSort("nat")
    .withGenerator("zero", "nat")
    .withGenerator("suc", "nat", "nat")
    .withGenerator("endplace", "place")

  def createSignature(places: List[Place]): Signature = places match {
    case Nil => basicSignature
    case place :: tail => createSignature(tail).withGenerator(place.id, "place", "nat", "place")
  }

  def createTransitionSystem(transitions: List[Transition], adt: ADT, initialState: ATerm): TransitionSystem = transitions match {
    case Nil => new TransitionSystem(adt, initialState).declareStrategy("applyOnce", S)(Choice(S, One(ApplyOnce(S), 2)))(false)
    case transition :: tail =>
      val res = createTransitionSystem(tail, adt, initialState)
      createStrategyFor(transition, adt, res)
  }

  def createInitialState(places: List[Place], adt: ADT): ATerm = places match {
    case Nil => adt.term("endplace")
    case place :: tail => adt.term(place.id, define(place.initialMarking, adt.term("zero"), adt), createInitialState(tail, adt))
  }

  def createStrategyFor(transition: Transition, adt: ADT, ts: TransitionSystem): TransitionSystem = {
    val tsWithInputArcs = createInputArcEquations(transition.inputArcs.toList, adt, ts)
    val tsWithAllArcs = createOutputArcEquations(transition.outputArcs.toList, adt, tsWithInputArcs)
    val inputStrategies: Set[NonVariableStrategy] = transition.inputArcs.map(a => ApplyOnce(DeclaredStrategyInstance(a.id)))
    val inputStrategy = if (inputStrategies.isEmpty) Identity else inputStrategies.reduce((s1, s2) => Sequence(s1, s2))
    val outputStrategies: Set[NonVariableStrategy] = transition.outputArcs.map(a => ApplyOnce(DeclaredStrategyInstance(a.id)))
    val outputStrategy = if (outputStrategies.isEmpty) Identity else outputStrategies.reduce((s1, s2) => Sequence(s1, s2))
    tsWithAllArcs.declareStrategy(transition.id)(Sequence(inputStrategy, outputStrategy))(true)
  }

  def createOutputArcEquations(arcs: List[Arc], adt: ADT, ts: TransitionSystem): TransitionSystem = arcs match {
    case Nil => ts
    case arc :: tail => createOutputArcEquations(tail, adt, ts).declareStrategy(arc.id,
      adt.term(arc.place.id, adt.term("x"), adt.term("p")) -> adt.term(arc.place.id, define(arc.annotation, adt.term("x"), adt), adt.term("p")))(false)
  }

  def createInputArcEquations(arcs: List[Arc], adt: ADT, ts: TransitionSystem): TransitionSystem = arcs match {
    case Nil => ts
    case arc :: tail =>
      createInputArcEquations(tail, adt, ts).declareStrategy(arc.id,
        adt.term(arc.place.id, define(arc.annotation, adt.term("x"), adt), adt.term("p")) -> adt.term(arc.place.id, adt.term("x"), adt.term("p")))(false)
  }

  /**
   * Takes a petri net and creates a transition system.
   *
   * @return a transition system that represents the petri net.
   */
  def apply(net: PetriNet) = {
    val signature = createSignature(net.places.toList)
    val adt = new ADT(net.name, signature)
      .declareVariable("p", "place")
      .declareVariable("x", "nat")
    // now we create the transition system
    createTransitionSystem(net.transitions.toList, adt, createInitialState(net.places.toList, adt))
  }
}