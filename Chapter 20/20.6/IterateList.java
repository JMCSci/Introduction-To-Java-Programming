/* Chapter 20.6
 * Program creates a LinkedList that stores 5 million integers
 * Elapsed time is measured to traverse list using iterator vs. using get(index) method
 */

package iteratelist;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		long currentMillisecond = System.currentTimeMillis();
		long currentSecond = System.currentTimeMillis() / 1000;
		long elapsedSecond = 0;
		long iteratorSec = 0;
		long getIndexSec = 0;
		
		// Add integers to LinkedList
		for(int i = 0; i < 5000000; i++) {
			list.add(i);
		}
		
		// Traverse list with iterator
		ListIterator<Integer> iterator = list.listIterator();
		currentSecond = System.currentTimeMillis() / 1000;
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		elapsedSecond = System.currentTimeMillis() / 1000;
		iteratorSec = elapsedSecond - currentSecond;
		
		// Traverse list with get(index) method
		currentSecond = System.currentTimeMillis() / 1000;
		for(int i = 0; i < 5000000; i++) {
			System.out.println(list.get(i));
		}
		elapsedSecond = System.currentTimeMillis() / 1000;
		getIndexSec = elapsedSecond - currentSecond;
		
		System.out.println("\nTime elapsed for iterator: " + iteratorSec + " seconds");
		System.out.println("Time elapsed for get(index) method: " + getIndexSec + " seconds");
	}

}
