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
package ch.unige.cui.smv.stratagem.gal.expressions

/**
 * Represents a boolean expression
 * @author mcolange
 *
 */
sealed abstract class BoolExpression {
  /**
   * Simplifies a BoolExpr
   * flattens recursive n-ary operators, evaluate constants...
   * @return the simplified BoolExpression
   */
  def simplify(): BoolExpression

  def isInSupport(x: String): Boolean = BoolExpressionFactory.isInSupport(x,this)

  def getSubExpression(x: String): Option[IntExpression] = None

  def partialEval(pattern: IntExpression, replace: IntExpression): BoolExpression

  def unary_! = BoolExpressionFactory.createNot(this)
}

/**
 * Boolean Constant.
 */
case class BoolConstant private[expressions] (val value: Boolean) extends BoolExpression {
  def simplify(): BoolExpression = this

  def partialEval(pattern: IntExpression, replace: IntExpression): BoolExpression = this
}

/**
 * Boolean negation
 */
case class Not private[expressions] (val term: BoolExpression) extends BoolExpression {
  def simplify(): BoolExpression = {
    term.simplify() match {
      case Not(b)           => b
      case BoolConstant(c)  => BoolConstant(!c)
      case x: Any           => Not(x)
    }
  }

  override def getSubExpression(x: String): Option[IntExpression] = term.getSubExpression(x)

  def partialEval(pattern: IntExpression, replace: IntExpression): BoolExpression =
    BoolExpressionFactory.createNot(term.partialEval(pattern, replace))
}

/**
 * Represent n-ary boolean operations.
 */
sealed abstract class NaryBoolExpression protected (val terms: Set[BoolExpression]) extends BoolExpression {
  /**
   * a helper function to flatten sub-expressions (x+(y+z) => x+y+z)
   */
  def flattenHelper(x: BoolExpression): Set[BoolExpression]
  /**
   * the neutral element for the operation
   */
  def neutral: Boolean
  /**
   * the operation on plain boolean
   */
  def operation(x: Boolean,y: Boolean): Boolean
  /**
   * a helper function to build an expression of the correct type.
   */
  def builder(s: Set[BoolExpression]): BoolExpression

  def simplify(): BoolExpression = {
    // recursive call
    var s2 = terms map { e => e.simplify() }
    // flatten
    s2 = s2.flatMap(flattenHelper)
    // aggregate constants
    val (constants,rest) = s2.partition({ x => x match { case BoolConstant(_) => true; case _ => false } })
    val constantTerm = constants.foldLeft(neutral)({ case (x,BoolConstant(y)) => operation(x,y) })
    if (constantTerm != neutral) {
      // the only n-ary ops are 'AND' and 'OR'
      // a constant boolean term that is not neutral is necessarily absorbing
      s2 = Set(BoolConstant(constantTerm))
    } else {
      s2 = rest
    }
    if (s2.size == 1) {
      s2.head
    } else {
      builder(s2)
    }
  }

  override def getSubExpression(x: String): Option[IntExpression] = {
    object hasSubExpr {
      def unapply(b: BoolExpression): Option[IntExpression] = {
        b.getSubExpression(x)
      }
    }
    def pf: PartialFunction[BoolExpression,IntExpression] = (_: BoolExpression) match {
      case hasSubExpr(e) => e
    }
    terms.collectFirst(pf)
  }

  def partialEval(pattern: IntExpression, replace: IntExpression): BoolExpression =
    builder(terms map { e => e.partialEval(pattern, replace) }).simplify()
}

/**
 * n-ary boolean AND
 */
case class And private[expressions] (override val terms: Set[BoolExpression]) extends NaryBoolExpression(terms) {
  def flattenHelper(x: BoolExpression): Set[BoolExpression] = {
    x match {
      case And(y)   => y
      case _        => Set(x)
    }
  }

  def neutral: Boolean = true

  def operation(x: Boolean, y: Boolean): Boolean = x && y

  def builder(s: Set[BoolExpression]) = And(s)
}

/**
 * n-ary boolean OR
 */
case class Or private[expressions] (override val terms: Set[BoolExpression]) extends NaryBoolExpression(terms) {
  def flattenHelper(x: BoolExpression): Set[BoolExpression] = {
    x match {
      case Or(y)   => y
      case _        => Set(x)
    }
  }

  def neutral: Boolean = false

  def operation(x: Boolean, y: Boolean): Boolean = x || y

  def builder(s: Set[BoolExpression]) = Or(s)
}

