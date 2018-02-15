

inThisBuild(List(
  organization := "com.yoohaemin",
  scalaVersion := "2.12.4",
  version      := "0.1.0-SNAPSHOT",
  scalacOptions ++=
    "-Ypartial-unification" :: Nil
))


lazy val root = (project in file(".")).
  settings(
    name := "neo4j-doobie-example",
    libraryDependencies ++= {
      val doobieV = "0.5.0"

      "org.neo4j"    %  "neo4j-jdbc-driver" % "3.3.0" ::
      "org.tpolecat" %% "doobie-core"       % doobieV ::
      "org.tpolecat" %% "doobie-postgres"   % doobieV ::
      "org.tpolecat" %% "doobie-specs2"     % doobieV :: Nil
    }
  )
