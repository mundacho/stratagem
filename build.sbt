name := "stratagem"

version := "0.1"

scalaVersion := "2.10.2"

parallelExecution in Test := false

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0.M8" % "test"

testOptions in Test += Tests.Argument("-oD")

testOptions in Test += Tests.Argument("-u", "target/test-reports")

// libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.2" % "test"

org.scalastyle.sbt.ScalastylePlugin.Settings

// for strange reasons, this file will make the generation of the documentation fail, we ignore it with this line.
sources in (Compile, doc) ~= (_ filter (_.getName != "OneRewriter.scala")) 