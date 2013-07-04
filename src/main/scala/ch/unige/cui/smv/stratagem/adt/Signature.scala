package ch.unige.cui.smv.stratagem.adt


/**
 * Represents a signature. Formally, a set of sorts and a set of operations, each operation having its own arity.
 * 
 * @param sorts the set of sorts.
 * @param generators the set of generators.
 * @param operations the set of operations.
 */
class Signature (val sorts:Set[Sort], val generators:Set[Operation], val operations:Set[Operation]) {
  require(!sorts.isEmpty)
}