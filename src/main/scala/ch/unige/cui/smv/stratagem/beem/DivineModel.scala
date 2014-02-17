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

/**
 * Represents a Divine model.
 * @author mundacho
 *
 */
case class DivineModel(val globalVariables: Map[String, DivineVariable], val processes: List[DivineProcess]) {

  /**
   * Creates an empty model.
   */
  def this() {
    this(Map.empty, Nil)
  }

  /**
   * Declares a new array variable. Declaration defines the value of the array to an array containing all values equal to zero.
   *
   * @param nameSymbol a symbol representing the name of the array.
   * @param size the size of the array
   * @return a new divine model with the array declared.
   *
   */
  def declareArrayVariable(nameSymbol: Symbol, size: Int) = {
    require(!globalVariables.contains(nameSymbol.name), s"There is a variable with name ${nameSymbol.name} already in the this divine model.")
    require(size > 0, s"Invalid size $size for array ${nameSymbol}.name")
    this.copy(globalVariables = globalVariables + DivineArrayVariable(nameSymbol.name, Array(size)).asTuple)
  }

  /**
   * Declares an int variable.
   * @param nameSymbol a symbol representing the name of the variable.
   * @param initialVauel the initial value of the variable, when omitted its value is 0.
   * @return a new divine model with the int variable declared.
   */
  def declareIntVariable(nameSymbol: Symbol, initialValue: Int = 0) = {
    require(!globalVariables.contains(nameSymbol.name), s"There is a variable with name ${nameSymbol.name} already in the this divine model.")
    this.copy(globalVariables = globalVariables + DivineIntVariable(nameSymbol.name, initialValue).asTuple)
  }

  /**
   * Declares a process.
   * @param proc the process to be added.
   * @return a new divine model with the proc declared.
   */
  def declareProc(proc: DivineProcess) = {
    require(!processes.map(_.name).contains(proc.name), s"There is a process with the name ${proc.name} already defined")
    require(!proc.transitions.isEmpty, s"The proces ${proc.name} does not have any transitions. Unable to add it to the divine model")
    val newProc = proc.copy(container = Some(this))
    // Check that the process is well formed
    for (t <- newProc.transitions) {
      val (testRes1, message1) = newProc.checkVariables(t.guard)
      require(testRes1, s"Error at transition ${t.stateChange} of ${newProc.name}: ${message1}")
      for (e <- t.effects) {
        val (testRes2, message2) = newProc.checkVariables(e)
        require(testRes2, s"Error at transition ${t.effects} of ${newProc.name}: ${message2}")
      }
    }
    this.copy(processes = newProc :: processes)
  }

}