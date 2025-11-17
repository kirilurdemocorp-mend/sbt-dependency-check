version := "0.1"
lazy val root = project in file(".")
scalaVersion := "2.13.18"

libraryDependencies ++= Seq(
  "commons-beanutils" % "commons-beanutils" % "1.11.0" % "test",
  "org.eclipse.jetty" % "jetty-runner" % "9.4.58.v20250814" % "provided",
  "com.github.t3hnar" % "scala-bcrypt_2.10" % "2.6" % "runtime",
  "org.apache.commons" % "commons-collections4" % "4.5.0",
  "com.google.oauth-client" % "google-oauth-client" % "1.39.0" % "optional"
)

dependencyCheckSkipTestScope := false
dependencyCheckSkipProvidedScope := true
dependencyCheckSkipRuntimeScope := false