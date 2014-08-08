name := "ch.unige.cui.smv.stratagem.xtext.ts"

version := "0.1"

scalaVersion := "2.10.2"

unmanagedSourceDirectories in Compile := (baseDirectory.value / "src")::(baseDirectory.value / "src-gen")::Nil

unmanagedResourceDirectories in Compile :=  (baseDirectory.value / "src-gen")::Nil

resolvers += Resolver.url("smv-shared").artifacts(
        "http://alpina.unige.ch/ivy/[organisation]/[module]/([branch]/)[revision]/[artifact].[ext]").ivys("http://alpina.unige.ch/ivy/[organisation]/[module]/([branch]/)ivys/[module]-[revision].xml")  


// emf required libraries

libraryDependencies += "javax" % "inject" % "1.0.0.v20091030"

libraryDependencies += "org.eclipse" % "xtext" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "emf-ecore-xmi" % "2.10.0.v20140514-1158"

libraryDependencies += "org.eclipse" % "emf-ecore" % "2.10.0.v20140514-1158"

libraryDependencies += "org.eclipse" % "emf-common" % "2.10.0.v20140514-1158"

libraryDependencies += "org.antlr" % "runtime" % "3.2.0.v201101311130"

libraryDependencies += "com.google" % "inject" % "3.0.0.v201312141243"

libraryDependencies += "org.eclipse" % "emf-mwe-core" % "1.3.3.v201406110919"

libraryDependencies += "org.apache" % "commons-cli" % "1.2.0.v201404270220"

libraryDependencies += "org.eclipse" % "emf-mwe2-runtime" % "2.6.1.v201406110919"

libraryDependencies += "org.eclipse" % "emf-mwe-utils" % "1.3.3.v201406110919"

libraryDependencies += "org.eclipse" % "xtext-util" % "2.6.2.v201407030533"

libraryDependencies += "com.google" % "guava" % "15.0.0.v201403281430"

libraryDependencies += "org.eclipse" % "xtext-xbase" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "xtext-common-types" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "xtend-lib" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "xtext-xbase-lib" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "xtext-generator" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "xtend" % "2.0.0.v201406030414"

libraryDependencies += "com.ibm" % "icu" % "50.1.1.v201304230130"

libraryDependencies += "org.eclipse" % "xpand" % "2.0.0.v201406030414"

libraryDependencies += "org.eclipse" % "xtend-typesystem-emf" % "2.0.0.v201406030414"

libraryDependencies += "org.eclipse" % "emf-codegen-ecore" % "2.10.0.v20140519-0339"

libraryDependencies += "org.eclipse" % "emf-codegen" % "2.10.0.v20140519-0339"

libraryDependencies += "org.eclipse" % "emf-mwe2-lib" % "2.6.1.v201406110919"

libraryDependencies += "org.apache" % "commons-logging" % "1.1.1.v201101211721"

libraryDependencies += "org.eclipse" % "emf-mwe2-launch" % "2.6.1.v201406120758"

libraryDependencies += "org.eclipse" % "emf-mwe2-language" % "2.6.1.v201406120758"

libraryDependencies += "org.objectweb" % "asm" % "5.0.1.v201404251740"

libraryDependencies += "org.eclipse" % "xtend-core" % "2.6.2.v201407030533"

libraryDependencies += "org.eclipse" % "jdt-core" % "3.9.2.v20140114-1555"

libraryDependencies += "org.eclipse" % "jdt-compiler-apt" % "1.0.600.v20130530-1010"

libraryDependencies += "org.eclipse" % "jdt-compiler-tool" % "1.0.200.v20130530-1010"

libraryDependencies += "org.apache" % "log4j" % "1.2.15.v201012070815"
