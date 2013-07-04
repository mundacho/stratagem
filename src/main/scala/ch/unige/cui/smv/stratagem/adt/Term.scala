package ch.unige.cui.smv.stratagem.adt

/**
 * Represents a term.
 */
abstract class Term {
   /**
   * @return the sort of the term.
   */
  def sort:Sort
}

/**
 * Represents a non variable term.
 * 
 * @param operationSymbol the operation symbol.
 * @param subterms the list of subterms
 */
case class NonVariableTerm(val operationSymbol:Operation, val subterms:List[Term]) extends Term {
  require(operationSymbol.arity == subterms.map(_.sort))
  
  def sort = operationSymbol.returnType;
}


/**
 * Represents a variable in a term.
 * @param declaration link to the the declaration
 */
case class Variable(val declaration:VariableDeclaration) extends Term {
  def sort = declaration.sort
}