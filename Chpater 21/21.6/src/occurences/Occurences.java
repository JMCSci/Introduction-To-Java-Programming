/* Chapter 21.6 */

package occurences;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occurences {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int key = -1;	// number we input
		int value = 0;	// number of occurrences
		int max = 0;
		int keyValue = 0;
		
		System.out.print("Enter a numbers: ");
		while(key != 0) {
			key = sc.nextInt();
			// If map is empty insert key/value into map
			if(map.isEmpty()) {
				value = 1;
				map.put(key, value);
			} else {
				// Check if map contains key
				if(map.containsKey(key) == true){
					// If it does -- increase value by 1
					// Get key value and increase it by one and put it back in map
					keyValue = map.get(key);
					keyValue++;
					map.put(key, keyValue);
					if(keyValue > max) {
						max = keyValue;
					} 
				} else {
					// If it doesn't -- add to map
					value++;
					map.put(key, value);
				}
			}
			value = 0; // Reset value
		}
		
		// Get all entries in set
		Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
		
		// Iterate through set
		for(Entry<Integer, Integer> temp: entrySet) {
			if(temp.getValue() == max) {
				System.out.print(temp.getKey() + " ");
			}
			
		}
		sc.close();
	}

}
