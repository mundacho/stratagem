/*
Stratagem is a model checker for transition systems described using rewriting
rules and strategies.
Copyright (C) 2013 - SMV@Geneva University.
Program written by Edmundo Lopez Bobeda <edmundo [at] lopezbobeda.net>.
This program is free software; you can redistribute it and/or modify
it under the  terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package ch.unige.cui.smv.stratagem.gal

import scala.util.parsing.combinator.lexical.Scanners
import ch.unige.cui.smv.stratagem.gal.expressions.BoolExpression
import ch.unige.cui.smv.stratagem.gal.expressions.BoolExpressionFactory
import ch.unige.cui.smv.stratagem.gal.expressions.IntExpression
import ch.unige.cui.smv.stratagem.gal.expressions.IntExpressionFactory

/**
 * Parser for GAL
 * Uses PackratParser (i.e. memoized parser) to handle left-recursion
 * Recall that PackratParsers can be freely mixed with vanilla Parsers
 * Remember to turn the 'def' to 'lazy val' (see PackratParsers doc)
 *
 * @TODO add a reference (DDD website for instance)
 * @TODO the first rule may not be well implemented
 * @TODO make sure the labels are well parsed
 * @TODO fix the parsing of comments
 *
 * @author mcolange
 *
 */
class GALParser2 extends scala.util.parsing.combinator.RegexParsers with scala.util.parsing.combinator.PackratParsers {
  private var result: GAL = GAL("")
  private var currentGA: Transition = Transition("","",BoolExpressionFactory.createBoolConstant(true), SeqStatement(Array()))

  def getResult = result

  def checkVariableExistence(str: String) {
    assert(result.getVariables.contains(str), "Variable " + str + " not declared")
  }

  def checkArrayExistence(str: String) {
    assert(result.getArrays.contains(str), "Array " + str + " not declared")
  }

  // @TODO change this to use constructor instead?
  def setGAL(g: GAL) { result = g }

  lazy val system: PackratParser[Unit] =
      ((("gal" | "GAL") ~ qualifiedName ^^ {
          case _ ~ name => result = GAL(name)
          }) ~ "{" ~> (((variableDeclaration | arrayDeclaration)*) ^^ {
            _ => ()
          }) ~ (transition + ) ^^ { case _ ~ l => for (t <- l) result.addTransition(t) }) ~ ((transient?) ^^ { _ => () }) <~ "}" ^^ { _ => () }

  lazy val variableDeclaration: PackratParser[Unit] =
      ("int" ~> qualifiedName <~ "=") ~ (integer <~ ";") ^^ {
        case name ~ initVal => result.addVariable(name,initVal)
      }

  lazy val arrayDeclaration: PackratParser[Unit] =
      "array" ~ "[" ~ number ~ "]" ~ qualifiedName ~ "=" ~ "(" ~ initValues ~ ")" ~ ";" ^^ {
        case _ ~ _ ~ i ~ _ ~ name ~ _ ~ _ ~ init ~ _ ~ _ => assert(i == init.length); result.addArray(name,init)
      }

  lazy val transition: PackratParser[Transition] =
    "transition" ~ qualifiedName ~ "[" ~ boolOr ~ "]" ~ (("label" ~> string)?) ~ body ^^ {
      case _ ~ name ~ _ ~ guard ~ _ ~ Some(label) ~ trbody => Transition(name,label,guard,trbody)//result.addTransition(Transition(name,label,guard,trbody))
      case _ ~ name ~ _ ~ guard ~ _ ~ None ~ trbody => Transition(name,"",guard,trbody)//result.addTransition(Transition(name,"",guard,trbody))
    }

