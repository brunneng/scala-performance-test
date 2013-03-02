package com.greentea.performance.test.add

import com.greentea.performance.test.ITestCode
import collection.mutable

/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 13:12
 */
class AddToListBufferEndScala extends ITestCode {

  var list : mutable.ListBuffer[String] = null

  def getName: String = "Add to end of list buffer (Scala)"

  def init() {
    list = new mutable.ListBuffer[String]
  }

  def run() {
    list += "1"
  }

  def clean() {
    list = null
  }
}
