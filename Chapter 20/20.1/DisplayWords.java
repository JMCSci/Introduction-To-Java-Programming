/* Chapter 20.1
 * Program reads words from a text file and displays all the words in ascending alphabetical order
 * The words must start with a letter
 * The text file is passed as command-line argument
 */

package displayword;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplayWords {
	public static void main(String[] args) throws Exception {
		String filename = "";
		for(String temp: args) {
			filename = temp; 
		}
		File file = new File(filename);
		ArrayList<String> list = new ArrayList<String>();
		Scanner input = new Scanner(file);
		
		@SuppressWarnings("unused")
		int i = 0;
		// Add words to list
		while(input.hasNext()) {
			list.add(input.next());
			i++;
		}
		
		sortArray(list);
		
		// Loop through list and display contents
		for(String temp: list) {
			System.out.println(temp);
		}
		
		input.close();
	}
	
	// sortArray: Sort array using Bubble Sort algorithm
	public static <E extends Comparable<E>>void sortArray(ArrayList<String> list) {
		String temp = "";
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = 0; j < list.size() - 1; j++) {
				if(list.get(j).compareTo(list.get(j + 1)) >= 1) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
			
		}
	}

}
