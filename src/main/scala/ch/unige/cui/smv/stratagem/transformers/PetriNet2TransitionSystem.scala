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

import ch.unige.cui.smv.stratagem.adt.PredefADT.NAT_SORT_NAME
import ch.unige.cui.smv.stratagem.adt.PredefADT.ZERO
import ch.unige.cui.smv.stratagem.adt.PredefADT.define
import ch.unige.cui.smv.stratagem.petrinets.Arc
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT.ENDPLACE
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT.PLACE_SORT_NAME
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.petrinets.Transition
import ch.unige.smv.cui.metamodel.adt.ATerm
import ch.unige.smv.cui.metamodel.adt.ADT
import ch.unige.smv.cui.metamodel.adt.Signature
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import ch.unige.cui.smv.stratagem.adt.ATermHelper.term2RichTerm
import ch.unige.cui.smv.metamodel.ts.VariableStrategy
import ch.unige.cui.smv.metamodel.ts.TransitionSystem
import ch.unige.cui.smv.metamodel.ts.Strategy
import ch.unige.cui.smv.metamodel.ts.TsFactory
import ch.unige.cui.smv.stratagem.ts.RichTransitionSystem
import ch.unige.cui.smv.metamodel.ts.NonVariableStrategy

/**
 * Object that transforms a Petri net into a transition system.
 * @author mundacho
 *
 */
object PetriNet2TransitionSystem extends ((PetriNet) => TransitionSystem) {

  import ch.unige.cui.smv.stratagem.util.StrategyDSL._

  /**
   * A variable strategy to be used later.
   */
  def S = {
    val res = TsFactory.eINSTANCE.createVariableStrategy()
    res.setName("S")
    res
  }

  /**
   * A convenience method.
   */
  def ApplyOnce(s: => Strategy) = {
    val strat = (TsFactory.eINSTANCE.createDeclaredStrategyInstance())
    strat.setName("applyOnce")
    strat.getActualParams().add(s)
    strat
  }

  def basicSignature = PetriNetADT.basicPetriNetSignature

  def createSignature(places: List[Place], sign: Signature): Signature = places match {
    case Nil => sign
    case place :: tail => createSignature(tail, sign.withGenerator(place.id, PLACE_SORT_NAME, NAT_SORT_NAME, PLACE_SORT_NAME))
  }

  def createTransitionSystem(transitions: List[Transition], adt: ADT, initialState: ATerm): TransitionSystem = transitions match {
    case Nil => {
      val ts = TsFactory.eINSTANCE.createTransitionSystem()
      ts.setAdt(adt)
      ts.setInitialState(initialState)
      ts.declareStrategy("applyOnce", S)(Choice(S, One(ApplyOnce(S), 2)))(false)
      ts
    }
    case transition :: tail =>
      val res = createTransitionSystem(tail, adt, initialState)
      createStrategyFor(transition, adt, res)
  }

  def createInitialState(places: List[Place], adt: ADT): ATerm = places match {
    case Nil => adt.term(ENDPLACE)
    case place :: tail => adt.term(place.id, define(place.initialMarking, adt.term(ZERO), adt), createInitialState(tail, adt))
  }

  def createStrategyFor(transition: Transition, adt: ADT, ts: TransitionSystem): TransitionSystem = {
    val tsWithInputArcs = createInputArcEquations(transition.inputArcs.toList, ts)
    val tsWithAllArcs = createOutputArcEquations(transition.outputArcs.toList, tsWithInputArcs)
    val inputStrategies: Set[NonVariableStrategy] = transition.inputArcs.map(a => ApplyOnce(DeclaredStrategyInstance(a.id)))
    val inputStrategy = if (inputStrategies.isEmpty) Identity else inputStrategies.reduce((s1, s2) => Sequence(s1, s2))
    val outputStrategies: Set[NonVariableStrategy] = transition.outputArcs.map(a => ApplyOnce(DeclaredStrategyInstance(a.id)))
    val outputStrategy = if (outputStrategies.isEmpty) Identity else outputStrategies.reduce((s1, s2) => Sequence(s1, s2))
    tsWithAllArcs.declareStrategy(transition.id)(Sequence(inputStrategy, outputStrategy))(true)
  }

  def createOutputArcEquations(arcs: List[Arc], ts: TransitionSystem): TransitionSystem = arcs match {
    case Nil => ts
    case arc :: tail => createOutputArcEquations(tail, ts).declareStrategy(arc.id,
      ts.getAdt().term(arc.place.id, ts.getAdt().term("x"), ts.getAdt().term("p")) -> ts.getAdt().term(arc.place.id, define(arc.annotation, ts.getAdt().term("x"), ts.getAdt()), ts.getAdt().term("p")))(false)
  }

  def createInputArcEquations(arcs: List[Arc], ts: TransitionSystem): TransitionSystem = arcs match {
    case Nil => ts
    case arc :: tail =>
      createInputArcEquations(tail, ts).declareStrategy(arc.id,
        ts.getAdt().term(arc.place.id, define(arc.annotation, ts.getAdt().term("x"), ts.getAdt()), ts.getAdt().term("p")) -> ts.getAdt().term(arc.place.id, ts.getAdt().term("x"), ts.getAdt().term("p")))(false)
  }

  /**
   * Takes a petri net and creates a transition system.
   *
   * @param net the input petri net
   * @return a transition system that represents the petri net.
   */
  def apply(net: PetriNet) = {
    val signature = createSignature(net.places.toList, basicSignature)
    val adt = { val a = AdtFactory.eINSTANCE.createADT(); a.setName(net.name); a.setSignature(signature); a }
      .declareVariable("p", PLACE_SORT_NAME)
      .declareVariable("x", NAT_SORT_NAME)
    // now we create the transition system
    createTransitionSystem(net.transitions.toList, adt, createInitialState(net.places.toList, adt))
  }
}