package com.edu;
;

public class MainAppString {

	public static void main(String[] args){
		String s="Hello world";
		int vc=0;
		int l=s.length();
		System.out.println("Number of Chars="+l);
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i);
			if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
			vc++;
		}
	}
		System.out.println("Number of vowels="+vc);
}
}
