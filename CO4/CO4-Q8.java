package myproject;
import java.util.Scanner;
class functions{
	int ar[] = new int[20];
	int i,top=-1,item,n,ch;
	Scanner sc= new Scanner(System.in);
	void push() {
		if(top>=n) {
			System.out.println("Stack is Full");
		}
		else {
			System.out.println("Enter the element to be inserted ");
			item=sc.nextInt();
			top++;
			ar[top]=item;
		}
		
	}
	void pop() {
		if(top<0) {
			System.out.println("Stack is empty");
		}
		else {
			item=ar[top];
			ar[top]='\0';
			top--;
			System.out.println("Deleted element is "+item);
		}
	}
	void traverse() {
		if(top<0) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is");
			for(i=top;i>=0;i--) {
				System.out.println(ar[i]+"\n");
			}
		}
	}
	void stackoperations() {
			System.out.println("enter the limit");
			n=sc.nextInt();
			do {
				System.out.println("Stack Operations are:\n1 : PUSH\n2 : POP\n3 : Traverse\n4 : Exit\nEnter your choice");
				ch=sc.nextInt();
				switch(ch) {
				case 1 : push();break;
				case 2 : pop();break;
				case 3 : traverse();break;
				case 4 : System.exit(0);
				default : System.out.println("Wrong entry");
				}
			}while(ch!=4);
		
	}
	
}

public class stacks {

	public static void main(String[] args) {
		functions f1=new functions();
		f1.stackoperations();
		
	}

}
