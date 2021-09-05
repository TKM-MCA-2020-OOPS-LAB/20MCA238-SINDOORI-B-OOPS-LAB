package myproject;
import java.util.*;
import java.util.stream.*;
public class treetomap {
   public static void main(String args[]) {
      Map<String, String> map = new HashMap<>();
      map.put("1", "Anoop");
      map.put("2", "Arjun");
      map.put("3", "Bincy");
      map.put("4", "Elzha");
      map.put("5", "Jishnu");
      map.put("6", "Rahul");
      map.put("7", "Riya");
      map.put("8", "Sindhuri");
      map.put("9", "Sree");
      System.out.println("HashMap = " + map);
      Map<String, String> treeMap = new TreeMap<>();
      treeMap.putAll(map);
      System.out.println("TreeMap (HashMap to TreeMap) " + treeMap);
   }
}