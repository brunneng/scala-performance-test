package com.greentea.performance.test.group;

import com.greentea.performance.test.ITestCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: goodg_000
 * Date: 19.02.13
 * Time: 0:41
 */
public class GroupArrayListJava implements ITestCode {

   private List<String> list;
   private int elementsCount = 10;

   public GroupArrayListJava(int elementsCount) {
      this.elementsCount = elementsCount;
   }

   public String getName() {
      return "Groups of " + elementsCount + " elements of array list by key func (Java)";
   }

   public void init() {
      list = new ArrayList<String>();
      for (int i = 0; i < elementsCount; ++i) {
         list.add("" + Math.pow(elementsCount - i, 2));
      }
   }

   public void run() {
      Map<Integer, List<String>> group = new HashMap<Integer, List<String>>();
      for (String val : list) {
         Integer key = val.length();
         List<String> values = group.get(key);
         if (values == null) {
            values = new ArrayList<String>();
            group.put(key, values);
         }

         values.add(val);
      }
   }

   public void clean() {
      list = null;
   }
}
