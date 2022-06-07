/* 
 RIGHT ARROW PATTERN
 -------------------

 Write a program to print the Right Arrow Pattern.

 INPUT PATTERN:
 --------------
 Take an input integer which is from stdin.

 OUTPUT FORMAT:
 --------------
 print Right Arrow Pattern

 Example Input:
 5

OUTPUT:
-------
*****
  ****
    ***
      **
        *
      **
    ***
  ****
*****

*/

import java.util.Scanner;

class RightArrowPattern {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=1;j<=(2*i-2);j++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
                                System.out.print("*");
			System.out.println();
		}

		for(int i=1;i<=n;i++) {
                        for(int j=1;j<=(2*n-2*i);j++)
                                System.out.print(" ");
                        for(int j=1;j<=i;j++)
                                System.out.print("*");
                        System.out.println();
                }
		
	
	}

}
