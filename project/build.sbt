resolvers += Classpaths.typesafeResolver

//You need to add the resolver as long as the plugin is only published to the snapshots repo. 
//As soon as it is in central, you can remove this additional resolver.
resolvers += "Scala Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"