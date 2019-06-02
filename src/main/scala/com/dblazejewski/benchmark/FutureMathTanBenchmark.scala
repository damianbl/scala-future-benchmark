package com.dblazejewski.benchmark

import java.util.concurrent.TimeUnit

import com.dblazejewski.tan.{FutureForComprehensionMathTanTestCase, FutureSequenceMathTanTestCase}
import org.openjdk.jmh.annotations.{Benchmark, BenchmarkMode, Mode, OutputTimeUnit}

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class FutureMathTanBenchmark {

  @Benchmark
  def futureForComprehensionTestCase(): Unit = FutureForComprehensionMathTanTestCase.sum

  @Benchmark
  def futureSequenceTestCase(): Unit = FutureSequenceMathTanTestCase.sum
}
