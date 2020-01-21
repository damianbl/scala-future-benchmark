package com.dblazejewski.zio.tan

import zio.Exit.{Failure, Success}
import zio.blocking.Blocking
import zio.clock.Clock
import zio.console.Console
import zio.internal.{Platform, PlatformLive}
import zio.random.Random
import zio.system.System
import zio.{DefaultRuntime, Runtime, ZEnv, ZIO}

object ZioSequenceMathTanTestCase extends MathTanTestCase {
  override def sum: Double = {
    val zioResult = ZIO.mergeAllPar(
      zt1 :: zt2 :: zt3 :: zt4 :: zt5 :: zt6 :: zt7 :: zt8 :: Nil
    )(0.0)(_ + _)

    val runtime = new DefaultRuntime {}

    runtime.unsafeRunSync(zioResult) match {
      case Success(sum)     => sum
      case Failure(failure) => throw new RuntimeException(failure.prettyPrint)
    }
  }
}
