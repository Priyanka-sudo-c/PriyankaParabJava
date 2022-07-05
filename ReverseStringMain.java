package com.edu;

import java.util.Scanner;

public class ReverseStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the string");
     s=sc.nextLine();
     for(int i=s.length()-1;i>=0;i--) {
    	 System.out.print(s.charAt(i));
     }
	}

}
