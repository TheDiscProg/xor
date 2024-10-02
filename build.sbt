import sbt.librarymanagement.CrossVersion
import sbtghpackages.GitHubPackagesPlugin.autoImport.githubRepository

lazy val scala2 = "2.13.14"
lazy val scala3 = "3.5.1"
lazy val supportedScalaVersions = List(scala2, scala3)

ThisBuild / organization := "TheDiscProg"

ThisBuild / version := "0.3.1"

lazy val commonSettings = Seq(
  scalaVersion := scala3,
  libraryDependencies ++= Dependencies.all,
  githubOwner := "TheDiscProg",
  githubRepository := "simex-utils"
)

lazy val root = (project in file("."))
  .enablePlugins(
    ScalafmtPlugin
  )
  .settings(
    commonSettings,
    name := "simex-utils",
    scalacOptions ++= Scalac.options,
    crossScalaVersions := supportedScalaVersions,
    scalacOptions ++= {
      CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, 13)) => Seq.empty
        case _ =>
          Seq(
            "-Ykind-projector:underscores"
          )
      }
    },
    libraryDependencies ++= {
      if (scalaVersion.value.startsWith("2"))
        Seq(
          compilerPlugin(("org.typelevel" %% "kind-projector" % "0.13.3").cross(CrossVersion.full)),
          compilerPlugin(("com.olegpy" %% "better-monadic-for" % "0.3.1"))
        )
      else
        Seq.empty
    }
  )

addCommandAlias("cleanTest", ";clean;scalafmt;test:scalafmt;test;")
addCommandAlias("cleanCoverage", ";clean;scalafmt;test:scalafmt;coverage;test;coverageReport;")
