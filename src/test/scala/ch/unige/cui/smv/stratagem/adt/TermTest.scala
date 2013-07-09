package ch.unige.cui.smv.stratagem.adt

import org.scalatest.BeforeAndAfter
import org.scalatest.FlatSpec

class TermTest extends FlatSpec {

  "A term" should "throw an exception if its parameters' sorts do not correspond to its arity" in {
    val booleanSort = Sort("bool")
    val natSort = Sort("nat")
    val zero = Operation("zero", natSort, Nil)
    val suc = Operation("suc", natSort, natSort :: Nil)
    val trueOp = Operation("true", booleanSort, Nil)
    val falseOp = Operation("false", booleanSort, Nil)
    val andOp = Operation("and", booleanSort, booleanSort :: booleanSort :: Nil)
    intercept[IllegalArgumentException] {
      Term(andOp, Term(trueOp, Nil) :: Nil)
    }
    intercept[IllegalArgumentException] {
      Term(andOp, Term(trueOp, Nil) :: Term(falseOp, Nil) :: Term(trueOp, Nil) :: Nil)
    }
    intercept[IllegalArgumentException] {
      Term(andOp, Term(trueOp, Nil) :: Term(zero, Nil) :: Nil)
    }
  }
  
  "A term" should "write itself pretty" in {
        val booleanSort = Sort("bool")
    val natSort = Sort("nat")
    val zero = Operation("zero", natSort, Nil)
    val suc = Operation("suc", natSort, natSort :: Nil)
    val trueOp = Operation("true", booleanSort, Nil)
    val falseOp = Operation("false", booleanSort, Nil)
    val andOp = Operation("and", booleanSort, booleanSort :: booleanSort :: Nil)
    val bVariableDec = new VariableDeclaration(booleanSort, "b")
    val xVariableDec = new VariableDeclaration(natSort, "x")
    val varBool = Variable(bVariableDec)
    val xNat = Variable(xVariableDec)
    assert(Term(andOp, Term(trueOp, Nil) :: Term(falseOp, Nil) :: Nil).toString == "and(true, false)")
    assert(Term(suc, Term(suc, Term(zero, Nil) :: Nil) :: Nil).toString == "suc(suc(zero))")
    assert(Term(andOp, Term(trueOp, Nil) :: varBool :: Nil).toString == "and(true, b)")
    assert(Term(suc, Term(suc, xNat :: Nil) :: Nil).toString == "suc(suc(x))")
  }

  "A term" should "allow to build well formed ground terms" in {
    val booleanSort = Sort("bool")
    val natSort = Sort("nat")
    val zero = Operation("zero", natSort, Nil)
    val suc = Operation("suc", natSort, natSort :: Nil)
    val trueOp = Operation("true", booleanSort, Nil)
    val falseOp = Operation("false", booleanSort, Nil)
    val andOp = Operation("and", booleanSort, booleanSort :: booleanSort :: Nil)

    Term(andOp, Term(trueOp, Nil) :: Term(falseOp, Nil) :: Nil)

    Term(suc, Term(suc, Term(zero, Nil) :: Nil) :: Nil)
  }

  "A term" should "allow to build well formed terms with variables" in {
    val booleanSort = Sort("bool")
    val natSort = Sort("nat")
    val zero = Operation("zero", natSort, Nil)
    val suc = Operation("suc", natSort, natSort :: Nil)
    val trueOp = Operation("true", booleanSort, Nil)
    val falseOp = Operation("false", booleanSort, Nil)
    val andOp = Operation("and", booleanSort, booleanSort :: booleanSort :: Nil)
    val bVariableDec = new VariableDeclaration(booleanSort, "b")
    val xVariableDec = new VariableDeclaration(natSort, "x")
    val varBool = Variable(bVariableDec)
    val xNat = Variable(xVariableDec)

    Term(andOp, Term(trueOp, Nil) :: varBool :: Nil)
    Term(suc, Term(suc, xNat :: Nil) :: Nil)
  }

  "A term" should "allow to build our philosopher's model" in {
    // sorts
    val philoSort = Sort("philo")
    val stateSort = Sort("state")
    val forkSort = Sort("fork")
    // operations on state sort
    val eatingState = Operation("eating", stateSort, Nil)
    val thinking = Operation("thinking", stateSort, Nil)
    val waiting = Operation("waiting", stateSort, Nil)
    val waitingForLeftFork = Operation("waitingForLeftFork", stateSort, Nil)
    val waitingForRightFork = Operation("waitingForRightFork", stateSort, Nil)
    // operations for fork sort
    val forkUsed = Operation("forkUsed", forkSort, Nil)
    val forkFree = Operation("forkFree", forkSort, Nil)
    // operations for philosophers sort
    val emtytable = Operation("emptytable", philoSort, Nil)
    val philo = Operation("philo", philoSort, stateSort::forkSort::philoSort::Nil)
    
    // represents the following inductive term:
    // philo(thinking, forkFree, philo(thinking, forkFree, emptytable))
    println(Term(philo, Term(thinking, Nil)::Term(forkFree, Nil)::
        Term(philo, Term(thinking, Nil)::Term(forkFree, Nil)::
            Term(philo, Term(thinking, Nil)::Term(forkFree, Nil)::Term(emtytable,Nil)::Nil)::Nil)::Nil
        ).toString)
    assert(Term(philo, Term(thinking, Nil)::Term(forkFree, Nil)::
        Term(philo, Term(thinking, Nil)::Term(forkFree, Nil)::
            Term(philo, Term(thinking, Nil)::Term(forkFree, Nil)::Term(emtytable,Nil)::Nil)::Nil)::Nil
        ).toString == "philo(thinking, forkFree, philo(thinking, forkFree, philo(thinking, forkFree, emptytable)))")
   
  }

}