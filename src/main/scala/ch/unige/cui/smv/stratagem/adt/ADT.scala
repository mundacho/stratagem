package ch.unige.cui.smv.stratagem.adt

/**
 * Represents an ADT object. This object is inmutable.
 * 
 * @param name the name of the adt.
 * @param signature the signature.
 * @param variable a variable using sorts of this ADT.
 * @author mundacho
 */
class ADT private (val name:String, val signature:Signature, val variables:Map[String, VariableDeclaration]) {
  
  /**
   * Creates an empty ADT.
   * @param name the name of this ADT.
   * @param signature a signature.
   */
  def this(name: String, signature: Signature) = {
    this(name, signature, Map.empty)
  }
  
  /**
   * Declares a variable in this ADT.
   * 
   * @param name the variable's name
   * @sortName its sort.
   * @return an ADT with the variable.
   */
  def declareVariable(name: String, sortName:String) = {
    require(!variables.isDefinedAt(name), "A variable with the name \"" + name + "\" exists already")
    require(signature.sorts.isDefinedAt(sortName), "The sort \"" + sortName + "\" is not in the signature of this ADT")
    new ADT(name, signature, variables + (name -> new VariableDeclaration(signature.sorts(sortName), name)))
  }
}