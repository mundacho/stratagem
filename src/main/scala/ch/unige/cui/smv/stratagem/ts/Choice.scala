package ch.unige.cui.smv.stratagem.ts

/**
 * Represents the Choice strategy.
 * @param S1 strategy to be used as parameter.
 * @param S2 strategy to be used as parameter.
 * @author mundacho
 *
 */
case class Choice(S1:Strategy, S2:Strategy) extends NonVariableStrategy