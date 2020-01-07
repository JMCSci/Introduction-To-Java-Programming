/* Chapter 19.5
 * Program finds and returns the maximum element in an array
 */

package maximumelement;

public class MaximumElement {
	public static void main(String[] args) {
		Integer [] list1 = {55, 6, 4, 9, 75, 12, -104};
		String [] list2 = {"Martha", "Bob", "Xander", "Lisa"};
		
		System.out.println("Max value: " + MaximumElement.<Integer>max(list1));
		System.out.println("Max value: " + MaximumElement.<String>max(list2));
	}
	
	// max: Finds and returns the maximum element in an array
	public static <E extends Comparable<E>> E max(E[] list) {
		E value = null;
		value = list[0];
		for(int i = 0; i < list.length; i++) {	
			if(list[i].compareTo(value) >= 1) {
				value = list[i];
			}
		}
		return value;
	}

}
