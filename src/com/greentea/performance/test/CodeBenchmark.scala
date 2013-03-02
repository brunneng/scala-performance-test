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
    val i = tests.iterator()
    while (i.hasNext) {
      val testCode = i.next()
      testCode.init()

      val start = System.currentTimeMillis()
      testCode.run()
      val end = System.currentTimeMillis()
      printf("%70s: %s ms\n", testCode.getName, (end - start))

      testCode.clean()
      System.gc()
    }
  }
}
