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

import scala.ref.WeakReference

/**
 * This class is a wrapper for classes created using a CanononicalFactory.
 * It redefines the equals and hashCode method to be just a reference
 * comparison.
 * @author mundacho
 *
 */
class LightWeightWrapper[T <: AnyRef] private (wrap: T) {
  
  val _wrap = new WeakReference(wrap)
  
  def wrapped = _wrap.get match {
    case Some(w) => w
    case None => // should never happen 
      throw new IllegalStateException
  }
  
  override lazy val hashCode = wrapped.hashCode
  
  override def equals(o: Any): Boolean = o match {
    case LightWeightWrapper(w) => w eq this.wrapped
    case _ => false
  }
}

object LightWeightWrapper {
  
  def unapply[T <: AnyRef](w: LightWeightWrapper[T]):Option[T] = w._wrap.get match {
    case Some(w) => Some(w) 
    case None => None
  }
  
  def apply[T <: AnyRef](wrap: T) = new LightWeightWrapper[T](wrap)
}