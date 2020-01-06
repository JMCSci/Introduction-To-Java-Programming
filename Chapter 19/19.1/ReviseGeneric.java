/* Chapter 19.1
 * Revise GenericStack class to implement it using an array rather than an ArrayLiat
 * Check size of array before adding a new element to the stack. 
 * If array full, create a new array that doubles the current array size and copy elements to a new array
 */

package revisegeneric;

public class ReviseGeneric {
	static int size = 0;
	static String [] list = new String [3];
	static boolean even = false;
	static boolean open = false;
	
	ReviseGeneric() {
		list[0] = "London";
		list[1] = "Paris";
		list[2] = "Berlin";
	}
	
	// Check size of array
	public static int getSize() {
		if(list.length % 2 == 0) {
			even = true;
		}
		size = list.length;
		return size;
	}
	
	
	// Create new array if full; if not return original list
	public static String[] newArray() {
		getSize();
		openElement();
		if(open == false) {
			size = size * 2;
			String [] newList = new String [size];
			// Create new array and double size
			for(int i = list.length - 1; i  >= 0; i--) {
				newList[(newList.length - 1) - i] = list[(list.length - 1) - i];
			}
			return list = newList;	
		} 
		return list;
		
	}
	
	// Check element in first position of array
	public static String peek() {
		getSize();
		String temp = "";
		for(int i = list.length - 1; i >= 0; i--) {
			if(list[i] == null) {
				temp = list[i + 1];
				break;
			} else {
				temp = list[0];
			}
		}
		return temp;
	}
	
	public static void openElement() {
		for(int i = list.length - 1; i >= 0; i--) {
			if(list[i] == null) {
				open = true;
				break;
			}
			open = false;
		}
		
	}
	
	// Move elements down (1 element) in array, add new element to top of stack
	public static String[] push(String newValue) {
		getSize();
		newArray();
		if(open = false) {
			if(even == true) {
				String [] tempArray = new String[list.length];
				for(int i = 0; i < list.length / 2; i++) {
					tempArray[(tempArray.length - 1) - i] = list[i];
				}
				// Add element to top of stack
				tempArray[(list.length / 2) - 1] = newValue;
				return list = tempArray;
			}
			String [] tempArray = new String[list.length];
			for(int i = 0; i < list.length / 2; i++) {
				tempArray[(tempArray.length - 1) - i] = list[i];
			}
			// Add element to top of stack
			tempArray[(list.length / 2) - 1] = newValue;
			list = tempArray;
			return list;
		}
		// Add pushed to top of stack
		for(int i = list.length - 1; i >= 0; i--) {
			if(list[i] == null) {
				list[i] = newValue;
				break;
			}
		}
		return list;
	}
	
	// Does array shrink(?) 
	// Return and remove top element in stack
	// REWRITE
	public static String pop() {
		getSize();
		// If array shrinks, leave tempArray as-is
		// If it doesn't, remove list.length - 1
		String [] tempArray = new String [list.length - 1];
		if(list.length % 2 == 0) {
			String popValue = list[(list.length / 2) - 1];
		}
		String popValue = list[list.length / 2];
		// Take array divide by 2 and copy the bottom elements
		for(int i = 0; i < list.length / 2; i++) {
			tempArray[(tempArray.length - 1) - i] = list[(list.length - 1) - i];
		}
		list = tempArray; 
		return popValue;
	}
	
	// printArray: Print contents of array
	public static void printArray() {
		getSize();
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}


}
