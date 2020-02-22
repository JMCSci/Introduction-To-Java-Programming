/* Chapter 18.13
 * Program returns the largest integer in an array recursively
 * User is prompted to enter a list of eight integers and displays the largest element
 */

package largestnumber;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] array = new int [8];
		int count = array.length - 1;
		int i = 0;
		int max = array[count];
		
		System.out.println("Enter eight integers: ");
		while(i < array.length) {
			array[i] = input.nextInt();
			i++;
		}
		max = largestNumber(array, count, max);
		System.out.println("The largest number is: " + max);
		input.close();
	}
	
	// largestNumber: Returns the largest number in an array [recursively]
	public static int largestNumber(int array[], int count, int max) {
		// BASE CASE -- STOPPING CASE
		if(count == 0) {
			if(array[count] > max) {
				max = array[count];
			}
			return max;
		} 
		if(array[count] > max) {
			max = array[count];
		}
		return largestNumber(array, count - 1, max);
			
	}

}