/**
 * Represent binary boolean expression (comparisons between integer expressions)
 */
sealed abstract class BinaryBoolExpression protected (val lhs: IntExpression, val rhs: IntExpression) extends BoolExpression {
  /**
   * the operation on plain integers
   */
  def operation(x: Int,y: Int): Boolean
  /**
   * helper function for simplify
   */
  def builder(x: IntExpression, y: IntExpression): BoolExpression

  def simplify(): BoolExpression = {
    // recursive calls
    val l = lhs.simplify()
    val r = rhs.simplify()
    (l,r) match {
      case (Constant(i),Constant(j))  => BoolConstant(operation(i,j))
      case (_,_)                      => builder(l,r)
    }
  }

  override def getSubExpression(x: String): Option[IntExpression] = {
    lhs.getSubExpression(x) match {
      case e @ Some(_)  => e
      case None         => rhs.getSubExpression(x) match {
        case f @ Some(_)  => f
        case None         => None
      }
    }
  }

  def partialEval(pattern: IntExpression, replace: IntExpression): BoolExpression =
    builder(lhs.partialEval(pattern, replace), rhs.partialEval(pattern, replace)).simplify()
}

case class Eq private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryBoolExpression(lhs,rhs) {
  def operation(x: Int, y: Int): Boolean = x == y

  //@TODO sort the variables to get a canonical expression
  def builder(x: IntExpression, y: IntExpression) = Eq(x,y)
}

case class Neq private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryBoolExpression(lhs,rhs) {
  def operation(x: Int, y: Int): Boolean = x != y

  //@TODO sort the variables to get a canonical expression
  def builder(x: IntExpression, y: IntExpression) = Neq(x,y)
}

case class Gt private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryBoolExpression(lhs,rhs) {
  def operation(x: Int, y: Int): Boolean = x > y

  def builder(x: IntExpression, y: IntExpression) = Lt(y,x)
}

case class Lt private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryBoolExpression(lhs,rhs) {
  def operation(x: Int, y: Int): Boolean = x < y

  def builder(x: IntExpression, y: IntExpression) = Lt(x,y)
}

case class Geq private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryBoolExpression(lhs,rhs) {
  def operation(x: Int, y: Int): Boolean = x >= y

  def builder(x: IntExpression, y: IntExpression) = Leq(y,x)
}

case class Leq private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryBoolExpression(lhs,rhs) {
  def operation(x: Int, y: Int): Boolean = x <= y

  def builder(x: IntExpression, y: IntExpression) = Leq(x,y)
}

/**
 * A factory to build boolean expressions
 */
object BoolExpressionFactory {
  def isInSupport(v: String, expr: BoolExpression): Boolean = {
    expr match {
      case e: NaryBoolExpression    => e.terms.foldLeft(false)({ (x,y) => x || y.isInSupport(v) })
      case e: BinaryBoolExpression  => e.lhs.isInSupport(v) || e.rhs.isInSupport(v)
      case BoolConstant(_)          => false
      case Not(b)                   => b.isInSupport(v)
    }
  }

  def createBoolConstant(b: Boolean): BoolExpression = BoolConstant(b)

  def createBinaryOr(left: BoolExpression, right: BoolExpression): BoolExpression = Or(Set(left,right)).simplify()

  def createOr(s: Set[BoolExpression]): BoolExpression = Or(s).simplify()

  def createBinaryAnd(left: BoolExpression, right: BoolExpression): BoolExpression = And(Set(left,right)).simplify()

  def createAnd(s: Set[BoolExpression]): BoolExpression = And(s).simplify()

  def createNot(b: BoolExpression) = Not(b).simplify()

  def createEq(l: IntExpression,r: IntExpression)   = Eq(l,r).simplify()
  def createNeq(l: IntExpression,r: IntExpression)  = Neq(l,r).simplify()
  def createLeq(l: IntExpression,r: IntExpression)  = Leq(l,r).simplify()
  def createGeq(l: IntExpression,r: IntExpression)  = Geq(l,r).simplify()
  def createLt(l: IntExpression,r: IntExpression)   = Lt(l,r).simplify()
  def createGt(l: IntExpression,r: IntExpression)   = Gt(l,r).simplify()
}