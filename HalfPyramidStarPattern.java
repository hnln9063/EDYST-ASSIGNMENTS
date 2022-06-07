/*
 HALF PYRAMID STAR PATTERN
 -------------------------

 For any given number n, print half pyramid star pattern.

 INPUT FORMAT:
 -------------

 Take an integer input from stdin

OUTPUT:
------
Print the half pyramid star pattern

Example Input:
--------------
6
OUTPUT Format:
--------------
*
* *
* * *
* * * *
* * * * *
* * * * * *

*/

import java.util.*;

class HalfPyramidStarPattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}
