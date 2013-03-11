package com.greentea.performance.test.batch

import com.greentea.performance.test.ITestCode

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 1:00
 */
class MultiplyElementsOfTwoArraysScala(elementsCount : Int) extends ITestCode {

  var array1 : Array[Int] = null
  var array2 : Array[Int] = null
  var res : Array[Int] = null

  def getName: String = "Multiply elements of two arrays of size " + elementsCount + "  (Scala)";

  def init() {
    array1 = (0 to elementsCount-1).toArray
    array2 = (0 to elementsCount-1).toArray
  }

  def run() {
    res = array1.zip(array2).map(z => z._1 * z._2)
  }

  def getResult: AnyRef = res

  def clean() {
    array1 = null
    array2 = null
    res = null
  }
}
