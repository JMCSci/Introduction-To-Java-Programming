/* Chapter 19.1
 * Revise GenericStack class to implement it using an array rather than an ArrayLiat
 * Check size of array before adding a new element to the stack. 
 * If array full, create a new array that doubles the current array size and copy elements to a new array
 * 
 * I originally messed this up and had to revised it
 * Code probably could be shorted if rewritten
 */

package revisegeneric;

public class ReviseGeneric {
	static int size = 0;
	static int newSize = 0;
	static String [] list = new String [3];
	static boolean even = false;
	static boolean open = false;
	
	ReviseGeneric() {
		list[0] = "London";
		list[1] = "Paris";
		list[2] = "Berlin";
	}
	
	/* getSize: Check size of array */
	public static int getSize() {
		if(list.length % 2 == 0) {
			even = true;
		}
		size = list.length;
		return size;
	}
	
	/* newArray: Create new array if array is full; if not return original list */
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
	
	/* peek: Return first element at top of stack */
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
	
	/* openElement: Returns true if there is an open element in array */
	public static void openElement() {
		for(int i = list.length - 1; i >= 0; i--) {
			if(list[i] == null) {
				open = true;
				break;
			}
			open = false;
		}
	}
	
	/* push: Add new element to top of stack */
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
	
	/* pop: Return and remove element at the top of the stack */
	public static String pop() {
		// Iterate backwards through array to find top element
		// Copy element at top of stack to variable to be returned
			String popValue = null;
			// Check if array has null values
			// If it does, iterate through list to find top of stack
			openElement();
			if(open == true) {
				// Find top of stack
				for(int i = list.length - 1; i >= 0; i--) {
					// Get size of new array (w/o null values) through iteration 
					newSize++;
					if(list[i] == null) {
						// Get pop value
						popValue = list[i + 1];
						// Copy array to new array w/o pop value and null values
						list = copyArray(newSize);
						break;
						}
							
					}
						
				} else {
					popValue = list[0];
					// Size of array will be current array size plus 1 b/c value in method is minus 2
					// Remember pop value will not be included
					// Copy array to new array w/o element at top of stack
					size = getSize() + 1;
					copyArray(size);
				}
		return popValue;
	}
	
	/* copyArray: Copy contents of array to another */
	public static String [] copyArray(int newSize) {
		// Minus 2 because we do not want to include pop value
		String[] newArray = new String[newSize - 2];
		for(int i = newArray.length - 1; i >= 0; i--) {
			newArray[(newArray.length - 1) - i] = list[(list.length - 1) - i];
		}
		list = newArray;
		return list;	
	}
	
	/* printArray: Print contents of array */
	public static void printArray() {
		getSize();
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}


}
