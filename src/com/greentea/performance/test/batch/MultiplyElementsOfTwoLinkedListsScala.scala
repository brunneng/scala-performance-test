package com.greentea.performance.test.batch

import com.greentea.performance.test.ITestCode

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 1:00
 */
class MultiplyElementsOfTwoLinkedListsScala(elementsCount : Int) extends ITestCode {

  var list1 : List[Int] = null
  var list2 : List[Int] = null
  var res : List[Int] = null

  def getName: String = "Multiply elements of two linked lists of size " + elementsCount + "  (Scala)";

  def init() {
    list1 = (0 to elementsCount-1).toList
    list2 = (0 to elementsCount-1).toList
  }

  def run() {
    res = list1.zip(list2).map(z => z._1 * z._2)
  }

  def getResult: AnyRef = res

  def clean() {
    list1 = null
    list2 = null
    res = null
  }
}
