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
package ch.unige.cui.smv.stratagem.modelchecker

import scala.language.implicitConversions
import org.scalatest.BeforeAndAfter
import org.scalatest.BeforeAndAfterAll
import org.scalatest.FlatSpec
import scala.collection.JavaConversions._
import com.typesafe.scalalogging.slf4j.Logging
import ch.unige.cui.smv.stratagem.beem.DivineModel
import ch.unige.cui.smv.stratagem.beem.DivineProcess
import ch.unige.cui.smv.stratagem.beem.expressions._
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl
import ch.unige.cui.smv.stratagem.transformers.beem.BEEMModel2TransitionSystem
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup
import org.eclipse.ocl.examples.xtext.oclstdlib.OCLstdlibStandaloneSetup

/**
 * Test a transformation from beem to stratagem transition system.
 * @author mundacho
 *
 */
class BEEMTest extends FlatSpec with BeforeAndAfter with Logging {

  before {
    org.eclipse.ocl.examples.pivot.OCL.initialize(null);
    org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
    org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain.initialize(null)
    OCLinEcoreStandaloneSetup.doSetup()
    OCLstdlibStandaloneSetup.doSetup()
  }

  implicit def int2IntegerExpression(n: Int) = Value(n)
  implicit def symbol2Var(s: Symbol) = Var(s.name)

