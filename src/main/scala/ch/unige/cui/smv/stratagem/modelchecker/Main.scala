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

import java.io.File
import org.slf4j.Logger
import com.typesafe.scalalogging.slf4j.Logging
import ch.qos.logback.classic.Level
import ch.unige.cui.smv.stratagem.sigmadd.SigmaDDFactoryImpl
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SigmaDDRewriterFactory
import ch.unige.cui.smv.stratagem.util.AuxFunctions.timeAndSpace
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SigmaDDRewritingCacheStats.stats
import ch.unige.cui.smv.stratagem.ts.Identity
import ch.unige.cui.smv.stratagem.transformers.Model2TransitionSystem
import ch.unige.cui.smv.stratagem.transformers.PetriNet2TransitionSystem
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.transformers.SetOfModules2TransitionSystemWithAnonimization
import ch.unige.cui.smv.stratagem.transformers.SetOfModules2TransitionSystem
import ch.unige.cui.smv.stratagem.transformers.PNML2PetriNet
import ch.unige.cui.smv.stratagem.transformers.Modularizer
import ch.unige.cui.smv.stratagem.transformers.FileModularizer

/**
 * The main class of stratagem. It is used to launch the model checker.
 * @author mundacho
 *
 */
object Main extends Logging {

  val programName = "stratagem"
  val sversion = "0.2"
  val quietMode = "activate quiet mode. Only errors are printed."
  val fileComment = "the model in pnml format."
  val debugMode = "activate debug mode. Lots of output."
  val saturationComment = "Disable saturation."

  def main(args: Array[String]) {
    val parser = configureParser
    parser.parse(args, Config()) map { config =>
      // configure logging
      val root = org.slf4j.LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME).asInstanceOf[ch.qos.logback.classic.Logger];
      root.setLevel(Level.DEBUG) // default log level
      if (config.quiet) root.setLevel(Level.INFO)
      if (config.verbose) root.setLevel(Level.TRACE)
      if (config.verbose && config.quiet) logger.warn("Set quiet and verbose flag at the same time")

      val model2ts: Model2TransitionSystem = createModelToTransitionSystemTransformation(config.transformation, if (config.hasClustering) Some(config.clustering) else None)
      logger.debug("Successfully processed input file")
      if (config.mode == "analyzer") {
        // check config
        val petrinet = PNML2PetriNet(config.model)
        val listOfModules = Modularizer(petrinet)
        logger.debug(s"The number of modules that were detected is ${listOfModules.size}")
        logger.debug("Printing detected modules, each line represents a module:")
        logger.info(listOfModules.map(_.net.places.toList.sortBy(p => (p.id, p.name)).map { p =>
          if (config.names && config.ids) s"${p.name} (${p.id})" else if (config.ids) p.id else p.name
        }.mkString(", ")).mkString("\n"))
        if (config.transitionSystem) {
          val ts = model2ts(config.model)
          logger.info(ts.toString)
        }
      } else {
        val ts = model2ts(config.model)
        if (config.transitionSystem) {
          logger.info(ts.toString)
        }
        val sigmaDDFactory = SigmaDDFactoryImpl(ts.adt.signature)
        val initialState = sigmaDDFactory.create(ts.initialState)
        logger.debug(s"Successfully created initial state")
        val rewriter = if (config.saturation) {
          sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriterWithSaturation(ts, Identity, 2)
        } else {
          sigmaDDFactory.rewriterFactory.transitionSystemToStateSpaceRewriter(ts)
        }
        logger.debug(s"Successfully created state space rewriter")
        logger.debug("Starting calculation of state space")
        val stateSpace = stats(timeAndSpace(rewriter(initialState).get))
        val stateSpaceSize = stateSpace.size
        logger.debug("State space size:")
        logger.info(s"$stateSpaceSize")
      }
    } getOrElse {
      logger.error("Unable to parse the parameters")
    }

  }

  def configureParser = new scopt.OptionParser[Config](programName) {
    head(programName + " " +  sversion)
    opt[Unit]('q', "quiet") action { (_, c) =>
      c.copy(quiet = true)
    } text (quietMode)
    opt[Unit]("no-saturate") abbr ("ns") action { (_, c) =>
      c.copy(saturation = false)
    } text (saturationComment)
    opt[File]("clustering") optional() abbr ("c") action { (x, c) =>
      c.copy(hasClustering = true, clustering = x)
    } text ("select the clustering file")
    opt[String]("transformation") abbr ("t") action { (x, c) =>
      c.copy(transformation = x)
    } text ("Choose the transformation for the model. Available transformations are:" +
      "\nnaive:              transforms the model naively" +
      "\nnaive-modular:      transforms the model trying to reduce its complexity by dividing it into submodules" +
      "\nanonymized-modular: transforms the model trying to reduce its complexity by dividing it into submodules. " +
      "It also will rename the places in the modules")
    opt[Unit]("debug") action { (_, c) =>
      c.copy(verbose = true)
    } text (debugMode)
    arg[File]("<file>") required () action { (x, c) =>
      c.copy(model = x)
    } text (fileComment)
    cmd("analyzer") action { (_, c) =>
      c.copy(mode = "analyzer")
    } text ("Analyzer mode allows to analyze the petri net without performing the state space calculation") children (
      opt[Unit]("modules") action { (_, c) =>
        c.copy(modules = true)
      } text ("""Print discovered modules (clusters). A module is a set of places that share some
transitions in common. The union of all modules is equal to thewhole set of
places. The intersection of two modules is empty."""),
      opt[Unit]("with-names") action { (_, c) =>
        c.copy(names = true)
      } text ("Print the names of the modules (from the PNML)"),
      opt[Unit]("with-ids") action { (_, c) =>
        c.copy(ids = true)
      } text ("Print the ids of the modules (from the PNML)"),
      opt[Unit]("print-transition-system") abbr ("ts") action { (_, c) =>
        c.copy(transitionSystem = true)
      } text ("Print the generated transition system"))
  }

  def createModelToTransitionSystemTransformation(transformationName: String, clusteringFile: Option[File]) = transformationName match {
    case "naive" => new Model2TransitionSystem {
      type ModelType = PetriNet
      type PreprocessedModelType = PetriNet
      
      val file2Model = PNML2PetriNet
      val modelPreprocessor = (m: PetriNet) => m
      val preprocessedModel2TransitionSystem = PetriNet2TransitionSystem
    }
    case "naive-modular" => new Model2TransitionSystem {
      type ModelType = PetriNet
      type PreprocessedModelType = (List[PTModule], PetriNet)

      val file2Model = PNML2PetriNet
      val modelPreprocessor = (model: PetriNet) => (Modularizer(model), model)
      val preprocessedModel2TransitionSystem = SetOfModules2TransitionSystem.tupled
    }
    case "anonymized-modular" | "" => new Model2TransitionSystem {
      type ModelType = PetriNet
      type PreprocessedModelType = (List[PTModule], PetriNet)
      
      val file2Model = PNML2PetriNet
      
      
      val modelPreprocessor = clusteringFile match {
        case None => (model: PetriNet) => (Modularizer(model), model)
        case Some(file) => (model: PetriNet) => ((new FileModularizer(file))(model), model)
      }
      val preprocessedModel2TransitionSystem = SetOfModules2TransitionSystemWithAnonimization.tupled
    }
    case _ =>
      logger.error("Unrecognized transformation")
      scala.sys.exit(-1)
  }
}