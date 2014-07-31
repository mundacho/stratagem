addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.4.0")

// addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.6.1")
addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.5.1" intransitive())

libraryDependencies += "org.kamranzafar" % "jtar" % "2.2"

libraryDependencies += "org.fusesource.scalate" %% "scalate-core" % "1.6.1" intransitive()

libraryDependencies += "org.fusesource.scalate" %% "scalate-util" % "1.6.1" intransitive()

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.5"
