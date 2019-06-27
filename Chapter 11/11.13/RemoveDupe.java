/* Chapter 11.13
 * remove duplicates from list
 */

package removeduplicate;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDupe {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
// user prompted to enter 10 numbers
		System.out.print("Enter ten integers: ");
		for(int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		sortArray(list);
		removeDuplicate(list);
		printArray(list);
		
	}
	
// sort ArrayList so duplicates are next to each other		
	public static void sortArray(ArrayList<Integer> list) {
		list.sort(null);
	}

// remove duplicate elements from ArrayList	
	public static void removeDuplicate(ArrayList<Integer> list) {
		for(int i = 0; i < list.size() - 1; i++) {
			if(list.get(i) == list.get(i + 1)) {
				list.remove(list.get(i + 1));
			}
			
		}
			
	}

// print ArrayList
	public static void printArray(ArrayList<Integer> list) {
		System.out.print("The distinct integers are: "); 
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ") ;
		}
	}
	

}
