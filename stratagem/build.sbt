name := "stratagem"

version := "0.4.1"

scalaVersion := "2.10.2"

parallelExecution in Test := false

javaOptions in run += "-Xms1G"

javaOptions in run += "-Xmx1G"

javaOptions in run += "-Xss16M"

javaOptions in run += "-XX:+UseParallelGC"  

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0.M8" % "test"

testOptions in Test += Tests.Argument("-oD")

testOptions in Test := Seq(Tests.Filter(s => !s.endsWith("TestSuite")))

parallelExecution in Test := false

logBuffered in Test := false

testOptions in Test += Tests.Argument("-u", "target/test-reports")

//libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.2" % "test"

org.scalastyle.sbt.ScalastylePlugin.Settings

// dependencies for command line parser

libraryDependencies += "com.github.scopt" %% "scopt" % "3.2.0"

resolvers += "sonatype-public" at "https://oss.sonatype.org/content/groups/public"

resolvers += Resolver.url("smv-shared").artifacts(
        "http://alpina.unige.ch/ivy/[organisation]/[module]/([branch]/)[revision]/[artifact].[ext]").ivys("http://alpina.unige.ch/ivy/[organisation]/[module]/([branch]/)ivys/[module]-[revision].xml")  

libraryDependencies += "com.typesafe" %% "scalalogging-slf4j" % "1.0.1"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.2"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.13"

// emf standalone

libraryDependencies += "javax" % "inject" % "1.0.0.v20091030"

libraryDependencies += "org.eclipse" % "ocl-examples-pivot" % "3.4.1.v20140621-2054"

libraryDependencies += "org.eclipse" % "emf-edit" % "2.10.0.v20140519-0339"

libraryDependencies += "org.eclipse" % "emf-common" % "2.10.0.v20140514-1158"

libraryDependencies += "org.eclipse" % "emf-ecore" % "2.10.0.v20140514-1158"

libraryDependencies += "org.eclipse" % "emf-ecore-change" % "2.10.0.v20140514-1158"

libraryDependencies += "org.eclipse" % "ocl-common" % "1.2.0.v20140610-0641"

libraryDependencies += "org.eclipse" % "ocl-examples-common" % "3.3.0.v20140610-0641"

libraryDependencies += "org.eclipse" % "emf-ecore-xmi" % "2.10.0.v20140514-1158"

libraryDependencies += "org.eclipse" % "ocl-examples-library" % "3.4.1.v20140621-2054"

libraryDependencies += "org.eclipse" % "ocl-examples-domain" % "3.4.1.v20140621-2054"

libraryDependencies += "org.eclipse" % "ocl-examples-xtext-oclinecore" % "3.4.0.v20140610-0641"

libraryDependencies += "org.eclipse" % "ocl-examples-xtext-essentialocl" % "3.4.1.v20140622-1041"

libraryDependencies += "org.eclipse" % "ocl-examples-xtext-base" % "3.4.1.v20140621-2055"

libraryDependencies += "org.eclipse" % "xtext" % "2.6.2.v201407030533"

libraryDependencies += "org.antlr" % "runtime" % "3.2.0.v201101311130"

libraryDependencies += "com.google" % "inject" % "3.0.0.v201312141243"

libraryDependencies += "org.eclipse" % "emf-mwe-core" % "1.3.3.v201406110919"

libraryDependencies += "org.apache" % "commons-cli" % "1.2.0.v201404270220"

libraryDependencies += "org.eclipse" % "emf-mwe2-runtime" % "2.6.1.v201406110919"

libraryDependencies += "org.eclipse" % "emf-mwe-utils" % "1.3.3.v201406110919"

libraryDependencies += "org.eclipse" % "xtext-util" % "2.6.2.v201407030533"

libraryDependencies += "com.google" % "guava" % "15.0.0.v201403281430"

libraryDependencies += "org.eclipse" % "xtext-common-types" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "ocl-examples-xtext-oclstdlib" % "3.4.1.v20140618-0715"

libraryDependencies += "org.apache" % "log4j" % "1.2.15.v201012070815"

libraryDependencies += "org.eclipse" % "xtext-xbase" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "xtend-lib" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "xtext-xbase-lib" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "uml2-uml" % "4.1.2.v20140202-2055"

libraryDependencies += "org.eclipse" % "uml2-common" % "1.8.2.v20140202-2055"

libraryDependencies += "org.eclipse" % "uml2-types" % "1.1.0.v20140202-2055"

libraryDependencies += "org.eclipse" % "emf-mapping-ecore2xml" % "2.8.0.v20140519-0339"

libraryDependencies += "org.eclipse" % "emf-validation" % "1.7.0.201306111341"

libraryDependencies += "org.eclipse" % "core-resources" % "3.8.101.v20130717-0806"

libraryDependencies += "org.eclipse" % "uml2-uml-resources" % "4.1.0.v20140202-2055"

libraryDependencies += "org.eclipse" % "uml2-uml-profile-l2" % "1.1.0.v20140202-2055"

libraryDependencies += "org.eclipse" % "uml2-uml-profile-l3" % "1.1.0.v20140202-2055"
