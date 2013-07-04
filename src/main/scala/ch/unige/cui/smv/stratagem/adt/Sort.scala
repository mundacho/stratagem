package ch.unige.cui.smv.stratagem.adt

/**
 * Represents a sort.
 * 
 * @param name the name of the sort.
 * @param superSort the super sort for this sort.
 * 
 * @author mundacho
 *
 */
class Sort (val name: String, val superSort: Sort)