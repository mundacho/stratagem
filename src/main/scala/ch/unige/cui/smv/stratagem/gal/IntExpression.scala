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

import ch.unige.cui.smv.stratagem.gal.PrettyPrinter

/**
 * Represents integer expression
 *
 * @author mcolange
 *
 * @TODO move neutral elements to a companion object, to save a field in all objects
 *
 */
sealed abstract class IntExpression {
  def simplify(): IntExpression

  def isInSupport(x: String): Boolean

  /**
   * returns a <b>proper</b> sub-expression that contains the variable x
   * @param x a variable to be contained in the sub-expression
   * @return Some(e) if such a proper sub-expression exists, None otherwise
   */
  def getSubExpression(x: String): Option[IntExpression] = None

  /**
   * @TODO 'final' does not produce compile-time error when trying to overload, strange, isn't it?
   */
  final def partialEval(pattern: IntExpression, replace: IntExpression): IntExpression = this match {
    case `pattern`  => replace
    case _          => partialEvalAux(pattern, replace)
  }

  protected def partialEvalAux(pattern: IntExpression, replace: IntExpression): IntExpression

  override def toString(): String = throw new NotImplementedError("the print method is not implemented for this IntExpression!")

  /**
   * A helper function to make the creation of IntExpression less verbose
   */
  def + (that: IntExpression) = {
    IntExpressionFactory.createBinaryAddition(this,that)
  }
}

/**
 * integer constant
 */
case class Constant private[expressions] (val value: Int) extends IntExpression {
  def simplify(): IntExpression = this

  def isInSupport(x: String): Boolean = false

  /**
   * the pattern is not a constant expression (or it is quite a strange manner to use the mechanism)
   */
  def partialEvalAux(pattern: IntExpression, replace: IntExpression): IntExpression = this

  override def toString(): String = value.toString
}

/**
 * integer variable
 */
case class IntVariable private[expressions] (val name: String) extends IntExpression {
  def simplify(): IntExpression = this

  def isInSupport(x: String): Boolean = name == x

  def partialEvalAux(pattern: IntExpression, replace: IntExpression): IntExpression = this

  override def toString(): String = name
}

/**
 * embed a boolean expression.
 * `true` is 1 and `false` is 0
 */
case class WrapBool private[expressions] (val value: BoolExpression) extends IntExpression {
  def simplify(): IntExpression = {
    value.simplify() match {
      case BoolConstant(b)  => if (b) Constant(1) else Constant(0)
      case b: Any           => WrapBool(b)
    }
  }

  def isInSupport(x: String): Boolean = value.isInSupport(x)

  override def getSubExpression(x: String): Option[IntExpression] = value.getSubExpression(x)

  def partialEvalAux(pattern: IntExpression, replace: IntExpression): IntExpression =
    IntExpressionFactory.createWrapBool(value.partialEval(pattern, replace))

  override def toString(): String = "[" + value + "]"
}

/**
 * access to the cell of an array
 */
case class ArrayAccess private[expressions] (val arrayName: String, val index: IntExpression) extends IntExpression {
  def simplify(): IntExpression = ArrayAccess(arrayName,index.simplify())

  def isInSupport(x: String): Boolean = {
    // is v of the form `arrayName[i]`?
    val pos = x.indexOf('[')
    if (pos == -1 || x.take(pos) != arrayName) {
      // recursively check the index
      index.isInSupport(x)
    } else {
      // toInt should not throw, since the index is properly extracted
      val vIndex = x.substring(pos + 1, x.size - 1).toInt
      index match {
        case Constant(`vIndex`)  => true
        case Constant(_)         => false
        case _                   => true
      }
    }
  }

  override def getSubExpression(x: String): Option[IntExpression] = {
    index match {
      case Constant(_)  => None
      case _            => Some(index)
    }
  }

  def partialEvalAux(pattern: IntExpression, replace: IntExpression) =
    index match {
      case Constant(i) => if (IntExpressionFactory.createIntVariable(toString) == pattern) replace else this
      case _           => IntExpressionFactory.createArrayAccess(arrayName, index.partialEval(pattern, replace))
    }

  override def toString(): String = arrayName + "[" + index + "]"
}

/**
 * access to a given cell of an array
 * @TODO really useful?
 */
//case class ConstArray() extends IntExpression

/**
 * represents n-ary integer operations
 */
sealed abstract class NaryIntExpression protected (val terms: Array[IntExpression]) extends IntExpression {
  def flattenHelper(x: IntExpression): Array[IntExpression]
  val neutral: Int
  def operation(x: Int,y: Int): Int
  def builder(s: Array[IntExpression]): IntExpression

  def simplify(): IntExpression = {
    // recursive calls
    var s = terms map ({ case e: Any => e.simplify() })
    // flatten
    s = s.flatMap(flattenHelper)
    // gather constants
    val (constants,rest) = s.partition({x => x match { case Constant(_) => true; case _ => false }})
    val constantTerm = constants.foldLeft(neutral)({ case (x,Constant(y)) => operation(x,y) })
    s = rest
    if (constantTerm != neutral) {
      s = s :+ Constant(constantTerm)
    }
    if (s.size == 1) {
      s.head
    } else {
      builder(s)
    }
  }

