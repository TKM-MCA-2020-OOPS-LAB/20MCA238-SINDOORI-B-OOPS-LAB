package myproject;

import java.util.*;
public class comparehash {
public static void main(String[] args) {
      HashSet<String> linkedset1 = new HashSet<String>();
      linkedset1.add("Red");
      linkedset1.add("Green");
      linkedset1.add("Black");
      linkedset1.add("White");
        System.out.println("\nFirst LinkedHashSet : " + linkedset1);
        HashSet<String> linkedset2 = new HashSet<String>();
        linkedset2.add("Red");
        linkedset2.add("Pink");
        linkedset2.add("Black");
        linkedset2.add("Orange");
        System.out.println("\nSecond LinkedHashSet : " +linkedset2);
        HashSet<String>result_set = new HashSet<String>();
       for (String element : linkedset1){
           System.out.println(linkedset2.contains(element) ? "Yes" : "No");
        }      
   }
}
