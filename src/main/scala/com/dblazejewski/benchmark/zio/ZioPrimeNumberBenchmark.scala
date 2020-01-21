package com.dblazejewski.benchmark.zio

import java.util.concurrent.TimeUnit

import com.dblazejewski.zio.prime.{ZioForComprehensionPrimeNumberTestCase, ZioSequencePrimeNumberTestCase}
import org.openjdk.jmh.annotations.{Benchmark, BenchmarkMode, Mode, OutputTimeUnit}

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
private class ZioPrimeNumberBenchmark {

  @Benchmark
  def zioForComprehensionTestCase(): Unit = ZioForComprehensionPrimeNumberTestCase.sum

  @Benchmark
  def zioSequenceTestCase(): Unit = ZioSequencePrimeNumberTestCase.sum
}
