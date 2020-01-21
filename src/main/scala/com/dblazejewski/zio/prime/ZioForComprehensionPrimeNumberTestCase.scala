package com.dblazejewski.zio.prime

import zio.DefaultRuntime
import zio.Exit.{Failure, Success}

object ZioForComprehensionPrimeNumberTestCase extends PrimeNumberTestCase {
  override def sum: Int = {
    val zioResult = for {
      r1 <- findPrimesUpTo(1000)
      r2 <- findPrimesUpTo(10000)
      r3 <- findPrimesUpTo(100000)
    } yield r1 + r2 + r3

    val runtime = new DefaultRuntime {}

    runtime.unsafeRunSync(zioResult) match {
      case Success(sum)     => sum
      case Failure(failure) => throw new RuntimeException(failure.prettyPrint)
    }
  }
}
