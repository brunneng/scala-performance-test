package com.greentea.performance.test.add

import collection.mutable
import com.greentea.performance.test.ITestCode

/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 14:32
 */
class AppendToLinkedListEndScala extends ITestCode {
  var list : mutable.LinkedList[String] = null

  def getName: String = "Append to end of linked list (Scala)"

  def init() {
    list = new mutable.LinkedList[String]
  }

  def run() {
    list = list.append(mutable.LinkedList("1"))
  }

  def getResult: AnyRef = list

  def clean() {
    list = null
  }
}
