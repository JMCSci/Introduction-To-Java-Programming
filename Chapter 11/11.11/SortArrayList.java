/* Chapter 11.11
 * Sort ArrayList in increasing order
 */

package sortarraylist;

import java.util.ArrayList;
import java.util.Random;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random rand = new Random();

// fill ArrayList with random numbers
		for(int i = 0; i < 5; i++) {
			list.add(rand.nextInt(10));
		}
// print unsorted ArrayList 
		System.out.println("Unsorted ArrayList");
		for(int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}
		
		sort(list);
		printSort(list);
	}

// sort ArrayList
	public static void sort(ArrayList<Integer> list) {
		list.sort(null);
		}

// print sorted ArrayList
	public static void printSort(ArrayList<Integer> list) {
		System.out.println("\nSorted ArrayList");
		for(int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}
	}
}