  def isInSupport(x: String): Boolean = {
    terms.find({ e => e.isInSupport(x) }) match {
      case Some(_)  => true
      case None     => false
    }
  }

  override def getSubExpression(x: String): Option[IntExpression] = {
    terms.find({ e => e.isInSupport(x) })
  }

  def partialEvalAux(pattern: IntExpression, replace: IntExpression) = {
    builder(terms map { e => e.partialEval(pattern, replace) }).simplify()
  }

  def opSymbol(): String

  override def toString(): String = {
    var res = ""
    for (v <- terms) {
      if (v == terms.head) {
        res += v
      } else {
        res += opSymbol + v
      }
    }
    res
  }
}

/**
 * n-ary integer addition
 */
case class Plus private[expressions] (override val terms: Array[IntExpression]) extends NaryIntExpression(terms) {
  def flattenHelper(x: IntExpression): Array[IntExpression] = {
    x match {
      case Plus(y)  => y
      case _        => Array(x)
    }
  }

  val neutral: Int = 0

  def operation(x: Int, y: Int): Int = x + y

  def builder(s: Array[IntExpression]): IntExpression = Plus(s)

  def opSymbol(): String = " + "
}

/**
 * n-ary integer multiplication
 */
case class Mult private[expressions] (override val terms: Array[IntExpression]) extends NaryIntExpression(terms) {
  def flattenHelper(x: IntExpression): Array[IntExpression] = {
    x match {
      case Mult(y)  => y
      case _        => Array(x)
    }
  }

  val neutral: Int = 1

  def operation(x: Int, y: Int): Int = x * y

  def builder(s: Array[IntExpression]): IntExpression = Mult(s)

  def opSymbol(): String = " * "
}

/**
 * n-ary integer bitwise AND
 */
case class BitAnd private[expressions] (override val terms: Array[IntExpression]) extends NaryIntExpression(terms) {
  def flattenHelper(x: IntExpression): Array[IntExpression] = {
    x match {
      case BitAnd(y)  => y
      case _          => Array(x)
    }
  }

  val neutral: Int = 0xffffffff

  def operation(x: Int, y: Int): Int = x & y

  def builder(s: Array[IntExpression]): IntExpression = BitAnd(s)

  def opSymbol(): String = " & "
}

/**
 * n-ary integer bitwise OR
 */
case class BitOr private[expressions] (override val terms: Array[IntExpression]) extends NaryIntExpression(terms) {
  def flattenHelper(x: IntExpression): Array[IntExpression] = {
    x match {
      case BitOr(y)  => y
      case _          => Array(x)
    }
  }

  val neutral: Int = 0

  def operation(x: Int, y: Int): Int = x | y

  def builder(s: Array[IntExpression]): IntExpression = BitOr(s)

  def opSymbol(): String = " | "
}

/**
 * n-ary integer bitwise XOR
 */
case class BitXor private[expressions] (override val terms: Array[IntExpression]) extends NaryIntExpression(terms) {
  def flattenHelper(x: IntExpression): Array[IntExpression] = {
    x match {
      case BitXor(y)  => y
      case _          => Array(x)
    }
  }

  val neutral: Int = 0

  def operation(x: Int, y: Int): Int = x ^ y

  def builder(s: Array[IntExpression]): IntExpression = BitXor(s)

  def opSymbol(): String = " ^ "
}

/**
 * represents binary integer operations
 */
sealed abstract class BinaryIntExpression protected (val lhs: IntExpression, val rhs: IntExpression) extends IntExpression {
  /**
   * left-neutral element
   */
  def lneutral: Option[Int]
  /**
   * right-neutral element
   */
  def rneutral: Option[Int]
  /**
   * the operation on plain integers
   */
  def operation(x: Int,y: Int): Int
  /**
   * a helper function for the simplification
   */
  protected def builder(l: IntExpression,r: IntExpression): IntExpression

  /**
   * Simplifies the expression, by recursive simplification and neutral element simplification.
   * @TODO also use absorbing element?
   */
  def simplify(): IntExpression = {
    // recursive calls
    val l = lhs.simplify()
    val r = rhs.simplify()
    (l,r,lneutral,rneutral) match {
      case (Constant(i),Constant(j),_,_)            => Constant(operation(i,j))
      case (_,Constant(p),_,Some(q))  if (p == q)   => l
      case (Constant(p),_,Some(q),_)  if (p == q)   => r
      case (_,_,_,_)                                => builder(l,r)
    }
  }

  def isInSupport(x: String): Boolean = {
    lhs.isInSupport(x) || rhs.isInSupport(x)
  }

