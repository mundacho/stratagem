package ch.unige.cui.smv.stratagem.ts

/**
 * Represents the declaration of a strategy for a transition system.
 * @param declaredStrategy the declaration of the strategy.
 * @param isTransition true if the strategy is a transition of the transition system.
 */
case class StrategyDeclaration(val declaredStrategy:DeclaredStrategy, val isTransition:Boolean)