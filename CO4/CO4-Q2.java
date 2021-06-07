package myprojects;
import myprojects.arithmetic.*;
import java.util.Scanner;

public class sum {
	static int s1, s2;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter 2 number");
		s1=sc.nextInt();
		s2=sc.nextInt();
		division d=new division();
		d.getdata(s1,s2);
		d.display();
	}

}
