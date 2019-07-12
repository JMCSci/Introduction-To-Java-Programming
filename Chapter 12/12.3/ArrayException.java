/* Chapter 12.3
 * Create array of 100 random integers
 * Prompt user to enter index of array
 * Display corresponding element value
 * If out of bounds, display message "Out of Bounds"
 */

package arrayexception;

import java.util.Random;
import java.util.Scanner;

public class ArrayException {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int [] array1 = new int [100];
	fillArray(array1);
	try {
	System.out.print("Enter array index: ");
	System.out.println(array1[input.nextInt()]);
	} 
	catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("Out of bounds");
	}
	input.close();

	}
	public static void fillArray(int array1[]) {
		Random rand = new Random();
		for(int i = 0; i < 100; i++) {
			array1[i] = rand.nextInt(1000);
		}
	}
	
}
