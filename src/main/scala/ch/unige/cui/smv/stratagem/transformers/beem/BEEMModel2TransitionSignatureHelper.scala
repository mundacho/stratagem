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
package ch.unige.cui.smv.stratagem.transformers.beem

import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.beem.DivineProcess
import ch.unige.cui.smv.stratagem.beem.DivineVariable
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.ATerm

/**
 * Helper object for the creation of the signature of a BEEM model.
 * @author mundacho
 *
 */
private[beem] object BEEMModel2TransitionSignatureHelper {

  // aux functions
  def lt(n1: ATerm, n2: ATerm)(implicit a: ADT) = a.term(LESS_THAN_FUNCTOR, n1, n2)
  def myEq(n1: ATerm, n2: ATerm)(implicit a: ADT) = a.term(EQ_FUNCTOR, n1, n2)
  def neq(n1: ATerm, n2: ATerm)(implicit a: ADT) = a.term(NEQ_FUNCTOR, n1, n2)
  def neg(n: ATerm)(implicit a: ADT) = a.term(NEG_FUNCTOR_NAME, n)
  def suc(n: ATerm)(implicit a: ADT) = a.term(SUC_FUNCTOR_NAME, n)
  def doubleVar(n1: ATerm, n2: ATerm, n3: ATerm)(implicit a: ADT) = a.term(DOUBLE_VAR_FUNCTOR, n1, n2, n3)
  def doubleVarNeg(n1: ATerm, n2: ATerm, n3: ATerm)(implicit a: ADT) = a.term(DOUBLE_VAR_NEG_FUNCTOR, n1, n2, n3)
  def plus(n1: ATerm, n2: ATerm)(implicit a: ADT) = a.term(PLUS_FUNCTOR, n1, n2)
  def minus(n1: ATerm, n2: ATerm)(implicit a: ADT) = a.term(MINUS_FUNCTOR, n1, n2)
  def intVar(n1: ATerm, n2: ATerm, n3: ATerm)(implicit a: ADT) = a.term(INT_VAR_FUNCTOR, n1, n2, n3)
  def arrVar(n1: ATerm, n2: ATerm, n3: ATerm)(implicit a: ADT) = a.term(ARRAY_VAR_FUNCTOR, n1, n2, n3)
  def _test(n1: ATerm, n2: ATerm)(implicit a: ADT) = a.term(TEST_FUNCTOR, n1, n2)
  def getArr(n1: ATerm, n2: ATerm)(implicit a: ADT) = a.term(GET_ARR_FUNCTOR, n1, n2)
  def arr(n1: ATerm, n2: ATerm)(implicit a: ADT) = a.term(ARRAY_FUNCTOR_NAME, n1, n2)
  def readVal(n1: ATerm, n2: ATerm)(implicit a: ADT) = a.term(READ_VAL_ARR_FUNCTOR, n1, n2)
  def valueAndIndex(n1: ATerm, n2: ATerm)(implicit a: ADT) = a.term(VAL_AND_INDEX_FUNCTOR, n1, n2)

  /**
   * Main function for the creation of the signature specific signature of the model.
   * @param globalVariables the global variables of the model.
   * @param processes a list containing all the processes defined in the model.
   * @param sign the base signature where everything will be added. It will not be modified.
   * @return a new signature that allows to describe the model passed in the parameters.
   */
  def createSignature(globalVariables: Map[String, DivineVariable], processes: List[DivineProcess], sign: Signature): Signature = globalVariables.toList.sortBy(_._1) match {
    case Nil => createSignature(processes, sign)
    case head :: tail =>
      if (!sign.generators.contains(head._2.name)) createSignature(tail.toMap, processes, sign.withGenerator(head._2.name, VARIABLE_NAME_SORT_NAME))
      else createSignature(tail.toMap, processes, sign) // skip the creation of the name
  }

  def createSignature(processes: List[DivineProcess], sign: Signature): Signature = processes match {
    case Nil => sign
    case proc :: tail => createSignature(tail, createSignatureForProces(proc, sign))
  }

  def createSignatureForProces(proc: DivineProcess, sign: Signature): Signature = {
    def createStatesInSignature(possibleStates: List[Symbol], sign: Signature): Signature = possibleStates match {
      case Nil => sign
      case s :: tail =>
        if (!sign.generators.contains(s.name)) createStatesInSignature(tail, sign.withGenerator(s.name, STATE_SORT_NAAME))
        else createStatesInSignature(tail, sign)
    }
    def createVariablesInSignature(variables: List[String], sign: Signature): Signature = variables match {
      case Nil => sign
      case s :: tail =>
        if (!sign.generators.contains(s)) createVariablesInSignature(tail, sign.withGenerator(s, VARIABLE_NAME_SORT_NAME))
        else createVariablesInSignature(tail, sign) // skip the creation of the name
    }
    val signWithProcesses = createStatesInSignature(proc.possibleStates.toList, sign.withGenerator(proc.name, PROCESS_NAME_SORT_NAME))
    createVariablesInSignature(proc.variables.keys.toList, signWithProcesses)
  }

  val NAT_SORT_NAME = "nat"
  val NZNAT_SORT_NAME = "nznat"
  val BOOL_SORT_NAME = "bool"
  val INT_SORT_NAME = "int"
  val STATE_SORT_NAAME = "state"
  val STATECOMP_SORT_NAME = "stateComponent"
  val ZERO_SORT_NAME = "zero"
  val ARRAY_SORT_NAME = "array"
  val VARIABLE_NAME_SORT_NAME = "variableName"
  val PROCESS_NAME_SORT_NAME = "processName"

  val TRUE_CONSTANT_NAME = "true"
  val FALSE_CONSTANT_NAME = "false"
  val EMPTY_STATE_CONSTANT = "emptyState"
  val EMPTY_ARRAY_CONSTANT_NAME = "emptyArray"
  val ZERO_CONSTANT_NAME = "zero"

  val INT_VAR_FUNCTOR = "intVar"
  val ARRAY_VAR_FUNCTOR = "arrayVar"
  val PROC_VAR_FUNCTOR = "procVar"
  val SUC_FUNCTOR_NAME = "suc"
  val NEG_FUNCTOR_NAME = "-"
  val ARRAY_FUNCTOR_NAME = "arr"
  val STATE_VAR_FUNCTOR_NAME = "statVar"

  val topStack = "___stack"
  val stackElt = "___stackElt"

  // operations functors
  val LESS_THAN_FUNCTOR = "lt"
  val EQ_FUNCTOR = "_eq"
  val NEQ_FUNCTOR = "_neq"
  val TEST_FUNCTOR = "_test"
  val DOUBLE_VAR_FUNCTOR = "doubleVar"
  val DOUBLE_VAR_NEG_FUNCTOR = "doubleVarNeg"
  val PLUS_FUNCTOR = "+"
  val MINUS_FUNCTOR = "minus"
  val GET_ARR_FUNCTOR = "getArr"
  val READ_VAL_ARR_FUNCTOR = "readVal"
  val VAL_AND_INDEX_FUNCTOR = "valIndex"

  val $s1 = "s1" // represents a state
  val $s2 = "s2" // represents a state
  val $i1 = "i1" // represents an integer
  val $i2 = "i2" // represents an integer
  val $n1 = "n1" // represents a nat
  val $n2 = "n2" // represents a nat
  val $nz1 = "nz1" // represents a nznat
  val $nz2 = "nz2" // represents a nznat
  val $nz3 = "nz3" // represents a nznat
  val $v1 = "v1" // represents a variable name
  val $a1 = "a1" // represents an array

  /**
   * The basic signature. It will be enriched with the variable names and operations specific for the model.
   */
  val basicSignature = (new Signature)
    .withSort(BOOL_SORT_NAME)
    .withSort(INT_SORT_NAME)
    .withSort(NAT_SORT_NAME, INT_SORT_NAME)
    .withSort(ZERO_SORT_NAME, NAT_SORT_NAME)
    .withSort(NZNAT_SORT_NAME, NAT_SORT_NAME)
    .withSort(STATECOMP_SORT_NAME)
    .withSort(STATE_SORT_NAAME)
    .withSort(VARIABLE_NAME_SORT_NAME)
    .withSort(ARRAY_SORT_NAME)
    .withSort(PROCESS_NAME_SORT_NAME)
    // Bool
    .withGenerator(TRUE_CONSTANT_NAME, BOOL_SORT_NAME)
    .withGenerator(FALSE_CONSTANT_NAME, BOOL_SORT_NAME)
    // Nat
    .withGenerator(ZERO_CONSTANT_NAME, ZERO_SORT_NAME)
    .withGenerator(SUC_FUNCTOR_NAME, NZNAT_SORT_NAME, NAT_SORT_NAME)
    // Int
    .withGenerator(NEG_FUNCTOR_NAME, INT_SORT_NAME, INT_SORT_NAME)
    // state
    .withGenerator(EMPTY_STATE_CONSTANT, STATECOMP_SORT_NAME)
    // operations
    .withOperation(LESS_THAN_FUNCTOR, BOOL_SORT_NAME, INT_SORT_NAME, INT_SORT_NAME)
    .withOperation(EQ_FUNCTOR, BOOL_SORT_NAME, INT_SORT_NAME, INT_SORT_NAME)
    .withOperation(NEQ_FUNCTOR, BOOL_SORT_NAME, INT_SORT_NAME, INT_SORT_NAME)
    .withOperation(TEST_FUNCTOR, STATECOMP_SORT_NAME, BOOL_SORT_NAME, STATECOMP_SORT_NAME)
    .withOperation(DOUBLE_VAR_FUNCTOR, INT_SORT_NAME, INT_SORT_NAME, INT_SORT_NAME, INT_SORT_NAME)
    .withOperation(DOUBLE_VAR_NEG_FUNCTOR, INT_SORT_NAME, INT_SORT_NAME, INT_SORT_NAME, INT_SORT_NAME)
    .withOperation(PLUS_FUNCTOR, INT_SORT_NAME, INT_SORT_NAME, INT_SORT_NAME)
    .withOperation(MINUS_FUNCTOR, INT_SORT_NAME, INT_SORT_NAME, INT_SORT_NAME)
    .withOperation(GET_ARR_FUNCTOR, ARRAY_SORT_NAME, INT_SORT_NAME, ARRAY_SORT_NAME) // this is before reading
    .withOperation(READ_VAL_ARR_FUNCTOR, ARRAY_SORT_NAME, INT_SORT_NAME, ARRAY_SORT_NAME) // this is after reading
    .withOperation(VAL_AND_INDEX_FUNCTOR, INT_SORT_NAME, INT_SORT_NAME, NAT_SORT_NAME) // container type for a value + an array index
    // var functors
    .withGenerator(INT_VAR_FUNCTOR, STATECOMP_SORT_NAME, VARIABLE_NAME_SORT_NAME, INT_SORT_NAME, STATECOMP_SORT_NAME)
    .withGenerator(ARRAY_VAR_FUNCTOR, STATECOMP_SORT_NAME, VARIABLE_NAME_SORT_NAME, ARRAY_SORT_NAME, STATECOMP_SORT_NAME)
    .withGenerator(STATE_VAR_FUNCTOR_NAME, STATECOMP_SORT_NAME, PROCESS_NAME_SORT_NAME, STATE_SORT_NAAME, STATECOMP_SORT_NAME)
    .withGenerator(PROC_VAR_FUNCTOR, STATECOMP_SORT_NAME, PROCESS_NAME_SORT_NAME, STATECOMP_SORT_NAME, STATECOMP_SORT_NAME)
    // array generators
    .withGenerator(ARRAY_FUNCTOR_NAME, ARRAY_SORT_NAME, INT_SORT_NAME, ARRAY_SORT_NAME)
    .withGenerator(EMPTY_ARRAY_CONSTANT_NAME, ARRAY_SORT_NAME)
    // temp variable name
    .withGenerator(topStack, VARIABLE_NAME_SORT_NAME)
    .withGenerator(stackElt, VARIABLE_NAME_SORT_NAME)

}