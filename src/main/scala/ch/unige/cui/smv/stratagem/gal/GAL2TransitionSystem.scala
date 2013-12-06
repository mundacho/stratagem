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

import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.Signature

import ch.unige.cui.smv.stratagem.gal.expressions.BoolExpression

import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Fail
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.ts.GALAssignment
import ch.unige.cui.smv.stratagem.ts.GALPredicate
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.VariableStrategy

/**
 * A translater that turns a GAL into a Transition System.
 * @TODO is not it possible to use plain integers instead of algebraic ones?
 * @TODO turn some of the methods to private ones?
 *
 * @author mcolange
 */
object GAL2TransitionSystem {
  /**
   * Macros for the signature (the EquivSplit rewritters use them)
   */
  val VARIABLE_SORT = "variable"
  val ENDVAR = "endvar"
  val INTEGER_SORT = "integer"
  val NAT_SORT = "nat"
  val NZNAT_SORT = "nznat"
  val ZERO = "zero"
  val SUCC = "suc"
  val NEG = "neg"

  /**
   * Basic signature
   */
  val basicSignature = (new Signature)
      .withSort(VARIABLE_SORT)
      .withGenerator(ENDVAR, VARIABLE_SORT)
      .withSort(INTEGER_SORT)
      .withSort(NAT_SORT, INTEGER_SORT)
      .withSort(NZNAT_SORT, NAT_SORT)
      .withGenerator(ZERO, NAT_SORT)
      .withGenerator(SUCC, NZNAT_SORT, NAT_SORT)
      .withGenerator(NEG, INTEGER_SORT, NZNAT_SORT)

  private val S = VariableStrategy("S")

  /**
   * @param arrayNames a list of array names
   * @param arraySizes maps each array name to its size
   * @return the list of cells of the arrays (t1[0], t1[1], t2[0], ...)
   */
  def array2variables(arrayNames: List[String], arraySizes: scala.collection.mutable.Map[String,Int]): List[String] = arrayNames match {
    case Nil => Nil
    case x::l => array2variablesAux(x, arraySizes(x)-1):::array2variables(l, arraySizes)
  }

  def array2variablesAux(name: String, size: Int): List[String] = size match {
    case 0      => List(name + "[0]")
    case i: Any => (name + "[" + i + "]")::array2variablesAux(name,i-1)
  }

  /**
   * Creates the appropriate signature given a list of variables.
   * This list should be produced from the list of variables and arrays of a GAL, using the above array2variables function.
   *
   * @param variables a list of variables
   * @return the signature for this list of variables
   */
  def createSignature(variables: List[String]): Signature = variables match {
    case Nil => basicSignature
    case x::l => createSignature(l).withGenerator(x, VARIABLE_SORT, INTEGER_SORT, VARIABLE_SORT)
  }

  private def myUnion(s1: Strategy, s2: Strategy) = {
    Choice(Union(s1, s2), Choice(s1, s2))
  }

  /**
   * Adds a set of Transition that share the same label to a TransitionSystem
   *
   * @param transitions   a list of transitions that share the same label
   * @param ts            a transition system to augment
   * @return a new TransitionSystem, the input TS augmented with the input transitions
   */
  private def addLabelledTransition(transitions: List[Transition], ts: TransitionSystem): TransitionSystem = {
    require(transitions.nonEmpty)
    val label = transitions.head.label
    val strategies = transitions map transition2strategy
    val union = strategies.reduceLeft((s1,s2) => myUnion(s1,s2))
    ts.declareStrategy(label)(union)(false)
  }

  /**
   * Creates the TS for the GAL model
   *
   * @param model the GAL to be turned into a TS
   * @return the corresponding TS
   */
  def createTransitionSystem(transitions: List[List[Transition]], adt: ADT, initState: ATerm): TransitionSystem = {
    transitions match {
      case Nil    => (new TransitionSystem(adt, initState)).declareStrategy("applyOnce", S)(Choice(S, One(DeclaredStrategyInstance("applyOnce", S), 2)))(false)
      case t::l   => addLabelledTransition(t, createTransitionSystem(l, adt, initState))
    }
  }

  /**
   * Creates the term encoding the initial state.
   * @TODO what about the variable ordering?
   *
   * @param vars        the list of all variables, including array cells.
   * @param initValue   the collection of initial values
   * @param adt         the ADT of the GAL
   * @return a term encoding the initial state
   */
  def createInitialState(vars: List[String], initValue: scala.collection.mutable.Map[String,Int], adt: ADT): ATerm = vars match {
    case Nil => adt.term(ENDVAR)
    case x::l => adt.term(x, adtInt(initValue(x), adt), createInitialState(l, initValue, adt))
  }

  /**
   * a helper function to turn a regular int into an algebraic int
   *
   * @param i   the plain integer to be translated
   * @param adt the used ADT (needs to be referred to in the returned term)
   * @return a term representing algebraically the input 'i'
   */
  def adtInt(i: Int, adt: ADT): ATerm = i match {
    case 0                => adt.term(ZERO)
    case a: Any if (a>0)  => adt.term(SUCC, adtInt(a-1, adt))
    case a: Any           => adt.term(NEG, adtInt(-a, adt))
  }

  /**
   * Translates a BoolExpression
   */
  def bool2strategy(expr: BoolExpression): Strategy = new GALPredicate(expr)

  /**
   * Translates a Statement
   * @TODO implement the call of labelled transitions
   */
  def statement2strategy(stat: Statement): Strategy = stat match {
    case Assignment(lhs, rhs) => new GALAssignment(lhs, rhs)
    case SeqStatement(s)      => s.toList match {
      case Nil        => Identity
      case x::l       => Sequence(statement2strategy(x),statement2strategy(SeqStatement(l.toArray)))
    }
    case ITE(c,bt,bf)         => myUnion(Sequence(bool2strategy(c),statement2strategy(bt)), Sequence(bool2strategy(! c),statement2strategy(bf)))
    case FixStatement(b)      => FixPointStrategy(statement2strategy(b))
    case Call(l)              => throw new NotImplementedError("call transitions by label is not implemented yet")
    case Abort()              => Fail
  }

  /**
   * Translates a transition
   */
  def transition2strategy(trans: Transition): NonVariableStrategy =
    ch.unige.cui.smv.stratagem.ts.Sequence(bool2strategy(trans.guard),statement2strategy(trans.action))

  def apply(model: GAL) = {
    // create the list of variables to create the signature
    val varList = model.variables.toList:::array2variables(model.arrays.toList,model.arraySize)
    // the signature
    val sign = createSignature(varList)
    // the ADT
    val adt = new ADT(model.name,sign).declareVariable("X",INTEGER_SORT).declareVariable("D",VARIABLE_SORT)
    // the initial state
    val initState = createInitialState(varList, model.initValue, adt)
    createTransitionSystem(model.transitions.toList.groupBy(t => t.label).values.toList, adt, initState).declareStrategy("___main___")(DeclaredStrategyInstance(""))(true)
  }
}