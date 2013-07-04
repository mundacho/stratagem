package ch.unige.cui.smv.stratagem.adt

/**
 * Represents a term.
 */
abstract class Term 

/**
 * Represents a non variable term.
 * 
 * @param operationSymbol the operation symbol.
 * @param subterms the list of subterms
 */
class NonVariableTerm(val operationSymbol:Operation, val subterms:List[Term]) extends Term

class Variable(val declaration:VariableDeclaration)