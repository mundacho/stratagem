package ch.unige.cui.smv.stratagem.ts

import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.Equation

/**
 * Represents a transition system.
 *
 * @param adt the adt from where the terms of this transition system are created.
 * @param initialState the initial state of this transition system.
 * @param declaredStrategies the declared strategies of this transition system.
 * @author mundacho
 *
 */
class TransitionSystem private (val adt: ADT, val initialState: ATerm, val declaredStrategies: Map[String, Strategy]) {
  require(initialState.adt eq adt)

  /**
   * Constructor creates transition system with no global transitions.
   * @param adt cf. main constructor.
   * @param initialState cf. main constructor.
   *
   */
  def this(adt: ADT, initialState: ATerm) {
    this(adt, initialState, Map.empty)
  }

  /**
   * Returns a new transition system adding a new transition described by strategy.
   * @param strategy the strategy to be added.
   */
  def declareStrategy(strategy: Strategy) = {
    require(!declaredStrategies.contains(strategy.label), "A strategy with that name is already in the transition system.")
    new TransitionSystem(adt, initialState, declaredStrategies + (strategy.label -> strategy))
  }
  
    /**
   * Returns a transition system with an anonymous strategy that uses this equation as strategy.
   * @param label the label for the equation.
   * @param equation the equation
   */
  def declareStrategy(label: String, equation:Equation):TransitionSystem = {
    declareStrategy(new SimpleStrategy(label, equation))
  }

}