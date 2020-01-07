// http4s --------------------------------------------------------------------------------------------------------------
import $ivy.`org.http4s::http4s-dsl:0.21.0-M5`
import $ivy.`org.http4s::http4s-blaze-server:0.21.0-M5`
import $ivy.`org.http4s::http4s-blaze-client:0.21.0-M5`
import $ivy.`org.http4s::http4s-circe:0.21.0-M5`

import org.http4s._
import org.http4s.dsl.io._
import org.http4s.implicits._

// cats ----------------------------------------------------------------------------------------------------------------
import $ivy.`org.typelevel::cats-core:2.0.0`
import $ivy.`org.typelevel::cats-effect:2.0.0`

import cats._
import cats.data._
import cats.effect._
import cats.implicits._

// circe ---------------------------------------------------------------------------------------------------------------
import $ivy.`io.circe::circe-core:0.12.3`
import $ivy.`io.circe::circe-generic:0.12.3`
import $ivy.`io.circe::circe-parser:0.12.3`
import $ivy.`io.circe::circe-optics:0.12.0`
//import $ivy.`io.circe::circe-fs2:0.12.0`

import io.circe._
import io.circe.parser._
import io.circe.optics.JsonPath._

// doobie --------------------------------------------------------------------------------------------------------------
import $ivy.`org.tpolecat::doobie-core:0.8.6`
import $ivy.`org.tpolecat::doobie-postgres:0.8.6`

import doobie._
import doobie.implicits._
import doobie.util.ExecutionContexts
//import doobie.util._ // <- `doobie.util.io` creates conflict w/ other packages named `io` (e.g. io.circe)

import doobie.postgres._
import doobie.postgres.implicits._

implicit val lh = LogHandler.jdkLogHandler
implicit val cs = IO.contextShift(ExecutionContexts.synchronous)
val t = Transactor.fromDriverManager[IO]("org.postgresql.Driver", "jdbc:postgresql:inventory", "postgres", "password")

// fs2 -----------------------------------------------------------------------------------------------------------------
import $ivy.`co.fs2::fs2-core:2.1.0`
import $ivy.`co.fs2::fs2-io:2.1.0`

import fs2.Stream

// scalacheck ---------------------------------------------------------------------------------------------------------
import $ivy.`org.scalacheck::scalacheck:1.14.3`

import org.scalacheck._

// scala standard library ----------------------------------------------------------------------------------------------
import scala.util._
import scala.util.matching._
import scala.concurrent.duration

// java standard library -----------------------------------------------------------------------------------------------
import java.util.UUID