  lazy val body: PackratParser[SeqStatement] =
    "{" ~> ((
        (varAccess ~ "=" ~ bit_or ~ ';')  ^^  { case v ~ _ ~ va ~ _ => Assignment(v,va) }   |
          ("self" ~ '.' ~ string ~ ';')   ^^  { case _ ~ _ ~ lab ~ _ => Call(lab) }         |
          (("abort" ~ ';')                ^^  { case _ => Abort() })                        |
          (iteAction)                                                                       |
          ("fixpoint" ~ body)             ^^  { case _ ~ fixbody => FixStatement(fixbody) }
          )*) <~ "}" ^^ { l => SeqStatement(l.toArray) }

  lazy val iteAction: PackratParser[ITE] =
    "if" ~ '(' ~ boolOr ~ ')' ~ body ~ (("else" ~> body)?) ^^ {
      case _ ~ _ ~ cond ~ _ ~ iftrue ~ Some(iffalse)  => ITE(cond,iftrue,iffalse)
      case _ ~ _ ~ cond ~ _ ~ iftrue ~ None           => ITE(cond,iftrue,Abort())
  }

  lazy val transient: PackratParser[Unit] =
    "TRANSIENT" ~ '=' ~ boolOr ~ ';' ^^ {
      case _ ~ _ ~ value ~ _ => result.setTransientPredicate(value)
  }

  ////////////////// Boolean Expressions
  def boolExprHelper = (_: String) match {
    case "||" => BoolExpressionFactory.createBinaryOr(_,_)
    case "&&" => BoolExpressionFactory.createBinaryAnd(_,_)
  }

  lazy val boolOr: PackratParser[BoolExpression] =
    boolAnd ~ (("||" ~ boolAnd)*) ^^ foldListAux(boolExprHelper)

  lazy val boolAnd: PackratParser[BoolExpression] =
    boolNot ~ (("&&" ~ boolNot)*) ^^ foldListAux(boolExprHelper)

  lazy val boolNot: PackratParser[BoolExpression] =
    '!' ~> boolPrimary ^^ { b => BoolExpressionFactory.createNot(b) } |
    boolPrimary

  lazy val boolPrimary: PackratParser[BoolExpression] =
    "false" ^^ { _ => BoolExpressionFactory.createBoolConstant(false) }  |
    "true"  ^^ { _ => BoolExpressionFactory.createBoolConstant(true) }   |
    // the ANTLR version features a syntactical predicate here
    comparison                                                           |
    '(' ~> boolOr <~ ')'

  lazy val comparison: PackratParser[BoolExpression] =
    bit_or ~ comparisonOperators ~ bit_or ^^ {
      case left ~ op ~ right => op match {
        case "==" => BoolExpressionFactory.createEq(left,right)
        case "!=" => BoolExpressionFactory.createNeq(left,right)
        case "<"  => BoolExpressionFactory.createLt(left,right)
        case ">"  => BoolExpressionFactory.createGt(left,right)
        case "<=" => BoolExpressionFactory.createLeq(left,right)
        case ">=" => BoolExpressionFactory.createGeq(left,right)
      }
    }

  /////////////////// Int Expressions
  // @TODO extend this mechanism to rules for BoolExpr
  def foldListAux[A,B](createBinary: A => (B,B) => B): B ~ List[A ~ B] => B = _ match {
    case x ~ List()       => x
    case x ~ ((o ~ y)::l) => createBinary(o)(x,foldListAux(createBinary)(new ~(y,l)))
  }

  def intExprHelper: String => (IntExpression, IntExpression) => IntExpression = (_: String) match {
    case "|"    => IntExpressionFactory.createBinaryBitor(_,_)
    case "^"    => IntExpressionFactory.createBinaryBitxor(_,_)
    case "&"    => IntExpressionFactory.createBinaryBitand(_,_)
    case "<<"   => IntExpressionFactory.createLShift(_,_)
    case ">>"   => IntExpressionFactory.createRShift(_,_)
    case "+"    => IntExpressionFactory.createBinaryAddition(_,_)
    case "-"    => IntExpressionFactory.createMinus(_,_)
    case "*"    => IntExpressionFactory.createBinaryMult(_,_)
    case "/"    => IntExpressionFactory.createDivide(_,_)
    case "%"    => IntExpressionFactory.createModulo(_,_)
    case "**"   => IntExpressionFactory.createPower(_,_)
  }

