/* Chapter 19.4
 * Program implements a generic method for a linear search
 */

package linearsearch;

public class LinearSearch  {
	public static void main(String[] args) {
		Integer [] list1 = {5, 6, 7, 8};
		String [] list2 = {"Mike", "Sally", "Jim", "Jane"};
		
		System.out.println(LinearSearch.<Integer>linearSearch(list1, 9));
		System.out.println(LinearSearch.<Integer>linearSearch(list1, 8));
		System.out.println(LinearSearch.<String>linearSearch(list2, "Sally"));
		System.out.println(LinearSearch.<String>linearSearch(list2, "Michelle"));
	}
	
	// linearSearch: Searches generic array for key defined by user
	// If found, returns position in array
	// If not found, returns -1
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		int pos = 0;
		E value = null;
		for(int i = 0; i < list.length; i++) {
			value = list[i];
			if(value.compareTo(key) == 0) {
				System.out.println("Key found!");
				pos = i;
				return pos;
			} 
		}
		System.out.println("Key not found");
		pos = -1;
		return pos;
	}

}
