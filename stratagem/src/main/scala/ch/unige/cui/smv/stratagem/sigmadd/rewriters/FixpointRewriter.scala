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

package ch.unige.cui.smv.stratagem.sigmadd.rewriters

import com.typesafe.scalalogging.slf4j.Logging
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl

/**
 * Implements the fixpoint rewriter. It applies its rewriter until a fixpoint is reached.
 * @param rewriter the rewriter to be applied.
 */
private[sigmadd] case class FixpointRewriter(rewriter: SigmaDDRewriter, override val sigmaDDFactory: SigmaDDFactoryImpl) extends SigmaDDRewriter(sigmaDDFactory) with Logging {

  override lazy val hashCode = (this.getClass(), rewriter).hashCode

  override lazy val toString = (new StringBuilder("FixpointRewriter(") append rewriter.toString append ")").toString

  override def equals(obj: Any): Boolean = obj match {
    case that @ FixpointRewriter(r, _) => (this eq that) || (rewriter == r)
    case _ => false
  }

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
//    logger.trace(s"Entering fixpoint rewriter: ${this}")
    logger.trace(s"Fixpoint rewriter was applied on top of term with functor: ${sigmaDD.iipf.alpha.keys.head}")
    var result = rewriter(sigmaDD)
    //    logger.trace(s"Fixpoint rewriter was applied on top of term with functor:\n" + s"${sigmaDD}")
    if (result == None) { None } // no fixpoint
    else {
      var newResult = rewriter(result.get)
      logger.trace(s"Fixpoint rewriter has generated a decision diagram of size: ${newResult.get.size}")
      while ((newResult != None) && (result.get ne newResult.get)) {
        result = newResult
        newResult = rewriter(result.get)
//        if (newResult.get.iipf.alpha.keys.head.toString.startsWith("{sc")) {
          logger.trace(s"Fixpoint rewriter has generated a decision diagram of size: ${newResult.get.size}")
//        }
      }
      newResult
    }
  }
}