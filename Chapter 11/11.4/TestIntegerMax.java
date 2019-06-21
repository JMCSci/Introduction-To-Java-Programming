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

		/* asks for user input
		 * checks if number is not equal to 0
		 * if not is not equal zero number is add to object
		 */
		do {	
			x = input.nextInt();
			if(x != 0) 
				list.add(x);

		} while(x != 0);
		System.out.println("Maximum number is: " + IntegerMax.max(list));
		input.close();
	}
}

