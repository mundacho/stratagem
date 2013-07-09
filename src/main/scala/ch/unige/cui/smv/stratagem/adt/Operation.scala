package ch.unige.cui.smv.stratagem.adt

/**
 * Represents an operation of the adt.
 * 
 * @param name the operation's name.
 * @param returnType the operation's return type.
 * @param arity the operation's arity.
 * 
 * @author mundacho
 *
 */
case class Operation (val name:String, val returnType:ASort, val arity:List[ASort]) {
  require(name != "")
}