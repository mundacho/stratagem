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
/**
 * @author mundacho
 *
 */
import sbt._
import sbt.Keys._
import xerial.sbt.Pack._

object Build extends sbt.Build {

  lazy val root = Project(
    id = "stratagem",
    base = file("."),
    settings = Defaults.defaultSettings ++ packSettings ++
    Seq(
      // Specify mappings from program name -> Main class (full package path)
      packMain := Map("stratagem" -> "ch.unige.cui.smv.stratagem.modelchecker.Main"),
      // Add custom settings here
      // [Optional] JVM options of scripts (program name -> Seq(JVM option, ...))
      packJvmOpts := Map("stratagem" -> Seq("-Xms1G", "-Xmx4G", "-Xss64M")) 
      // [Optional] Extra class paths to look when launching a program
//      packExtraClasspath := Map("hello" -> Seq("${PROG_HOME}/etc"))
    )
  )
}