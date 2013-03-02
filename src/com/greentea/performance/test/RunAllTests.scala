package com.greentea.performance.test

import add._
import filter.{FilterEvenNumbersListScala, FilterEvenNumbersLinkedListJava, FilterEvenNumbersArrayScala, FilterEvenNumbersArrayListJava}
import group.{GroupByLinkedListScala, GroupArrayListJava}
import min.{MinLinkedListScala, MinByLinkedListScala, MinArrayListJava}
import sum.{SumLinkedListScala, SumArrayListJava}

/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 13:38
 */
object RunAllTests {
  def main(args : Array[String]) {

    val benchmark = new CodeBenchmark()
    val defaultIterationsCount = 20000000

    benchmark.addIteratedTest(new AddToArrayListEndJava(), defaultIterationsCount)
    benchmark.addIteratedTest(new AddToArrayBufferEndScala(), defaultIterationsCount)
    benchmark.addIteratedTest(new AddToListBufferEndScala(), defaultIterationsCount/10)
    benchmark.addIteratedTest(new AddToLinkedListEndJava(), defaultIterationsCount/10)
    benchmark.addIteratedTest(new AppendToLinkedListEndScala(), 10000)
    benchmark.addIteratedTest(new AddToHashSetJava(), defaultIterationsCount)
    benchmark.addIteratedTest(new AddToHashSetScala(), defaultIterationsCount)
    benchmark.addIteratedTest(new FilterEvenNumbersArrayListJava(50), defaultIterationsCount/10)
    benchmark.addIteratedTest(new FilterEvenNumbersLinkedListJava(50), defaultIterationsCount/10)
    benchmark.addIteratedTest(new FilterEvenNumbersListScala(50), defaultIterationsCount/10)
    benchmark.addIteratedTest(new FilterEvenNumbersArrayScala(50), defaultIterationsCount/10)
    benchmark.addIteratedTest(new SumArrayListJava(10), defaultIterationsCount)
    benchmark.addIteratedTest(new SumLinkedListScala(10), defaultIterationsCount)
    benchmark.addIteratedTest(new MinArrayListJava(100), defaultIterationsCount/10)
    benchmark.addIteratedTest(new MinByLinkedListScala(100), defaultIterationsCount/10)
    benchmark.addIteratedTest(new MinLinkedListScala(100), defaultIterationsCount/10)
    benchmark.addIteratedTest(new GroupArrayListJava(100), defaultIterationsCount/20)
    benchmark.addIteratedTest(new GroupByLinkedListScala(100), defaultIterationsCount/20)

    benchmark.runTests()
  }
}
