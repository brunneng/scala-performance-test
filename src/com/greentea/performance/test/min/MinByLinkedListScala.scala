package com.greentea.performance.test.min

import com.greentea.performance.test.ITestCode

/**
  * User: goodg_000
  * Date: 19.02.13
  * Time: 1:00
  */
class MinByLinkedListScala(elementsCount : Int) extends ITestCode {

   var list : List[String] = null

   def getName: String = "Min of " + elementsCount + " elements of linked list (list.minBy Scala)"

   def init() {
     list = (0 to elementsCount-1).map(i => "" + Math.pow(elementsCount-i, 2)).toList
   }

   def run() {
     val min = list.minBy(v => v.length)
   }

   def clean() {
     list = null
   }
 }
