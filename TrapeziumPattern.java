/* 
 TRAPEZIUM PATTERN

 Write a program to take input as integer and print the trapezium pattern.

 INPUT FORMAT:
 Take integer input from stdin.

 OUTPUT FORMAT:
 Print the desired pattern.

 Example input:
 4

OUTPUT:
 1*2*4*17*18*19*20
   5*6*7*14*15*16
     8*9*12*13
       10*11

 */

import java.util.Scanner;

class TrapeziumPattern {
	public static void main(String args[]) {
		int count1 = 0;
		int count2 = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--) {
			for(int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(++count1+"*");
			}
			for(int l = 1; l <= i; l++) {
				System.out.print(++count2+i*i);
				if(l != i)
					System.out.print("*");
			}
			System.out.println();
		
		}
	
	}

}
