package myproject;

import java.util.Scanner;

class Student
{
String name;
int age;
int mark;
Student()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name :");
name= sc.nextLine();
System.out.println("Enter age :");
age= sc.nextInt();
System.out.println("Enter marks :");
mark= sc.nextInt();
sc.close();
}
}
class Sports extends Student
{
int score;
Sports()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter marks in sports:");
score= sc.nextInt();
sc.close();
}
}
class Result extends  Sports
{
int total;
Result()
{
total=mark+score;
}
void display()
{
System.out.println("Name is :"+name);
System.out.println("Age is :"+age);
System.out.println("Mark in academic :" +mark);
System.out.println("Mark in sports  :" +score);
System.out.println("Total mark :" +total);
System.out.println("...............................");
}
}
public class academic {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students:");
		n=sc.nextInt();
		Result t[]= new Result[n];
		for(int i=0;i<n;i++)
		{
		t[i]=new Result();
		}
		System.out.println(" DETAILS  ");
		
		for(int i=0;i<n;i++)
		{
		t[i].display();
		}
		sc.close();

	}

}
