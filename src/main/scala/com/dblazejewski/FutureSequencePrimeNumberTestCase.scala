package com.dblazejewski

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object FutureSequencePrimeNumberTestCase extends PrimeNumberTestCase {
  override def findSum: Int = {
    val f = Future.sequence(Seq(findNextPrime(1000), findNextPrime(10000), findNextPrime(100000)))

    Await.result(f, 1000 millis).sum
  }
}
