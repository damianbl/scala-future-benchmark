package com.dblazejewski.future.tan

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FutureSequenceMathTanTestCase extends MathTanTestCase {
  override def sum: Double = {
    val f = Future.sequence(Seq(ft1, ft2, ft3, ft4, ft5, ft6, ft7, ft8))

    Await.result(f, 1000 millis).sum
  }
}
