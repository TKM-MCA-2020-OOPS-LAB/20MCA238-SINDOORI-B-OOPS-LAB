package myprojects;


public class hello extends Thread{
	public void run() {
		System.out.println("Welcome to JAVA\nThe Thread is running");
	}

	public static void main(String[] args) {
		hello h1=new hello();
		h1.run();

	}

}
