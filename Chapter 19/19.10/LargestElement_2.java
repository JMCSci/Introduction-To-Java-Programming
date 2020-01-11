/* Chapter 19.10
 * Program finds the largest element in an ArrayList
 * Version #2 -- uses Collections library to find largest element in a list
 */

package largestelement;

import java.util.ArrayList;
import java.util.Collections;

public class LargestElement_2 {
	public static void main(String []args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list1.add(4);
		list1.add(11);
		list1.add(7);
		list1.add(3);
		list1.add(21);
		list1.add(15);
		max(list1);
	
		list2.add("Sally");
		list2.add("Mark");
		list2.add("Adam");
		list2.add("Lisa");
		list2.add("Zoe");
		list2.add("Sherry");
		list2.add("Billy");
		max(list2);
	}
	
	// max: Finds the largest element in an ArrayList
	public static <E extends Comparable<E>> void max(ArrayList<E> list) {
		E temp = null;
		temp = Collections.max(list);
		System.out.println("Max: " + temp);
	}
	
	// printArray: Prints list contents
	public static <E> void printArray(ArrayList<E> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}

}
