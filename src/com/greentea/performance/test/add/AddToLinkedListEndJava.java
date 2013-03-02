package com.greentea.performance.test.add;

import com.greentea.performance.test.ITestCode;

import java.util.LinkedList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 14:19
 */
public class AddToLinkedListEndJava implements ITestCode {
   private List<String> list;

   public String getName() {
      return "Add to end of linked list (Java)";
   }

   public void init() {
      list = new LinkedList<String>();
   }

   public void run() {
      list.add("1");
   }

   public void clean() {
      list = null;
   }
}
