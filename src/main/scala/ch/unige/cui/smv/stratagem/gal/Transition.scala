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
package ch.unige.cui.smv.stratagem.gal

import ch.unige.cui.smv.stratagem.gal.expressions._

/**
 * Represents a GAL transition
 * @TODO redefine the toString method
 *
 * @author mcolange
 *
 */
case class Transition(val name: String, val label: String, val guard: BoolExpression, val action: SeqStatement) {
  override def toString() = {
    var res = "transition " + name
    if (label != "") {
      res += " label " + label
    }
    res += " [ " + PrettyPrinter.printBoolExpr(guard) + " ] {\n"
    res += PrettyPrinter.printAction(action)
    res += "}\n"
    res
  }
}

/**
 * @TODO this object does not belong here
 */
object PrettyPrinter {

  def printBoolExpr: BoolExpression => String = (_: BoolExpression) match {
    case BoolConstant(value)  => if (value) "true" else "false"
    case And(s)               => s./:("")({ case (a: String,b: BoolExpression) => a + " && " + printBoolExpr(b) }: (String,BoolExpression) => String)
    case Or(s)                => s./:("")({ case (a: String,b: BoolExpression) => a + " || " + printBoolExpr(b) }: (String,BoolExpression) => String)
    case Not(b)               => "!" + printBoolExpr(b)
    case Eq(l,r)              => printIntExpr(l) + "==" + printIntExpr(r)
    case Neq(l,r)             => printIntExpr(l) + "!=" + printIntExpr(r)
    case Gt(l,r)              => printIntExpr(l) + ">" + printIntExpr(r)
    case Lt(l,r)              => printIntExpr(l) + "<" + printIntExpr(r)
    case Geq(l,r)             => printIntExpr(l) + ">=" + printIntExpr(r)
    case Leq(l,r)             => printIntExpr(l) + "<=" + printIntExpr(r)
  }

  // @TODO all expressions are not printed
  def printIntExpr(arg: IntExpression): String = arg match {
    case Constant(i)      => i.toString
    case IntVariable(x)   => x
    case Plus(s)          => s./:("")({ case (a: String,b: IntExpression) => a + " + " + printIntExpr(b) }: (String,IntExpression) => String)
    case Mult(s)          => s./:("")({ case (a: String,b: IntExpression) => a + " * " + printIntExpr(b) }: (String,IntExpression) => String)
    case Minus(l,r)       => printIntExpr(l) + " - " + printIntExpr(r)
    case Divide(l,r)      => printIntExpr(l) + " / " + printIntExpr(r)
    case Modulo(l,r)      => printIntExpr(l) + " % " + printIntExpr(r)
    case Power(l,r)       => printIntExpr(l) + " ** " + printIntExpr(r)
    case ArrayAccess(l,r) => l + "[" + printIntExpr(r) + "]"
  }

  def printAction: Statement => String = _ match {
    case SeqStatement(s)      => s./:("")({ case (a: String,b: Statement) => a + "\n" + printAction(b) }: (String,Statement) => String)
    case Assignment(l,r)  => printIntExpr(l) + " = " + printIntExpr(r) + ";"
    case Abort()          => "abort;"
    case ITE(c,l,r)       => "if (" + printBoolExpr(c) + ") {" + printAction(l) + "} else {" + printAction(r) + "}"
    case FixStatement(b)  => "fixpoint {" + printAction(b) + "}"
    case Call(l)          => "self." + l + ";"
  }
}
