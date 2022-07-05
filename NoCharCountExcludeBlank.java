package com.edu;


public class NoCharCountExcludeBlank {

	public static void main(String[] args) {
		String s="Edubridge Learning pvt ltd";
		int ch1=0;
		//int l=s.length();
		//count no.of blank space
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				ch1++;
			}
		}
		//System.out.println("No of characters excluding blank="+(l-bl));
		System.out.println("No of characters excluding blank="+ch1);
	}

}
