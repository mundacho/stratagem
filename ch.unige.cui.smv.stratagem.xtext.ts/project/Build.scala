import sbt._
import Keys._

object MyBuild extends Build {
  lazy val root = Project(id = "xtext-strategy",
    base = file(".")) dependsOn (adt, ts)

  lazy val adt = RootProject(base = file("../ch.unige.cui.smv.metamodel.adt"))
  lazy val ts = RootProject(base = file("../ch.unige.cui.smv.metamodel.ts"))

}