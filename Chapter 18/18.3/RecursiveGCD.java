/* Chapter 18.3
 * Program computes the greatest common divisor using recursion
 */

package recursivegcd;

import java.util.Scanner;

public class RecurciveGCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = 0;
		int n = 0;
		int gcd = 0;
		
		System.out.println("Enter value for m: ");
		m = input.nextInt();
		System.out.println("Enter value for n: ");
		n = input.nextInt();
		gcd = gcd(m, n);
		System.out.println("The GCD of " + m + " and " + n + " is " + gcd);
		input.close();

	}
	
	/* METHOD: gcd
	 *  Finds the GCD of two integers 
	 */
	public static int gcd(int m, int n) {
		// BASE
		if(m % n == 0) {
			return n;
		}
		return gcd(n, m % n);
	}

}
