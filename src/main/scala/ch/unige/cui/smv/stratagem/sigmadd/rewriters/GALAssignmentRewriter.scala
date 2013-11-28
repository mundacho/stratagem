/*
Stratagem is a model checker for transition systems described using rewriting
rules and strategies.
Copyright (C) 2013 - SMV@Geneva University.
Program written by Edmundo Lopez Bobeda <edmundo [at] lopezbobeda.net>.
This program is free software; you can redistribute it and/or modify
it under the  terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package ch.unige.cui.smv.stratagem.sigmadd.rewriters

import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl$SigmaDDImpl
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDIPFFactoryImpl
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDInductiveIPFFactoryImpl

import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategy
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem

import ch.unige.cui.smv.stratagem.adt.Equation

import ch.unige.cui.smv.stratagem.gal.expressions.IntExpression
import ch.unige.cui.smv.stratagem.gal.expressions.IntExpressionFactory
import ch.unige.cui.smv.stratagem.gal.expressions.IntVariable
import ch.unige.cui.smv.stratagem.gal.expressions.ArrayAccess
import ch.unige.cui.smv.stratagem.gal.expressions.Constant

import ch.unige.cui.smv.stratagem.gal.GAL2TransitionSystem

import ch.unige.cui.smv.stratagem.util.StringSetWrapperFactory

/**
 * GAL Assignment implemented in terms of SigmaDDRewriter
 * @TODO make a companion object for 'static' methods
 *
 * @author mcolange
 *
 */
private[sigmadd] case class GALAssignmentRewriter(lhs: IntExpression, rhs: IntExpression, ts: TransitionSystem) extends SigmaDDRewriter {
  override lazy val toString = "GALAssignment(" + lhs + " := " + rhs + ")"

  override lazy val hashCode = (this.getClass(), lhs, rhs).hashCode

  /**
   * the ADT of the used TS, useful for building rewriting sub-strategies later on
   */
  private def adt = ts.adt

  type MapEquivSplit = GALAssignmentRewriter.MapEquivSplit

  /**
   * helper to apply a strategy to all levels
   */
  private def applyOnce(S: Strategy): Strategy = Choice(S, One(DeclaredStrategyInstance("applyOnce", S), 2))

  /**
   * an extractor to help with the index of an array
   */
  object ArrayIndexExtractor {
    def unapply(arg: IntExpression) = arg match {
      case ArrayAccess(_,i) => Some(i)
      case _                => None
    }
  }

  /**
   * an extractor to help with constant addresses
   */
  private object ConstAddress {
    def unapply(arg: IntExpression) = arg match {
      case IntVariable(x)             => Some(x)
      case ArrayAccess(a,Constant(i)) => Some(a + "[" + i + "]")
      case _                          => None
    }
  }

  /**
   * The real algorithm to evaluate the assignment
   * @TODO  it is not very clear when it should return None.
   *        so far, it returns only Some(_)
   */
  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
    lhs match {
      case ConstAddress(x)  => rhs match {
        case Constant(v)        => {// use a simple rewriting strategy
           val lhsTerm = adt.term(x,adt.term("X"),adt.term("D"))
           val rhsTerm = adt.term(x,GAL2TransitionSystem.adtInt(v,adt),adt.term("D"))
           val strat = applyOnce(SimpleStrategy(List(Equation(lhsTerm,rhsTerm))))
           SigmaDDRewriterFactory.strategyToRewriter(strat)(ts)(sigmaDD)
        }
        case _                  => {// use an EquivSplit to resolve the value to assign
          val values = GALAssignmentRewriter.queryVal(rhs,sigmaDD)
          var result = sigmaDD.bottomElement
          for ((v,d) <- values.data) {
            val recRewriter = new GALAssignmentRewriter(lhs,v,ts)
            recRewriter(d) match {
              case Some(dd) => result = result v dd
              case None => () //@TODO emit a warning or an error?
            }
          }
          Some(result)
        }
      }
      case _                => {// use a double combined EquivSplit
        // walk the variables at this level
        var result = sigmaDD.bottomElement
        for ((topVariables,tail) <- sigmaDD.iipf.alpha) {
          for (curVar <- topVariables.set) {
            val currentVariable = IntExpressionFactory.createIntVariable(curVar)
            // walk the values
            for ((currentValues,secondTerm) <- tail.alpha) {
              val valueSplit = GALAssignmentRewriter.intEquivSplit(currentValues)
              for ((currentVal,currentValDD) <- valueSplit.data) {
                val partialLHS = lhs.partialEval(currentVariable,currentVal)
                val partialRHS = rhs.partialEval(currentVariable,currentVal)
                // do they still depend on current variable?
                // lhs was necessarily a non-const array access, check if its index still depends on the current variable
                val index = ArrayIndexExtractor.unapply(partialLHS).get
                if (index.isInSupport(curVar)) {
                  // find a sub-expression to evaluate (in fact, the index)
                  val recIndex = GALAssignmentRewriter.queryVal(index,SigmaDDFactoryImpl.create(sigmaDD.sort,SigmaDDIPFFactoryImpl.create(curVar,new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(currentValDD -> secondTerm)))))
                  for ((resolvedIndex,resolvedIndexDD) <- recIndex.data) {
                    val resolvedLHS = partialLHS.partialEval(index,resolvedIndex)
                    val resolvedRHS = partialRHS.partialEval(index,resolvedIndex)
                    val recRewriter = new GALAssignmentRewriter(resolvedLHS, resolvedRHS, ts)
                    recRewriter(resolvedIndexDD) match {
                      case Some(d)  => result = result v d
                      case None     => () //@TODO emit a warning or an error
                    }
                  }
                } else {
                  val recRewriter = new GALAssignmentRewriter(partialLHS, partialRHS, ts)
                  recRewriter(SigmaDDFactoryImpl.create(sigmaDD.sort,SigmaDDIPFFactoryImpl.create(curVar,new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(currentValDD -> secondTerm))))) match {
                    case Some(d) => result = result v d
                    case None    => () //@TODO emit a warning or an error?
                  }
                }
              }
            }
          }
        }
        Some(result)
      }
    }
  }
}

