package com.edu;
public class StringDemoMain {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Hello";
		
		String s2=new String("Hello");
		String s3=new String("Hello");
		
		if(s==s1) {//compare the address
			System.out.println("s and s1 has same address");
		}else {
			System.out.println("s and s1 dont has same address");
		}
		
		if(s1.equals(s2)) { //compare the contents
			System.out.println("s1 and s2 have same info");
		}else {
			System.out.println("s1 and s2 have different info");
		}
		
		if(s2==s3) {//compare the address
			System.out.println("s and s1 has same address");
		}else {
			System.out.println("s and s1 dont has same address");
		}
		
		if(s2.equals(s3)) { //compare the contents
			System.out.println("s1 and s2 have same info");
		}else {
			System.out.println("s1 and s2 have different info");
		}

	}

}
