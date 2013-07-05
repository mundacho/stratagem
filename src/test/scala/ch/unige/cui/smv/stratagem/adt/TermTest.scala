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
    val sign = new Signature(Set(booleanSort), Set(trueOp, falseOp), Set(andOp))
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

  "A term" should "allow to build well formed ground terms" in {
    val booleanSort = Sort("bool")
    val natSort = Sort("nat")
    val zero = Operation("zero", natSort, Nil)
    val suc = Operation("suc", natSort, natSort :: Nil)
    val trueOp = Operation("true", booleanSort, Nil)
    val falseOp = Operation("false", booleanSort, Nil)
    val andOp = Operation("and", booleanSort, booleanSort :: booleanSort :: Nil)
    val sign = new Signature(Set(booleanSort), Set(trueOp, falseOp), Set(andOp))

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
    val sign = new Signature(Set(booleanSort), Set(trueOp, falseOp), Set(andOp))
    val bVariableDec = new VariableDeclaration(booleanSort, "b")
    val xVariableDec = new VariableDeclaration(natSort, "x")
    val varBool = Variable(bVariableDec)
    val xNat = Variable(xVariableDec)

    Term(andOp, Term(trueOp, Nil) :: varBool :: Nil)

    Term(suc, Term(suc, xNat :: Nil) :: Nil)
  }
}