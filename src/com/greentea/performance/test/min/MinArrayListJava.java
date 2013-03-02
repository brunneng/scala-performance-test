package com.greentea.performance.test.min;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 0:41
 */
public class MinArrayListJava implements ITestCode {

   private List<String> list;
   private int elementsCount = 10;

   public MinArrayListJava(int elementsCount) {
      this.elementsCount = elementsCount;
   }

   public String getName() {
      return "Min of " + elementsCount + " elements of array list (Java)";
   }

   public void init() {
      list = new ArrayList<String>();
      for (int i = 0; i < elementsCount; ++i) {
         list.add("" + Math.pow(elementsCount - i, 2));
      }
   }

   public void run() {
      String min = null;
      int lengthOfMin = Integer.MAX_VALUE;
      for (String val : list) {
         int len = val.length();
         if (min == null || len < lengthOfMin) {
            min = val;
            lengthOfMin = len;
         }
      }
   }

   public void clean() {
      list = null;
   }
}
