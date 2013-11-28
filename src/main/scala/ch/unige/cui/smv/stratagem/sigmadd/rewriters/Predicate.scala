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

import ch.unige.cui.smv.stratagem.gal.expressions.BoolExpression
import ch.unige.cui.smv.stratagem.gal.expressions.BoolConstant
import ch.unige.cui.smv.stratagem.gal.expressions.IntExpressionFactory

import ch.unige.cui.smv.stratagem.ts.TransitionSystem

/**
 * A rewiter to evaluate a BoolExpression on a sigmaDD
 * @author mcolange
 *
 */
class Predicate(expr: BoolExpression, ts: TransitionSystem) extends SigmaDDRewriter {
  override lazy val toString = "Predicate(" + expr + ")"

  override lazy val hashCode = (this.getClass(), expr).hashCode

  /**
   * Evaluates a BoolExpression
   * @TODO  it is not clear when None should be returned.
   * @param sigmaDD the DD on which `expr` is to be evaluated
   * @return None if no path match the predicate, Some(d) otherwise, where d is the subset of sigmaDD that matches the predicate `expr`
   */
  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
    var result = sigmaDD.bottomElement
    expr match {
      case BoolConstant(true)   => result = sigmaDD; Some(result)
      case BoolConstant(false)  => None
      case _      => {
        //@TODO check the sort of the ddd, should be 'variable'
        // walk the variables represented at this level
        for ((topVariables,tail) <- sigmaDD.iipf.alpha) {
          for (currentVariable <- topVariables.set) {
            // use their values to partially evaluate the input expression
            for ((currentValues,secondTerm) <- tail.alpha) {
              val valueSplit = GALAssignmentRewriter.intEquivSplit(currentValues)
              for ((currentVal,currentValDD) <- valueSplit.data) {
                val partialExpr = expr.partialEval(IntExpressionFactory.createIntVariable(currentVariable),currentVal)
                // does partialExpr still depend on the current variable ?
                if (partialExpr.isInSupport(currentVariable)) {
                  // find a sub-expression to recursively evaluate it (should not fail, since it should not return None)
                  val subExpr = partialExpr.getSubExpression(currentVariable).get
                  val recResult = GALAssignmentRewriter.queryVal(subExpr,SigmaDDFactoryImpl.create(sigmaDD.sort,SigmaDDIPFFactoryImpl.create(currentVariable,new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(currentValDD -> secondTerm)))))
                  for ((subExprResolved,subExprResolvedDD) <- recResult.data) {
                    val skipExpr = partialExpr.partialEval(subExpr,subExprResolved)
                    // rebuild the result, with a recursive call to EquivSplit
                    val dd2 = SigmaDDFactoryImpl.create(sigmaDD.sort,SigmaDDIPFFactoryImpl.create(currentVariable,new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(subExprResolvedDD -> secondTerm))))
                    val recRewriter = new Predicate(skipExpr, ts)
                    recRewriter(dd2) match {
                      case Some(d)  => result = result v d
                      case None     => ()//@TODO emit a warning or an error?
                    }
                  }
                } else {
                  // skip this level
                  for ((next,tt) <- secondTerm.alpha) {
                    val recRewriter = new Predicate(partialExpr, ts)
                    recRewriter(next) match {
                      case Some(dddd)  => val ttt = new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(dddd -> tt)); result = result v SigmaDDFactoryImpl.create(sigmaDD.sort,SigmaDDIPFFactoryImpl.create(currentVariable,new SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl(Map(currentValDD -> ttt))))
                      case None         => ()//@TODO emit a warning or an error?
                    }
                  }
                }
              }
            }
          }
        }
        if (result == result.bottomElement) {
          None
        } else {
          Some(result)
        }
      }
    }
  }
}