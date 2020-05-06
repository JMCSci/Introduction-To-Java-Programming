/* Chapter 24.4 
 * Program displays the first 50 prime numbers in descending order
 */

package ch24;

import java.util.Stack;

public class GenericStack {
	public static void main(String[] args) {
		Stack <Integer> primeNumber = new Stack<>();
		findPrime(primeNumber);
		displayNumbers(primeNumber);
	}
	
	// findPrime: Finds the first 50 prime numbers
	public static void findPrime(Stack<Integer> primeNumber) {
		for(int i = 0; i < 200 ; i++) {
			if(i % 2 != 0 && i > 1) {
				 if(i % 3 != 0 || i % 5 != 0 || i % 7 != 0 || i % 11 != 0) {
					 if(i % 1 == 0 && i % i == 0) {
						 primeNumber.push(i);
					 }
						
				 } 
			}
			if(primeNumber.size() == 50) {
				break;
			}
		}
		
	}
	
	// displayNumbers: Prints prime numbers in descending order
	public static void displayNumbers(Stack<Integer> primeNumber) {
		while(!primeNumber.isEmpty()) {
			System.out.println(primeNumber.pop());
		}
	}

}
