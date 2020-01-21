package com.dblazejewski.future.tan

import com.dblazejewski.benchmark.common.Sum

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

abstract class MathTanTestCase extends Sum[Double] {
  val (ft1, ft2, ft3, ft4, ft5, ft6, ft7, ft8) = (
    Future(Math.tan(3.14159)),
    Future(Math.tan(1.74533)),
    Future(Math.tan(1.0472)),
    Future(Math.tan(2.54159)),
    Future(Math.tan(2.14159)),
    Future(Math.tan(0.14159)),
    Future(Math.tan(0.74159)),
    Future(Math.tan(2.16459))
  )
}
