package com.greentea.performance.test.iteration;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 0:41
 */
public class IterationOverLinkedListJava implements ITestCode {

   private List<Integer> list;
   private int elementsCount = 10;

   public IterationOverLinkedListJava(int elementsCount) {
      this.elementsCount = elementsCount;
   }

   public String getName() {
      return "Iteration linked list of size " + elementsCount + "  (Java)";
   }

   public void init() {
      list = new LinkedList<Integer>();
      for (int i = 0; i < elementsCount; ++i) {
         list.add(i);
      }
   }

   public void run() {
      for (Integer val : list) {
         System.currentTimeMillis();
      }
   }

   public Object getResult() {
      return list;
   }

   public void clean() {
      list = null;
   }
}
