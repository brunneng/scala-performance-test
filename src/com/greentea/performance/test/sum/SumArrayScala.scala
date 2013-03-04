package com.greentea.performance.test.sum

import com.greentea.performance.test.ITestCode

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 1:00
 */
class SumArrayScala(elementsCount : Int) extends ITestCode {

  var array : Array[Int] = null
  var sum : Int = 0

  def getName: String = "Sum of " + elementsCount + " elements of array (Scala)"

  def init() {
    array = (0 to elementsCount-1).toArray
  }

  def run() {
    sum = array.sum
  }

  def getResult: AnyRef = ""+sum

  def clean() {
    array = null
  }
}
