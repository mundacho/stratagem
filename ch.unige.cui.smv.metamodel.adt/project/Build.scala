import sbt._
import Keys._

object MainStratagemBuild extends Build {
    lazy val root = Project(id = "adt-metamodel",
                            base = file("."))
}