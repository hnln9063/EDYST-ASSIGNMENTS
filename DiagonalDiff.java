/*
 
 DIAGONAL DIFFERENCE
 -------------------

 Given a square matrix, calculate the absolute difference between the sums of its diagonals.

 INPUT FORMAT:
 ------------
 The first line contains a single integer, n the number of rows and columns in the square matrix arr
 Each of the next n lines describes a row, arr[i] and consists of n space-seperated integers arr[i][j].

 OUTPUT FORMAT:
 -------------
 Print the absolute difference between the sum of the matrix's two diagonals as a single integer

CONSTRAINTS:
-----------
1 <= n <= pow(10,3)
1 <= arr[i][j] <= pow(10,5)

*/

import java.util.Scanner;

class DiagonalDiff {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
            }
        } 

        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    d1 += a[i][j];
                if (i == n - j - 1)
                    d2 += a[i][j];
            }
        }
        System.out.println(Math.abs(d1-d2));
    }

}

