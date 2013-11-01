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

import scala.collection.immutable.HashMap

import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDIPFFactoryImpl
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDInductiveIPFFactoryImpl

private[sigmadd] class OneRewriter(rewr: => SigmaDDRewriter, val subTermPosition: Int) extends SigmaDDRewriter {

  lazy val rewriter = rewr

  override lazy val toString = "OneRewriter(" + rewriter.toString + ", " + subTermPosition + ")"

  override lazy val hashCode = (this.getClass(), rewriter, subTermPosition).hashCode

  override def equals(obj: Any): Boolean = obj match {
    case that: OneRewriter => (this eq that) || ((rewriter == that.rewriter) && (this.subTermPosition == that.subTermPosition))
    case _ => false
  }

  type InductiveIPF = SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl
  val top: SigmaDDInductiveIPFFactoryImpl.InductiveIPFImpl = SigmaDDInductiveIPFFactoryImpl.TopIPF

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
    val result = sigmaDD.iipf.alpha.map((entry) =>
      {
        val (key, inductiveIPF) = entry
        applyOneRewriterOnIIPF(inductiveIPF, subTermPosition) match {
          case None => None
          case Some(r) => Some(SigmaDDFactoryImpl.create((sigmaDD.sort, SigmaDDIPFFactoryImpl.create(key, r))))
        }
      }).filter(_ != None)
    if (result.isEmpty) None else result.reduce((e1, e2) => Some(e1.get v e2.get))
  }

  def applyOneRewriterOnIIPF(iipf: InductiveIPF, n: Int): Option[InductiveIPF] = iipf match {
    case SigmaDDInductiveIPFFactoryImpl.TopIPF => None // could not rewrite here
    case e: InductiveIPF => {
      val res = e.alpha.map((entry) => {
        val (sigmaDD, nextIIPF) = entry
        if (n == 0) {
          rewriter(sigmaDD) match {
            case Some(s) => Some(SigmaDDInductiveIPFFactoryImpl.create(HashMap(s -> nextIIPF)))
            case None => applyOneRewriterOnIIPF(nextIIPF, 0) match {
              case None => None
              case Some(i) => Some(SigmaDDInductiveIPFFactoryImpl.create(HashMap(sigmaDD -> i)))
            }
          }
        } else if (n == 1) {
          rewriter(sigmaDD) match {
            case Some(s) => Some(SigmaDDInductiveIPFFactoryImpl.create(HashMap(s -> nextIIPF)))
            case None => None
          }
        } else {
          assert(n > 1)
          applyOneRewriterOnIIPF(nextIIPF, n - 1) match {
            case Some(s) => Some(SigmaDDInductiveIPFFactoryImpl.create(HashMap(sigmaDD -> s)))
            case None => None
          }
        }
      }).view.filter(_ != None)
      if (res.isEmpty) None else res.reduce((e1, e2) => Some(e1.get v e2.get))
    }
  }

}