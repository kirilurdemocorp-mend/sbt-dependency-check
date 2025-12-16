version := "0.1"
lazy val root = project in file(".")
scalaVersion := "2.10.7"

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-runner" % "11.0.26"
)

dependencyCheckFailBuildOnCVSS := 1