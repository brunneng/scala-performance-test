package com.greentea.performance.test.add;

import com.greentea.performance.test.ITestCode;

import java.util.HashSet;
import java.util.Set;

/**
 * User: goodg_000
 * Date: 17.02.13
 * Time: 13:11
 */
public class AddToHashSetJava implements ITestCode {

   private Set<String> set;

   public String getName() {
      return "Add to hash set (Java)";
   }

   public void init() {
      set = new HashSet<String>();
   }

   public void run() {
      set.add("1");
   }

   public void clean() {
      set = null;
   }
}
