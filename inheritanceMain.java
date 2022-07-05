package edu.java.com;
class Parent {
	int pid;
	String pname;
	
}
//child class can access ,default, public and protected information of the parent class
//constructor cannot be inherited and private data cannot be inherited in child class
class Child extends Parent{
	int cid;
	String cname;
	public Child() {
		pid=1;
		pname="kiran";
		cid=4;
		cname="Manoj";
	}
	void display() {
		System.out.println("Parent name"+pname);
		System.out.println("Child id "+cid);
		System.out.println("Child name"+cname);
	}
}
public class inheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ob=new Child();
ob.display();
	}
	}


