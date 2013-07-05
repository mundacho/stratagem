name := "stratagem"

version := "0.1"

// scalaVersion := "2.10"

testOptions in Test += Tests.Argument("-oD")

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"

testListeners <<= target.map(t => Seq(new eu.henkelmann.sbt.JUnitXmlTestsListener(t.getAbsolutePath)))