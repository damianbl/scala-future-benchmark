package com.dblazejewski

import org.scalatest.{FlatSpec, Matchers}

import scala.com.dblazejewski.prime.PrimeNumberTestCase
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object TestObject extends PrimeNumberTestCase {
  def test(n: Int): Future[Int] = findPrimesUpTo(n)

  override def sum: Int = 0
}

class PrimeNumberTestCaseTest extends FlatSpec with Matchers {
  "findPrimesUpTo 11" should "return list of prime numbers till 11" in {
    TestObject.test(11).map { primes =>
      primes shouldEqual 2 :: 3 :: 5 :: 7 :: 11 :: Nil
    }
  }
}
