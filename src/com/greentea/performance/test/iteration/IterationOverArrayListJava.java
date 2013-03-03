package com.greentea.performance.test.iteration;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 0:41
 */
public class IterationOverArrayListJava implements ITestCode {

   private List<Integer> list;
   private int elementsCount = 10;

   public IterationOverArrayListJava(int elementsCount) {
      this.elementsCount = elementsCount;
   }

   public String getName() {
      return "Iteration array list of size " + elementsCount + "  (Java)";
   }

   public void init() {
      list = new ArrayList<Integer>();
      for (int i = 0; i < elementsCount; ++i) {
         list.add(i);
      }
   }

   public void run() {
      for (Integer val : list) {
         System.currentTimeMillis();
      }
   }

   public void clean() {
      list = null;
   }
}
