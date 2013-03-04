package com.greentea.performance.test.iteration

import com.greentea.performance.test.ITestCode

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 1:00
 */
class IterationOverArrayScala(elementsCount : Int) extends ITestCode {

  var array : Array[Int] = null

  def getName: String = "Iteration array of size " + elementsCount + "  (Scala)";

  def init() {
    array = (0 to elementsCount-1).toArray
  }

  def run() {
    for (v <- array) {
      System.currentTimeMillis()
    }
  }

  def getResult: AnyRef = array

  def clean() {
    array = null
  }
}
