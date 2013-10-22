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

  def main(args: Array[String]) {
    val parser = new scopt.OptionParser[Config](programName) {
      head(programName)
      opt[Unit]('q', "quiet") action { (_, c) =>
        c.copy(quiet = true)
      } text (quietMode)
      opt[Unit]("debug")  action { (_, c) =>
        c.copy(debug = true)
      } text (debugMode)
      arg[File]("<file>") required () action { (x, c) =>
        c.copy(model = x)
      } text (fileComment)
    }
    parser.parse(args, Config()) map { config =>
      // configure logging
      val root = org.slf4j.LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME).asInstanceOf[ch.qos.logback.classic.Logger];
      root.setLevel(Level.INFO) // default log level
      if (config.quiet) root.setLevel(Level.ERROR)
      if (config.debug) root.setLevel(Level.DEBUG)
      if (config.debug && config.quiet) logger.warn("Set quiet and debug flag at the same time")
    } getOrElse {
      logger.error("Unable to parse the parameters")
    }
  }
}