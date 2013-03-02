package com.greentea.performance.test.add;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 13:11
 */
public class AddToArrayListEndJava implements ITestCode {

   private List<String> list;

   public String getName() {
      return "Add to end of array list (Java)";
   }

   public void init() {
      list = new ArrayList<String>();
   }

   public void run() {
      list.add("1");
   }

   public void clean() {
      list = null;
   }
}
