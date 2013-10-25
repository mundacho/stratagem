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
package ch.unige.cui.smv.stratagem.sigmadd

import org.scalatest.FlatSpec
import ch.unige.cui.smv.stratagem.adt.ADT
import ch.unige.cui.smv.stratagem.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.Signature
import ch.unige.cui.smv.stratagem.ts.Choice
import ch.unige.cui.smv.stratagem.ts.DeclaredStrategyInstance
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.ts.One
import ch.unige.cui.smv.stratagem.ts.Sequence
import ch.unige.cui.smv.stratagem.ts.Strategy
import ch.unige.cui.smv.stratagem.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.ts.Union
import ch.unige.cui.smv.stratagem.ts.VariableStrategy
import ch.unige.cui.smv.stratagem.ts.SimpleStrategy
import ch.unige.cui.smv.stratagem.ts.Try
import org.scalatest.BeforeAndAfter
import ch.unige.cui.smv.stratagem.ts.FixPointStrategy
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SigmaDDRewritingCacheStats
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SigmaDDRewriterFactory
import ch.unige.cui.smv.stratagem.util.AuxFunctions.time
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SigmaDDRewritingCacheStats.stats
// scalastyle:off regex
/**
 * Tests the generation of the state space.
 * @author mundacho
 *
 */
class StateSpaceGenerationTest extends FlatSpec with BeforeAndAfter {


  before {
    SigmaDDRewritingCacheStats.resetCaches
  }

  val signature = (new Signature)
    .withSort("ph")
    .withSort("state")
    .withSort("fork")
    .withSort("cluster")
    .withGenerator("eating", "state")
    .withGenerator("thinking", "state")
    .withGenerator("waiting", "state")
    .withGenerator("waitingForLeftFork", "state")
    .withGenerator("waitingForRightFork", "state")
    .withGenerator("forkUsed", "fork")
    .withGenerator("forkFree", "fork")
    .withGenerator("emptytable", "ph")
    .withGenerator("philo", "ph", "state", "fork", "ph")
    .withGenerator("c", "cluster", "ph", "cluster")
    .withGenerator("emptycluster", "cluster")

  val adt = new ADT("philoModel", signature)
    .declareVariable("x", "fork")
    .declareVariable("p", "ph")
    .declareVariable("s", "state")
    .declareVariable("f", "fork")
    .declareVariable("cVar", "cluster")
  // definitions to simplify the reading of terms.
  def eating = adt.term("eating")
  def thinking = adt.term("thinking")
  def waiting = adt.term("waiting")
  def waitingForLeftFork = adt.term("waitingForLeftFork")
  def waitingForRightFork = adt.term("waitingForRightFork")
  def forkUsed = adt.term("forkUsed")
  def forkFree = adt.term("forkFree")
  def emptytable = adt.term("emptytable")
  def X = adt.term("x")
  def P = adt.term("p")
  def S = adt.term("s")
  def F = adt.term("f")
  def CVar = adt.term("cVar")
  def philo(state: ATerm, fork: ATerm, ph: ATerm) = adt.term("philo", state, fork, ph)
  def emptycluster = adt.term("emptycluster")
  def cluster(substate: ATerm, nextCluster: ATerm) = adt.term("c", substate, nextCluster)

  // definitions to simplify strategy declarations
  def Repeat(s: Strategy) = DeclaredStrategyInstance("repeat", s)
  def DoForAllPhils(s: Strategy) = DeclaredStrategyInstance("doForAllPhil", s)
  def DoForLastPhil(s: Strategy) = DeclaredStrategyInstance("doForLastPhil", s)

  val V = VariableStrategy("V")

  def generateInitialState(n: Int): ATerm = {
    require(n > 1)
    def auxGenerate(n: Int): ATerm = {
      n match {
        case 1 => philo(thinking, forkFree, emptytable)
        case _ => philo(thinking, forkFree, auxGenerate(n - 1))
      }
    }
    auxGenerate(n)
  }

  val numberOfPhilosophersTest1 = 3

