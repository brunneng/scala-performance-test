package com.greentea.performance.test

import add._
import filter.{FilterEvenNumbersListScala, FilterEvenNumbersLinkedListJava, FilterEvenNumbersArrayScala, FilterEvenNumbersArrayListJava}
import group.{GroupByLinkedListScala, GroupArrayListJava}
import iteration.{IterationOverLinkedListScala, IterationOverLinkedListJava, IterationOverArrayScala, IterationOverArrayListJava}
import min.{MinLinkedListScala, MinByLinkedListScala, MinArrayListJava}
import sum.{SumArrayScala, SumLinkedListScala, SumArrayListJava}

/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 13:38
 */
object RunAllTests {
  def main(args : Array[String]) {

    val benchmark = new CodeBenchmark()
    val defaultIterationsCount = 20000000

    benchmark.addIteratedTest(new IterationOverArrayListJava(1000), defaultIterationsCount/100)
    benchmark.addIteratedTest(new IterationOverArrayScala(1000), defaultIterationsCount/100)
    benchmark.addIteratedTest(new IterationOverLinkedListJava(1000), defaultIterationsCount/100)
    benchmark.addIteratedTest(new IterationOverLinkedListScala(1000), defaultIterationsCount/100)
    benchmark.addIteratedTest(new AddToListBufferEndScala(), defaultIterationsCount/10)
    benchmark.addIteratedTest(new AddToLinkedListEndJava(), defaultIterationsCount/10)
    benchmark.addIteratedTest(new AddToArrayListEndJava(), defaultIterationsCount)
    benchmark.addIteratedTest(new AddToArrayBufferEndScala(), defaultIterationsCount)
    benchmark.addIteratedTest(new AppendToLinkedListEndScala(), 10000)
    benchmark.addIteratedTest(new AddToHashSetJava(), defaultIterationsCount/10)
    benchmark.addIteratedTest(new AddToHashSetScala(), defaultIterationsCount/10)
    benchmark.addIteratedTest(new FilterEvenNumbersArrayListJava(50), defaultIterationsCount/10)
    benchmark.addIteratedTest(new FilterEvenNumbersLinkedListJava(50), defaultIterationsCount/10)
    benchmark.addIteratedTest(new FilterEvenNumbersListScala(50), defaultIterationsCount/10)
    benchmark.addIteratedTest(new FilterEvenNumbersArrayScala(50), defaultIterationsCount/10)
    benchmark.addIteratedTest(new SumArrayListJava(10), defaultIterationsCount)
    benchmark.addIteratedTest(new SumArrayScala(10), defaultIterationsCount)
    benchmark.addIteratedTest(new SumLinkedListScala(10), defaultIterationsCount)
    benchmark.addIteratedTest(new SumArrayListJava(10000), defaultIterationsCount/1000)
    benchmark.addIteratedTest(new SumArrayScala(10000), defaultIterationsCount/1000)
    benchmark.addIteratedTest(new SumLinkedListScala(10000), defaultIterationsCount/1000)
    benchmark.addIteratedTest(new MinArrayListJava(100), defaultIterationsCount/10)
    benchmark.addIteratedTest(new MinByLinkedListScala(100), defaultIterationsCount/10)
    benchmark.addIteratedTest(new MinLinkedListScala(100), defaultIterationsCount/10)
    benchmark.addIteratedTest(new MinArrayListJava(10000), defaultIterationsCount/1000)
    benchmark.addIteratedTest(new MinByLinkedListScala(10000), defaultIterationsCount/1000)
    benchmark.addIteratedTest(new MinLinkedListScala(10000), defaultIterationsCount/1000)
    benchmark.addIteratedTest(new GroupArrayListJava(100), defaultIterationsCount/20)
    benchmark.addIteratedTest(new GroupByLinkedListScala(100), defaultIterationsCount/20)
    benchmark.addIteratedTest(new GroupArrayListJava(10000), defaultIterationsCount/2000)
    benchmark.addIteratedTest(new GroupByLinkedListScala(10000), defaultIterationsCount/2000)

    benchmark.runTests()
  }
}
