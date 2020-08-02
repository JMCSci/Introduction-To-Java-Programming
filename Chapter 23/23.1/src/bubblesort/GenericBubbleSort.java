/* Chapter 23.1 */

package bubblesort;

import java.util.Comparator;

public class GenericBubbleSort {
	public static void main(String[] args) {
		// Sort list using Comparable interface
		Integer [] list1 = {4, 5, 1, 0, 6, -1, 23, -43};
		System.out.println("Unsorted");
		print(list1);
		bubbleSort(list1);
		System.out.println("\nSorted with Comparable interface");
		print(list1);
		
		// Sort list using Comparator interface
		Integer [] list2 = {4, 5, 1, 0, 6, -1, 23, -43};
		System.out.println("\nUnsorted");
		print(list2);
		bubbleSort(list2);
		System.out.println("\nSorted with Comparator interface");
		print(list2);
	}
	
	public static <E extends Comparable<E>> void bubbleSort(E[] list) {
		E temp = null;
		for(int i = 0; i < list.length - 1; i++) {
			for(int j = 0; j < list.length - 1; j++) {
				if(list[j].compareTo(list[j + 1]) > 0) {
					temp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
		E temp = null;
		
		for(int i = 0; i < list.length - 1; i++) {
			for(int j = 0; j < list.length - 1; j++) {
				if(comparator.compare(list[j], list[j + 1]) > 0) {
					temp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
	public static <E> void print(E[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
