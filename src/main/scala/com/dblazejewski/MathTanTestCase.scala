package com.dblazejewski

import com.dblazejewski.benchmark.common.Sum

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

abstract class MathTanTestCase extends Sum[Double] {
  val (t1, t2, t3) = (Future(Math.tan(9876.12)), Future(Math.tan(965552.17)), Future(Math.tan(343235.54)))
}
