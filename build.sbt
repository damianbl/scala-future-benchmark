name := "scala-future-benchmark"

version := "1.0"

scalaVersion := "2.12.8"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.scalaz" %% "scalaz-zio" % "1.0-RC5+1-e5fc479f+20190601-2346-SNAPSHOT"

enablePlugins(JmhPlugin)