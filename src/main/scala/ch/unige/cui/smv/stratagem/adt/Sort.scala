package ch.unige.cui.smv.stratagem.adt

/**
 * Represents a sort.
 *
 * @constructor Creates a new sort.
 * @param name the name of the sort.
 * @param superSort the super sort for this sort.
 *
 * @author mundacho
 *
 */
case class Sort(val name: String, val superSort: Sort) {

  require(
    superSort match {
      case AnySort => true
      case _ => superSort != null
    })

  /**
   * Constructor to create a sort with no super sort.
   * @param name the name of the sort.
   */
  def this(name: String) = this(name, AnySort)
}

object AnySort extends Sort("AnySort", null)