  override def getSubExpression(x: String): Option[IntExpression] = {
    if (lhs.isInSupport(x)) {
      Some(lhs)
    } else if (rhs.isInSupport(x)) {
      Some(rhs)
    } else {
      None
    }
  }

  def partialEvalAux(pattern: IntExpression, replace: IntExpression): IntExpression =
    builder(lhs.partialEval(pattern, replace), rhs.partialEval(pattern, replace)).simplify()

  def opSymbol(): String

  override def toString(): String = lhs + opSymbol() + rhs
}

/**
 * binary subtraction
 */
case class Minus private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryIntExpression(lhs,rhs) {
  def lneutral: Option[Int] = None
  def rneutral: Option[Int] = Some(0)
  def operation(x: Int,y: Int) = x - y
  def builder(l: IntExpression, r: IntExpression): IntExpression = Minus(l,r)
  def opSymbol(): String = " - "
}

/**
 * binary division
 */
case class Divide private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryIntExpression(lhs,rhs) {
  def lneutral: Option[Int] = None
  def rneutral: Option[Int] = Some(1)
  def operation(x: Int,y: Int) = x / y
  def builder(l: IntExpression, r: IntExpression): IntExpression = Divide(l,r)
  def opSymbol(): String = " / "
}

/**
 * binary modulo
 */
case class Modulo private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryIntExpression(lhs,rhs) {
  def lneutral: Option[Int] = None
  def rneutral: Option[Int] = None
  def operation(x: Int,y: Int) = x % y
  def builder(l: IntExpression, r: IntExpression): IntExpression = Modulo(l,r)
  def opSymbol(): String = " % "
}

/**
 * raise to the power
 */
case class Power private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryIntExpression(lhs,rhs) {
  def lneutral: Option[Int] = None
  def rneutral: Option[Int] = Some(1)
  // @TODO use quick exponentiation
  def operation(x: Int,y: Int): Int = {
    require(y >= 0, "the exponent must be non-negative")
    y match {
      case 0 => 1
      case _ => x*operation(x,y-1)
    }
  }
  def builder(l: IntExpression, r: IntExpression): IntExpression = Power(l,r)
  def opSymbol(): String = " ** "
}

/**
 * bit left shift
 */
case class LShift private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryIntExpression(lhs,rhs) {
  def lneutral: Option[Int] = None
  def rneutral: Option[Int] = Some(0)
  def operation(x: Int,y: Int) = x << y
  def builder(l: IntExpression, r: IntExpression): IntExpression = LShift(l,r)
  def opSymbol(): String = " << "
}

/**
 * bit right shift
 */
case class RShift private[expressions] (override val lhs: IntExpression, override val rhs: IntExpression) extends BinaryIntExpression(lhs,rhs) {
  def lneutral: Option[Int] = None
  def rneutral: Option[Int] = Some(0)
  def operation(x: Int,y: Int) = x >> y
  def builder(l: IntExpression, r: IntExpression): IntExpression = RShift(l,r)
  def opSymbol(): String = " >> "
}

/**
 * A factory for IntExpr, ensures simplification during construction
 */
object IntExpressionFactory {
  def createConstant(i: Int) = Constant(i)
  def createIntVariable(x: String) = IntVariable(x)
  def createArrayAccess(a: String,i: IntExpression) = ArrayAccess(a,i).simplify()
  def createWrapBool(b: BoolExpression) = WrapBool(b).simplify()

  def createBinaryAddition(l: IntExpression, r: IntExpression) = Plus(Array(l,r)).simplify()
  def createPlus(s: Array[IntExpression]) = Plus(s).simplify()

  def createBinaryMult(l: IntExpression, r: IntExpression) = Mult(Array(l,r)).simplify()
  def createMult(s: Array[IntExpression]) = Mult(s).simplify()

  def createBinaryBitor(l: IntExpression, r: IntExpression) = BitOr(Array(l,r)).simplify()
  def createBitOr(s: Array[IntExpression]) = BitOr(s).simplify()

  def createBinaryBitxor(l: IntExpression, r: IntExpression) = BitXor(Array(l,r)).simplify()
  def createBitXor(s: Array[IntExpression]) = BitXor(s).simplify()

  def createBinaryBitand(l: IntExpression, r: IntExpression) = BitAnd(Array(l,r)).simplify()
  def createBitAnd(s: Array[IntExpression]) = BitAnd(s).simplify()

  def createMinus(l: IntExpression, r:IntExpression) = {
    Minus(l,r).simplify()
  }

  def createDivide(l: IntExpression, r:IntExpression) = {
    Divide(l,r).simplify()
  }

  def createPower(l: IntExpression, r: IntExpression) = {
    Power(l,r).simplify()
  }

  def createModulo(l: IntExpression, r: IntExpression) = {
    Modulo(l,r).simplify()
  }

  def createLShift(l: IntExpression, r: IntExpression) = {
    LShift(l,r).simplify()
  }

  def createRShift(l: IntExpression, r: IntExpression) = {
    RShift(l,r).simplify()
  }
}
