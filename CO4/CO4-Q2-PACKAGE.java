package myprojects.arithmetic;

interface operation {
	void getdata(int a,int b);
	void display();
}
 class adds implements operation {
	 int a1,b1,c;
	public void getdata(int a,int b) {
		a1=a;
		b1=b;
		
	}

	@Override
	public void display() {
		c=a1+b1;
		System.out.println("Sum is "+c);
	}
	
} 
 class differences extends adds {
	 int c,a1,b1;
	 public void getdata(int a,int b) {
		 super.getdata(a,b);
		 a1=a;b1=b;
	 }
	 public void dislpay() {
		 super.display();
		 c=a1-b1;
		 System.out.println("Differences is "+c);
	 }
 }
 class product extends differences {
	 int c,a1,b1;
	 public void getdata(int a,int b) {
		 super.getdata(a,b);
		 a1=a;b1=b;
	 }
	 public void dislpay() {
		 super.display();
		 c=a1*b1;
		 System.out.println("Product is "+c);
	 }
 }
public class division extends product {
	 int c,a1,b1;
	 public void getdata(int a,int b) {
		 super.getdata(a,b);
		 a1=a;b1=b;
	 }
	 public void dislpay() {
		 super.display();
		 c=a1/b1;
		 System.out.println("Quotient is "+c);
	 }

}
