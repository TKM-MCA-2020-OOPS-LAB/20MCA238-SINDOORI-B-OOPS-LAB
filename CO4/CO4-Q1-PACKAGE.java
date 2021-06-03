package myprojects.graphics;

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
		System.out.println("enter the length and breadth of rectangle");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	public void area() {
		super.area();
		ar=l*b;
		System.out.println("Area of rectangle is "+ar);
	}
	public void perimeter() {
		super.perimeter();
		peri=2*l*b;
		System.out.println("Perimeter of rectangle is "+peri);
	}
}
class triangle extends rectangle {
	int a,b,c,h,ar,peri;
	Scanner sc=new Scanner(System.in);
	public void getdata() {
		super.getdata();
		System.out.println("enter the three sides and height of triangle");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		b=sc.nextInt();
	}
	public void area() {
		super.area();
		ar=(b*h)/2;
		System.out.println("Area of triangle is "+ar);
	}
	public void perimeter() {
		super.perimeter();
		peri=a+b+c;
		System.out.println("Perimeter of triangle is "+peri);
	}
}

public class square extends triangle {
	int s,ar,peri;
	Scanner sc=new Scanner(System.in);
	public void getdata() {
		super.getdata();
		System.out.println("enter the side of square");
		s=sc.nextInt();
	}
	public void area() {
		super.area();
		ar=s*s;
		System.out.println("Area of square is "+ar);
	}
	public void perimeter() {
		super.perimeter();
		peri=4*s;
		System.out.println("Perimeter of square is "+peri);
	}
}
