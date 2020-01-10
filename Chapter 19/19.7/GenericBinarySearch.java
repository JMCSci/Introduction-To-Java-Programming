/* Chapter 19.7
 * Program implements a generic method to conduct a binary search
 */

package genericbinarysearch;

public class GenericBinarySearch {
	public static void main(String[] args) {
	Integer [] list1 = {5, 2, 9, 8, 32, 22};
	String [] list2 = {"Martha", "Bob", "Xander", "Lisa"};
	int pos = 0;
	
	System.out.println("Unsorted Array");
	printArray(list1);
	bubbleSort(list1);
	System.out.println("Sorted Array");
	printArray(list1);
	pos = binarySearch(list1, 22);
	System.out.println("Key found at position: " + pos);
	System.out.println();
	System.out.println("Unsorted Array");
	printArray(list2);
	bubbleSort(list2);
	System.out.println("Sorted Array");
	printArray(list2);
	pos = binarySearch(list2, "Lisa");
	System.out.println("Key found at position: " + pos);
	}
	
	// binarySearch: Algorithm searches and returns key position in array
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int low = 0;
		int high = list.length - 1;
	
		while(high >= low) {
			int mid = (low + high) / 2;
			if(key.compareTo(list[mid]) <= -1) {
				high = mid - 1;
			} else if(key.compareTo(list[mid]) == 0) {
				return mid;
			} else {
				low = mid + 1;
			}	
		}
		// If not found, return -1
		return -1;
	}
	
	// bubbleSort: Algorithm sorts array in ascending order
	public static <E extends Comparable<E>> void bubbleSort(E[] list) {
		E temp = null;
		for(int i = 0; i < list.length - 1; i++) {
			for(int j = 0; j < list.length - 1; j++) {
				if(list[j].compareTo(list[j + 1]) >= 1) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;	
				}
				
			}
		}
	}
	
	// printArray: Print array contents
	public static <E>void printArray(E[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println();
	}
	
}
