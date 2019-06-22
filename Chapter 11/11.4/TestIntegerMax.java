/* Chapter 11.4
 * 
 */

package integerMax;

import java.util.ArrayList;
import java.util.Scanner;

public class TestIntegerMax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter a sequence of numbers. The last number should be 0: ");	
		int x;

		/* asks for user input first
		 * checks while condition if true does it again
		 */
		do {	
			x = input.nextInt();
				list.add(x);

		} while(x != 0);
		System.out.println("Maximum number is: " + IntegerMax.max(list));
		input.close();
	}
}

