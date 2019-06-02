package com.dblazejewski

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

trait PrimeNumber {
  def findSum: Long
}

abstract class PrimeNumberTestCase extends PrimeNumber {
  private def isPrime(n: Long): Future[Boolean] = Future {
    n match {
      case 0 | 1 => false
      case 2 | 3 => true
      case _ => (2L to Math.sqrt(n).toLong).forall(y => n % y != 0)
    }
  }

  protected def findNextPrime(n: Long): Future[Long] = {
    def iterate(m: Long): Future[Long] = {
      isPrime(m) flatMap { prime =>
        if (prime) Future.successful(m)
        else iterate(m + 1)
      }
    }

    iterate(n)
  }
}
