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

package ch.unige.cui.smv.stratagem.sigmadd

/**
 * Implements the choice strategy.
 * @param rewriter1 is the rewriter created by the first strategy of the original choice strategy.
 * @param rewriter2 is the rewriter created by the second strategy of the original choice strategy.
 */
private[sigmadd] case class ChoiceRewriter(rewriter1: SigmaDDRewriter, rewriter2: SigmaDDRewriter) extends SigmaDDRewriter {

  override lazy val hashCode = (this.getClass(), rewriter1, rewriter2).hashCode

  override lazy val toString = "ChoiceRewriter(" + rewriter1.toString + ", " + rewriter2.toString + ")"

  override def equals(obj: Any): Boolean = obj match {
    case that @ ChoiceRewriter(r1, r2) => (this eq that) || ((rewriter1 == r1) && (rewriter2 == r2))
    case _ => false
  }

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = rewriter1(sigmaDD) match {
    case None => rewriter2(sigmaDD)
    case Some(result) => Some(result)
  }
}