package net.lopezbobeda.xtend.plugin

import sbt._
import Keys._
import java.io.{ File, Writer }
import org.eclipse.xtend.core.compiler.batch.Main
import org.apache.log4j.BasicConfigurator
import org.eclipse.xtend.core.XtendStandaloneSetup
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler
import plugins._

object MyPlugin extends AutoPlugin {
  // by defining autoImport, the settings are automatically imported into user's `*.sbt`
  object autoImport {
    // configuration points, like the built-in `version`, `libraryDependencies`, or `compile`
    lazy val mySourceGenerator = taskKey[Seq[File]]("Generate Java files from xtend")
    lazy val xtendSourceDirectories = settingKey[Seq[File]]("The location of xtend files and java files it uses")
    lazy val xtendOutputDirectory = settingKey[File]("The location of files produced by xtend")

    // default values for the tasks and settings
    lazy val baseXtendPluginSettings: Seq[Def.Setting[_]] = Seq(
      xtendOutputDirectory in Compile := baseDirectory.value / "xtend-gen",
      sourceManaged <<= (xtendOutputDirectory in Compile),
      xtendSourceDirectories in Compile := (baseDirectory.value / "src") :: (baseDirectory.value / "src-gen") :: Nil,
      mySourceGenerator in Compile := {
        if (!compileXtend((xtendOutputDirectory in Compile).value, (xtendSourceDirectories in Compile).value, (dependencyClasspath in Compile).value.files, streams.value.log)) {
          throw new Error("xtend compile fail")
        }
        val javaFiles = ((xtendOutputDirectory in Compile).value ** "*.java" get)
        javaFiles.foreach { f =>
          streams.value.log.info(f.toString)
          IO.readLines(f).foreach { l => streams.value.log.info(l) }
        }
        javaFiles
      },
      cleanFiles += (xtendOutputDirectory in Compile).value,
      sourceGenerators in Compile <+= (mySourceGenerator in Compile).toTask)
  }

  override def requires = JvmPlugin

  override def trigger = allRequirements

  import autoImport._

  override val projectSettings = baseXtendPluginSettings

  def createLogger(): Writer = {
    import org.apache.log4j.{ Logger => Log4jLogger, Level, WriterAppender, SimpleLayout, Layout }

    val logger = Log4jLogger.getLogger("org.eclipse.xtext")
    logger.setAdditivity(false)
    logger.setLevel(Level.DEBUG)
    logger.removeAllAppenders()
    val w = new java.io.CharArrayWriter
    val appender = new WriterAppender(new SimpleLayout(), w)
    logger.addAppender(appender)
    w
  }

  private[plugin] def compileXtend(out: File, in: Seq[File], cp: Seq[File], log: Logger): Boolean = {

    val logger = createLogger()
    val injector = new XtendStandaloneSetup().createInjectorAndDoEMFRegistration
    val c = injector.getInstance(classOf[XtendBatchCompiler])
    c.setOutputPath(out.toString())
    c.setSourcePath(in.map(_.toString).mkString(File.pathSeparator))
    c.setVerbose(true)
    c.setOutputWriter(new LoggerWriter(log))
    c.setClassPath(cp.map { _.getAbsolutePath }.mkString(File.pathSeparator))
    c.compile()
  }

}

object Compiler {
  def apply(): Seq[File] = {
    Main.main(Array("-useCurrentClassLoader", "-d", "/Users/mundacho/git/stratagem/ch.unige.cui.smv.stratagem.xtext.ts/xtend-gen/",
      "-cp", "/Users/mundacho/git/stratagem/ch.unige.cui.smv.stratagem.xtext.ts/src-gen/",
      "-cp", "/Users/mundacho/git/stratagem/ch.unige.cui.smv.stratagem.xtext.ts/src/",
      "/Users/mundacho/git/stratagem/ch.unige.cui.smv.stratagem.xtext.ts/src/"))
    Nil
  }

}



