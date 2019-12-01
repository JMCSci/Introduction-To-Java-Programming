/* Chapter 18.6
 * Program recursively computes the following series: 1/2 + 2/3 + ... + n/n + 1
 */

package sumseries;
import java.text.DecimalFormat;

public class SumSeries {
	public static void main(String[] args) {
		DecimalFormat decimal = new DecimalFormat("##.##");
		double n = 10;
		double result = 0;
		result = sumRecursive(n + 1, result);
		System.out.printf("The sum of the series m(" + decimal.format(n) + ") is: %.5f", result);
	}
	
	/* METHOD: sumRecursive
	 * Returns the sum of the series
	 */
	public static double sumRecursive(double n, double result) {
		// BASE -- stopping condition
		if(n == 0) {
			return result;
		} else {
			// RECURSION -- calls method until base condition is met
			result = result + (n / (n + 1));
			return sumRecursive(n - 1, result);
		}
		
	}

}
