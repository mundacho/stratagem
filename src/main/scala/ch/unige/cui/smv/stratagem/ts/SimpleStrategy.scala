package ch.unige.cui.smv.stratagem.ts

import ch.unige.cui.smv.stratagem.adt.Equation

/**
 * Represents the simplest possible strategy: A list of rewriting rules.
 * 
 * @param label the label of the strategy.
 * @param equations a list of equations to be interpreted as rewriting rules.
 * @author mundacho
 *
 */
class SimpleStrategy(label: String, val equations: List[Equation]) extends Strategy(label) {
  def this(label: String, equation: Equation) = this(label, equation::Nil)
}