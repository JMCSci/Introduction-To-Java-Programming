/* Chapter 20.12
 * Program implements Cloneable interface 
 * Implements the clone() method to clone a priority queue
 */

package clonequeue;


public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		MyPriorityQueue<Integer> myq1 = new MyPriorityQueue<Integer>();
		myq1.add(3);
		myq1.add(5);
		myq1.add(7);
		MyPriorityQueue<Integer> myq2 = myq1.clone(); 
		System.out.println(myq2);
	}

}
