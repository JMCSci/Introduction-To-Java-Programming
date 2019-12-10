/* Chapter 18.10
 * Program finds the number of occurrences of a character in a string recursively
 */

package countchar;

import java.util.Scanner;

public class CountChar {
	protected static String str = "";
	protected static String temp = "";
	protected static char a = ' ';
	protected static int num = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = input.next();
		System.out.print("Enter a letter to find: ");
		temp = input.next();
		a = temp.charAt(0);
		num = count(str, a);
		if(num == 0) {
			System.out.println("\nThe character '" + a + "' was not found.");
		} else if(num > 1) {
			System.out.println("\nThe character '" + a + " was found " + num + " times.");
		} else {
			System.out.println("\nThe character '" + a + "' was found " + num + " time.");
		}
		input.close();
	}
	
	/* METHOD: count
	 * Uses recursion to find number of occurrences of a character in a string
	 * Nested conditional 
	 */
	public static int count(String str, char a) {
		// BASE -- stopping condition
		if(str.length() == 0) {
			return num;
		// RECURSION
		} else {
			if(str.charAt(str.length() - 1) == a) {
				num++;
			} 
			count(str.substring(0, str.length() - 1), a);
		}
		return num;
	}

}
