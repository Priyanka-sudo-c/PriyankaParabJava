/*
 * write a program in java to enter  a sentence. Frame a word by joining all the first
 * characters of each word of the sentence .Displaying the word
 * sample input :Vital information resource Under Seize
 * sample output:VIRUS
 */
package edu.com;

public class SpringPgms {

	public static void main(String[] args, int i) {
		// TODO Auto-generated method stub
String s="Vital Information Resource under Seize";
 String s1 =" ";
 s1=s1+s.charAt(0);//s1=""+V// s1=V
 
    for(int i1=0;i1<s.length(); i1++) {
       char ch=s.charAt(i1);
       if(ch==' ') {
	     s1=s1+s.charAt(i1+1);
       }
  }
 System.out.println(s1);
	}
}
