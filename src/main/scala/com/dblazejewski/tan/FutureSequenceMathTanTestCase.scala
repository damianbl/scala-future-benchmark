package com.dblazejewski.tan

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object FutureSequenceMathTanTestCase extends MathTanTestCase {
  override def sum: Double = {
    val f = Future.sequence(Seq(t1, t2, t3, t4, t5, t6, t7, t8))

    Await.result(f, 1000 millis).sum
  }
}
