/* Chapter 7.5
 * Program reads in 10 numbers and displays the number of distinct numbers
 * Numbers separated by one space 
 */

package distinctnumbers;

import java.util.Scanner;

public class DistinctNumers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] distinctArray = new int [10];
		int temp = 0; 
		int n = 0;																// Counter										
		System.out.println("Enter ten numbers: ");
		for(int i = 0; i < distinctArray.length; i++) {
			temp = input.nextInt();
			// Adds number to array and increases counter
			if(checkArray(temp, distinctArray)) {
				distinctArray[n] = temp;
				n++;
			}
		}
		System.out.println("\nThe number of distinct number(s) is " + n);
		printArray(distinctArray, n);
		input.close();
	}
	
	/* METHOD: printArray
	 * Display contents of array
	 */
	
	public static void printArray(int array[], int n) {
		System.out.print("The distinct number(s) is/are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/* METHOD: checkArray
	 * Checks each element against temp to find distinct numbers
	 * Breaks out of loop if true or false is returned
	 */
	
	public static Boolean checkArray(int temp, int array[]) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == temp) {
				return false;
			}
		}
		return true;
	}
}
