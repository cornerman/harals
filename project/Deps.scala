import sbt._
import Keys._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Deps {
  // hack to expand %%% in settings, needs .value in build.sbt
  import Def.{setting => dep}

  val scalaTest = dep("org.scalatest" %%% "scalatest" % "3.0.8")
  val boopickle = dep("io.suzaku" %%% "boopickle" % "1.3.1")
  val cats = dep("org.typelevel" %%% "cats-core" % "2.0.0")
  val circe = new {
    private val version = "0.12.1"
    val core = dep("io.circe" %%% "circe-core" % version)
    val parser = dep("io.circe" %%% "circe-parser" % version)
  }
  val scodec = new {
    val core = dep("org.scodec" %%% "scodec-core" % "1.11.4")
    val bits = dep("org.scodec" %%% "scodec-bits" % "1.1.12")
  }
  val upickle = dep("com.lihaoyi" %%% "upickle" % "0.8.0")
}
