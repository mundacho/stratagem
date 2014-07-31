name := "ch.unige.cui.smv.metamodel.ts"

version := "0.1"

scalaVersion := "2.10.2"

javaSource in Compile := baseDirectory.value / "src"

resolvers += Resolver.url("smv-shared").artifacts(
        "http://alpina.unige.ch/ivy/[organisation]/[module]/([branch]/)[revision]/[artifact].[ext]").ivys("http://alpina.unige.ch/ivy/[organisation]/[module]/([branch]/)ivys/[module]-[revision].xml")  

// emf required libraries

libraryDependencies += "javax" % "annotation" % "1.1.0.v201209060031"

libraryDependencies += "javax" % "inject" % "1.0.0.v20091030"

libraryDependencies += "org.eclipse" % "core.runtime.compatibility.registry" % "3.5.200.v20130514-1256"

libraryDependencies += "org.eclipse" % "core-runtime" % "3.9.100.v20131218-1515"

libraryDependencies += "org.eclipse" % "osgi" % "3.9.1.v20140110-1610"

libraryDependencies += "org.eclipse" % "equinox-weaving-hook" % "1.0.200.v20120524-1707"

libraryDependencies += "org.eclipse" % "equinox-common" % "3.6.200.v20130402-1505"

libraryDependencies += "org.eclipse" % "core-jobs" % "3.5.300.v20130429-1813"

libraryDependencies += "org.eclipse" % "equinox-registry" % "3.5.301.v20130717-1549"

libraryDependencies += "org.eclipse" % "equinox-preferences" % "3.5.100.v20130422-1538"

libraryDependencies += "org.eclipse" % "core-contenttype" % "3.4.200.v20130326-1255"

libraryDependencies += "org.eclipse" % "equinox-app" % "1.3.100.v20130327-1442"

libraryDependencies += "org.eclipse" % "emf-ecore" % "2.10.0.v20140514-1158"

libraryDependencies += "org.eclipse" % "emf-common" % "2.10.0.v20140514-1158"

libraryDependencies += "org.eclipse" % "emf-ecore-xmi" % "2.10.0.v20140514-1158"