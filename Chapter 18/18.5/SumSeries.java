/* Chapter 18.5
 * Program computes a series of numbers using recursion
 * Series: m(n) = 1/2 + 2/3 + ... + 1/2i + 1;
 */

package sumseries;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SumSeries {
	public static void main(String[] args) {
		DecimalFormat decimal = new DecimalFormat("##.##");
		Scanner input = new Scanner(System.in);
		double n = 10;
		double result = 0;
		result = sumRecursion(n + 1, result);
		System.out.printf("The sum of the series for m(" + decimal.format(n) + ") is %.5f" , result);
		input.close();
	}
	
	/* METHOD: sumRecursion
	 * Returns the sum of a series
	 */
	public static double sumRecursion(double n, double result) {
		// BASE CASE -- stopping condition
		if(n == 0) {
			return n / ((2 * n) + 1);
		} else {
			// RECURSION
			result = n / ((2 * n) + 1);
			return result + sumRecursion(n - 1, result);	
		}
		
	}

}
