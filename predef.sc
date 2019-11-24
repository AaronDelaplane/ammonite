import $ivy.`org.http4s::http4s-dsl:0.21.0-M5`
import $ivy.`org.http4s::http4s-blaze-server:0.21.0-M5`
import $ivy.`org.http4s::http4s-blaze-client:0.21.0-M5`
import $ivy.`org.http4s::http4s-circe:0.21.0-M5`

import $ivy.`org.typelevel::cats-core:2.0.0`
import $ivy.`org.typelevel::cats-effect:2.0.0`

import $ivy.`io.circe::circe-core:0.12.3`
import $ivy.`io.circe::circe-generic:0.12.3`
import $ivy.`io.circe::circe-parser:0.12.3`
//import $ivy.`io.circe::circe-optics:0.12.3`
import $ivy.`io.circe::circe-fs2:0.12.0`

import $ivy.`co.fs2::fs2-core:2.1.0`
import $ivy.`co.fs2::fs2-io:2.1.0`

import $ivy.`org.tpolecat::doobie-core:0.8.6`
import $ivy.`org.tpolecat::doobie-postgres:0.8.6`

import doobie._
import doobie.implicits._

import cats._
import cats.effect._
import cats.implicits._

import doobie.util.ExecutionContexts

implicit val cs = IO.contextShift(ExecutionContexts.synchronous)

val xa = Transactor.fromDriverManager[IO](
  "org.postgresql.Driver",     // driver classname
  "jdbc:postgresql:world",     // connect URL (driver-specific)
  "postgres",                  // user
  "",                          // password
  Blocker.liftExecutionContext(ExecutionContexts.synchronous) // just for testing
)


