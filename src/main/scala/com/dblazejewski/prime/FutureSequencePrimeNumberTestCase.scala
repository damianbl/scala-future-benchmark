package com.dblazejewski.prime

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object FutureSequencePrimeNumberTestCase extends PrimeNumberTestCase {
  override def sum: Int = {
    val f = Future.sequence(Seq(findPrimesUpTo(10000), findPrimesUpTo(100000), findPrimesUpTo(1000000)))

    Await.result(f, 100 seconds).sum
  }
}
