package myproject;
import java.util.Scanner;

interface calculate {
	void getdata();
	void area();
	void perimeter();
}

class circle implements calculate {
	int r;
	double ar,peri;
	Scanner sc=new Scanner(System.in);
	public void getdata() {
		System.out.println("enter the radius");
		r=sc.nextInt();
	}
	public void area() {
		ar=3.14*r*r;
		System.out.println("Area of circle is "+ar);
	}
	public void perimeter() {
		peri=2*3.14*r;
		System.out.println("Perimeter of circle is "+peri);
	}
}

class rectangle extends circle {
	int l,b,ar,peri;
	Scanner sc=new Scanner(System.in);
	public void getdata() {
		super.getdata();
		System.out.println("enter the length and breadth");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	public void area() {
		ar=l*b;
		System.out.println("Area of rectangle is "+ar);
	}
	public void perimeter() {
		peri=2*l*b;
		System.out.println("Perimeter of rectangle is "+peri);
	}
}

public class interface1 {

	public static void main(String[] args) {
		rectangle r=new rectangle();
		r.getdata();
		r.area();
		r.perimeter();

	}

}
