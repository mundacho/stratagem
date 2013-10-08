resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

//You need to add the resolver as long as the plugin is only published to the snapshots repo. 
//As soon as it is in central, you can remove this additional resolver.
resolvers += "Scala Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

addSbtPlugin("eu.henkelmann" % "junit_xml_listener" % "0.4-SNAPSHOT")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.3.2")

