package com.greentea.performance.test.iteration

import com.greentea.performance.test.ITestCode

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 1:00
 */
class IterationOverLinkedListScala(elementsCount : Int) extends ITestCode {

  var list : List[Int] = null

  def getName: String = "Iteration linked list of size " + elementsCount + " (Scala)";

  def init() {
    list = (0 to elementsCount-1).toList
  }

  def run() {
    for (v <- list) {
      System.currentTimeMillis()
    }
  }

  def getResult: AnyRef = list

  def clean() {
    list = null
  }
}
