//Function Overriding
package edu.java.com;
class Parent{
	void display() {
		System.out.println("Parent display");
	}
}
class Child extends Parent {
	void m1() {
		System.out.println("child function m1");
	}
public	void display() {//function overriding
		super.display();
     System.out.println("Child display");  
	}
}

public class FunctionOverridingMain {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        child ob=new Child();
          ob.m1();
          ob.display();
	}

}
