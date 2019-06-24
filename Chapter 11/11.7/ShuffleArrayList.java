/* Class SuffleArrayList
 * Shuffle ArrayList of integers 
 */

package shuffleArrayList;

import java.util.ArrayList;

public class ShuffleArrayList {

	public static int [] array1 = {1,2,3,4,5}; 
	
	ShuffleArrayList() {
		
	}
	
// add integers from array to ArrayList
	public static void addIntegers(ArrayList<Integer> list) {
		for(int i = 0; i < array1.length; i++) {
			list.add(array1[i]);
		}
	}

// method shuffles Array list -- calls Collections class
	public static void shuffle(ArrayList<Integer> list) {
		java.util.Collections.shuffle(list);
	}
	
// method views ArrayList
	public static void viewArrayList(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
}
