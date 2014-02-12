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
package ch.unige.cui.smv.stratagem.beem

import ch.unige.cui.smv.stratagem.beem.expressions.BooleanExpression
import ch.unige.cui.smv.stratagem.beem.expressions.VoidExpression

/**
 * Represents a divine transition.
 * @param stateChange is a tuple where the first entry is the process's state before the execution of the transition
 * and the second entry is the process's state after the execution of the transition.
 * @param guard represents the guard of the transition
 * @param effects a list of expressions representing the changes in the global variables and the process's variables
 * @author mundacho
 *
 */
class DivineTransition(val stateChange: (Symbol, Symbol), val guard: BooleanExpression, val effects: VoidExpression*)