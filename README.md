Description
===========

StrataGEM (Strategy Generic Extensible Modelchecker) is a tool aimed at the analysis of Petri nets and other models of concurrency by means of symbolic model-checking techniques. StrataGEM marries the well know concepts of Term Rewriting (TR) to the efficiency of Decision Diagrams (DDs). TR systems are a great way to describe the semantics of a system, being readable and compact, but their direct implementation tends to be rather slow on large sets of terms. On the other hand, DDs have demonstrated their efficiency for model-checking, but translating a system semantics into efficient DDs operations is an expert’s matter. StrataGEM describes the semantics of a system in terms of strategies over a TR system, and automatically translates these rules into operations on DD to handle the model-checking. The ultimate goal of StrataGEM is to become a verification framework for the different variants of Petri nets by separating the semantics of the model from the computation that performs model-checking.

Binary distribution
===================

You can download the binaries from [here](https://sourceforge.net/projects/stratagem-mc/).

Features
========

Stratagem v0.3 can perform the following tasks:

- Read a Place/Transition Petri net and calculate its state space.
- Automatically decompose a P/T Petri net in modules
- Transform a P/T Petri net into a rewriting based transition system
- Use different strategies to speed up the calculation of the state space. In particular it can use anonymization and saturation.
- Read a clustering file to optimize the state space generation.

Input formats
=============

The following input formats are supported:

- [PNML](http://www.pnml.org) for P/T nets
- DiViNe. In the current version the divine formalism can only be used via API.


Requirements
============

To run stratagem you need:

- Java 1.6 or later

To compile stratagem you need:

- sbt 0.13
- Java 1.6 or later

Documentation
=============

ScalaDoc is available [here](http://alpina.unige.ch/jenkins/job/stratagem/javadoc/?#package).

stratagem
=========

Stratagem - DD- and rewriting strategies- based model checker
