package myproject;

import java.util.*;
class Student
{
String name;
LinkedList<String> l_list = new LinkedList<String>();
public void Student()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name :");
name= sc.nextLine();
l_list.add(name);
sc.close();
}
void display()
{
	System.out.println("The Original linked list: " + l_list);
	l_list.clear();
	System.out.println("The New linked list After deletion: " + l_list);
}
}
public class frames1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Student s=new Student();
   System.out.println("enter the limit");
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
	  s.Student();
   }
   s.display();
}
}
