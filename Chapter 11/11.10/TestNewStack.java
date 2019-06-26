/*	Chapter 11.10
 *	Prompts user for 5 numbers and displays them in reverse order
 */

package mystack;

import java.util.Scanner;

public class TestMyStack {
	public static void main(String[] args) {
	NewStack test3 = new NewStack();
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter 5 numbers: ");
		for(int i = 0; i < 5; i++) {
			test3.push(input.nextInt());
		}
	
	System.out.println("The numbers in reverse are: ");
		for(int i = 0; i < 5; i++) {
			System.out.println(test3.pop());
		}
		input.close();
	
	}

}
