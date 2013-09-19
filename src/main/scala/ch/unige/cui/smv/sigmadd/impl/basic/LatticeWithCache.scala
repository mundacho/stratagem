package ch.unige.cui.smv.sigmadd.impl.basic

import ch.unige.cui.smv.stratagem.sigmadd.LatticeElement
import scala.collection.mutable.HashMap

trait OperationCache extends LatticeElement {

  type LatticeElementType <: OperationCache

  val operationCache = new HashMap[(String, OperationCache, OperationCache), LatticeElementType]

  abstract override def v(that: LatticeElementType): LatticeElementType = {
    // order the parameters
    val key = if (this.hashCode > that.hashCode) ("union", this, that) else ("union", that, this)
    operationCache.getOrElseUpdate(key, super.v(that))
  }

  abstract override def ^(that: LatticeElementType): LatticeElementType = {
    // order the parameters
    val key = if (this.hashCode > that.hashCode) ("inter", this, that) else ("inter", that, this)
    operationCache.getOrElseUpdate(key, super.^(that))
  }

  abstract override def \(that: LatticeElementType): LatticeElementType = {
    val key = ("diff", this, that)
    operationCache.getOrElseUpdate(key, super.v(that))
  }

}