/* Chapter 7.2
 * Program reads 10 integers and displays them in reverse order in which they were read
 */

package reverseNumbers;

import java.io.File;
import java.util.Scanner;

public class ReverseNumbers {
	public static void main(String[] args) throws Exception {
		int [] array1 = new int [22];
		inputData(array1);
		displayArray(array1);
		blankSpace();
		reverseOrder(array1);	
	}
	// Insert data into array
	public static void inputData(int array1[]) throws Exception {
		Scanner input = new Scanner(new File("data.txt"));	
		int i = 0;
		while(input.hasNextInt()) {
			array1[i] = input.nextInt();
			i++;
		}
	}
	
	// Display array
	public static void displayArray(int array1[]) {
		for(int i = 0; i < array1.length - 12; i++) {
			System.out.println(array1[i]);
		}
	}
	
	// Display in reverse order
	public static void reverseOrder(int array1[]) {
		for(int i = 9; i >= 0; i--) {
			System.out.println(array1[i]);
		}
		
	}
	
	// Blank space 
	public static void blankSpace() {
		System.out.println();
	}
	

}
