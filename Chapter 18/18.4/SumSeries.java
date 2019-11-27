/* Chapter 18.4 
 * Program computes a series of ith numbers using recursion
 * Series: m(i) = 1 + 1/2 + 1/3 + ... + 1/i;
 */

package sumseries;
import java.util.Scanner;

public class SumSeries {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double i = 0;
		double result = 0;
		double count = 1;
		
		System.out.println("Enter value the value of i: ");
		i = input.nextInt();
		result = sumRecursive(i ,count ,result);
		System.out.printf("The sum of the series is: %.3f" , result);
		input.close();
		
	}
	
	/* METHOD: sumRecursive
	 * Sums series using recursion
	 */
	public static double sumRecursive(double i, double count, double result) {
		// BASE CASE
		if(count == i) {
			result = (1/count) + result;
			return result;
		}
		result = (1/count) + result;
		count++;	
		return sumRecursive(i, count, result);
	}
	
	/* METHOD: sumIterate
	 * Sums series using iteration
	 */
	public static double sumIterate(double i, double result) {
		for(double j = 1; j <= i; j++) {
			result = (1/j) + result;
		}
		return result;
	}

}
