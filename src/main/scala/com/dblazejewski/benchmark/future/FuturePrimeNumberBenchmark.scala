package com.dblazejewski.benchmark.future

import java.util.concurrent.TimeUnit

import com.dblazejewski.future.prime.{FutureForComprehensionPrimeNumberTestCase, FutureSequencePrimeNumberTestCase}
import org.openjdk.jmh.annotations.{Benchmark, BenchmarkMode, Mode, OutputTimeUnit}

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
private class FuturePrimeNumberBenchmark {

  @Benchmark
  def futureForComprehensionTestCase(): Unit = FutureForComprehensionPrimeNumberTestCase.sum

  @Benchmark
  def futureSequenceTestCase(): Unit = FutureSequencePrimeNumberTestCase.sum
}
