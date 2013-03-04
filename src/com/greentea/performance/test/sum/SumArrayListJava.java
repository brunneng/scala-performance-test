package com.greentea.performance.test.sum;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 0:41
 */
public class SumArrayListJava implements ITestCode {

   private List<Integer> list;
   private int elementsCount = 10;
   private int sum = 0;

   public SumArrayListJava(int elementsCount) {
      this.elementsCount = elementsCount;
   }

   public String getName() {
      return "Sum of " + elementsCount + " elements of array list (Java)";
   }

   public void init() {
      list = new ArrayList<Integer>();
      for (int i = 0; i < elementsCount; ++i) {
         list.add(i);
      }
   }

   public void run() {
      sum = 0;
      for (Integer val : list) {
         sum += val;
      }
   }

   public Object getResult() {
      return sum;
   }

   public void clean() {
      list = null;
   }
}
