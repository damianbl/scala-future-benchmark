package com.dblazejewski.zio.tan

import com.dblazejewski.benchmark.common.Sum
import zio.ZIO

abstract class MathTanTestCase extends Sum[Double] {
  val (zt1, zt2, zt3, zt4, zt5, zt6, zt7, zt8) = (
    ZIO(Math.tan(3.14159)),
    ZIO(Math.tan(1.74533)),
    ZIO(Math.tan(1.0472)),
    ZIO(Math.tan(2.54159)),
    ZIO(Math.tan(2.14159)),
    ZIO(Math.tan(0.14159)),
    ZIO(Math.tan(0.74159)),
    ZIO(Math.tan(2.16459))
  )
}
