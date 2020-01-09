/* Chapter 19.6
 * Program uses a generic method to return the maximum element in a 2D array
 */

package maximum2d;

public class Maximum2D {
	public static void main(String[] args) {
		Integer [][] list1 = {{1, 2, 3}, 
						      {4, 5, 6}};
		String [][] list2 = {{"John", "Hanna", "Bill"},
							 {"Lisa", "Mike", "Jill"}};
		
		System.out.println("Maximum value: " + max(list1));
		System.out.println("Maximum value: " + max(list2));
	}
	
	// max: Returns the maximum element in a two-dimensional array
	public static <E extends Comparable<E>> E max(E[][] list) {
		E value = null;
		value = list[0][0];
		// Iterate through array rows and columns to find the max value
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[i].length; j++) {
				if(value.compareTo(list[i][j]) <= 1) {
					value = list[i][j];
					
				}
		
			}
		}	
		return value;
	}
	

}
