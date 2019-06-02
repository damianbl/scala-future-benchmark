package com.dblazejewski

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object FutureSequenceTestCase extends TestCase {
  override def sum: Double = {
    val f = Future.sequence(Seq(t1, t2, t3))

    Await.result(f, 1000 millis).sum
  }
}