  lazy val bit_or: PackratParser[IntExpression] =
    bitxor ~ (("|" ~ bitxor)*) ^^ foldListAux(intExprHelper)

  lazy val bitxor: PackratParser[IntExpression] =
    bit_and ~ (("^" ~ bit_and)*) ^^ foldListAux(intExprHelper)

  lazy val bit_and: PackratParser[IntExpression] =
    bitshift ~ (("&" ~ bitshift)*) ^^ foldListAux(intExprHelper)

  lazy val bitshift: PackratParser[IntExpression] =
    addition ~ ((("<<" | ">>") ~ addition)*) ^^ foldListAux(intExprHelper)

  lazy val addition: PackratParser[IntExpression] =
    multiplication ~ ((("+" | "-") ~ multiplication)*) ^^ foldListAux(intExprHelper)

  lazy val multiplication: PackratParser[IntExpression] =
    unaryMinus ~ ((("*" | "/" | "%") ~ unaryMinus)*) ^^ foldListAux(intExprHelper)

  lazy val unaryMinus: PackratParser[IntExpression] =
    '-' ~ power ^^ { case _ ~ value => IntExpressionFactory.createMinus(IntExpressionFactory.createConstant(0),value) } |
    power

  lazy val power: PackratParser[IntExpression] =
    intPrimary ~ (("**" ~ intPrimary)*) ^^ foldListAux(intExprHelper)

  lazy val intPrimary: PackratParser[IntExpression] =
    integer     ^^ { i => IntExpressionFactory.createConstant(i) }  |
    varAccess                                                       |
    // @TODO add a syntactical predicate
    '(' ~> bit_or <~ ')'                                            |
    '(' ~> wrapBool <~ ')'

  lazy val varAccess: PackratParser[IntExpression] =
    arrayVarAccess | variableRef

  lazy val variableRef: PackratParser[IntExpression] =
    qualifiedName ^^ { name => checkVariableExistence(name); IntExpressionFactory.createIntVariable(name) }

  lazy val arrayVarAccess: PackratParser[IntExpression] =
    qualifiedName ~ "[" ~ bit_or ~ "]" ^^ {
      case name ~ _ ~ index ~ _ => checkArrayExistence(name); IntExpressionFactory.createArrayAccess(name, index)
    }

  lazy val wrapBool: PackratParser[IntExpression] =
    boolOr ^^ { b => IntExpressionFactory.createWrapBool(b) }

  /////////////////// utils & tokens
  lazy val initValues: PackratParser[Array[Int]] =
    integer ~ ((',' ~> integer)*) ^^ { case i ~ l => (i::l).toArray }

  def qualifiedNameHelper = (_: String) match {
    case "." =>  (_: String) + "." + (_: String)
  }

  // @TODO test that it behaves properly
  lazy val qualifiedName: PackratParser[String] =
    identifier ~ (("." ~ (identifier | integer ^^ { i => i.toString }))*)  ^^ foldListAux(qualifiedNameHelper)

  // this is a signed integer
  lazy val integer: PackratParser[Int] =
    ("-"?) ~ number ^^ {
      case Some(_) ~ i => -i
      case None ~ i => i
  }

  // this is an unsigned integer
  lazy val number: PackratParser[Int] = """\d+""".r ^^ { i => i.toInt }

  lazy val identifier: PackratParser[String] = parser2packrat("""([a-z]|[A-Z])([a-z]|[A-Z]|\d|_)*""".r)

  // @TODO the original parser also single-quoted string (copy-paste the regex)
  lazy val string: PackratParser[String] = parser2packrat("""("\[btnfru"'\]|[^\"])*"""".r)

  lazy val comparisonOperators: PackratParser[String] = "<" | ">" | ">=" | "<=" | "==" | "!="
}
