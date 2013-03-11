package com.greentea.performance.test.batch;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 0:41
 */
public class MultiplyElementsOfTwoLinkedListsJava implements ITestCode {

   private List<Integer> list1;
   private List<Integer> list2;
   private List<Integer> res;
   private int elementsCount = 10;

   public MultiplyElementsOfTwoLinkedListsJava(int elementsCount) {
      this.elementsCount = elementsCount;
   }

   public String getName() {
      return "Multiply elements of two linked lists of size " + elementsCount + "  (Java)";
   }

   public void init() {
      list1 = new LinkedList<Integer>();
      list2 = new LinkedList<Integer>();
      for (int i = 0; i < elementsCount; ++i) {
         list1.add(i);
         list2.add(i);
      }
   }

   public void run() {
      res = new LinkedList<Integer>();

      Iterator<Integer> i1 = list1.iterator();
      Iterator<Integer> i2 = list1.iterator();

      while (i1.hasNext()) {
         res.add(i1.next()*i2.next());
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
