package com.dblazejewski

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object FutureSequencePrimeNumberTestCase extends PrimeNumberTestCase {
  override def findSum: Long = {
    val f = Future.sequence(Seq(findNextPrime(1111111111), findNextPrime(888888888), findNextPrime(999999999)))

    Await.result(f, 1000 millis).sum
  }
}
