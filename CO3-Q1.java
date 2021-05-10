package myproject;
import java.util.Scanner;


public class areas {
	void area(float r) {
		System.out.println("Area if circle is "+(3.14*r*r));
	}
	void area (int a) {
		System.out.println("area of square is "+ a*a);
	}
	void area(int l, int b) {
		System.out.println("Area of rectanlge is "+l*b);
	}
	void area (float h, float w) {
		System.out.println("Area of triangle is "+(0.5*h*w));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		areas ar=new areas();
		System.out.println("Enter the radius of circle ");
		Float r=sc.nextFloat();
		System.out.println("Enter the side of square ");
		int a=sc.nextInt();
		System.out.println("Enter the length and breadth of rectangle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the heigth and width of triangle");
		Float h=sc.nextFloat();
		Float w=sc.nextFloat();
		ar.area(r);
		ar.area(a);
		ar.area(l,b);
		ar.area(h,w);
		
	}

}
