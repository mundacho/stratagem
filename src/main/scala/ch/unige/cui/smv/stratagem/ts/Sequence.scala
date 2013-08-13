package ch.unige.cui.smv.stratagem.ts

/**
 * Represents the Sequence strategy.
 * @param S1 strategy to be used as parameter.
 * @param S2 strategy to be used as parameter.
 * @author mundacho
 *
 */
case class Sequence(S1:Strategy, S2:Strategy) extends NonVariableStrategy