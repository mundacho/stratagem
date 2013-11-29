name := "stratagem"

version := "0.2"

scalaVersion := "2.10.2"

parallelExecution in Test := false

javaOptions in run += "-Xms1G"

javaOptions in run += "-Xmx1G"

javaOptions in run += "-Xss16M" 

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0.M8" % "test"

testOptions in Test += Tests.Argument("-oD")

testOptions in Test += Tests.Argument("-u", "target/test-reports")

// libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.2" % "test"

org.scalastyle.sbt.ScalastylePlugin.Settings

// dependencies for command line parser

libraryDependencies += "com.github.scopt" %% "scopt" % "3.1.0"

resolvers += "sonatype-public" at "https://oss.sonatype.org/content/groups/public"

libraryDependencies += "com.typesafe" %% "scalalogging-slf4j" % "1.0.1"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.2"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.13"

libraryDependencies += "com.google.guava" % "guava" % "15.0"