version := "0.1"
lazy val root = project in file(".")
scalaVersion := "2.13.18"

dependencyCheckFailBuildOnCVSS := 0
dependencyCheckScanSet := Seq(baseDirectory.value / "src/main/customDir")