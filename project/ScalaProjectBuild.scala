import sbt._
import sbt.Keys._

object ScalaProjectBuild extends Build {

  lazy val scalaProject = Project(
    id = "sort-sample",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Sort-Sample-for-Scala",
      organization := "org.example",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2"
      // add other settings here
    )
  )
}
