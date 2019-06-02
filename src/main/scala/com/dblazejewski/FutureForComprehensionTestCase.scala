package com.dblazejewski

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FutureForComprehensionTestCase extends TestCase {

  override def sum: Double = {
    val f = for {
      r1 <- t1
      r2 <- t2
      r3 <- t3
    } yield r1 + r2 + r3

    Await.result(f, 1000 millis)
  }
}
