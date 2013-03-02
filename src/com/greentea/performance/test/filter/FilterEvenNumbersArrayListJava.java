package com.greentea.performance.test.filter;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 20.02.13
 * Time: 19:44
 */
public class FilterEvenNumbersArrayListJava implements ITestCode {

   private List<Integer> list;
   private int elementsCount = 10;

   public FilterEvenNumbersArrayListJava(int elementsCount) {
      this.elementsCount = elementsCount;
   }

   public String getName() {
      return "Select even numbers from array list of length " + elementsCount + " (Java)";
   }

   public void init() {
      list = new ArrayList<Integer>();
      for (int i = 0; i < elementsCount; ++i) {
         list.add(i);
      }
   }

   public void run() {
      List<Integer> res = new ArrayList<Integer>();
      for (Integer val : list) {
         if (val % 2 == 0) {
            res.add(val);
         }
      }
   }

   public void clean() {
      list = null;
   }

}
