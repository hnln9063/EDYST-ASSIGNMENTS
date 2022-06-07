/*
 Write a program to take String if the length of String is odd print X pattern otherwise print INVALID

INPUT FORMAT:
Take a String as input from stdin.

OUTPUT FORMAT:
print the desired pattern or INVALID

Example Input:
edyst

output:
e   t
 d s
  y
 d s
e   t

 */

import java.util.Scanner;
class XPattern {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		if(len%2 != 0) {
			for(int i=0;i<len;i++) {
				int j=len-1-i;
				for(int k=0;k<len;k++) {
					if(k == i||k==j)
						System.out.print(s.charAt(k));
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		} else {
			System.out.println("INVALID");
		}
	
	}

}
