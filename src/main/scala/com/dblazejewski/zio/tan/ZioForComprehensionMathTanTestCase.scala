package com.dblazejewski.zio.tan

import zio.DefaultRuntime
import zio.Exit.{Failure, Success}

object ZioForComprehensionMathTanTestCase extends MathTanTestCase {

  override def sum: Double = {
    val zioResult = for {
      r1 <- zt1
      r2 <- zt2
      r3 <- zt3
      r4 <- zt4
      r5 <- zt5
      r6 <- zt6
      r7 <- zt7
      r8 <- zt8
    } yield r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8

    val runtime = new DefaultRuntime {}

    runtime.unsafeRunSync(zioResult) match {
      case Success(sum)     => sum
      case Failure(failure) => throw new RuntimeException(failure.prettyPrint)
    }
  }
}
