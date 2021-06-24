package myproject;

import java.util.*;
public class array1 { 
	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Varun");
		obj.add("Akhil");
		obj.add("Namitha");
		obj.add("Nikhil");
		obj.add("Sudhi");
		obj.add(2,"Rakhi");
		System.out.println("\n Array is :");
		for(String str:obj)
		System.out.println(str);
		obj.remove("rakhi");
		obj.remove(2);
		System.out.println("\n Array after remove operation");
		for(String str:obj)
		System.out.println(str);
		Collections.sort(obj);
		System.out.println(" \n Array  after sorting");
		for(String str : obj)
		System.out.println(str);
		System.out.println("\n Object at index 1:"+obj.get(1));
		System.out.println("\n Size of the arraylist :"+obj.size());
		obj.clear();
		System.out.println("\n Array after clear method:"+obj);
	
	}

}