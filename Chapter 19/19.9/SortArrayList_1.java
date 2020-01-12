/* Chapter 19.9
 * Program sorts a generic ArrayList
 * Version #1 -- uses Bubble Sort algorithm
 */

package sortarraylist;

import java.util.ArrayList;

public class SortArrayList_1 {
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
		System.out.println(list1);
		sort(list1);
		System.out.println("Sorted List");
		System.out.println(list1);
		
		list2.add("Sally");
		list2.add("Mark");
		list2.add("Adam");
		list2.add("Lisa");
		list2.add("Sherry");
		list2.add("Billy");
		System.out.println();
		System.out.println("Unsorted List");
		System.out.println(list2);
		sort(list2);
		System.out.println("Sorted List");
		System.out.println(list2);
	}
	
	// sort: Sorts list using Bubble Sort algorithm
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E temp = null;
		
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
	
	// printArray: Prints list contents
	public static <E> void printArray(ArrayList<E> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}

}
