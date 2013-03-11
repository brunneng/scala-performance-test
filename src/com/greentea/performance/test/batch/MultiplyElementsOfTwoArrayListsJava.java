package com.greentea.performance.test.batch;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 0:41
 */
public class MultiplyElementsOfTwoArrayListsJava implements ITestCode {

   private List<Integer> list1;
   private List<Integer> list2;
   private List<Integer> res;
   private int elementsCount = 10;

   public MultiplyElementsOfTwoArrayListsJava(int elementsCount) {
      this.elementsCount = elementsCount;
   }

   public String getName() {
      return "Multiply elements of two array lists of size " + elementsCount + "  (Java)";
   }

   public void init() {
      list1 = new ArrayList<Integer>();
      list2 = new ArrayList<Integer>();
      for (int i = 0; i < elementsCount; ++i) {
         list1.add(i);
         list2.add(i);
      }
   }

   public void run() {
      res = new ArrayList<Integer>(list1.size());
      for (int i = 0; i < list1.size(); ++i) {
         res.add(list1.get(i)*list2.get(i));
      }
   }

   public Object getResult() {
      return res;
   }

   public void clean() {
      list1 = null;
      list2 = null;
      res = null;
   }
}
