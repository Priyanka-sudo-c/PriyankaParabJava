package edu.com;


public class Addition {
	int a,b,s; //instance variables
	//Constructor is a special method , its name is class name itself and it does not 
	//have return type
	Addition(){ //constructor with no argument
		a=10;
		b=56;
		System.out.println("Constructor is called");
		System.out.println("Constructor is used to initialize the member data of the class");
	}
	Addition (int i, int j){
		System.out.println("Constructor with arg is called");
	a=i;
	b=j;
}
	void add() {//method
		s=a+b;
		System.out.println("s="+s);
	}

	public static void main(String[] args) {
		Addition ob = new Addition();//calls constructor
		Addition ob1 = new Addition();//calls constructor
		ob.add(); //calling methods
		ob1.add();
		Addition ob2 =new Addition(6,9);
		Addition ob3 =new Addition(6,10);
		ob2.add();
		ob3.add();
	}
}
