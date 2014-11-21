Description
===========

StrataGEM (Strategy Generic Extensible Modelchecker) is a tool aimed at the analysis of Petri nets and other models of concurrency by means of symbolic model-checking techniques. StrataGEM marries the well know concepts of Term Rewriting (TR) to the efficiency of Decision Diagrams (DDs). TR systems are a great way to describe the semantics of a system, being readable and compact, but their direct implementation tends to be rather slow on large sets of terms. On the other hand, DDs have demonstrated their efficiency for model-checking, but translating a system semantics into efficient DDs operations is an expert’s matter. StrataGEM describes the semantics of a system in terms of strategies over a TR system, and automatically translates these rules into operations on DD to handle the model-checking. The ultimate goal of StrataGEM is to become a verification framework for the different variants of Petri nets by separating the semantics of the model from the computation that performs model-checking.

Citation
========

If you want to cite stratagem in your papers, please use the following citation:

    @conference {17,
      title = {StrataGEM: A Generic Petri Net Verification Framework},
      booktitle = {Proceedings of the 35th International Conference on Application and Theory of Petri Nets and Concurrency},
      year = {2014},
      month = {06/2014},
      publisher = {Springer},
      organization = {Springer},
      address = {Tunis, Tunisia},
      abstract = {In this paper we present the Strategy Generic Extensible Modelchecker (StrataGEM), a tool aimed at the analysis of Petri nets and other models of concurrency by means of symbolic model-checking techniques. StrataGEM marries the well know concepts of Term Rewrit- ing (TR) to the efficiency of Decision Diagrams (DDs). TR systems are a great way to describe the semantics of a system, being readable and com- pact, but their direct implementation tends to be rather slow on large sets of terms. On the other hand, DDs have demonstrated their efficiency for model-checking, but translating a system semantics into efficient DDs operations is an expert{\textquoteright}s matter. StrataGEM describes the semantics of a system in terms of strategies over a TR system, and automatically trans- lates these rules into operations on DD to handle the model-checking. The ultimate goal of StrataGEM is to become a verification framework for the different variants of Petri nets by separating the semantics of the model from the computation that performs model-checking.},
      url = {http://edmundo.lopezbobeda.net/sites/default/files/pdfs/petrinets2014.pdf},
      author = {L{\'o}pez B{\'o}beda, Edmundo and Maximilien Colange and Didier Buchs},
      editor = {Gianfranco Ciardo and Ekkart Kindler}
    }

For word users it looks like this:
![Edmundo López Bóbeda and Maximilien Colange and Didier Buchs, StrataGEM: A Generic Petri Net Verification Framework ](https://raw.githubusercontent.com/mundacho/stratagem/master/stratagem/resources/citation.png "Citation in word format")


Binary distribution
===================

You can download the binaries from [here](https://sourceforge.net/projects/stratagem-mc/).

Features
========

Stratagem v0.5.0 can perform the following tasks:

- Read transition systems in its own langauge (.ts) directly from the a text file and perform its state space calculation. You can see an example of a transition system file [here](https://github.com/mundacho/stratagem/blob/master/stratagem/resources/philo.ts)
- Read a Place/Transition Petri net and calculate its state space.
- Automatically decompose a P/T Petri net in modules.
- Transform a P/T Petri net into a rewriting based transition system.
- Use different strategies to speed up the calculation of the state space. In particular it can use anonymization and saturation.
- Read a clustering file to optimize the state space generation.
- Write the terms of the state space (warning: There can be a lot of terms in the state space!)

Input formats
=============

The following input formats are supported:

- Transition system (.ts) can be read from a text file. Represents a transition system.
- [PNML](http://www.pnml.org) for P/T nets
- DiViNe. In the current version the divine formalism can only be used via API.


Requirements
============

To run stratagem you need:

- Java 1.7 or later

To compile stratagem you need:

- sbt 0.13.5
- Java 1.7 or later

Documentation
=============

ScalaDoc is available [here](http://alpina.unige.ch/jenkins/job/stratagem/javadoc/?#package).
