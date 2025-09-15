version := "0.1"
lazy val root = project in file(".")
scalaVersion := "2.10.7"

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-runner" % "9.4.58.v20250814"
)

dependencyCheckFailBuildOnCVSS := 1
dependencyCheckSuppressionFiles := Seq(new File("suppressions.xml"))