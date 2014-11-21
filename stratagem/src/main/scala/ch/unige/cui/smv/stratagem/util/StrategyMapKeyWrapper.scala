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
package ch.unige.cui.smv.stratagem.util

import org.eclipse.emf.ecore.util.EcoreUtil
import ch.unige.cui.smv.metamodel.ts.Strategy
import ch.unige.cui.smv.metamodel.ts.Identity
import ch.unige.cui.smv.metamodel.ts.Choice
import ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.metamodel.ts.Fail
import ch.unige.cui.smv.metamodel.ts.FixPointStrategy
import ch.unige.cui.smv.metamodel.ts.IfThenElse
import scala.collection.JavaConversions._
import ch.unige.cui.smv.metamodel.ts.Not
import ch.unige.cui.smv.metamodel.ts.One
import ch.unige.cui.smv.metamodel.ts.Saturation
import ch.unige.cui.smv.metamodel.ts.Sequence
import ch.unige.cui.smv.metamodel.ts.SimpleStrategy
import org.eclipse.emf.ecore.EObject
import ch.unige.smv.cui.metamodel.adt.Equation
import ch.unige.smv.cui.metamodel.adt.Variable
import ch.unige.smv.cui.metamodel.adt.Term
import ch.unige.cui.smv.metamodel.ts.Union
import ch.unige.cui.smv.metamodel.ts.VariableStrategy
import ch.unige.cui.smv.metamodel.ts.All

/**
 * Wraps a strategy so that we can use it in a map as the key
 *
 * @author mundacho
 *
 */
case class StrategyMapKeyWrapper(wrapped: Strategy) {

  override lazy val hashCode = wrapped match {
    case s: Choice => (s.getClass(), StrategyMapKeyWrapper(s.getS1()), StrategyMapKeyWrapper(s.getS2())).hashCode
    case s: DeclaredStrategyInstance => (s.getClass, s.getName(), s.getActualParams().map(a => StrategyMapKeyWrapper(a))).hashCode
    case s: Fail => (s.getClass).hashCode
    case s: FixPointStrategy => (s.getClass(), StrategyMapKeyWrapper(s.getS())).hashCode
    case s: Identity => (s.getClass()).hashCode
    case s: IfThenElse => (s.getClass(), StrategyMapKeyWrapper(s.getS1()), StrategyMapKeyWrapper(s.getS2()), StrategyMapKeyWrapper(s.getS3)).hashCode
    case s: Not => (s.getClass(), StrategyMapKeyWrapper(s.getS())).hashCode
    case s: All => (s.getClass(), StrategyMapKeyWrapper(s.getS())).hashCode
    case s: One => (s.getClass(), StrategyMapKeyWrapper(s.getS()), s.getN).hashCode
    case s: Saturation => (s.getClass(), StrategyMapKeyWrapper(s.getS()), s.getN).hashCode
    case s: Sequence => (s.getClass(), StrategyMapKeyWrapper(s.getS1()), StrategyMapKeyWrapper(s.getS2())).hashCode
    case s: SimpleStrategy => (s.getClass(), s.getEquations().map(_.toString)).hashCode
    case s: Union => (s.getClass(), StrategyMapKeyWrapper(s.getS1()), StrategyMapKeyWrapper(s.getS2())).hashCode
    case s: VariableStrategy => (s.getClass(), s.getName()).hashCode
    
    case _ =>{
      throw new NotImplementedError("This strategy was not implemented in the wrapper")
    } 
  }

  override def equals(obj: Any) = obj match {
    case that: StrategyMapKeyWrapper => EcoreUtil.equals(that.wrapped, this.wrapped)
    case _ => false
  }
}