//import com.typesafe.sbt.SbtAspectj._

name := "reactive-stocks"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)


scalaVersion := "2.11.5"

resolvers += "Kamon Repository Snapshots" at "http://snapshots.kamon.io"
val kamonVersion = "0.3.6-fc86654c2ff451fa222677b27a5b45e024b93f61"
val kamonRepo = "io.kamon"

libraryDependencies ++= Seq(
  ws, // Play's web services module
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.typesafe.akka" %% "akka-slf4j" % "2.3.9",
  "org.webjars" % "bootstrap" % "3.0.0",
  "org.webjars" % "flot" % "0.8.0",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.9" % "test",
  kamonRepo %% "kamon-core" % kamonVersion,
  kamonRepo %% "kamon-akka" % kamonVersion,
  kamonRepo %% "kamon-statsd" % kamonVersion,
  kamonRepo %% "kamon-log-reporter" % kamonVersion,

  "org.aspectj" % "aspectjweaver" % "1.8.4"
)

//aspectjSettings

javaOptions += "-noverify"

//javaOptions <++= AspectjKeys.weaverOptions in Aspectj

//fork in run := true
