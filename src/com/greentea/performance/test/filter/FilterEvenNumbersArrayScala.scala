package com.greentea.performance.test.filter

import com.greentea.performance.test.ITestCode
import collection.mutable

/**
  * User: goodg_000
  * Date: 20.02.13
  * Time: 19:49
  */
class FilterEvenNumbersArrayScala(elementsCount : Int) extends ITestCode {

   var array : Array[Int] = null

   def getName: String = "Select even numbers from array of length " + elementsCount + " (Scala)"

   def init() {
     array = (0 to elementsCount).toArray
   }

   def run() {
     val res = array.filter(_ % 2 == 0)
   }

   def clean() {
     array = null
   }
 }
