/*
 * write  a program in java accept a String in upper case replace all the vowels presenter
 * sample input"TATA STEEL IS IN JAMSHEDPUR
 * SMPLE OUTPUT: T*T ST**L *S *N J*MSH*DP*R
 */
package edu.com;
public class StringReplaceVowelStar {

	public static void main(String[] args) {
		String s="TATA STEEL IS IN JAMSHEDPUR";
		String str="";
		for(int i=0;i<s.length();i++) { 
			char ch=s.charAt(i); 
			if(ch=='A'||ch=='E'||ch=='I'|| ch=='O'||ch=='U') {
				str=str+"*"; 
			}else {
				str=str+ch; 
			}
		}
		System.out.println(str);

	}
}
