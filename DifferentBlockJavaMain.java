package edu.java.com;

public class DifferentBlockJavaMain {
	
	static {
		System.out.println("Stati block will execute before the main");
	}
	{
		System.out.println("Ananomous block this will execute before constructor");
	}
	DifferentBlockJavaMain(){
		System.out.println("This is constructor block");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		DifferentBlockJavaMain ob=new DifferentBlockJavaMain();

	}
}

