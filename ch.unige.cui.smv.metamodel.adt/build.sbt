name := "ch.unige.cui.smv.metamodel.adt"

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

libraryDependencies += "org.eclipse" % "ocl-common" % "1.1.0.v20130531-0544"

libraryDependencies += "org.eclipse" % "ocl-examples-xtext-oclinecore" % "3.3.0.v20130527-1543"

libraryDependencies += "org.eclipse" % "ocl-examples-xtext-essentialocl" % "3.3.1.v20130817-0639"

libraryDependencies += "org.eclipse" % "ocl-examples-xtext-base" % "3.3.1.v20130817-0929"

libraryDependencies += "org.eclipse" % "ocl-examples-pivot" % "3.3.2.v20131206-1641"

libraryDependencies += "org.eclipse" % "emf-edit" % "2.10.0.v20140519-0339"

libraryDependencies += "org.eclipse" % "emf-ecore-change" % "2.10.0.v20140514-1158"

libraryDependencies += "org.eclipse" % "uml2-uml-resources" % "4.1.0.v20140202-2055"

libraryDependencies += "org.eclipse" % "uml2-uml" % "4.1.2.v20140202-2055"

libraryDependencies += "org.eclipse" % "uml2-common" % "1.8.2.v20140202-2055"

libraryDependencies += "org.eclipse" % "uml2-types" % "1.1.0.v20140202-2055"

libraryDependencies += "org.eclipse" % "emf-mapping-ecore2xml" % "2.8.0.v20140519-0339"

libraryDependencies += "org.eclipse" % "emf-validation" % "1.7.0.201306111341"

libraryDependencies += "org.eclipse" % "core-resources" % "3.8.101.v20130717-0806"

libraryDependencies += "org.eclipse" % "uml2-uml-profile-l2" % "1.1.0.v20140202-2055"

libraryDependencies += "org.eclipse" % "uml2-uml-profile-l3" % "1.1.0.v20140202-2055"

libraryDependencies += "org.eclipse" % "ocl-examples-common" % "3.2.100.v20130520-1503"

libraryDependencies += "org.eclipse" % "ocl-examples-library" % "3.3.1.v20130817-0632"

libraryDependencies += "org.eclipse" % "ocl-examples-domain" % "3.3.1.v20130817-0757"

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

