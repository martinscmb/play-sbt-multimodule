name := """proj"""

version := "1.0-SNAPSHOT"

lazy val proja = Project(id = "proj-a", base = file("modules/proj-a"))
  .enablePlugins(PlayScala)

lazy val projb = Project(id = "proj-b", base = file("modules/proj-b"))
  .enablePlugins(PlayScala)
  .dependsOn(proja)
  .aggregate(proja)

lazy val root = Project(id = "proj", base = file("."))
  .enablePlugins(PlayScala)
  .dependsOn(proja, projb)
  .aggregate(proja, projb)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
