package myproject;
import java.util.Scanner;

class person {
	String name,gender,address;
	int age;
	Scanner sc=new Scanner(System.in);
	
	public person() {
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Gender: ");
		gender=sc.next();
		System.out.println("Enter Address: ");
		address=sc.next();
		System.out.println("Enter Age: ");
		age=sc.nextInt();
	}
}

class employee extends person {
	int empid,salary;;
	String cname,qual;
	Scanner sc=new Scanner(System.in);

	public employee() 
	{
		System.out.println("Enter Employee id: ");
		empid=sc.nextInt();
		System.out.println("Enter Company name: ");
		cname=sc.next();
		System.out.println("Enter Salary: ");
		salary=sc.nextInt();
		System.out.println("Enter Qualification: ");
		qual=sc.next();
	}
}

class teacher extends employee
	{
		String department,subject;
		Scanner sc=new Scanner(System.in);
		
		public emp()
		{
			System.out.println("Enter department: ");
			department=sc.next();
			System.out.println("Enter Subject: ");
			subject=sc.next();
		}
		public void display()
		{
			System.out.println("Details");
			System.out.println("Name : "+name);
			System.out.println("Gender : "+gender);
			System.out.println("Address: "+address);
			System.out.println("Age: "+age);
			System.out.println("Employee id: "+empid);
			System.out.println("Company Name: "+cname);
			System.out.println("Qualification: "+qual);
			System.out.println("Salary: "+salary);
			System.out.println("Department: "+department);
			System.out.println("Subject: "+subject);
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the limit : ");
		int n=sc.nextInt();
		teacher e[]=new teacher[n];
		for(i=0;i<n;i++) 
		{
			e[i]=new teacher();	
	   }
		
		for(i=0;i<n;i++) 
		{
			e[i].display();
		}
		
	}

}
