/* Chapter 18.14
 * Program returns the number of uppercase letters in a string
 * User is prompted to enter a string and displays the number of uppercase letters in string
 */

package uppercaseString;

import java.util.Scanner;

public class UppercaseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String myString = new String();
		int num = 0;
		int count = 0;
		System.out.print("Enter a string: ");
		myString = input.nextLine();
		count = myString.length() - 1;
		num = uppercaseNum(myString, count, num);
		System.out.println("The number of uppercase letters in this string is: " + num);
		input.close();
	}
	
	// uppercaseNum: Returns the number of uppercase letters in a string [recursively]
	public static int uppercaseNum(String myString, int count, int num) {
		// BASE CASE -- STOPPPING CONDITION
		if(count == 0) {
			if(Character.isUpperCase(myString.charAt(count))) {
				num += 1;
			}
			return num;
		} else { 
			if(Character.isUpperCase(myString.charAt(count))) {
				num += 1;
				return uppercaseNum(myString, count - 1, num);
			} 
		}
		return uppercaseNum(myString, count - 1, num);
		
	}

}
