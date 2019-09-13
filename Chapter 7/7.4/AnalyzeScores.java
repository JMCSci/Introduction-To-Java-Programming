/* Chapter 7.4
 * Program reads an unspecified number of scores and determines 
 * how many scores are above or equal to the average 
 * and how many scores are below the average
 */

package analyzescores;

import java.util.Scanner;

public class AnalyzeScores {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int [] array = new int [100];
		int element = 0, i = 0; 
		double average; 
		System.out.println("Enter a score: ");
		
		while(input.hasNext()) {
			array[i] = input.nextInt();
			element = i;
			if(array[i] > 0) {
				System.out.println("Enter another score or enter -1 to stop");
				i++;
			}
			else {
				break;
			}
		}
		printArray(array, element);
		average = findAverage(array, element);
		analyzeScores(array, element, average);
		input.close();
	}
	
	/* METHOD: printArray 
	 * When user enters -1 in main, i-variable saves to element variable
	 * Element variable used in for loop to signify the last element used
	 */
	public static void printArray(int array[], int element) {
		for(int j = 0; j < element; j++) {
			System.out.println(array[j]);
		}
	}
	
	/* METHOD: findAverage
	 * Finds the average in the array
	 */
	public static double findAverage(int array[], int element) {
		int sum = 0;
		for(int j = 0; j < element; j++) {
			sum = sum + array[j];
		}
		return sum / element;
	}
	
	/* METHOD: analyzeScores
	 * Determines how many scores are above, equal or below the average
	 */
	public static void analyzeScores(int array[], int element, double average) {
		int above = 0, equal = 0, below = 0;
		for(int j = 0; j < element; j++) {
			if(array[j] > average) {
				above++;
			}
			else if(array[j] == average) {
				equal++;
			}
			else if(array[j] < average) {
				below++;
			}
		}
		System.out.println("\nThere are " + above + " scores above the average");
		System.out.println("There are " + equal + " scores equal to the average");
		System.out.println("There are " + below + " scores below the average");
	}
	

}
