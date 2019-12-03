/* Chapter 18.8 
 * Program uses recursion to display an integer value reversely on the console
 */

package recursiveinteger;

import java.util.Scanner;

public class TestInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RDisplay rdisplay = new RDisplay();
		System.out.print("Enter an integer: ");
		rdisplay.reverseDisplay(input.nextInt());
		input.close();
	}

}
