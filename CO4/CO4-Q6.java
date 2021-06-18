package myprojects;

import java.util.Scanner;

class firstthread implements Runnable{
	
	
	public void run() {
		int n=50;
		System.out.println("Fibonacci Series ");Scanner sc = new Scanner(System.in);
		int n1=0,n2=1,n3,i;
		 System.out.print(n1+" "+n2);   
		    
		 for(i=2;i<n;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 } System.out.println("\n");      
	}
	
	
	
}
 class secondthread implements Runnable{
	
	public void run() {
		
		System.out.println("Even numbers"); 
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		number = sc.nextInt();	
		System.out.print("Even Numbers Are : ");  
		for (int i=1; i<=number; i++)   
		{  
		
		if (i%2==0)   
		{  
		System.out.print(i + " ");  
		}  
		}  
		
	}
	
}
public class multi {

	public static void main(String[] args)throws InterruptedException {
		firstthread t1 = new firstthread();
		Thread a = new Thread(t1);
		secondthread t2 = new secondthread();
		Thread b = new Thread(t2);
		System.out.println("Multithreading Using Runnable Interface");
		a.start();
		a.sleep(200);
		b.start();
		b.sleep(200);
		
		// TODO Auto-generated method stub

	}

}
