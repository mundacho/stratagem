name := "stratagem"

version := "0.1"

scalaVersion := "2.10.1"

testOptions in Test += Tests.Argument("-oD")

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.2" % "test"

testListeners <<= target.map(t => Seq(new eu.henkelmann.sbt.JUnitXmlTestsListener(t.getAbsolutePath)))
