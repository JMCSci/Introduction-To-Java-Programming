/* Chapter 18.9
 * Program displays string in reverse recursively
 */

package reversestring;

import java.util.Scanner;

public class ReverseString {
	protected static char tempChar = ' ';
	protected static String value = "";
	protected static String newValue = "";
	
	public static void main(String[] args) {
		String value = null;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		value = input.next();
		reverseDisplay(value);
		input.close();
	}
	
	public static void reverseDisplay(String value) {
		// BASE -- stopping condition
		if(value.length() == 0) {
			value = newValue + value;
			System.out.println(value);
		} else {
			tempChar = value.charAt(value.length() - 1);
			newValue = newValue + Character.toString(tempChar);
			reverseDisplay(value.substring(0, value.length() - 1));
		}

	}
}

