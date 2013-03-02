package com.greentea.performance.test.sum

import com.greentea.performance.test.ITestCode

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 1:00
 */
class SumLinkedListScala(elementsCount : Int) extends ITestCode {

  var list : List[Int] = null

  def getName: String = "Sum of " + elementsCount + " elements of linked list (Scala)"

  def init() {
    list = (0 to elementsCount-1).toList
  }

  def run() {
    val sum = list.sum
  }

  def clean() {
    list = null
  }
}