object GALAssignmentRewriter {
  //@TODO refer directly to SigmaDDRewriter alias
  type SigmaDDImplType = SigmaDDFactoryImpl.SigmaDDImpl

  /**
   * an alias for the terminal '1'
   */
  private val terminalOne = SigmaDDInductiveIPFFactoryImpl.TopIPF

  /**
   * A helper class to store the result of the EquivSplit
   */
  private[rewriters] class MapEquivSplit {
    var data = scala.collection.mutable.Map[IntExpression,SigmaDDImplType]()

    def +=(d: SigmaDDImplType, e: IntExpression) {
      data.get(e) match {
        case None => data(e) = d
        case Some(x) => data(e) = x v d
      }
    }
  }

  /**
   * side EquivSplit to deal with algebraic integers (hmmpf)
   * @TODO handle negative integers
   */
  private[rewriters] def intEquivSplit(ddd: SigmaDDImplType): MapEquivSplit = {
    var result = new MapEquivSplit()
    val wrap0 = StringSetWrapperFactory.create(Set("zero"))
    for ((entry,tail) <- ddd.iipf.alpha) {
      // if it contains 0 (it should be alone, and tail should be empty)
      if ((entry ^ wrap0) != entry.bottomElement) {
        // check that 0 is alone in 'entry'
        assert(entry.size == 1)
        // check that the tail is emtpy (i.e. is the terminal 1)
        assert(tail == terminalOne)
        result += (SigmaDDFactoryImpl.create(ddd.sort,SigmaDDIPFFactoryImpl.create("zero",terminalOne)),IntExpressionFactory.createConstant(0))
      }
      // otherwise, recursively build the map
      else {
        // 'entry' should contain a single element "succ"
        assert(entry.size == 1) // only size is checked here
        for ((d,t) <- tail.alpha) {
          // check that t is empty, i.e. terminal '1'
          assert(t == terminalOne)
          val recRes = intEquivSplit(d)
          for ((expr,delta) <- recRes.data) {
            expr match {
              case Constant(i)  => result += (SigmaDDFactoryImpl.create(delta.sort,SigmaDDIPFFactoryImpl.create("succ",new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(delta -> t)))),IntExpressionFactory.createConstant(i+1))
              case _            => throw new RuntimeException("equivsplit should not return non-constant expressions")
            }
          }
        }
      }
    }
    result
  }

  /**
   * the 'core' EquivSplit, that evaluates a single expression
   */
  private[rewriters] def queryVal(expr: IntExpression, ddd: SigmaDDImplType): MapEquivSplit = {
    var result = new MapEquivSplit()
    expr match {
      case Constant(_)  => result += (ddd,expr); result
      case _      => {
        //@TODO check the sort of the ddd, should be 'variable'
        // walk the variables represented at this level
        for ((topVariables,tail) <- ddd.iipf.alpha) {
          for (currentVariable <- topVariables.set) {
            // use their values to partially evaluate the input expression
            for ((currentValues,secondTerm) <- tail.alpha) {
              val valueSplit = GALAssignmentRewriter.intEquivSplit(currentValues)
              for ((currentVal,currentValDD) <- valueSplit.data) {
                val partialExpr = expr.partialEval(IntExpressionFactory.createIntVariable(currentVariable),currentVal)
                // does partialExpr still depend on the current variable ?
                if (partialExpr.isInSupport(currentVariable)) {
                  // find a sub-expression to recursively evaluate it
                  val Some(subExpr) = partialExpr.getSubExpression(currentVariable)
                  val recResult = queryVal(subExpr,SigmaDDFactoryImpl.create(ddd.sort,SigmaDDIPFFactoryImpl.create(currentVariable,new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(currentValDD -> secondTerm)))))
                  for ((subExprResolved,subExprResolvedDD) <- recResult.data) {
                    val skipExpr = partialExpr.partialEval(subExpr,subExprResolved)
                    // rebuild the result, with a recursive call to EquivSplit
                    val dd2 = SigmaDDFactoryImpl.create(ddd.sort,SigmaDDIPFFactoryImpl.create(currentVariable,new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(subExprResolvedDD -> secondTerm))))
                    val rec2 = queryVal(skipExpr,dd2)
                    for ((eeee,dddd) <- rec2.data) {
                      result += (dddd,eeee)
                    }
                  }
                } else {
                  // skip this level
                  for ((next,tt) <- secondTerm.alpha) {
                    val recRes = queryVal(partialExpr,next)
                    for ((eeee,dddd) <- recRes.data) {
                      val ttt = new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(dddd -> tt))
                      result += (SigmaDDFactoryImpl.create(ddd.sort,SigmaDDIPFFactoryImpl.create(currentVariable,new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(currentValDD -> ttt)))),eeee)
                    }
                  }
                }
              }
            }
          }
        }
        result
      }
    }
  }
}
