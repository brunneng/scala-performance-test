package com.greentea.performance.test.min

import com.greentea.performance.test.ITestCode

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 1:00
 */
class MinLinkedListScala(elementsCount: Int) extends ITestCode {

  var list: List[String] = null
  var min: String = null

  def getName: String = "Min of " + elementsCount + " elements of linked list (Scala)"

  def init() {
    list = (0 to elementsCount - 1).map(i => "" + Math.pow(elementsCount - i, 2)).toList
  }

  def run() {
    min = null
    var minLen = Int.MaxValue
    for (v <- list) {
      val len = v.size
      if (len < minLen) {
        min = v
        minLen = len
      }
    }
  }

  def getResult: AnyRef = min

  def clean() {
    list = null
    min = null
  }
}
