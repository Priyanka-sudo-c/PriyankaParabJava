package edu.com;

public class StringBuilderExample {

	public static void main(String[] args) {
		String s="Edubridge";
		
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
        System.out.println(sb.append("India"));
	}

}
