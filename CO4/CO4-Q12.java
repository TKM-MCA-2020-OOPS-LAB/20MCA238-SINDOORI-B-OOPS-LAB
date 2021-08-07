package myproject;
import java.util.*;
public class deletetion {
	public static void main(String[] args) {

			Stack<String> stack1 = new Stack<String>();
					Scanner sc=new Scanner(System.in);
					 System.out.println("Enter Number Of elements ");
					 int n=sc.nextInt();
					 System.out.println("Enter the elements ");
					 for(int i =0;i<n;i++)
					 {
						 String st=sc.next();
						 stack1.add(st);
						 
					 }
					System.out.println("Stack is \n " + stack1);
					 System.out.println("Enter item to be deleted ");
					 int key=sc.nextInt();
					String item = stack1.remove(key);
					System.out.println("\nRemoved element: "+ item);
					System.out.println("\nStack after deletion is " + stack1);
			 
		}

	}
