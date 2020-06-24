// http4s --------------------------------------------------------------------------------------------------------------
import $ivy.`org.http4s::http4s-dsl:0.21.1`
import $ivy.`org.http4s::http4s-blaze-server:0.21.1`
import $ivy.`org.http4s::http4s-blaze-client:0.21.1`
import $ivy.`org.http4s::http4s-circe:0.21.1`

import org.http4s._
import org.http4s.dsl.io._
import org.http4s.implicits._

// cats ----------------------------------------------------------------------------------------------------------------
import $ivy.`org.typelevel::cats-core:2.2.0-M2`
import $ivy.`org.typelevel::cats-effect:2.1.3`

import cats._
import cats.data._
import cats.syntax.all._
import cats.effect._

// cats-retry ---------------------------------------------------------------------------------------------------------
import $ivy.`com.github.cb372::cats-retry:1.0.0`

import retry._

// circe ---------------------------------------------------------------------------------------------------------------
import $ivy.`io.circe::circe-core:0.13.0`
import $ivy.`io.circe::circe-generic:0.13.0`
import $ivy.`io.circe::circe-parser:0.13.0`
import $ivy.`io.circe::circe-optics:0.12.0`
//import $ivy.`io.circe::circe-fs2:0.12.0`

import io.circe._
import io.circe.parser._
import io.circe.optics.JsonPath._

// doobie --------------------------------------------------------------------------------------------------------------
import $ivy.`org.tpolecat::doobie-core:0.8.8`
import $ivy.`org.tpolecat::doobie-postgres:0.8.8`

import doobie._
import doobie.implicits._
import doobie.util.ExecutionContexts
//import doobie.util._ // <- `doobie.util.io` creates conflict w/ other packages named `io` (e.g. io.circe)

import doobie.postgres._
import doobie.postgres.implicits._

//implicit val lh = LogHandler.jdkLogHandler
//implicit val cs = IO.contextShift(ExecutionContexts.synchronous)
//val t = Transactor.fromDriverManager[IO]("org.postgresql.Driver", "jdbc:postgresql:inventory", "postgres", "password")

// refined ------------------------------------------------------------------------------------------------------------
import $ivy.`eu.timepit::refined:0.9.13`
import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric._

// enumeratum ----------------------------------------------------------------------------------------------------------
import $ivy.`com.beachape::enumeratum:1.5.15`
import enumeratum._

// fs2 -----------------------------------------------------------------------------------------------------------------
import $ivy.`co.fs2::fs2-core:2.4.2`
import $ivy.`co.fs2::fs2-io:2.4.2`

import fs2.Stream

// scalacheck ---------------------------------------------------------------------------------------------------------
//import $ivy.`org.scalacheck::scalacheck:1.14.3`

//import org.scalacheck._
//import Gen._
//import Arbitrary._
//import org.scalacheck.Prop._

// scala standard library ----------------------------------------------------------------------------------------------
import scala.util._
import scala.util.matching._
import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.language.postfixOps
import scala.collection.immutable._

// scala standard module not in standard lib
import $ivy.`org.scala-lang.modules::scala-parallel-collections:0.2.0`

// java standard library -----------------------------------------------------------------------------------------------
import java.util.UUID

// implicits -----------------------------------------------------------------------------------------------------------
implicit val cs: ContextShift[IO] = IO.contextShift(global)
implicit val timer: Timer[IO] = IO.timer(global)

