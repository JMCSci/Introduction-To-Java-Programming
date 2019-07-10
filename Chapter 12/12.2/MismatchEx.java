/* Chapter 12.2
 * Write program that prompts user to read two integers and displays their sum. 
 * Program should prompt user to read the number again if input is incorrect
 */

package mismatchex;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MismatchEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, sum;
		Boolean a = true;
		while(a)
		try {
		System.out.println("Input two integers: "); 
		System.out.print("Input 1: ");
		x = input.nextInt();
		System.out.print("Input 2: ");
		y = input.nextInt();
		sum = x + y;
		System.out.println("The sum is: " + sum);
		break;
		}
		catch(InputMismatchException ex) {
			System.out.println("Wrong input. Please re-enter.\n");
			// clear current input
			input.next();	
			continue;
		}
		
		input.close();
	}

}
