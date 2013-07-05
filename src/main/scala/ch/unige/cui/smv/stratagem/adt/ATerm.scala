package ch.unige.cui.smv.stratagem.adt

/**
 * Represents a term.
 */
abstract class ATerm {
   /**
   * @return the sort of the term.
   */
  def sort:Sort
}

/**
 * Represents a non variable term. A constant or a term with parameters.
 * 
 * @param operationSymbol the operation symbol.
 * @param subterms the list of subterms
 */
case class Term(val operationSymbol:Operation, val subterms:List[ATerm]) extends ATerm {
  require(operationSymbol.arity == subterms.map(_.sort))
  
  def sort = operationSymbol.returnType;
}


/**
 * Represents a variable in a term.
 * @param declaration link to the the declaration
 */
case class Variable(val declaration:VariableDeclaration) extends ATerm {
  def sort = declaration.sort
}