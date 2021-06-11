package myprojects;
import java.util.Scanner;

class NegativeExpception extends Exception{

	private static final long serialVersionUID = 1L;

	public NegativeExpception(String s) {
             super(s);
		
	}
}

public class numbersexpectiopn {

		public static void main(String[] args) {
			int ar[],i,sum=0,n;
			float avg;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the total number");
			n=sc.nextInt();
			ar = new int[n];
			System.out.println("Enter the numbers:");
			for(i=0;i<n;i++)
		    {
		        ar[i] = sc.nextInt();
		    }
			
		   try {
			    
			    for(i=0;i<n;i++) 
			    {
				    	if(ar[i]<0)
				    	{
				    		throw new NegativeExpception("Numbers must be positive");
				    	}
				    	else {
				    	 sum = sum + ar[i];
					      
				    	}
			    
			    }
			    avg=sum/n;
			    System.out.println("Average :"+avg);
			    }
		   catch(NegativeExpception e) {
		   		System.out.println("Exception Occurred..... "+e);
		   	}
		   	    
			   
		   }

}











	
	