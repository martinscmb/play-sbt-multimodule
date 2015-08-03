name := """proj-b"""

version := "1.0-SNAPSHOT"

lazy val projb = Project(id = "proj-b", base = file("."))
	.enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq()

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
