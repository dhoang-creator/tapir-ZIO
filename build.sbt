name := "tapir-ZIO"
organization := "com.dhoang"
version := "0.1.0-SNAPSHOT"

lazy val rootProject = (project in file("."))

scalaVersion := "2.13.10"
val tapirVersion = "1.2.10"

libraryDependencies ++= Seq(
  // Tapir
  "com.softwaremill.sttp.tapir"       %% "tapir-http4s-server-zio"          % tapirVersion,
  "com.softwaremill.sttp.tapir"       %% "tapir-http4s-server"              % tapirVersion,

  // http4s
  "org.http4s"                        %% "http4s-ember-server"              % "0.23.18",
  "org.http4s"                        %% "http4s-dsl"                       % "0.23.18",
  "org.http4s"                        %% "http4s-blaze-server"              % "0.23.14",
  "org.http4s"                        %% "http4s-blaze-client"              % "0.23.14",

  // ZIO
  "dev.zio"                           %% "zio"                              % "2.0.13",
  "dev.zio"                           %% "zio-streams"                      % "2.0.13",

  // Postgres DB
  "org.postgresql"                    % "postgresql"                       % "42.5.4",

  // Doobie
  "org.tpolecat"                      %% "doobie-core"                      % "1.0.0-RC1",
  "org.tpolecat"                      %% "doobie-postgres"                  % "1.0.0-RC1",

  // slf4j
  "ch.qos.logback"                    % "logback-classic"                   % "1.4.7",

  // Test Frameworks
  "com.softwaremill.sttp.tapir"       %% "tapir-sttp-stub-server"           % tapirVersion        % Test,
  "dev.zio"                           %% "zio-test"                         % "2.0.13"            % Test,
  "dev.zio"                           %% "zio-test-sbt"                     % "2.0.13"            % Test,
  "org.scalactic"                     %% "scalactic"                        % "3.2.15"            % Test,
  "org.scalatest"                     %% "scalatest"                        % "3.2.15"            % Test
)

testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework"))

