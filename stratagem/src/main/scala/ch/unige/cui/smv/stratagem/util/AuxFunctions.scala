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
package ch.unige.cui.smv.stratagem.util

import scala.collection.JavaConversions._

import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil

import com.typesafe.scalalogging.slf4j.Logging

import ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.metamodel.ts.SimpleStrategy
import ch.unige.cui.smv.metamodel.ts.TransitionSystem

/**
 * @author mundacho
 *
 */
object AuxFunctions extends Logging {

  lazy val identifierPattern = """([a-zA-Z_]\w+)""".r

  def timeAndSpace[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block // call-by-name
    val t1 = System.nanoTime()
    logger.debug("Elapsed time: " + (t1 - t0) * 1.0e-9 + "[seconds]")
    logger.debug("Total memory used: " + Runtime.getRuntime().totalMemory() / 1048576 + "[MB]")
    result
  }

  /**
   * Does the diagnostics of a transition system. For it to work it is necessary to do the linking first when is a manually created transition system.
   * @param ts the transtion system
   */
  def doDiagnostics(ts: TransitionSystem) = {
    def returnDiagnosticsAsListOfString(diagnostic: Diagnostic) = {
      val errors = diagnostic.getChildren()
      (for (error <- errors) yield {
        //            	  val node = org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode()
        val dataList = error.getData().headOption
        for (
          data <- dataList;
          if (error.getSource() != "org.eclipse.emf.ecore")
        ) yield {
          val node = org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode(data.asInstanceOf[EObject])
          (if (node != null) s"At line ${node.getStartLine}" else "") + s"${error.getMessage()}"
        }
      }).toList.collect({ case Some(e) => e })
    }
    val diagnostic = Diagnostician.INSTANCE.validate(ts);
    diagnostic.getSeverity() match {
      case Diagnostic.ERROR =>
        throw new IllegalTransitionSystemException(returnDiagnosticsAsListOfString(diagnostic))
      case Diagnostic.WARNING =>
        throw new IllegalTransitionSystemException(returnDiagnosticsAsListOfString(diagnostic))
      case _ => List() // No problem
    }
  }

  def doLinking(ts: TransitionSystem) {
    for (declaredStrategy <- ts.getAuxiliary() ++ ts.getTransitions()) {
      val treeIterator = EcoreUtil.getAllContents(declaredStrategy, true).asInstanceOf[TreeIterator[EObject]]
      while (treeIterator.hasNext()) {
        treeIterator.next() match {
          case s: DeclaredStrategyInstance =>
            s.setDeclaration(ts.getDeclaredStrategyByName(s.getName()))
            if (ts.getDeclaredStrategyByName(s.getName()) == null) {
              throw new IllegalTransitionSystemException(List(s"Usage of invalid strategy ${s.getName()} in declared strategy ${declaredStrategy.getName()}"))
            }
          case s: SimpleStrategy => treeIterator.prune
          case _ => // do nothing
        }
      }
    }
  }

}