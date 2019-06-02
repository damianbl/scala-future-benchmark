package com.dblazejewski

import com.dblazejewski.benchmark.common.Sum

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

abstract class PrimeNumberTestCase extends Sum[Long] {
  private def isPrime(n: Long): Future[Boolean] = Future {
    n match {
      case 0L | 1L => false
      case 2L | 3L => true
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
