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
import ch.unige.cui.smv.stratagem.util.AuxFunctions.time
import ch.unige.cui.smv.stratagem.sigmadd.rewriters.SigmaDDRewritingCacheStats.stats
import ch.unige.cui.smv.stratagem.ts.Identity

/**
 * The main class of stratagem. It is used to launch the model checker.
 * @author mundacho
 *
 */
object Main extends Logging {

  val programName = "stratagem"
  val version = "1.0"
  val quietMode = "activate quiet mode. Only errors are printed."
  val fileComment = "the model in pnml format."
  val debugMode = "activate debug mode. Lots of output"
  val saturationComment = "Disable saturation Might improve speed in some examples"

  def main(args: Array[String]) {
    val parser = new scopt.OptionParser[Config](programName) {
      head(programName)
      opt[Unit]('q', "quiet") action { (_, c) =>
        c.copy(quiet = true)
      } text (quietMode)
      opt[Unit]('s', "saturate") action { (_, c) =>
        c.copy(saturation = true)
      } text (saturationComment)
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
        } text ("Print discovered modules (clusters)."),
        opt[Unit]("with-names") action { (_, c) =>
          c.copy(names = true)
        } text ("Print the names of the modules (from the PNML)"),
        opt[Unit]("with-ids") action { (_, c) =>
          c.copy(ids = true)
        } text ("Print the ids of the modules (from the PNML)"))
    }
    parser.parse(args, Config()) map { config =>
      // configure logging
      val root = org.slf4j.LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME).asInstanceOf[ch.qos.logback.classic.Logger];
      root.setLevel(Level.DEBUG) // default log level
      if (config.quiet) root.setLevel(Level.INFO)
      if (config.verbose) root.setLevel(Level.TRACE)
      if (config.verbose && config.quiet) logger.warn("Set quiet and verbose flag at the same time")
      val petrinet = PNML2PetriNet(config.model)
      logger.debug("Successfully processed input file")
      if (config.mode == "analyzer") {
        // check config
        val listOfModules = Modularizer(petrinet)
          logger.debug("Printing names of modules")
          logger.info(listOfModules.map(_.net.places.toList.sortBy(p => (p.id, p.name)).map{p =>
            if (config.names && config.ids) s"${p.name} (${p.id})"
            else if (config.ids) p.id
            else p.name
          }.mkString(", ")).mkString("\n"))
      } else {
        val transformer = PetriNet2TransitionSystem
        val ts = transformer(petrinet)
        val initialState = SigmaDDFactoryImpl.create(ts.initialState)
        logger.debug(s"Successfully created initial state")
        val rewriter = if (config.saturation) SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriterWithSaturation(ts, Identity, 2) else SigmaDDRewriterFactory.transitionSystemToStateSpaceRewriter(ts)
        logger.debug(s"Successfully created state space rewriter")
        logger.info("Starting calculation of state space")
        val stateSpace = time(rewriter(initialState).get)
        val stateSpaceSize = stateSpace.size
        logger.info(s"State space size: $stateSpaceSize")
      }
    } getOrElse {
      logger.error("Unable to parse the parameters")
    }
  }
}