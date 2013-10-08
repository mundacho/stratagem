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

package ch.unige.cui.smv.stratagem.adt

/**
 * Represents a signature. Formally, a set of sorts and a set of operations, each operation having its own arity. This object is immutable.
 *
 * @param sorts the set of sorts.
 * @param generators the set of generators.
 * @param operations the set of operations.
 */
class Signature private (val sorts: Map[String, ASort], val generators: Map[String, Operation], val operations: Map[String, Operation]) {

  /**
   * Creates a signature without sorts.
   *
   */
  def this() = {
    this(Map.empty, Map.empty, Map.empty)
  }

  /**
   * Adds a sort. Does not allow repeated sorts.
   * @param sortName the name of the sort.
   * @return a signature with the sort it its set of sorts.
   */
  def withSort(sortName: String) = {
    val sort = Sort(sortName)
    require(!sorts.isDefinedAt(sortName), "Redefinition of sort. Sort \"" + sort + "\" is already present in the signature")
    new Signature(sorts + (sortName -> Sort(sortName)), generators, operations)
  }

  /**
   * Adds a subsort.
   *
   * @param subSort the subsorts's name to be added. It must not exist in the signature
   * @param sort the super sort. It must exist in the signature.
   * @return a signature with the sort it its set of sorts.
   */
  def withSort(subSort: String, sort: String) = {
    require(!sorts.isDefinedAt(subSort), "Subsort \"" + subSort + "\" already present in the signature")
    require(sorts.isDefinedAt(sort), "Super sort \"" + sort + "\" is not present in the signature. Please define it.")
    new Signature(sorts + (subSort -> SubSort(subSort, sorts(sort))), generators, operations)
  }

  /**
   * Adds an operation.
   *
   * @param name the operation's name
   * @param returnSortName the name of the return sort.
   * @param params list of strings that represent the arity (i.e. list of sorts) taken as parameters.
   * @return a signature with the new operation.
   */
  def withOperation(name: String, returnSortName: String, params: String*) = {
    require(!sorts.isEmpty, "No sorts in this signature")
    require(sorts.isDefinedAt(returnSortName), "The return sort is not part of this signature")
    require(!operations.isDefinedAt(name), "Redefinition of operation. Operation \"" + name + "\" is already in this signature")
    require(!generators.isDefinedAt(name), "Operation \"" + name + "\" is already in this signature as a generator")
    val listOfIllegalSorts = params.filter(aritySortName => !sorts.contains(aritySortName)).isEmpty
    require(listOfIllegalSorts, "The arity contains a sort that is not part of this signature: " + listOfIllegalSorts)
    new Signature(sorts, generators, operations + (name -> Operation(name, sorts(returnSortName), params.toList.map(sorts(_)))))
  }

  /**
   * Adds a generator.
   *
   * @param name the generator's name
   * @param returnSortName the name of the return sort.
   * @param params list of strings that represent the arity (i.e. list of sorts) taken as parameters.
   * @return a signature with the new operation.
   */
  def withGenerator(name: String, returnSortName: String, params: String*) = {
    require(!sorts.isEmpty, "No sorts in this signature")
    require(sorts.isDefinedAt(returnSortName), "The return sort is not part of this signature")
    require(!generators.isDefinedAt(name), "Redefinition of generator. Generator \"" + name + "\" is already in this signature")
    require(!operations.isDefinedAt(name), "Generator \"" + name + "\" is defined in this signature as an operation")
    val listOfIllegalSorts = params.filter(aritySortName => !sorts.contains(aritySortName)).isEmpty
    require(listOfIllegalSorts, "The arity contains a sort that is not part of this signature: " + listOfIllegalSorts)
    new Signature(sorts, generators + (name -> Operation(name, sorts(returnSortName), params.toList.map(sorts(_)))), operations)
  }
}