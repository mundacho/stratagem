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

  private def unit(checkingResult: Boolean) = {
    (checkingResult, "")
  }

  private def lift(checkerFunction: (Strategy) => Boolean) = (x: Strategy) => unit(checkerFunction(x))

  private def bind(f: Boolean => (Boolean, String)): ((Boolean, String) => (Boolean, String)) = {
    (result: Boolean, message: String) =>
      {
        val (checkingResult, checkingMessage) = f(result)
        (checkingResult && result, message + checkingMessage)
      }
  }

  /**
   * Does the dirty work for syntaxCheck.
   * @param strategy the strategy to syntax check. In the first call should be the body.
   * @param params the formal parameters of the declared strategy
   * @return true if the declared strategy's body is syntax correct. Otherwise returns false and gives no indication of where is the fault.
   */
  private def checkSyntax(strategy: Strategy, params: VariableStrategy*)(implicit ts: TransitionSystem): (Boolean, String) = {
    strategy match {
      case Choice(s1, s2) => {
        val (result1, message1) = checkSyntax(s1, params: _*)
        val (result2, message2) = checkSyntax(s2, params: _*)
        (result1 && result2, message1 + message2)
      }
      case Fail => (true, "")
      case Identity => (true, "")
      case One(s) => checkSyntax(s, params: _*)
      case FixPointStrategy(s) => checkSyntax(s, params: _*)
      case Sequence(s1, s2) => {
        val (result1, message1) = checkSyntax(s1, params: _*)
        val (result2, message2) = checkSyntax(s2, params: _*)
        (result1 && result2, message1 + message2)
      }
      case Union(s1, s2) => {
        val (result1, message1) = checkSyntax(s1, params: _*)
        val (result2, message2) = checkSyntax(s2, params: _*)
        (result1 && result2, message1 + message2)
      }
      case v: VariableStrategy => if (params.toList.exists(elt => elt eq v)) (true, "") else (false, "\nVariable " + v.name + " does not reference the same variable in the parameters")
      case SimpleStrategy(List(_, _*)) => (true, "")
      case strategyInstance @ DeclaredStrategyInstance(name, _*) => {
        // check if the strategy is already defined
        if (ts.strategyDeclarations.isDefinedAt(name)) {
          val theDeclaredStrategy = ts.strategyDeclarations(name).declaredStrategy
          // first check that the number of formal parameters is correct
          if (theDeclaredStrategy.formalParameters.size == strategyInstance.actualParams.size) {
            var (res, mes) = (true, "")
            for (param <- strategyInstance.actualParams) {
              val (result, message) = checkSyntax(param, params: _*)
              res &&= result
              mes += message
            }
            (res, mes)
          } else {
            (false, "\nStrategy " + theDeclaredStrategy.label + " does not have the good number of parameters. Expected " + theDeclaredStrategy.formalParameters.size + " and found " + strategyInstance.actualParams.size)
          }
        } else {
          (false, DeclaredStrategy.errorMessageStringNotDefined.format(name))
        }

      }
    }
  }
}

object DeclaredStrategy {
  val errorMessageStringNotDefined = "\nStrategy \"%s\" is not defined in the transition system"
}