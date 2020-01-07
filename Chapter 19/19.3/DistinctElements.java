/* Chapter 19.3
 * Program returns a new ArrayList. 
 * The new list contains the non-duplicate elements from the original list
 */

package distinctelements;

import java.util.ArrayList;

public class DistinctElements {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(11);
		list.add(7);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(5);
		printArray(list);
		list = removeDuplicates(list);
		printArray(list);
	}
	
	/* removeDuplicate: Returns ArrayList with non-duplicate elements from original list */
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
		ArrayList<E> newList = new ArrayList<E>();
		Object temp = null;
		int duplicate = 0;
		
		// Take one element and go through entire list to see if there is a duplicate
		for(int i = 0; i < list.size(); i++) {
			duplicate = 0;
			// Check if there are duplicates  -- increase variable by 1 if there are
			// If variable value equals 1, that means it is seeing the number it is checking
			// If variable is greater than 1, that means there is a duplicate in the list
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i) == list.get(j)) {
					duplicate++;
				}
			}
			// Check if non-duplicate is in newList
			// Add it to list if array is empty 
			if(newList.size() == 0 && duplicate == 1) {
				newList.add(list.get(i));
				// If list is not empty, check if list contains element
			} else if(newList.size() > 0 && duplicate == 1){
				temp = list.get(i);
				// If element isn't in list, add it
				// If element is in list, don't do anything
					if(!newList.contains(temp)) {
						newList.add(list.get(i));
					}
			}
		}
		list = newList;
		return list;
	}
	
	/* printArray: Prints array contents */
	public static void printArray(ArrayList<?> list) {
		System.out.println("Array contents");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}

}
