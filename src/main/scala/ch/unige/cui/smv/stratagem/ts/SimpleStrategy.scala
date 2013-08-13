package ch.unige.cui.smv.stratagem.ts

import ch.unige.cui.smv.stratagem.adt.Equation

/**
 * Represents the simplest possible strategy: A list of rewriting rules.
 * 
 * @param equations a list of equations to be interpreted as rewriting rules.
 * @author mundacho
 *
 */
case class SimpleStrategy(val equations: List[Equation]) extends NonVariableStrategy