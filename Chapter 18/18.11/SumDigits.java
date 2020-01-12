/* Chapter 18.11
 * Program computes the sum of the digits in an integer
 * For example: sumDigits(234) returns 2 + 3 + 4 = 9
 */

package sumdigits;

import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long sum = 0;
		int n = 0;
		System.out.print("Enter the digits to be summed: ");
		n = input.nextInt();
		sum = sumDigits(n);
		System.out.println("Digits: " + n);
		System.out.println("Sum: " + sum);
		input.close();
	}
	
	// sumDigits: Returns sum of digits in an integer
	public static int sumDigits(long n) {
		long newValue = 0;
		String longString = "";
		String numString = "";
		int num = 0;
		
		// Convert long into a String
		longString = Long.toString(n);
		// BASE CASE -- ends recursion and sums value when length of string is equal to 1
		if(longString.length() == 1) {
			numString = Character.toString(longString.charAt(0));
			num = Integer.parseInt(numString);
			return num;
		}
		
		// Convert first number to a String
		numString = Character.toString(longString.charAt(0));
		// Convert from String to an integer
		num = Integer.parseInt(numString);
		
		// Shorten method parameter by n - 1 and convert back to long
		newValue = Long.parseLong(longString.substring(1, longString.length())); 
		
		return sumDigits(newValue) + num;
	}

}
