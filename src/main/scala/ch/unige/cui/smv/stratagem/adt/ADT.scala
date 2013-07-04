package ch.unige.cui.smv.stratagem.adt

/**
 * Represents an ADT object.
 * 
 * @param name the name of the adt.
 * @param signature the signature.
 * @param variable a variable using sorts of this ADT.
 * @author mundacho
 */
class ADT (val name:String, val signature:Signature, val variables:Set[VariableDeclaration])