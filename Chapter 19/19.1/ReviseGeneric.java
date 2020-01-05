/* Chapter 19.1
 * Revise GenericStack class to implement it using an array rather than an ArrayLiat
 * Check size of array before adding a new element to the stack. 
 * If array full, create a new array that doubles the current array size and copy elements to a new array
 */

package revisegeneric;

public class ReviseGeneric {
	static int size = 3;
	static String [] list = new String [size];
	
	ReviseGeneric() {
		list[0] = "London";
		list[1] = "Paris";
		list[2] = "Berlin";
	}
	
	// Check size of array
	public static int getSize() {
		return list.length;
	}
	
	// Create new array if full; if not return original list
	public static String[] newArray() {
		// Check if empty; if not, create new array and double size
			if(list[0].isEmpty() == false) {
				int newSize = size * 2;
				String [] newList = new String [newSize];
				// Copy elements over and return new array
				for(int j = 0; j < list.length; j++) {
					newList[j] = list[j];
				}
				return list = newList;
			} 
		return list;
	}
	
	// Check element in first position of array
	public static String peek() {		
		return list[0];
	}
	
	// Move elements down (1 element) in array, add new element to top of stack
	public static String[] push(String newValue) {
		String [] tempArray = new String[list.length];
		for(int i = 0; i < list.length / 2; i++) {
			tempArray[(tempArray.length - 1) - i] = list[i];
		}
		// Add element to top of stack
		tempArray[(list.length / 2) - 1] = newValue;
		return list = tempArray;
	}
	
	// Array shrink(?) 
	// Return and remove top element in stack
	public static String pop() {
		// If shrink array, leave tempArray as-is
		// If no shrink, remove minus 1
		String [] tempArray = new String [list.length - 1];
		String popValue = list[(list.length / 2) - 1];
		// Take array divide by 2 and copy the bottom elements
		for(int i = 0; i < list.length / 2; i++) {
			tempArray[(tempArray.length - 1) - i] = list[(list.length - 1) - i];
		}
		list = tempArray; 
		return popValue;
	}
	
	// printArray: Print contents of array
	public static void printArray() {
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}


}
