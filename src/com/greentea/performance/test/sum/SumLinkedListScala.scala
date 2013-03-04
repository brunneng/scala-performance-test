package com.greentea.performance.test.sum

import com.greentea.performance.test.ITestCode

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 1:00
 */
class SumLinkedListScala(elementsCount : Int) extends ITestCode {

  var list : List[Int] = null
  var sum : Int = 0

  def getName: String = "Sum of " + elementsCount + " elements of linked list (Scala)"

  def init() {
    list = (0 to elementsCount-1).toList
  }

  def run() {
    sum = list.sum
  }

  def getResult: AnyRef = ""+sum

  def clean() {
    list = null
  }
}
