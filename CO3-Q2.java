package myproject;
import java.util.Scanner;

class employeee {

	int empid;
	String name;
	int salary;
	String address;
	public employeee(int e, String n, int s, String a) {
		empid=e;
		name=n;
		salary=s;
		address=a;
	}
}
public class teacher extends employeee {
	int department;
	String subject;
	public teacher(int e,String n,int s,String a,int d,String sub) {
		super(e,n,s,a);
		department=d;
		subject=sub;
	}
	void display() {
		System.out.println("id is "+empid);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		System.out.println("address is "+address);
		System.out.println("department is "+department);
		System.out.println("subject is "+subject);
		
	}
	public static void main(String[] args) {
		int e1,s1,d1;
		String n1,a1,sub1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int n=sc.nextInt();
		teacher ar[]=new teacher[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter id");
			e1=sc.nextInt();
			System.out.println("enter name");
			n1=sc.nextLine();
			System.out.println("enter salary");
			s1=sc.nextInt();
			System.out.println("enter address");
			a1=sc.nextLine();
			System.out.println("enter department");
			d1=sc.nextInt();
			System.out.println("enter subject");
			sub1=sc.nextLine();
			ar[i]=new teacher (e1,n1,s1,a1,d1,sub1);
			System.out.println("Details are");
			for(int j=0;j<n;j++) {
				ar[j].display();
			}
			
		}
	}
		
}
