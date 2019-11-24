/* Chapter 18.1
 * Program finds the factorial for a large number (ex. 100!)
 * User is prompted to an enter an integer and display its factorial 
 * Factorial method uses recursion
 */

package factorial;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger result = null;
		String myNumber = null;	
		
		System.out.print("Enter a number: ");
		// Saves number to a string
		myNumber = input.next();
		
		// Create BigInteger object
		BigInteger num = new BigInteger(myNumber);
		
		result = factorial(num);
		System.out.println("The factorial of " + myNumber + " is: " + result);
		input.close();
	}
	
	/* METHOD: factorial 
	 * Recursive method that finds the factorial of number
	 * Returns BigInteger object 
	 */
	public static BigInteger factorial(BigInteger myNumber) {
		BigInteger base = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		if(myNumber.equals(base)) {
			return one;
		}
		return myNumber.multiply(factorial(myNumber.subtract(one)));
	}

}
