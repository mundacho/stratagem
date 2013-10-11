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

import scala.collection.immutable.HashMap

class OneRewriter(val rewriter: SigmaDDRewriter) extends SigmaDDRewriter {

  type InductiveIPF = SigmaDDFactoryImpl.ipfFactory.InductiveIPFType
  val top:SigmaDDFactoryImpl.ipfFactory.InductiveIPFType = SigmaDDFactoryImpl.ipfFactory.inductiveIPFFactory.TopIPF

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
    val resultPair = sigmaDD.iipf.alpha.map((entry) =>
      {
        val (key, inductiveIPF) = entry
        val rewritingResult = applyOneRewriterOnIIPF(inductiveIPF)
        (SigmaDDFactoryImpl.create((sigmaDD.sort, SigmaDDFactoryImpl.ipfFactory.create(key, rewritingResult._1))), rewritingResult._2)
      }).reduce((pair1, pair2) => (pair1._1 v pair2._1, pair1._2 || pair2._2))
    resultPair match {
      case (_, false) => None
      case (s, true) => Some(s)
    }
  }

  def applyOneRewriterOnIIPF(iipf: InductiveIPF): (InductiveIPF, Boolean) = iipf match {
   case SigmaDDFactoryImpl.ipfFactory.inductiveIPFFactory.TopIPF => (SigmaDDFactoryImpl.ipfFactory.inductiveIPFFactory.TopIPF, false) // could not rewrite here
    case e: InductiveIPF => e.alpha.map((entry) => {
      val (sigmaDD, nextIIPF) = entry
      rewriter(sigmaDD) match {
        case Some(s) => (SigmaDDFactoryImpl.ipfFactory.inductiveIPFFactory.create(HashMap(s -> nextIIPF)), true)
        case None => {
          val res = applyOneRewriterOnIIPF(nextIIPF)
          (SigmaDDFactoryImpl.ipfFactory.inductiveIPFFactory.create(HashMap(sigmaDD -> res._1)), res._2)
        }
      }
    }).reduce((pair1, pair2) => (pair1._1 v pair2._1, pair1._2 || pair2._2))
  }

}