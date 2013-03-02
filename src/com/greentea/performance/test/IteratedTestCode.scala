package com.greentea.performance.test


/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 13:13
 */
class IteratedTestCode(testCode : ITestCode, iterationsCount : Int) extends ITestCode {
  def getName: String = testCode.getName + " [x" + iterationsCount + "]"

  def init() {
    testCode.init()
  }

  def run() {
    var i = 0
    while (i < iterationsCount) {
      testCode.run()
      i += 1
    }
  }

  def clean() {
    testCode.clean()
  }
}
