package com.greentea.performance.test.group

import com.greentea.performance.test.ITestCode

/**
  * User: goodg_000
  * Date: 19.02.13
  * Time: 1:00
  */
class GroupByLinkedListScala(elementsCount : Int) extends ITestCode {

   var list : List[String] = null

   def getName: String = "Group of " + elementsCount + " elements of linked list by key func (Scala)"

   def init() {
     list = (0 to elementsCount-1).map(i => "" + Math.pow(elementsCount-i, 2)).toList
   }

   def run() {
     val groups = list.groupBy(s => s.length)
   }

   def clean() {
     list = null
   }
 }
