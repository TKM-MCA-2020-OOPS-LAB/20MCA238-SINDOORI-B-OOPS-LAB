package myprojects;
import java.util.Scanner;

class multiplication extends Thread{
	
	public void run() {
		System.out.println("Multiplication Table of 5");
		int num =5;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d \n" , num, i , num *i);
		}
	}
	
}
class prime extends Thread{
	
	public void run() {
		System.out.println("Prime Number Series");
		int n;
	      int status = 1;
	      int num = 3;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the limit :");
	       n = sc.nextInt();
	      if (n>= 1)
	      {
	         System.out.println("First "+n+" prime numbers are:");
	      
	         System.out.println(2);
	      }

	      for ( int i = 2 ; i <=n ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         status = 1;
	         num++;
		}sc.close();
	}
	
}


public class main1 {

	public static void main(String[] args)throws InterruptedException {
		
		multiplication m = new multiplication();
		m.start();
		m.sleep(200);
		prime p = new prime();
		p.start();
		p.sleep(200);
	
	}
}
