/* Chapter 19.8 
 * Program shuffles a generic ArrayList
 * Version #2 uses a random number generator and duplicate number checker to shuffle list
 */

package shufflearraylist;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add(4);
		list1.add(9);
		list1.add(1);
		list1.add(22);
		list1.add(3);
		list2.add("Lisa");
		list2.add("Martha");
		list2.add("Susan");
		list2.add("Henry");
		list2.add("Tom");
		System.out.println("Unshuffled List");
		printArray(list1);
		shuffle(list1);
		System.out.println("Shuffled List");
		printArray(list1);
		System.out.println("Unshuffled List");
		printArray(list2);
		shuffle(list2);
		System.out.println("Shuffled List");
		printArray(list2);
	}
	
	// shuffle: Shuffles ArrayList
	public static <E> void shuffle(ArrayList<E> list) {
		// Create a new ArrayList
		ArrayList<E> newList = new ArrayList<E>();
		int rand = 0;
		E temp = null;
		
		// Loop through array
		for(int i = 0; i < list.size(); i++) {
			// Create a random number from 0 - size of list
			rand = ThreadLocalRandom.current().nextInt(0, list.size());
			// Uses random number to pick element from list 
			temp = list.get(rand);
			// Loop to see if temp value is already in new ArrayList
			// If it is, get another random number and use it pick another element
			// If it isn't add it to the new list
			while(checkDuplicate(newList, temp) == true) {
					rand = ThreadLocalRandom.current().nextInt(0, list.size());
					temp = list.get(rand);
			}			
			newList.add(i, temp);
		}
		// Set elements old list with values from new list
		for(int i = 0; i < list.size(); i++) {
			list.set(i, newList.get(i));
		}
	}
	
	// checkDuplicate: Checks if ArrayList already contains element
	// Returns true if it does, false if it doesn't
	public static <E> boolean checkDuplicate(ArrayList<E> list, E temp) {
		if(list.contains(temp)) {
			return true;
		}
		return false;
	}
	
	// printArray: Prints array contents
	public static <E> void printArray(ArrayList<E> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}
	
	

}
