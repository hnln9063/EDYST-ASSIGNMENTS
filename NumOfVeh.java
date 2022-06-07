/*
 AUCTION NUMBER

Codu is fond of vehicle numbers. Code wants to compute the numbers of vehicles that can be registered in his state. A vehicle normally has a registration numbers like (ST 01 AB 1234). Each registration number has 4 parts, seperated by spaces.

The first part has two letters common for all cars in the state. The next 2 digit numbers is the number of the district where the car is registered within the state, it is always 2 digits, and may have a leading zero. After that, the next part consists of 2 letters denoting the series and the last part is 4 digit number (it will always be 4 digits, even if it has leading zeroes).

The entire registration number is unique to each vehicle. You have been given the number of districts in each state and range of letters and a set of digits that can be used for forming a vehicle registration number. You need to find the maximum number of vehicles that can be registered with non-special numbers, subject to the rules.

The state has identified some numbers as special, and will not be issued normally, but will only be availabe by auction. In these plates, the last part (consists of four digits) has three or more repetitions of one digit such as 0001, 0000, 0100, 2212 ... so on.

The output should consists of the maximum number of vehicles that can be registered in the state with non-special numbers.

INPUT FORMAT:

First line contains Number of districts
Second lne contains Range of alphabets, for example if the range s B F, any of the letters B, C , D, E, F may be used in any combination for the two letter series which comes before the four digit number.
Third line contains Range of digits, for example if the range is 3 6, any of the letters 3, 4, 5, 6 may be used in any combination for the four digit number which comes after the two letter series.

OUTPUT FORMAT:

Output a single number, maximum number of vehicles that can be registered in the state with non special numbers.

CONSTRAINTS:
1 <= Number of districts < 100
A <= Range of alphabets <= Z
0 <= Range of digits <= 9
All ranges are valid

Example Input:
2
B B
1 2

Output:
12

 */

import java.util.*;
class NumOfVeh {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char a1 = sc.next().charAt(0);
		char a2 = sc.next().charAt(0);
		int first = sc.nextInt();
		int last = sc.nextInt();
		// If characters, a1 = B and a2 = B then difference between their ascii value is 0. 
		// So we take only one character B. 
		// So we add 1.
		int chardiff = (a2-a1+1);
		int diff = last - first + 1;
		int sqOfCharDiff = chardiff*chardiff;
		
		int result = ((diff*diff*diff*diff)-(diff + (4*diff*(diff - 1))))*n*sqOfCharDiff;
		System.out.println(result);

	}
}
