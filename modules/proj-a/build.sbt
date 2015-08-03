name := """proj-a"""

version := "1.0-SNAPSHOT"

lazy val proja = Project(id = "proj-a", base = file("."))
	.enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq()
