/* MyPriortyQueue class
 * Clones a priority queue
 * This a shallow copy
 * Deep copy would include data fields
 * Returned copy should be obtained by calling super.clone()
 */

package clonequeue;

import java.util.PriorityQueue;
import java.lang.Cloneable;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {		
	@Override	
	public MyPriorityQueue<E> clone() throws CloneNotSupportedException {
		MyPriorityQueue<E> queue = new MyPriorityQueue<E>();
		return (MyPriorityQueue<E>) super.clone();
	}
}
