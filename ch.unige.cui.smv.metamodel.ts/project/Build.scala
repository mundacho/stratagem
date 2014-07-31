import sbt._
import Keys._

object MainStratagemBuild extends Build {
    lazy val root = Project(id = "ts-metamodel",
                            base = file(".")) dependsOn(adt)

    lazy val adt = RootProject(base = file("../ch.unige.cui.smv.metamodel.adt"))

}