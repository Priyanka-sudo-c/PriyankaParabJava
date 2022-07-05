package edu.com;

//function overloading by changing the data type

class Overload{
	void display() {
		System.out.println("No arg function");
	}
	void display(int i) {
		System.out.println("one arg function of type int");
	}
	void display(float i) {
		System.out.println("one arg function of type float");
	}
	void display(double i) {
		System.out.println("one arg function of type double");
	}
	void display(char i) {
		System.out.println("one arg function of type char");
	}
	void display(int i, int j) {
		System.out.println("two arg of type int");
	}
	void display(int i, float j) {
		System.out.println("two arg one is int and another is float");
	}
	void display(float j, int i) {
		System.out.println("By interchanging arguments first is float and second is int");
	}
}
public class FunctionOverloading {
	public static void main(String[] args) {
		Overload ob=new Overload();
		ob.display();
		ob.display(56);
		ob.display(5.6f);
		ob.display(7.9);
		ob.display('A');
ob.display(5,8);
      ob.display(4, 6.7f);
      ob.display(8.9f, 7);
	}
}
