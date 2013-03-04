package com.greentea.performance.test


/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 13:13
 */
class IteratedTestCode(testCode : ITestCode, iterationsCount : Int) extends ITestCode {
  def warmUpIterationsCount = 20000
  def getName: String = testCode.getName + " [x" + iterationsCount + "]"

  def init() {
    testCode.init()
  }

  def warmUp() {
    var i = 0
    while (i < warmUpIterationsCount) {
      testCode.run()
      i += 1
    }
  }

  def run() {
    var i = 0
    while (i < iterationsCount) {
      testCode.run()
      i += 1
    }
  }

  def getResult: AnyRef = testCode.getResult

  def clean() {
    testCode.clean()
  }
}
