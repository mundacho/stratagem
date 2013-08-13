package ch.unige.cui.smv.stratagem.ts

import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.Equation
import javax.media.j3d.DecalGroup

/**
 * Represents a transition system.
 *
 * @param adt the adt from where the terms of this transition system are created.
 * @param initialState the initial state of this transition system.
 * @param strategyDeclarations the declared strategies of this transition system.
 * @author mundacho
 *
 */
class TransitionSystem private (val adt: ADT, val initialState: ATerm, val strategyDeclarations: Map[String, StrategyDeclaration]) {
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
   * Returns a transition system with a declared strategy that uses this equation.
   * @param label the label for the equation.
   * @param equation the equation
   * @param isTransition true if the declared strategy is going to be used as a transition.
   */
  def declareStrategy(label: String, equation:Equation)(isTransition: Boolean):TransitionSystem = {
    declareStrategy(label, equation::Nil)(isTransition)
  }
  
   /**
   * Returns a transition system with a declared strategy that uses this equation.
   * @param label the label for the equation.
   * @param equations the equations for the simple strategy.
   * @param isTransition true if the declared strategy is going to be used as a transition.
   */
  def declareStrategy(label: String, equations:List[Equation])(isTransition: Boolean):TransitionSystem = {
    addDeclaredStrategy(DeclaredStrategy(label, SimpleStrategy(equations))) (isTransition)
  }
  
  
  def addDeclaredStrategy(declaredStrategy: DeclaredStrategy)(isTransition: Boolean) = {
    require(!strategyDeclarations.contains(declaredStrategy.label), "A strategy with that name is already defined in this transition system")
    val ts = new TransitionSystem(adt, initialState, strategyDeclarations + (declaredStrategy.label -> StrategyDeclaration(declaredStrategy, isTransition)))
    require(declaredStrategy.syntaxCheck(ts),  "There is a syntax error in the declaration of strategy: " + declaredStrategy.label)
    ts
  }
  
   /**
   * Returns a transition system with a new declared strategy.
   * @param label the name of the declared strategy.
   * @param isTransition true if the declared strategy is going to be used as a transition.
   * @param params the list of parameters that it uses.
   * @param body the body of the declared strategy.
   */
  def declareStrategy(label: String, params:VariableStrategy*)(body:NonVariableStrategy)(isTransition:Boolean):TransitionSystem = {
    new TransitionSystem(adt, initialState, strategyDeclarations + (label -> StrategyDeclaration(DeclaredStrategy(label, body, params:_*), false)))
  }

}