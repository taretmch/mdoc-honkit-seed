import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.criceta"
ThisBuild / organizationName := "taretmch"

lazy val docs = (project in file("docs"))
  .settings(name := "docs-seed")
  .enablePlugins(MdocPlugin)
  .settings(mdocIn := file("docs/src/main"))
  .settings(mdocOut := file("docs/mdoc"))
