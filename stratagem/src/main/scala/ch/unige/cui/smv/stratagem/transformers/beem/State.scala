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
package ch.unige.cui.smv.stratagem.transformers.beem



/**
 * The state monad.
 *
 * @note Borrowed from http://blog.tmorris.net/posts/memoisation-with-state-using-scala/ .
 *
 * @author mundacho
 *
 */
case class State[S, A](run: S => (A, S)) {

  def map[B](f: A => B): State[S, B] =
    State(s => {
      val (a, t) = run(s)
      (f(a), t)
    })

  def withFilter(p: A => Boolean): State[S, Unit] = State(s => {
    val (a, t) = run(s)
    if (p(a)) ((), t) else ((), s)
  })

  def flatMap[B](f: A => State[S, B]): State[S, B] =
    State(s => {
      val (a, t) = run(s)
      f(a) run t
    })

  def eval(s: S): (S, A) = {
    val (res, finalState) = run(s)
    (finalState, res)
  }
}

object State {
  // The insert function, inserts a state.
  def insert[S, A](a: A): State[S, A] =
    State(s => (a, s))

  // Convenience function for taking the current state to a value
  def get[S, A](f: S => A): State[S, A] =
    State(s => (f(s), s))

  // Convenience function for modifying the current state
  def mod[S](f: S => S): State[S, Unit] =
    State(s => ((), f(s)))

  def modAndReturn[A, S](f: S => (S, A)): State[S, A] =
    State(s => {
      val (t, a) = f(s)
      (a, t)
    })

}