package com.dblazejewski

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

trait PrimeNumber {
  def findSum: Int
}

abstract class PrimeNumberTestCase extends PrimeNumber {
  private def isPrime(n: Int): Future[Boolean] = Future {
    n match {
      case 0 | 1 => false
      case 2 | 3 => true
      case _ => (2 to Math.sqrt(n).toInt).forall(y => n % y != 0)
    }
  }

  protected def findNextPrime(n: Int): Future[Int] = {
    def iterate(m: Int): Future[Int] = {
      isPrime(m) flatMap { prime =>
        if (prime) Future.successful(m)
        else iterate(m + 1)
      }
    }

    iterate(n)
  }
}
