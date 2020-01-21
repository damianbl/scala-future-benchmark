name := "scala-future-benchmark"

version := "1.0"

scalaVersion := "2.12.8"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "dev.zio" %% "zio" % "1.0.0-RC17"

enablePlugins(JmhPlugin)
