/* 
 JAVA PROGRAM TO PRINT SOLID SQUARE

 EXAMPLE INPUT:
 5

OUTPUT:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/

import java.util.Scanner;

class SolidSquare {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		for(int i=0;i<length;i++) { 
			for(int j=0;j<length;j++) { 
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

