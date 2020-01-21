package com.dblazejewski.future.tan

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FutureForComprehensionMathTanTestCase extends MathTanTestCase {

  override def sum: Double = {
    val f = for {
      r1 <- ft1
      r2 <- ft2
      r3 <- ft3
      r4 <- ft4
      r5 <- ft5
      r6 <- ft6
      r7 <- ft7
      r8 <- ft8
    } yield r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8

    Await.result(f, 1000 millis)
  }
}
