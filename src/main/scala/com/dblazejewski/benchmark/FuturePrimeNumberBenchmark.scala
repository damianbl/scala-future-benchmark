package com.dblazejewski.benchmark

import java.util.concurrent.TimeUnit

import com.dblazejewski.FutureSequencePrimeNumberTestCase
import org.openjdk.jmh.annotations.{Benchmark, BenchmarkMode, Mode, OutputTimeUnit}

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class FuturePrimeNumberBenchmark {

  @Benchmark
  def futureSequenceTestCase(): Unit = FutureSequencePrimeNumberTestCase.sum
}
