package com.dblazejewski

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

trait Sum {
  def sum: Double
}

abstract class TestCase extends Sum {
  val (t1, t2, t3) = (Future(Math.tan(9876.12)), Future(Math.tan(965552.17)), Future(Math.tan(343235.54)))
}
