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
package ch.unige.cui.smv.stratagem.modelchecker

import java.io.File
import com.typesafe.scalalogging.slf4j.Logging
import java.io.FileNotFoundException
import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import scala.collection.mutable.HashMap
import com.sun.corba.se.spi.orbutil.fsm.Input
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.Fail
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.NonVariableStrategy

/**
 * This object takes a file and transforms it to a stratagem transition system.
 *
 * @author mundacho
 *
 */
object PNML2TransitionSystem extends Logging {

  var name: String = ""

  case class Transition(val id: String, val inputArc: Set[(String, Int)], val outputArc: Set[(Int, String)])

  var signature = (new Signature)
    .withSort("place")
    .withSort("nat")
    .withGenerator("zero", "nat")
    .withGenerator("suc", "nat", "nat")
    .withGenerator("endplace", "place")

  def define(n: Int, initialTerm: ATerm, a: ADT): ATerm = n match {
    case 0 => initialTerm
    case _ => a.term("suc", (define(n - 1, initialTerm, a)))
  }

  def apply(input: File) = {

    val xml = loadFile(input)
    // first we create an adt
    val nameList = xml \ "net" \ "name" \ "text"
    name = extractName(nameList)
    logger.debug(s"Name of the petri net is $name")
    val places = (xml \ "net" \ "page" \ "place").map(p => {
      signature = signature.withGenerator((p \ "@id").text, "place", "nat", "place")
      p
    })
    var adt = (new ADT(name, signature))
      .declareVariable("p", "place")
      .declareVariable("x", "nat")
    // we can now create the initial term
    var term = adt.term("endplace")
    logger.debug(s"Number of places in the net is ${places.size}")
    for (p <- places) {
      val placeId = (p \ "@id").text
      if ((p \ "initialMarking" \ "text").size == 0) {
        term = adt.term(placeId, adt.term("zero"), term)
      } else {
        val numberOfTokens = (p \ "initialMarking" \ "text").text.toInt
        term = adt.term(placeId, define(numberOfTokens, adt.term("zero"), adt), term)
      }
    }
    val initialState = term
    // now we define the transitions
    var ts = new TransitionSystem(adt, initialState)

    val transitions = HashMap((xml \ "net" \ "page" \ "transition").map(t => ((t \ "@id").text, new Transition((t \ "@id").text, Set.empty, Set.empty))).toArray: _*)
    logger.debug(s"Number of transitions is ${transitions.size}")
    val arcs = xml \ "net" \ "page" \ "arc"
    val arcsByTransition = arcs.groupBy(arc => extractTransition(transitions, arc))
    arcsByTransition.foreach { e =>
      {
        val (transitionId, embeddedArcs) = e
        for (arc <- embeddedArcs) {
          val arcInscription = (arc \ "inscription" \ "text").text
          val numberOfTokens = if (arcInscription.isEmpty()) 1 else arcInscription.toInt
          val source = (arc \ "@source").text
          val target = (arc \ "@target").text
          if (source == transitionId) {
            transitions(source) = new Transition(transitionId, transitions(source).inputArc, transitions(source).outputArc + ((numberOfTokens, target)))
          } else if (target == transitionId) {
            transitions(target) = new Transition(transitionId, transitions(target).inputArc + ((source, numberOfTokens)), transitions(target).outputArc)
          }
        }
      }
    }
    // now we need to transform all those transitions to rewrite rules.

    var i = 1
    val S = VariableStrategy("S")
    def ApplyOnce(s: Strategy) = DeclaredStrategyInstance("applyOnce", s)
    ts = ts.declareStrategy("applyOnce", S)(Choice(S, One(ApplyOnce(S), 2)))(false)

    transitions.values.foreach { t =>
      var sequenceOfActions: NonVariableStrategy = Fail
      // for each input arc we create the h- rule
      t.inputArc.foreach { a =>
        val (source, numberOfTokens) = a
        val strategyName = t.id.concat(i.toString)
        ts = ts.declareStrategy(strategyName,
          adt.term(source, define(numberOfTokens, adt.term("x"), adt), adt.term("p")) -> adt.term(source, adt.term("x"), adt.term("p")))(false)
        i = i + 1
        sequenceOfActions = sequenceOfActions match {
          case Fail => ApplyOnce(DeclaredStrategyInstance(strategyName))
          case _ => Sequence(ApplyOnce(DeclaredStrategyInstance(strategyName)), sequenceOfActions)
        }
      }
      t.outputArc.foreach { a =>
        val (numberOfTokens, target) = a
        val strategyName = t.id.concat(i.toString)
        ts = ts.declareStrategy(strategyName,
          adt.term(target, adt.term("x"), adt.term("p")) -> adt.term(target, define(numberOfTokens, adt.term("x"), adt), adt.term("p")))(false)
        i = i + 1
        sequenceOfActions = sequenceOfActions match {
          case Fail => ApplyOnce(DeclaredStrategyInstance(strategyName))
          case _ => Sequence(ApplyOnce(DeclaredStrategyInstance(strategyName)), sequenceOfActions)
        }
      }
      // now we need to create a transition in our transition system for this transition t
      ts = ts.declareStrategy(t.id) { sequenceOfActions }(true)
    }
    ts
  }

  private def extractName(nameList: scala.xml.NodeSeq): String =
    if (nameList.isEmpty) {
      logger.warn("This petri net has no name")
      "anonymous petri net"
    } else if (nameList.size == 1) {
      nameList.head.text
    } else {
      logger.warn("This file has several name tags, chosing the first one")
      nameList(1).text
    }

  private def loadFile(input: java.io.File): scala.xml.Elem = {
    val res = try {
      Some(scala.xml.XML.loadFile(input))
    } catch {
      case ex: FileNotFoundException => {
        logger.error("Unable to open file " + input.getName())
        None
      }
    }
    if (res.isEmpty) System.exit(-1)
    res.get
  }

  private def extractTransition(transitions: scala.collection.mutable.HashMap[String, ch.unige.cui.smv.stratagem.modelchecker.PNML2TransitionSystem.Transition], arc: scala.xml.Node): String = {
    if (transitions.isDefinedAt((arc \ "@source").text)) {
      (arc \ "@source").text
    } else {
      (arc \ "@target").text
    }
  }
}