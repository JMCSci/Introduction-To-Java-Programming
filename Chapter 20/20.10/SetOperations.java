/* Chapter 20.10
 * Program creates two priority queues and finds their union, difference, and intersection
 */

package setoperations;

import java.util.PriorityQueue;
import java.util.Arrays;

public class SetOperations {
	public static void main(String[] args) {
		PriorityQueue<String> list1 = new PriorityQueue<String>(Arrays.asList("George", 
				"Jim", "John", "Blake", "Kevin", "Michael"));
		PriorityQueue<String> list2 = new PriorityQueue<String>(Arrays.asList("George",
				"Katie", "Kevin", "Michelle", "Ryan"));
		
		System.out.println(list1);
		// addAll - union
		list1.addAll(list2);
		System.out.println(list1);
		// removeAll - difference
		list1.removeAll(list2);
		System.out.println(list1);
		// retainAll - intersection
		list1.retainAll(list2);
		System.out.println(list1);		
	}

}
