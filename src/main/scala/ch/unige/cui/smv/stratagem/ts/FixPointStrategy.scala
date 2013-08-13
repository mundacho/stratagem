package ch.unige.cui.smv.stratagem.ts

/**
 * Represents a FixPointStrategy.
 * @param S strategy that will be repeated.
 * @author mundacho
 *
 */
case class FixPointStrategy(S:Strategy) extends NonVariableStrategy