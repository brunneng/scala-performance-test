package com.greentea.performance.test.batch;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 0:41
 */
public class MultiplyElementsOfTwoArraysJava implements ITestCode {

   private int[] array1;
   private int[] array2;
   private int[] res;
   private int elementsCount = 10;

   public MultiplyElementsOfTwoArraysJava(int elementsCount) {
      this.elementsCount = elementsCount;
   }

   public String getName() {
      return "Multiply elements of two arrays of size " + elementsCount + "  (Java)";
   }

   public void init() {
      array1 = new int[elementsCount];
      array2 = new int[elementsCount];
      for (int i = 0; i < elementsCount; ++i) {
         array1[i] = i;
         array2[i] = i;
      }
   }

   public void run() {
      res = new int[array1.length];
      for (int i = 0; i < array1.length; ++i) {
         res[i] = array1[i] * array2[i];
      }
   }

   public Object getResult() {
      return res;
   }

   public void clean() {
      array1 = null;
      array2 = null;
      res = null;
   }
}
