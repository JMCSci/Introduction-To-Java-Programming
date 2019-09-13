/* Chapter 7.3
 * Program reads integers between 1 - 100 and counts the occurrence of each
 */

package countnumbers;

import java.io.File;
import java.util.Scanner;
import java.io.PrintStream;

public class CountNumbers {
	public static void main(String[] args) throws Exception {
		int [] array1 = new int [20];
		inputData(array1);
		sortArray(array1);
		int count = 1, i = 0, temp;
		Scanner sorted = new Scanner(new File("sorted.txt"));
		
		try {
			for(i = 0; i < array1.length; i++) {
				temp = sorted.nextInt();
				if(array1[i + 1] == temp) {
					count++;
				}
				else {
					if(count == 1) {
					System.out.println(array1[i] + " occurs " + count + " time");
					count = 1;
					}
					else {
						System.out.println(array1[i] + " occurs " + count + " times");
						count = 1;
					}
					
				}
				
			}
			
		} 
		catch(ArrayIndexOutOfBoundsException ex) {
			if(count == 1) {
			System.out.println(array1[i] + " occurs" + count + " time");
			}
			else {
				System.out.println(array1[i] + " occurs" + count + " times");
				count = 1;
			}
		}
		
		sorted.close();
	}
	
	/* METHOD: inputData inputs numbers into array */
	public static void inputData(int array1[]) throws Exception {
		Scanner inputFile = new Scanner(new File("data.txt"));
		int i = 0; 
		while(inputFile.hasNextInt()) {
			array1[i] = inputFile.nextInt();
			i++;
		}
		inputFile.close();
	}
	
	/* METHOD: sortArray sorts array in ascending order */
	public static void sortArray(int array1[]) throws Exception{
		int temp = 0;
		for(int i = 0; i < array1.length - 1; i++) {
			for(int j = 0; j < array1.length- 1; j++) {
				if(array1[j] > array1[j + 1]) {
					temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
				}
			}
		}
		
	// Output sorted array to a file
		PrintStream output = new PrintStream("sorted.txt");
		for(int i = 0; i < array1.length; i++) {
			output.println(array1[i]);
		}
		output.close();

	}
	
	/* METHOD: displayArray1 displays array contents */
	public static void displayArray1(int array1[]) {
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}
	
	/* METHOD: blankSpace creates a empty line */
	public static void blankSpace() {
		System.out.println();
	}
	

}
