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
import ch.unige.cui.smv.stratagem.adt.ASortHelper

/**
 * Implementation of the all rewriter. Tries to apply a strategy s to all subterms.
 */
private[sigmadd] class AllRewriter(rewr: => SigmaDDRewriter, override val sigmaDDFactory: SigmaDDFactoryImpl) extends SigmaDDRewriter(sigmaDDFactory) {

  lazy val rewriter = rewr

  override lazy val toString = (new StringBuilder("AllRewriter(") append rewriter.toString append ")").toString

  override lazy val hashCode = (this.getClass(), rewriter).hashCode

  override def equals(obj: Any): Boolean = obj match {
    case that: AllRewriter => (this eq that) || ((rewriter == that.rewriter))
    case _ => false
  }

  type InductiveIPF = SigmaDDInductiveIPFFactoryImpl#InductiveIPFImpl
  val top: sigmaDDFactory.sigmaDDInductiveIPFFactory.InductiveIPFImpl = sigmaDDFactory.sigmaDDInductiveIPFFactory.TopIPF

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
    val result = sigmaDD.iipf.alpha.map((entry) =>
      {
        val (key, inductiveIPF) = entry
        applyOneRewriterOnIIPF(inductiveIPF) match {
          case None => None
          case Some(r) =>
            val allSorts = for (
              symbol <- key.set
            ) yield sigmaDDFactory.signature.getOperationByName(symbol).getReturnType()
            val Some(newSort) = ASortHelper.findCommonParent(allSorts.toArray: _*)
            Some(sigmaDDFactory.create((newSort, sigmaDDFactory.sigmaDDIPFFactory.create(key, r))))
        }
      }).filter(_ != None)
    if (result.isEmpty) None else result.reduce((e1, e2) => Some(e1.get v e2.get))
  }

  def applyOneRewriterOnIIPF(iipf: InductiveIPF): Option[InductiveIPF] = iipf match {
    case sigmaDDFactory.sigmaDDInductiveIPFFactory.TopIPF => Some(sigmaDDFactory.sigmaDDInductiveIPFFactory.TopIPF) // got to the end
    case e: InductiveIPF => {
      val res = e.alpha.view.map((entry) => {
        val (sigmaDD, nextIIPF) = entry
        for {
          rewrittenSigmaDD <- rewriter(sigmaDD)
          rewrittenNextIIPF <- applyOneRewriterOnIIPF(nextIIPF)
        } yield sigmaDDFactory.sigmaDDInductiveIPFFactory.create(HashMap(rewrittenSigmaDD -> rewrittenNextIIPF))
      }).view.filter(_ != None)
      if (res.isEmpty) None else res.reduce((e1, e2) => Some(e1.get v e2.get))
    }
  }
}