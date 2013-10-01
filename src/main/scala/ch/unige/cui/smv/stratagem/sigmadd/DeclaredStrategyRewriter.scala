package ch.unige.cui.smv.stratagem.sigmadd

import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.Fail
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategy
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance

class DeclaredStrategyRewriter(declaredStrategy: DeclaredStrategyInstance, ts: TransitionSystem) extends SigmaDDRewriter {

  lazy val formalToActualParameterMap = Map((ts.strategyDeclarations(declaredStrategy.name).declaredStrategy.formalParameters zip declaredStrategy.actualParams).toArray: _*)
  
  lazy val rewriter = SigmaDDRewriterFactory.strategyToRewriter(instanciate(ts.strategyDeclarations(declaredStrategy.name).declaredStrategy.body))(ts)

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = rewriter(sigmaDD)

  /**
   * We instanciate the variables of a strategy with variables.
   */
  private def instanciate(strategy: Strategy): Strategy = strategy match {
    case Choice(s1, s2) => Choice(instanciate(s1), instanciate(s2))
    case Fail => Fail
    case Identity => Identity
    case One(s) => One(instanciate(s))
    case FixPointStrategy(s) => FixPointStrategy(instanciate(s))
    case Sequence(s1, s2) => Sequence(instanciate(s1), instanciate(s2))
    case Union(s1, s2) => Union(instanciate(s1), instanciate(s2))
    case v: VariableStrategy => formalToActualParameterMap(v)
    case s @ SimpleStrategy(List(_, _*)) => s
    case strategyInstance @ DeclaredStrategyInstance(name, actualParams @ _*) => DeclaredStrategyInstance(name, actualParams.map(instanciate(_)).toArray: _*)
  }

}