package com.greentea.performance.test.add

import com.greentea.performance.test.ITestCode
import collection.mutable

/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 13:12
 */
class AddToHashSetScala extends ITestCode {

  var set : mutable.HashSet[String] = null

  def getName: String = "Add to hash set (Scala)"

  def init() {
    set = new mutable.HashSet[String]
  }

  def run() {
    set += "1"
  }

  def clean() {
    set = null
  }
}
