package com.dblazejewski.benchmark.common

import java.util.concurrent.TimeUnit

import com.dblazejewski.future.prime.{
  FutureForComprehensionPrimeNumberTestCase,
  FutureSequencePrimeNumberTestCase
}
import org.openjdk.jmh.annotations.{
  Benchmark,
  BenchmarkMode,
  Mode,
  OutputTimeUnit
}

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class ZioPrimeNumberBenchmark {

  @Benchmark
  def futureForComprehensionTestCase(): Unit =
    FutureForComprehensionPrimeNumberTestCase.sum

  @Benchmark
  def futureSequenceTestCase(): Unit = FutureSequencePrimeNumberTestCase.sum
  2
}
