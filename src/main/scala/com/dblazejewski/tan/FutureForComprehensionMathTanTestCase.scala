package com.dblazejewski.tan

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FutureForComprehensionMathTanTestCase extends MathTanTestCase {

  override def sum: Double = {
    val f = for {
      r1 <- t1
      r2 <- t2
      r3 <- t3
      r4 <- t4
      r5 <- t5
      r6 <- t6
      r7 <- t7
      r8 <- t8
    } yield r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8

    Await.result(f, 1000 millis)
  }
}
