package com.greentea.performance.test.add

import com.greentea.performance.test.ITestCode
import collection.mutable

/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 13:12
 */
class AddToHashSetScala extends ITestCode {

  var set : mutable.HashSet[Object] = null

  def getName: String = "Add new Object() to hash set (Scala)"

  def init() {
    set = new mutable.HashSet[Object]
  }

  def run() {
    set += new Object()
  }

  def clean() {
    set = null
  }
}
