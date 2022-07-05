package edu.com;
class AddOverLoad{
	void add(int i, int j) {
		System.out.println("Integer "+i+j);
	}
	void add(float i, float j) {
		System.out.println("Float "+(i+j));
	}
	void add(double i, double j) {
		System.out.println("Double "+(i+j));
	}
	void add(short i, short j) {
		System.out.println("Short "+(i+j));
		
	}
	void add(byte i, byte j) {
		System.out.println("Byte "+(i+j));
	}
	
}

public class AddOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddOverLoad obj=new AddOverLoad();
		obj.add(5,5);
		obj.add(5.5f, 6.3f);
		obj.add(5.7,7.2);
		obj.add((short)5,(short) 3);
		obj.add((byte)8,(byte) 6);
	}
}