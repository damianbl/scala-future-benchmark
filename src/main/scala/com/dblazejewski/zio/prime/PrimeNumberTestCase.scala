package com.dblazejewski.zio.prime

import com.dblazejewski.benchmark.common.Sum
import zio.{Task, ZIO}

abstract class PrimeNumberTestCase extends Sum[Int] {

  def findPrimesUpTo(n: Int): Task[Int] = ZIO {
    val isPrime = collection.mutable.BitSet(2 to n: _*) -- (4 to n by 2)
    for (p <- 2 +: (3 to Math.sqrt(n).toInt by 2) if isPrime(p)) {
      isPrime --= p * p to n by p
    }
    isPrime.toImmutable.sum
  }
}
