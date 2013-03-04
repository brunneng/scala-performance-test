package com.greentea.performance.test.filter

import com.greentea.performance.test.ITestCode

/**
 * User: goodg_000
 * Date: 20.02.13
 * Time: 19:49
 */
class FilterEvenNumbersListScala(elementsCount : Int) extends ITestCode {

  var list : List[Int] = null
  var res : List[Int] = null

  def getName: String = "Select even numbers from list of length " + elementsCount + " (Scala)"

  def init() {
    list = (0 to elementsCount).toList
  }

  def run() {
    res = list.filter(_ % 2 == 0)
  }

  def getResult: AnyRef = res

  def clean() {
    list = null
    res = null
  }
}
