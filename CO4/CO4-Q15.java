package myproject;

import java.util.LinkedHashSet;

public class linkedhash
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		linkedset.add("Akhil");
		linkedset.add("Manu");
		linkedset.add("Sindhuri");
		linkedset.add("Vishnu");// This will not add new element as A already exists
		linkedset.add("Anoop");
		linkedset.add("Elzha");

		System.out.println("Size of LinkedHashSet : " +linkedset.size());
		System.out.println("\nOriginal LinkedHashSet : " + linkedset);
		System.out.println("\nRemoving Vishnu from LinkedHashSet : " +linkedset.remove("Vishnu"));
		System.out.println("\nTrying to Remove something which is not "+"present : " + linkedset.remove("Anju"));
		System.out.println("\nChecking if Akhil is present : " +linkedset.contains("Akhil"));
		System.out.println("\nUpdated LinkedHashSet : " + linkedset);
	}
}
