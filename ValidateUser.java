package com.edu;

import java.util.Scanner;

public class ValidateUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String un,pass;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter user name");
      un =sc.next();
      System.out.println("Enter password");
      pass =sc.next();
      if(un.equalsIgnoreCase("admin") && pass.equals("admin123")) {
    	  System.out.println("User valid");
      }else {
    	  System.out.println("Not valid");
 
      }
	}

}
