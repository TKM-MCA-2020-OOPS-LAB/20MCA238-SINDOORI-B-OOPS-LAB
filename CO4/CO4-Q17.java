package myproject;

import java.util.*;

public class maphash {


		public static void main(String args[])
	    {
	       
	        Map<Integer, String> mp = new HashMap<>();
	        System.out.println("Enter the limit:");
	        Scanner inp = new Scanner(System.in);
	        int n= inp.nextInt();
	        System.out.println("Enter the Roll number and Name");
	        while(n!=0) {
	        	
	        	int e= inp.nextInt();
	        	String s= inp.next();
	        	mp.put(e, s);
	        	n--;
	        }
	        
	  
	        System.out.println("Initial Map:"+mp);
	        
	   
	        mp.put( (2), "David");
	        System.out.println("Updated Map:"+mp);
	        System.out.println("Enter the Roll number to be removed:");
	        int r=inp.nextInt();
	        mp.remove(r);
	        
	        System.out.println("After Removing the entry, Final Map  is:"+mp);
	    
	    }
	}
