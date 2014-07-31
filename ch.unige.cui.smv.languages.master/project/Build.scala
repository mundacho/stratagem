import sbt._
import Keys._

object MainStratagemBuild extends Build {
    lazy val root = Project(id = "stratagem-command-line",
                            base = file(".")) aggregate(adt, ts)

    lazy val adt = RootProject(base = file("../ch.unige.cui.smv.metamodel.adt"))

    lazy val ts = RootProject(base = file("../ch.unige.cui.smv.metamodel.ts"))  
}