package com.dblazejewski.zio.prime

import zio.Exit.{Failure, Success}
import zio.{DefaultRuntime, ZIO}

object ZioSequencePrimeNumberTestCase extends PrimeNumberTestCase {
  override def sum: Int = {
    val zioResult =
      ZIO.collectAllPar(
        findPrimesUpTo(10000) :: findPrimesUpTo(100000) :: findPrimesUpTo(1000000) :: Nil
      )

    val runtime = new DefaultRuntime {}

    runtime.unsafeRunSync(zioResult) match {
      case Success(sum)     => sum.sum
      case Failure(failure) => throw new RuntimeException(failure.prettyPrint)
    }
  }
}
