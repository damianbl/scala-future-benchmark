package com.dblazejewski.future.prime

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FutureForComprehensionPrimeNumberTestCase extends PrimeNumberTestCase {
  override def sum: Int = {
    val f = for {
      r1 <- findPrimesUpTo(1000)
      r2 <- findPrimesUpTo(10000)
      r3 <- findPrimesUpTo(100000)
    } yield r1 + r2 + r3

    Await.result(f, 1000 millis)
  }
}
