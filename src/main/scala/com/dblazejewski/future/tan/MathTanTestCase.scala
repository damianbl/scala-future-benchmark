package com.dblazejewski.future.tan

import com.dblazejewski.benchmark.common.Sum

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

abstract class MathTanTestCase extends Sum[Double] {
  val (t1, t2, t3, t4, t5, t6, t7, t8) = (Future(Math.tan(3.14159)), Future(Math.tan(1.74533)),
    Future(Math.tan(1.0472)), Future(Math.tan(2.54159)), Future(Math.tan(2.14159)), Future(Math.tan(0.14159)),
    Future(Math.tan(0.74159)), Future(Math.tan(2.16459)))
}
