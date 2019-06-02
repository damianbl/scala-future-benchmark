package com.dblazejewski.benchmark

import java.util.concurrent.TimeUnit

import com.dblazejewski.{FutureForComprehensionTestCase, FutureSequenceTestCase}
import org.openjdk.jmh.annotations.{Benchmark, BenchmarkMode, Mode, OutputTimeUnit}

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class FutureBenchmark {

  @Benchmark
  def futureForComprehensionTestCase(): Unit = FutureForComprehensionTestCase.sum

  @Benchmark
  def futureSequenceTestCase(): Unit = FutureSequenceTestCase.sum

}
