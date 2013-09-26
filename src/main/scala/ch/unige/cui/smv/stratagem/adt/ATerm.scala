package ch.unige.cui.smv.stratagem.adt

/**
 * Represents a term.
 */
abstract class ATerm(val adt: ADT) {
  /**
   * @return the sort of the term.
   */
  def sort: ASort
  
  /**
   * @return true if the term is a variable
   */
  val isVariable = false 

  def ->(rightTerm: ATerm) = {
    Equation(this, rightTerm)
  }

}

object ATerm {
  
  /**
   * Extractor that takes a term and extracts the string representation of its
   * operator (for example: it would extract the "and" from the term 
   * and(true, true)) and the list of arguments of the term (if any). 
   * 
   * @param term the term
   */
  def unapply(term: ATerm): Option[(String, List[ATerm])] = term match {
    case t:Term => Some(t.operationSymbol.name, t.subterms) 
    case t:Variable => Some(t.declaration.name, Nil)
    case _ => None
  }
}

/**
 * Represents a non variable term. A constant or a term with parameters.
 *
 * @param operationSymbol the operation symbol.
 * @param subterms the list of subterms
 * @param theAdt the adt this terms uses.
 */
private case class Term(val operationSymbol: Operation, val subterms: List[ATerm], theAdt: ADT) extends ATerm(theAdt) {

  require(operationSymbol.arity == subterms.map(_.sort), "Invalid parameter")
  require((adt.signature.operations ++ adt.signature.generators)(operationSymbol.name) == operationSymbol) // the adt contains the operation
  require(if (!subterms.isEmpty) {
    subterms.map(_.adt eq theAdt).reduce(_ && _)
  } else true, "It is not allowed to mix adts") // require that each adt in the subterms is the same that the parent term adt

  val sort = operationSymbol.returnType;
  override def toString = operationSymbol.name + (if (subterms.isEmpty) "" else subterms.mkString("(", ", ", ")"))
}

/**
 * Represents a variable in a term.
 * @param declaration link to the the declaration
 * @param theAdt the adt this terms uses.
 */
private case class Variable(val declaration: VariableDeclaration, theAdt: ADT) extends ATerm(theAdt) {
  require(adt.variables(declaration.name) == declaration)
  override val isVariable = true
  val sort = declaration.sort
  override def toString = declaration.name
}