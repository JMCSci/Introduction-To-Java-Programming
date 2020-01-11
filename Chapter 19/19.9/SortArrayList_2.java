/* Chapter 19.9
 * Program sorts a generic ArrayList
 * Version #2 -- uses Collections library to sort ArrayList
 */

package sortarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList_2 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add(4);
		list1.add(11);
		list1.add(7);
		list1.add(3);
		list1.add(21);
		list1.add(15);
		System.out.println("Unsorted List");
		printArray(list1);
		sort(list1);
		System.out.println("Sorted List");
		printArray(list1);
		
		list2.add("Sally");
		list2.add("Mark");
		list2.add("Adam");
		list2.add("Lisa");
		list2.add("Sherry");
		list2.add("Billy");
		System.out.println("Unsorted List");
		printArray(list2);
		sort(list2);
		System.out.println("Sorted List");
		printArray(list2);
	}
	
	// sort: Sorts list using Bubble Sort algorithm
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		Collections.sort(list);
	}
	
	// printArray: Prints list contents
	public static <E> void printArray(ArrayList<E> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}

}