  val ts = (new TransitionSystem(adt, generateInitialState(numberOfPhilosophersTest1)))
    .declareStrategy("doForAllPhil", V) { Union(Try(V), Choice(One(DoForAllPhils(V), 3), Try(V))) }(false)
    .declareStrategy("doForLastPhil", V) { Choice(One(DoForLastPhil(V)), V) }(false)
    .declareStrategy("goToWaitPhilo", philo(thinking, X, P) -> philo(waiting, X, P))(false)
    .declareStrategy("goToWait") { DoForAllPhils(DeclaredStrategyInstance("goToWaitPhilo")) }(true)
    .declareStrategy("takeRightForkFromWaitingPhilo", philo(waiting, forkFree, P) -> philo(waitingForLeftFork, forkUsed, P))(false)
    .declareStrategy("takeRightForkFromWaiting") { DoForAllPhils(DeclaredStrategyInstance("takeRightForkFromWaitingPhilo")) }(true)
    .declareStrategy("takeRightForkFromWaitingForRightForkPhilo", philo(waitingForRightFork, forkFree, P) -> philo(eating, forkUsed, P))(false)
    .declareStrategy("takeRightForkFromWaitingForRightFork") { DoForAllPhils(DeclaredStrategyInstance("takeRightForkFromWaitingForRightForkPhilo")) }(true)
    .declareStrategy("takeLeftForkFromWaitingPhilo", philo(S, forkFree, philo(waiting, F, P)) -> philo(S, forkUsed, philo(waitingForRightFork, F, P)))(false)
    .declareStrategy("takeLeftForkFromWaiting") { DoForAllPhils(DeclaredStrategyInstance("takeLeftForkFromWaitingPhilo")) }(true)
    .declareStrategy("takeLeftForkFromWaitingForLeftForkPhilo", philo(S, forkFree, philo(waitingForLeftFork, forkUsed, P)) -> philo(S, forkUsed, philo(eating, forkUsed, P)))(false)
    .declareStrategy("takeLeftForkFromWaitingForLeftFork") { DoForAllPhils(DeclaredStrategyInstance("takeLeftForkFromWaitingForLeftForkPhilo")) }(true)
    .declareStrategy("goToThinkPhilo", philo(S, forkUsed, philo(eating, forkUsed, P)) -> philo(S, forkFree, philo(thinking, forkFree, P)))(false)
    .declareStrategy("goToThink") { DoForAllPhils(DeclaredStrategyInstance("goToThinkPhilo")) }(true)
    .declareStrategy("takeLeftForkWaitingPhilo1", philo(waiting, F, P) -> philo(waitingForRightFork, F, P))(false)
    .declareStrategy("takeRightFork", philo(S, forkFree, P) -> philo(S, forkUsed, P))(false)
    .declareStrategy("takeLeftForkFromWaitingPhilo1") { Sequence(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), DoForLastPhil(DeclaredStrategyInstance("takeRightFork"))) }(true)
  // there are some rules missing, but the state space is the same size.
  // We intentionally omit the rules to make the first philosopher go to eat after taking the right fork and also the rule to make him go back to eat.

  "DeclaredStrategies" should "allow to generate the state space for the philosophers problem with 3 philosophers" in {
    val rewriter = SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts)
    stats(time(println("Total number of states: " + rewriter(SigmaDDFactoryImpl.create(ts.initialState)).get.size)))
    assert(rewriter(SigmaDDFactoryImpl.create(ts.initialState)).get.size == 76)
  }

  val numberOfPhilosophersTest2 = 9

  val ts1 = (new TransitionSystem(adt, generateInitialState(numberOfPhilosophersTest2)))
    .declareStrategy("doForAllPhil", V) { Union(Try(V), Choice(One(DoForAllPhils(V), 3), Try(V))) }(false)
    .declareStrategy("doForLastPhil", V) { Choice(One(DoForLastPhil(V)), V) }(false)
    .declareStrategy("goToWaitPhilo", philo(thinking, X, P) -> philo(waiting, X, P))(false)
    .declareStrategy("goToWait") { DoForAllPhils(DeclaredStrategyInstance("goToWaitPhilo")) }(true) // OK
    .declareStrategy("takeRightForkFromWaitingPhilo", philo(waiting, forkFree, P) -> philo(waitingForLeftFork, forkUsed, P))(false)
    .declareStrategy("takeRightForkFromWaiting") { DoForAllPhils(DeclaredStrategyInstance("takeRightForkFromWaitingPhilo")) }(true) // OK
    .declareStrategy("takeRightForkFromWaitingForRightForkPhilo", philo(waitingForRightFork, forkFree, P) -> philo(eating, forkUsed, P))(false)
    .declareStrategy("takeRightForkFromWaitingForRightFork") { DoForAllPhils(DeclaredStrategyInstance("takeRightForkFromWaitingForRightForkPhilo")) }(true) // OK
    .declareStrategy("takeLeftForkFromWaitingPhilo", philo(S, forkFree, philo(waiting, F, P)) -> philo(S, forkUsed, philo(waitingForRightFork, F, P)))(false)
    .declareStrategy("takeLeftForkFromWaiting") { DoForAllPhils(DeclaredStrategyInstance("takeLeftForkFromWaitingPhilo")) }(true) // OK
    .declareStrategy("takeLeftForkFromWaitingForLeftForkPhilo", philo(S, forkFree, philo(waitingForLeftFork, forkUsed, P)) -> philo(S, forkUsed, philo(eating, forkUsed, P)))(false)
    .declareStrategy("takeLeftForkFromWaitingForLeftFork") { DoForAllPhils(DeclaredStrategyInstance("takeLeftForkFromWaitingForLeftForkPhilo")) }(true) // OK
    .declareStrategy("goToThinkPhilo", philo(S, forkUsed, philo(eating, forkUsed, P)) -> philo(S, forkFree, philo(thinking, forkFree, P)))(false)
    .declareStrategy("goToThink") { DoForAllPhils(DeclaredStrategyInstance("goToThinkPhilo")) }(true) // OK
    .declareStrategy("takeLeftForkWaitingPhilo1", philo(waiting, F, P) -> philo(waitingForRightFork, F, P))(false)
    .declareStrategy("takeRightFork", philo(S, forkFree, P) -> philo(S, forkUsed, P))(false)
    .declareStrategy("takeLeftForkFromWaitingPhilo1") { Sequence(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), DoForLastPhil(DeclaredStrategyInstance("takeRightFork"))) }(true)
  // there are some rules missing, but the state space is the same size.
  // We intentionally omit the rules to make the first philosopher go to eat after taking the right fork and also the rule to make him go back to eat.

  it should "allow to generate the state space for the philosophers problem with 9 philosophers" in {
    val rewriter = SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts1)
    stats(time(println("Total number of states: " + rewriter(SigmaDDFactoryImpl.create(ts1.initialState)).get.size)))
    assert(rewriter(SigmaDDFactoryImpl.create(ts1.initialState)).get.size == 439204)
  }

  val numberOfPhilosophersTest3 = 9
  val numberOfClustersTest3 = 3

  def generateInitialCluteredState(totalPhils: Int, nbOfClusters: Int): ATerm = {
    require(totalPhils > 1)
    require(nbOfClusters > 0)
    def auxGenerate(n: Int): ATerm = {
      n match {
        case 1 => philo(thinking, forkFree, emptytable)
        case _ => philo(thinking, forkFree, auxGenerate(n - 1))
      }
    }
    nbOfClusters match {
      case 1 => cluster(auxGenerate(totalPhils), emptycluster)
      case _ => cluster(auxGenerate(totalPhils / nbOfClusters), generateInitialCluteredState(totalPhils - (totalPhils / nbOfClusters), nbOfClusters - 1))
    }
  }

  def DoForAllClusters(s: Strategy) = DeclaredStrategyInstance("doForAllClusters", s)
  def DoForLastCluster(s: Strategy) = DeclaredStrategyInstance("doForLastCluster", s)

  val ts2 = (new TransitionSystem(adt, generateInitialCluteredState(numberOfPhilosophersTest3, numberOfClustersTest3)))
    .declareStrategy("doForAllPhil", V) { Union(Try(V), Choice(One(DoForAllPhils(V), 3), Try(V))) }(false)
    .declareStrategy("doForLastPhil", V) { Choice(One(DoForLastPhil(V), 3), V) }(false)
    .declareStrategy("goToWaitPhilo", philo(thinking, X, P) -> philo(waiting, X, P))(false)
    .declareStrategy("goToWait") { DoForAllPhils(DeclaredStrategyInstance("goToWaitPhilo")) }(false)
    .declareStrategy("takeRightForkFromWaitingPhilo", philo(waiting, forkFree, P) -> philo(waitingForLeftFork, forkUsed, P))(false)
    .declareStrategy("takeRightForkFromWaiting") { DoForAllPhils(DeclaredStrategyInstance("takeRightForkFromWaitingPhilo")) }(false)
    .declareStrategy("takeRightForkFromWaitingForRightForkPhilo", philo(waitingForRightFork, forkFree, P) -> philo(eating, forkUsed, P))(false)
    .declareStrategy("takeRightForkFromWaitingForRightFork") { DoForAllPhils(DeclaredStrategyInstance("takeRightForkFromWaitingForRightForkPhilo")) }(false)
    .declareStrategy("takeLeftForkFromWaitingPhilo", philo(S, forkFree, philo(waiting, F, P)) -> philo(S, forkUsed, philo(waitingForRightFork, F, P)))(false) // this rule is not applied!
    .declareStrategy("takeLeftForkFromWaiting") { DoForAllPhils(DeclaredStrategyInstance("takeLeftForkFromWaitingPhilo")) }(false)
    .declareStrategy("takeLeftForkFromWaitingForLeftForkPhilo", philo(S, forkFree, philo(waitingForLeftFork, forkUsed, P)) -> philo(S, forkUsed, philo(eating, forkUsed, P)))(false)
    .declareStrategy("takeLeftForkFromWaitingForLeftFork") { DoForAllPhils(DeclaredStrategyInstance("takeLeftForkFromWaitingForLeftForkPhilo")) }(true)
    .declareStrategy("goToThinkPhilo", philo(S, forkUsed, philo(eating, forkUsed, P)) -> philo(S, forkFree, philo(thinking, forkFree, P)))(false)
    .declareStrategy("goToThink") { DoForAllPhils(DeclaredStrategyInstance("goToThinkPhilo")) }(false)
    .declareStrategy("takeLeftForkWaitingPhilo1", philo(waiting, F, P) -> philo(waitingForRightFork, F, P))(false)
    .declareStrategy("takeRightForkWaitingPhilo1", philo(waiting, F, P) -> philo(waitingForLeftFork, F, P))(false)
    .declareStrategy("takeRightFork", philo(S, forkFree, P) -> philo(S, forkUsed, P))(false)
    .declareStrategy("takeLeftForkFromWaitingPhilo1") { Sequence(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), DoForLastPhil(DeclaredStrategyInstance("takeRightFork"))) }(false)
    .declareStrategy("doForAllClusters", V) { Union(V, Choice(One(DoForAllClusters(V), 2), Identity)) }(false)
    .declareStrategy("doForLastCluster", V) { Choice(One(DoForLastCluster(V), 2), V) }(false)
    .declareStrategy("goToWaitCluster") { DoForAllClusters(One(DeclaredStrategyInstance("goToWait"), 1)) }(true)
    .declareStrategy("takeRightForkFromWaitingCluster") { DoForAllClusters(One(DeclaredStrategyInstance("takeRightForkFromWaiting"), 1)) }(true)
    .declareStrategy("takeLeftForkFromWaitingCluster") { DoForAllClusters(One(DeclaredStrategyInstance("takeLeftForkFromWaiting"), 1)) }(true)
    .declareStrategy("takeRightForkFromWaitingForRightForkCluster") { DoForAllClusters(One(DeclaredStrategyInstance("takeRightForkFromWaitingForRightFork"), 1)) }(true)
    .declareStrategy("takeLeftForkFromWaitingFirstPhiloCluster") {
      DoForAllClusters(Sequence(One(DoForLastPhil(DeclaredStrategyInstance("takeRightFork")), 1), One(One(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), 1), 2)))
    }(true)
    .declareStrategy("takeLeftForkFromWaitingForLeftForkCluster") { DoForAllClusters(One(DeclaredStrategyInstance("takeLeftForkFromWaitingForLeftFork"), 1)) }(true)
    .declareStrategy("goToThinkCluster") { DoForAllClusters(One(DeclaredStrategyInstance("goToThink"), 1)) }(true)
    .declareStrategy("takeLeftForkVeryFirstPhilo") {
      Sequence(One(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), 1), DoForLastCluster(One(DoForLastPhil(DeclaredStrategyInstance("takeRightFork")), 1)))
    }(true)

  // there are some rules missing, but the state space is the same size.
  // We intentionally omit the rules to make the first philosopher go to eat after taking the right fork and also the rule to make him go back to eat.

  it should "allow to generate the state space for the clustered philosophers problem with 9 philosophers" in {
    val rewriter = SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts2)
    stats(time(println("Total number of states: " + rewriter(SigmaDDFactoryImpl.create(ts2.initialState)).get.size)))
    assert(rewriter(SigmaDDFactoryImpl.create(ts2.initialState)).get.size == 439204)
  }

  val numberOfPhilosophersTest4 = 20
  val numberOfClustersTest4 = 4

  val ts3 = (new TransitionSystem(adt, generateInitialCluteredState(numberOfPhilosophersTest4, numberOfClustersTest4)))
    .declareStrategy("doForAllPhil", V) { Union(Try(V), Choice(One(DoForAllPhils(V), 3), Try(V))) }(false)
    .declareStrategy("doForLastPhil", V) { Choice(One(DoForLastPhil(V), 3), V) }(false)
    .declareStrategy("goToWaitPhilo", philo(thinking, X, P) -> philo(waiting, X, P))(false)
    .declareStrategy("goToWait") { DoForAllPhils(DeclaredStrategyInstance("goToWaitPhilo")) }(false)
    .declareStrategy("takeRightForkFromWaitingPhilo", philo(waiting, forkFree, P) -> philo(waitingForLeftFork, forkUsed, P))(false)
    .declareStrategy("takeRightForkFromWaiting") { DoForAllPhils(DeclaredStrategyInstance("takeRightForkFromWaitingPhilo")) }(false)
    .declareStrategy("takeRightForkFromWaitingForRightForkPhilo", philo(waitingForRightFork, forkFree, P) -> philo(eating, forkUsed, P))(false)
    .declareStrategy("takeRightForkFromWaitingForRightFork") { DoForAllPhils(DeclaredStrategyInstance("takeRightForkFromWaitingForRightForkPhilo")) }(false)
    .declareStrategy("takeLeftForkFromWaitingPhilo", philo(S, forkFree, philo(waiting, F, P)) -> philo(S, forkUsed, philo(waitingForRightFork, F, P)))(false) // this rule is not applied!
    .declareStrategy("takeLeftForkFromWaiting") { DoForAllPhils(DeclaredStrategyInstance("takeLeftForkFromWaitingPhilo")) }(false)
    .declareStrategy("takeLeftForkFromWaitingForLeftForkPhilo", philo(S, forkFree, philo(waitingForLeftFork, forkUsed, P)) -> philo(S, forkUsed, philo(eating, forkUsed, P)))(false)
    .declareStrategy("takeLeftForkFromWaitingForLeftFork") { DoForAllPhils(DeclaredStrategyInstance("takeLeftForkFromWaitingForLeftForkPhilo")) }(true)
    .declareStrategy("goToThinkPhilo", philo(S, forkUsed, philo(eating, forkUsed, P)) -> philo(S, forkFree, philo(thinking, forkFree, P)))(false)
    .declareStrategy("goToThink") { DoForAllPhils(DeclaredStrategyInstance("goToThinkPhilo")) }(false)
    .declareStrategy("takeLeftForkWaitingPhilo1", philo(waiting, F, P) -> philo(waitingForRightFork, F, P))(false)
    .declareStrategy("takeRightForkWaitingPhilo1", philo(waiting, F, P) -> philo(waitingForLeftFork, F, P))(false)
    .declareStrategy("takeRightFork", philo(S, forkFree, P) -> philo(S, forkUsed, P))(false)
    .declareStrategy("takeLeftForkFromWaitingPhilo1") { Sequence(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), DoForLastPhil(DeclaredStrategyInstance("takeRightFork"))) }(false)
    .declareStrategy("doForAllClusters", V) { Union(V, Choice(One(DoForAllClusters(V), 2), Identity)) }(false)
    .declareStrategy("doForLastCluster", V) { Choice(One(DoForLastCluster(V), 2), V) }(false)
    .declareStrategy("goToWaitCluster") { DoForAllClusters(One(DeclaredStrategyInstance("goToWait"), 1)) }(true)
    .declareStrategy("takeRightForkFromWaitingCluster") { DoForAllClusters(One(DeclaredStrategyInstance("takeRightForkFromWaiting"), 1)) }(true)
    .declareStrategy("takeLeftForkFromWaitingCluster") { DoForAllClusters(One(DeclaredStrategyInstance("takeLeftForkFromWaiting"), 1)) }(true)
    .declareStrategy("takeRightForkFromWaitingForRightForkCluster") { DoForAllClusters(One(DeclaredStrategyInstance("takeRightForkFromWaitingForRightFork"), 1)) }(true)
    .declareStrategy("takeLeftForkFromWaitingFirstPhiloCluster") {
      DoForAllClusters(Sequence(One(DoForLastPhil(DeclaredStrategyInstance("takeRightFork")), 1), One(One(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), 1), 2)))
    }(true)
    .declareStrategy("takeLeftForkFromWaitingForLeftForkCluster") { DoForAllClusters(One(DeclaredStrategyInstance("takeLeftForkFromWaitingForLeftFork"), 1)) }(true)
    .declareStrategy("goToThinkCluster") { DoForAllClusters(One(DeclaredStrategyInstance("goToThink"), 1)) }(true)
    .declareStrategy("takeLeftForkVeryFirstPhilo") {
      Sequence(One(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), 1), DoForLastCluster(One(DoForLastPhil(DeclaredStrategyInstance("takeRightFork")), 1)))
    }(true)

  // there are some rules missing, but the state space is the same size.
  // We intentionally omit the rules to make the first philosopher go to eat after taking the right fork and also the rule to make him go back to eat.

  it should "allow to generate the state space for the clustered philosophers problem with 20 philosophers" in {
    val rewriter = SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts3)
    stats(time(println("Total number of states: " + rewriter(SigmaDDFactoryImpl.create(ts3.initialState)).get.size)))
    assert(rewriter(SigmaDDFactoryImpl.create(ts3.initialState)).get.size == 3461452808002L)
  }

  val numberOfPhilosophersTest5 = 100
  val numberOfClustersTest5 = 10

  val ts4 = (new TransitionSystem(adt, generateInitialCluteredState(numberOfPhilosophersTest5, numberOfClustersTest5)))
    .declareStrategy("doForAllPhil", V) { Union(Try(V), Choice(One(DoForAllPhils(V), 3), Try(V))) }(false)
    .declareStrategy("doForLastPhil", V) { Choice(One(DoForLastPhil(V), 3), V) }(false)
    .declareStrategy("goToWaitPhilo", philo(thinking, X, P) -> philo(waiting, X, P))(false)
    .declareStrategy("goToWait") { DoForAllPhils(DeclaredStrategyInstance("goToWaitPhilo")) }(false)
    .declareStrategy("takeRightForkFromWaitingPhilo", philo(waiting, forkFree, P) -> philo(waitingForLeftFork, forkUsed, P))(false)
    .declareStrategy("takeRightForkFromWaiting") { DoForAllPhils(DeclaredStrategyInstance("takeRightForkFromWaitingPhilo")) }(false)
    .declareStrategy("takeRightForkFromWaitingForRightForkPhilo", philo(waitingForRightFork, forkFree, P) -> philo(eating, forkUsed, P))(false)
    .declareStrategy("takeRightForkFromWaitingForRightFork") { DoForAllPhils(DeclaredStrategyInstance("takeRightForkFromWaitingForRightForkPhilo")) }(false)
    .declareStrategy("takeLeftForkFromWaitingPhilo", philo(S, forkFree, philo(waiting, F, P)) -> philo(S, forkUsed, philo(waitingForRightFork, F, P)))(false) // this rule is not applied!
    .declareStrategy("takeLeftForkFromWaiting") { DoForAllPhils(DeclaredStrategyInstance("takeLeftForkFromWaitingPhilo")) }(false)
    .declareStrategy("takeLeftForkFromWaitingForLeftForkPhilo", philo(S, forkFree, philo(waitingForLeftFork, forkUsed, P)) -> philo(S, forkUsed, philo(eating, forkUsed, P)))(false)
    .declareStrategy("takeLeftForkFromWaitingForLeftFork") { DoForAllPhils(DeclaredStrategyInstance("takeLeftForkFromWaitingForLeftForkPhilo")) }(true)
    .declareStrategy("goToThinkPhilo", philo(S, forkUsed, philo(eating, forkUsed, P)) -> philo(S, forkFree, philo(thinking, forkFree, P)))(false)
    .declareStrategy("goToThink") { DoForAllPhils(DeclaredStrategyInstance("goToThinkPhilo")) }(false)
    .declareStrategy("takeLeftForkWaitingPhilo1", philo(waiting, F, P) -> philo(waitingForRightFork, F, P))(false)
    .declareStrategy("takeRightForkWaitingPhilo1", philo(waiting, F, P) -> philo(waitingForLeftFork, F, P))(false)
    .declareStrategy("takeRightFork", philo(S, forkFree, P) -> philo(S, forkUsed, P))(false)
    .declareStrategy("takeLeftForkFromWaitingPhilo1") { Sequence(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), DoForLastPhil(DeclaredStrategyInstance("takeRightFork"))) }(false)
    .declareStrategy("doForAllClusters", V) { Union(V, Choice(One(DoForAllClusters(V), 2), Identity)) }(false)
    .declareStrategy("doForLastCluster", V) { Choice(One(DoForLastCluster(V), 2), V) }(false)

    .declareStrategy("takeLeftForkFromWaitingFirstPhiloCluster") {
      DoForAllClusters(Sequence(One(DoForLastPhil(DeclaredStrategyInstance("takeRightFork")), 1), One(One(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), 1), 2)))
    }(true)
    .declareStrategy("takeLeftForkVeryFirstPhilo") {
      Sequence(One(DeclaredStrategyInstance("takeLeftForkWaitingPhilo1"), 1), DoForLastCluster(One(DoForLastPhil(DeclaredStrategyInstance("takeRightFork")), 1)))
    }(true)
    .declareStrategy("saturateCluster") {DoForAllClusters(One(FixPointStrategy(
      Union(DeclaredStrategyInstance("goToWait"), Union(DeclaredStrategyInstance("takeRightForkFromWaiting"), Union(DeclaredStrategyInstance("takeLeftForkFromWaiting"),
        Union(DeclaredStrategyInstance("takeRightForkFromWaitingForRightFork"), Union(DeclaredStrategyInstance("goToThink"), DeclaredStrategyInstance("takeLeftForkFromWaitingForLeftFork"))))))), 1))
    }(true)

  it should "allow to generate the state space for the clustered philosophers problem with 100 philosophers and saturation" in {
    val rewriter = SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts4)
    stats(time(println("Total number of states: " + rewriter(SigmaDDFactoryImpl.create(ts4.initialState)).get.size)))
    assert(rewriter(SigmaDDFactoryImpl.create(ts4.initialState)).get.size == BigInt("496926405783746676393791436882468230898067489522034699520200002"))
  }

}