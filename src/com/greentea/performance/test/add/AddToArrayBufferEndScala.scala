package com.greentea.performance.test.add

import com.greentea.performance.test.ITestCode
import collection.mutable

/**
  * User: goodg_000
  * Date: 17.02.13
  * Time: 13:12
  */
class AddToArrayBufferEndScala extends ITestCode {

   var list : mutable.ArrayBuffer[String] = null

   def getName: String = "Add to end of array buffer (Scala)"

   def init() {
     list = new mutable.ArrayBuffer[String]
   }

   def run() {
     list += "1"
   }

   def clean() {
     list = null
   }
 }
