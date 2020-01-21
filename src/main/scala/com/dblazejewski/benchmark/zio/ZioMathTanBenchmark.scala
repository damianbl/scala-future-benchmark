package com.dblazejewski.benchmark.zio

import java.util.concurrent.TimeUnit

import com.dblazejewski.zio.tan.{ZioForComprehensionMathTanTestCase, ZioSequenceMathTanTestCase}
import org.openjdk.jmh.annotations.{Benchmark, BenchmarkMode, Mode, OutputTimeUnit}

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class ZioMathTanBenchmark {

  @Benchmark
  def zioForComprehensionTestCase(): Unit = ZioForComprehensionMathTanTestCase.sum

  @Benchmark
  def zioSequenceTestCase(): Unit = ZioSequenceMathTanTestCase.sum
}
