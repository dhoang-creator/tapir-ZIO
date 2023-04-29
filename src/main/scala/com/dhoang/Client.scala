package com.dhoang

import cats.effect.ExitCode
import org.http4s.blaze.client.BlazeClientBuilder
import zio.{ZIO, ZIOAppDefault}

object Client extends ZIOAppDefault {
  def callEffect(client: Client[ZIO], str: String): ZIO[String] = {
    client.expect[String](uri"http://localhost:8080/length/" / str)
  }

  // The Exitcode is a hallmark of Cats IO => Is there a comparable equivalent for ZIO?
  override def run(args: List[String]): ZIO[E, A, ExitCode] =
    BlazeClientBuilder[ZIO]

}
