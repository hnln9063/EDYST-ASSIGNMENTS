/*
 
 ODD LENGTH PATTERN
 ------------------

 Take a string, your task is to print the pattern as shown in sample output. It prints it from the middle of the word such that it follows the following pattern as in sample output.

 INPUT FORMAT:
 ------------
 Take an String from stdin.

 OUTPUT FORMAT:
 --------------
 If the String length is odd, print the pattern as in sample output, else print NO PATTERN

 Example Input:
 --------------
 abada

OUTPUT:
-------
a
ad
ada
adaa
adaab
 
 */

import java.util.*;

public class OddLengthPattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if(s.length()%2 == 0) {
			System.out.println("NO PATTERN");
			return;
		}
		String s1 = s.substring(s.length()/2,s.length());
		s1 = s1 + s.substring(0,s.length()/2);

		for(int i=0;i<s.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(s1.charAt(j));
			}
			System.out.println();
		}
	
	}
}
