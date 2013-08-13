package ch.unige.cui.smv.stratagem.ts

/**
 * Represents an instance of a declared strategy. It knows how to check if it is syntactically correct collaborating with the TransitionSystem class.
 * @param name the name of the strategy. It refers to the label of the declared strategy in the transition system.
 * @param actualParams the actual parameters used by this instance.
 *
 * @author mundacho
 *
 */
case class DeclaredStrategyInstance(name: String, actualParams: Strategy*) extends NonVariableStrategy