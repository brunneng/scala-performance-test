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

   private Set<Object> set;

   public String getName() {
      return "Add new Object() to hash set (Java)";
   }

   public void init() {
      set = new HashSet<Object>();
   }

   public void run() {
      set.add(new Object());
   }

   public void clean() {
      set = null;
   }
}
