package com.greentea.performance.test.filter;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 20.02.13
 * Time: 19:44
 */
public class FilterEvenNumbersLinkedListJava implements ITestCode {

   private List<Integer> list;
   private int elementsCount = 10;
   private List<Integer> res;

   public FilterEvenNumbersLinkedListJava(int elementsCount) {
      this.elementsCount = elementsCount;
   }

   public String getName() {
      return "Select even numbers from linked list of length " + elementsCount + " (Java)";
   }

   public void init() {
      list = new LinkedList<Integer>();
      for (int i = 0; i < elementsCount; ++i) {
         list.add(i);
      }
   }

   public void run() {
      res = new LinkedList<Integer>();
      for (Integer val : list) {
         if (val % 2 == 0) {
            res.add(val);
         }
      }
   }

   public Object getResult() {
      return res;
   }

   public void clean() {
      list = null;
      res = null;
   }

}
