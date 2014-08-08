/**
* This transition system represents the well known philosopher problem.
*/

TransitionSystem
// this is a comment!
// the adt needs to have a name, in this case: myAdt
ADT myAdt

Signature

Sorts

ph, state, fork

Generators

// we define some constants here
eating : state
thinking : state
waiting : state
waitingLF : state
waitingRF : state
forkUsed : fork
forkFree : fork
emptytable : ph
// this is a generator with parameters
philo: state, fork, ph -> ph


Variables // the adt variables, you can use this variables in terms by prefixin them with a dollar sign ($)

x : fork
p : ph
f : fork
s : state

// the initial state, here we use 3 philosophers, feel free to add as much as you want
// for example four would be philo(thinking, forkFree, philo(thinking, forkFree, philo(thinking, forkFree, philo(thinking, forkFree, emptytable))))

initialState =  philo(thinking, forkFree, philo(thinking, forkFree, philo(thinking, forkFree, emptytable)))

// Here we define the strategies

Strategies

Try(S) = Choice(S, Identity)
DoForAllPhils(V) = Union(Try(V), Choice(One(DoForAllPhils(V), 3), Try(V)))
DoForLastPhil(V) = Choice(One(DoForLastPhil(V), 3), V)
// Here we define a parameterless strategy.
// Just note that when you call a parameterless strategy you need to use empty parenthesis just after it.
// see the strategy goToWait in the Transitions section for an example
goToWaitPhilo = { philo(thinking, $x, $p) -> philo(waiting, $x, $p) }
// a strategy can also be one rewrite rule, however rules have to be non-linear
takeRightForkFromWaitingPhilo = { philo(waiting, forkFree, $p) -> philo(waitingLF, forkUsed, $p) }
takeRightForkFromWaitingForRightForkPhilo = { philo(waitingRF, forkFree, $p) -> philo(eating, forkUsed, $p) }
takeLeftForkFromWaitingPhilo = { philo($s, forkFree, philo(waiting, $f, $p)) -> philo($s, forkUsed, philo(waitingRF, $f, $p)) }
takeLeftForkFromWaitingForLeftForkPhilo = {philo($s, forkFree, philo(waitingLF, forkUsed, $p)) -> philo($s, forkUsed, philo(eating, forkUsed, $p))}
goToThinkPhilo = { philo($s, forkUsed, philo(eating, forkUsed, $p)) -> philo($s, forkFree, philo(thinking, forkFree, $p)) }
takeLeftForkWaitingPhilo1 = {philo(waiting, $f, $p) -> philo(waitingRF, $f, $p)}
takeRightFork = { philo($s, forkFree, $p) -> philo($s, forkUsed, $p) }
  

Transitions

// These are the strategies that are interpreted as transitions, there must be at least one of these and also,
// they are not allowed to have parameters, in the body you can use any strategy defined either in the strategies
// section or in this section.

goToWait = DoForAllPhils(goToWaitPhilo())
takeRightForkFromWaiting = DoForAllPhils(takeRightForkFromWaitingPhilo())
takeRightForkFromWaitingForRightFork = DoForAllPhils(takeRightForkFromWaitingForRightForkPhilo())
takeLeftForkFromWaiting = DoForAllPhils(takeLeftForkFromWaitingPhilo())
takeLeftForkFromWaitingForLeftFork = DoForAllPhils(takeLeftForkFromWaitingForLeftForkPhilo())
goToThink = DoForAllPhils(goToThinkPhilo())
takeLeftForkFromWaitingPhilo1 = Sequence(takeLeftForkWaitingPhilo1(), DoForLastPhil(takeRightFork()))
