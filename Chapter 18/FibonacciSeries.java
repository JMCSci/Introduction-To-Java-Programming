/* Chapter 18.7
 * Program finds the number of times the fib method is called
 */

package fibonacciseries;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FibonacciSeries {
	protected static double sum = 0;
	
	public static void main(String[] args) {
		DecimalFormat decimal = new DecimalFormat("##.##");
		Scanner input = new Scanner(System.in);	
		int n = 0;
		int result = 0;
		System.out.print("Enter an index for a Fibonacci number: ");
		n = input.nextInt();
		result = fib(n);
		System.out.println("At index " + decimal.format(n) + ", fib method is called "
							+ decimal.format(sum) + " times.");
		System.out.println("The sum of the sequence is " + result);
		input.close();
	}
	
	/* METHOD: fib
	 * Calculates sum of Fibonacci sequence and determines how many times method is called
	 */
	public static int fib(int n) {
		if(n == 0) {
			sum = sum + 1;
			return 0;
		} else if(n == 1) {
			sum = sum + 1;
			return 1; 
		} else {
			sum = sum + 1;
			return fib(n - 1) + fib(n - 2);
		}
	}

}
