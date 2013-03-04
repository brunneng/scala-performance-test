package com.greentea.performance.test

import java.util

/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 13:46
 */
class CodeBenchmark {
  val tests = new util.ArrayList[ITestCode]()

  def addIteratedTest(testCode : ITestCode, iterationsCount : Int) {
    tests.add(new IteratedTestCode(testCode, iterationsCount))
  }

  def addTest(testCode : ITestCode) {
    tests.add(testCode)
  }

  def runTests() {
    var resultsHashSum = 0L
    val i = tests.iterator()
    while (i.hasNext) {
      val testCode = i.next()
      testCode.init()

      if (testCode.isInstanceOf[IteratedTestCode]) {
        testCode.asInstanceOf[IteratedTestCode].warmUp()
      }

      val start = System.currentTimeMillis()
      testCode.run()
      val end = System.currentTimeMillis()
      resultsHashSum += testCode.getResult.hashCode()
      printf("%70s: %s ms\n", testCode.getName, (end - start))

      testCode.clean()
      System.gc()
    }
    println(resultsHashSum)
  }
}
