/* Chapter 18.2
 * Program finds Fibonacci numbers through iterations
 * Fibonacci sequence - each number is the sum of the two preceding ones, starting from 0 and 1
 * Inner class not necessary (can use a method) but just wanted to try something new
 */

package fibonaccinumbers;
import java.util.Scanner;

public class FibonacciNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		
		// Inner class: Iterate
		class Iterate {
			private long f0 = 0;
			private long f1 = 1;
			private long currentFib;
			
			/* METHOD: fib
			 * Iterates though loop; uses n as an index
			 * Return Fibonacci number
			 */
			public long fib(int n) {
				for(int i = 1; i <= n; i++) {
					currentFib = f0 + f1;
					f0 = f1;
					f1 = currentFib;
				}
				return f0;
			}
		}
		
		// Create Iterate object
		Iterate iterate = new Iterate();
		
		System.out.println("Enter an index for a Fibonacci number: ");
		n = input.nextInt();
		// Calls class method and displays result
		System.out.println("The Fibonacci number at index " + n + " is " + iterate.fib(n));
		input.close();
	}
	
	/* METHOD: fib
	 * Uses recursion to find Fibonacci number
	 */
	public static long fib(long index) {
		if(index == 0) {
			return 0;
		}
		else if(index == 1) {
			return 1;
		}
		else {
			return fib(index - 1) + fib(index - 2);
		}
	}

}