  val petersonBEEM = new DivineModel()
    .declareArrayVariable('pos, 3)
    .declareArrayVariable('step, 3)
    .declareProc {
      new DivineProcess("P_0", Set('NCS, 'CS, 'wait, 'q2, 'q3), 'NCS)
        .declareIntVariable('j, 0)
        .declareIntVariable('k, 0)
        .declareTransition('NCS -> 'wait, True, Assign('j, 1)) // 2 states for this transition and only this proc
        .declareTransition('wait -> 'q2, LessThan('j, 3), Assign(Darray("pos", 0), 'j)) // 3 states for this transition and the previous and only this proc
        .declareTransition('q2 -> 'q3, True, Assign(Darray("step", Minus('j, 1)), 0), Assign('k, 0)) // 4 states for this transition and the previous and only this proc
        .declareTransition('q3 -> 'q3, And(LessThan('k, 3), IsEqual('k, 0)), Assign('k, Plus('k, 1))) // 5 states for this transition and the previous and only this proc
        .declareTransition('q3 -> 'q3, And(LessThan('k, 3), LessThan(Darray("pos", 'k), 'j)), Assign('k, Plus('k, 1))) // 7 states for this transition and the previous and only this proc
        .declareTransition('q3 -> 'wait, IsDifferent(Darray("step", Minus('j, 1)), 0), Assign('j, Plus('j, 1)))
        .declareTransition('q3 -> 'wait, IsEqual('k, 3), Assign('j, Plus('j, 1)))
        .declareTransition('wait -> 'CS, IsEqual('j, 3))
        .declareTransition('CS -> 'NCS, True, Assign(Darray("pos", 0), 0))
    }
    .declareProc {
      new DivineProcess("P_1", Set('NCS, 'CS, 'wait, 'q2, 'q3), 'NCS)
        .declareIntVariable('j, 0)
        .declareIntVariable('k, 0)
        .declareTransition('NCS -> 'wait, True, Assign('j, 1))
        .declareTransition('wait -> 'q2, LessThan('j, 3), Assign(Darray("pos", 1), 'j))
        .declareTransition('q2 -> 'q3, True, Assign(Darray("step", Minus('j, 1)), 1), Assign('k, 0))
        .declareTransition('q3 -> 'q3, And(LessThan('k, 3), IsEqual('k, 1)), Assign('k, Plus('k, 1)))
        .declareTransition('q3 -> 'q3, And(LessThan('k, 3), LessThan(Darray("pos", 'k), 'j)), Assign('k, Plus('k, 1)))
        .declareTransition('q3 -> 'wait, IsDifferent(Darray("step", Minus('j, 1)), 1), Assign('j, Plus('j, 1)))
        .declareTransition('q3 -> 'wait, IsEqual('k, 3), Assign('j, Plus('j, 1)))
        .declareTransition('wait -> 'CS, IsEqual('j, 3))
        .declareTransition('CS -> 'NCS, True, Assign(Darray("pos", 1), 0))
    }
    .declareProc {
      new DivineProcess("P_2", Set('NCS, 'CS, 'wait, 'q2, 'q3), 'NCS)
        .declareIntVariable('j, 0)
        .declareIntVariable('k, 0)
        .declareTransition('NCS -> 'wait, True, Assign('j, 1))
        .declareTransition('wait -> 'q2, LessThan('j, 3), Assign(Darray("pos", 2), 'j))
        .declareTransition('q2 -> 'q3, True, Assign(Darray("step", Minus('j, 1)), 2), Assign('k, 0))
        .declareTransition('q3 -> 'q3, And(LessThan('k, 3), IsEqual('k, 2)), Assign('k, Plus('k, 1)))
        .declareTransition('q3 -> 'q3, And(LessThan('k, 3), LessThan(Darray("pos", 'k), 'j)), Assign('k, Plus('k, 1)))
        .declareTransition('q3 -> 'wait, IsDifferent(Darray("step", Minus('j, 1)), 2), Assign('j, Plus('j, 1)))
        .declareTransition('q3 -> 'wait, IsEqual('k, 3), Assign('j, Plus('j, 1)))
        .declareTransition('wait -> 'CS, IsEqual('j, 3))
        .declareTransition('CS -> 'NCS, True, Assign(Darray("pos", 2), 0))

    }

  val simpleModelBEEM = new DivineModel()
    .declareProc {
      new DivineProcess("P_0", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }.declareProc {
      new DivineProcess("P_1", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }
    .declareProc {
      new DivineProcess("P_2", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }

  "SimpleModel" should "have eight different states" in {

    val ts = BEEMModel2TransitionSystem(simpleModelBEEM)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 8)
  }

  val simpleModelBEEM2 = new DivineModel()
    .declareProc {
      new DivineProcess("P_0", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, IsDifferent(5, 5), Noop)
    }.declareProc {
      new DivineProcess("P_1", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }
    .declareProc {
      new DivineProcess("P_2", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }

  "SimpleModel2" should "have 4 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM2)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    println(result.size)
    println(result)
    assert(result.size == 4)
  }

  val simpleModelBEEM3 = new DivineModel()
    .declareProc {
      new DivineProcess("P_0", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, LessThan(5, 7), Noop)
    }.declareProc {
      new DivineProcess("P_1", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }
    .declareProc {
      new DivineProcess("P_2", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }

  "SimpleModel3" should "have 8 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM3)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 8)
  }

  val simpleModelBEEM4 = new DivineModel()
    .declareProc {
      new DivineProcess("P_0", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, LessThan(7, 4), Noop)
    }.declareProc {
      new DivineProcess("P_1", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }
    .declareProc {
      new DivineProcess("P_2", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }

  "SimpleModel4" should "have 4 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM4)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 4)
  }

  val simpleModelBEEM5 = new DivineModel()
    .declareIntVariable('i, 0)
    .declareProc {
      new DivineProcess("P_0", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, LessThan('i, 9), Noop)
    }.declareProc {
      new DivineProcess("P_1", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }
    .declareProc {
      new DivineProcess("P_2", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }

  "SimpleModel5" should "have 8 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM5)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 8)
  }

  val simpleModelBEEM6 = new DivineModel()
    .declareIntVariable('i, 9)
    .declareIntVariable('j, 2)
    .declareProc {
      new DivineProcess("P_0", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, LessThan('j, 9), Noop)
    }.declareProc {
      new DivineProcess("P_1", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }
    .declareProc {
      new DivineProcess("P_2", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }

  "SimpleModel6" should "have 8 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM6)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 8)
  }

  val simpleModelBEEM7 = new DivineModel()
    .declareIntVariable('i, 9)
    .declareIntVariable('j, 10)
    .declareProc {
      new DivineProcess("P_0", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, LessThan('j, 9), Noop)
    }.declareProc {
      new DivineProcess("P_1", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }
    .declareProc {
      new DivineProcess("P_2", Set('on, 'off), 'off)
        .declareTransition('off -> 'on, True, Noop)
    }

  "SimpleModel7" should "have 4 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM7)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 4)
  }

  val simpleModelBEEM8 = new DivineModel()
    .declareIntVariable('i, 0)
    .declareProc {
      new DivineProcess("P_0", Set('off), 'off)
        .declareTransition('off -> 'off, True, Assign('i, 1))
    }.declareProc {
      new DivineProcess("P_1", Set('off), 'off)
        .declareTransition('off -> 'off, True, Assign('i, 2))
    }
    .declareProc {
      new DivineProcess("P_2", Set('off), 'off)
        .declareTransition('off -> 'off, True, Assign('i, 3))
    }

  "SimpleModel8" should "have 4 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM8)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())

    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)

    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 4)
  }

  val simpleModelBEEM9 = new DivineModel()
    .declareIntVariable('i, -1)
    .declareProc {
      new DivineProcess("P_0", Set('off), 'off)
        .declareTransition('off -> 'off, LessThan('i, 9), Assign('i, Plus('i, 1)))
    }.declareProc {
      new DivineProcess("P_1", Set('off), 'off)
        .declareTransition('off -> 'off, True, Noop)
    }
    .declareProc {
      new DivineProcess("P_2", Set('off), 'off)
        .declareTransition('off -> 'off, True, Noop)
    }

  "SimpleModel9" should "have 11 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM9)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 11)
  }

  val simpleModelBEEM10 = new DivineModel()
    .declareIntVariable('i, -1)
    .declareArrayVariable('a, 3)
    .declareProc {
      new DivineProcess("P_0", Set('off), 'off)
        .declareTransition('off -> 'off, LessThan('i, Darray("a", 2)), Assign('i, Plus('i, 1)))
    }.declareProc {
      new DivineProcess("P_1", Set('off), 'off)
        .declareTransition('off -> 'off, True, Noop)
    }
    .declareProc {
      new DivineProcess("P_2", Set('off), 'off)
        .declareTransition('off -> 'off, True, Noop)
    }

  "SimpleModel10" should "have 1 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM10)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 2)
  }

  val simpleModelBEEM11 = new DivineModel()
    .declareIntVariable('i, 2)
    .declareArrayVariable('a, 3)
    .declareProc {
      new DivineProcess("P_0", Set('off), 'off)
        .declareTransition('off -> 'off, LessThan(Darray("a", 'i), 9), Assign(Darray("a", 'i), Plus(Darray("a", 'i), 1)))
    }.declareProc {
      new DivineProcess("P_1", Set('off), 'off)
        .declareTransition('off -> 'off, True, Noop)
    }
    .declareProc {
      new DivineProcess("P_2", Set('off), 'off)
        .declareTransition('off -> 'off, True, Noop)
    }

  "SimpleModel11" should "have 10 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM11)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 10)
  }

  val simpleModelBEEM12 = new DivineModel()
    .declareArrayVariable('a, 3)
    .declareProc {
      new DivineProcess("P_0", Set('off), 'off)
        .declareIntVariable('i, 0)
        .declareTransition('off -> 'off, LessThan('i, 3), Assign('i, Plus('i, 1)))
    }.declareProc {
      new DivineProcess("P_1", Set('off), 'off)
        .declareIntVariable('i, 0)
        .declareTransition('off -> 'off, LessThan('i, 3), Assign('i, Plus('i, 1)))
    }
    .declareProc {
      new DivineProcess("P_2", Set('off), 'off)
        .declareIntVariable('i, 0)
        .declareTransition('off -> 'off, LessThan('i, 3), Assign('i, Plus('i, 1)))
    }

  "SimpleModel12" should "have 64 different states" in {
    val ts = BEEMModel2TransitionSystem(simpleModelBEEM12)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    assert(result.size == 64)
  }

  "Peterson" should "have 12498 different states" in {
    val ts = BEEMModel2TransitionSystem(petersonBEEM)
    val sigmaDDFactory = SigmaDDFactoryImpl(ts.getAdt().getSignature())
    val rewriter = sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    val initialState = sigmaDDFactory.create(ts.getInitialState())
    val result = rewriter(initialState).get
    println(result.size)
    assert(result.size == 12498)
  }

}