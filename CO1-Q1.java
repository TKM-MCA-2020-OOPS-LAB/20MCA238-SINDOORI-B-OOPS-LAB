package myproject;

public class product {
	int pcode;
	String pname;
	int price;
	public static void main(String[] args) {
		product ob1= new product();
		product ob2= new product();
		product ob3= new product();
		ob1.pcode=56894;
		ob1.pname="redmi";
		ob1.price=24000;
		ob2.pcode=78994;
		ob2.pname="realmi";
		ob2.price=24500;
		ob3.pcode=45694;
		ob3.pname="vivo";
		ob3.price=22000;
		if(ob1.price<=ob2.price && ob1.price<=onb3.price)
			System.out.println(ob1.pname+"is cheaper");
		else if(ob2.price<=ob1.price  && ob2.price<= ob3.price)
			System.out.println(ob2.pname+ "is cheaper");
		else
			System.out.println(ob3.pname+" is cheaper");
	}

}
