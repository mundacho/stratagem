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

import ch.unige.cui.smv.stratagem.gal.expressions.BoolExpression
import ch.unige.cui.smv.stratagem.gal.expressions.IntExpression

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
    res += " [ " + guard + " ] {\n"
    res += PrettyPrinter.printAction(action)
    res += "\n}\n"
    res
  }
}

/**
 * @TODO this object does not belong here
 */
object PrettyPrinter {
  def printAction: Statement => String = _ match {
    case SeqStatement(s)      => s./:("")({ case (a: String,b: Statement) => a + "\n" + printAction(b) }: (String,Statement) => String)
    case Assignment(l,r)  => l + " = " + r + ";"
    case Abort()          => "abort;"
    case ITE(c,l,r)       => "if (" + c + ") {" + printAction(l) + "} else {" + printAction(r) + "}"
    case FixStatement(b)  => "fixpoint {" + printAction(b) + "}"
    case Call(l)          => "self." + l + ";"
  }
}
