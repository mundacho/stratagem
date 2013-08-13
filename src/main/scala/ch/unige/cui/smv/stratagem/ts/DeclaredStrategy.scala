package ch.unige.cui.smv.stratagem.ts

/**
 * Represents a declared strategy.
 *
 * @param label the name of this strategy.
 * @param body a non variable strategy the body of this declared strategy.
 * @param params the parameters of this declared strategy.
 *
 * @author mundacho
 *
 */
case class DeclaredStrategy(label: String, body: NonVariableStrategy, formalParameters: VariableStrategy*) {

  /**
   * Checks the syntax of the body.
   */
  def syntaxCheck(ts: TransitionSystem) = {
    checkSyntax(body, formalParameters: _*)(ts)
  }

  /**
   * Does the dirty work for syntaxCheck.
   * @param strategy the strategy to syntax check. In the first call should be the body.
   * @param params the formal parameters of the declared strategy
   * @return true if the declared strategy's body is syntax correct. Otherwise returns false and gives no indication of where is the fault.
   */
  private def checkSyntax(strategy: Strategy, params: VariableStrategy*)(implicit ts: TransitionSystem): Boolean = {
    strategy match {
      case Choice(s1, s2) => checkSyntax(s1, params: _*) && checkSyntax(s2, params: _*)
      case Fail() => true
      case Identity() => true
      case One(s) => checkSyntax(s, params: _*)
      case FixPointStrategy(s) => checkSyntax(s, params: _*)
      case Sequence(s1, s2) => checkSyntax(s1, params: _*) && checkSyntax(s2, params: _*)
      case Union(s1, s2) => checkSyntax(s1, params: _*) && checkSyntax(s2, params: _*)
      case v: VariableStrategy => if (params.toList.exists(elt => elt eq v)) true else false
      case SimpleStrategy(List(_, _*)) => true
      case strategyInstance @ DeclaredStrategyInstance(name, _*) => {
        val theDeclaredStrategy = ts.strategyDeclarations(name).declaredStrategy
        // first check that the number of formal parameters is correct
        if (theDeclaredStrategy.formalParameters.size == strategyInstance.actualParams.size) {
          (true /: strategyInstance.actualParams.map(checkSyntax(_, params: _*)))(_ && _)
        } else {
          false
        }
      }
    }
  }
}