/* Chapter 19.8 
 * Program shuffles an ArrayList
 */

package shufflearraylist;

import java.util.ArrayList;
import java.util.Collections;

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
	
	public static <E> void shuffle(ArrayList<E> list) {
		Collections.shuffle(list); 
	}
	
	public static <E> void printArray(ArrayList<E> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}

}
