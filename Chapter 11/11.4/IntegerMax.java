/* Maximum element in ArrayList
 */

package integerMax;

import java.util.ArrayList;

public class IntegerMax {
	public static Integer num;
	
	IntegerMax() {
	}

/* method max finds the maximum number in an ArrayList
 * returns null if ArrayList does not contain any elements
 */
	public static Integer max(ArrayList<Integer> list) {
		if(list.size() == 0) {
			return null;
		}
		num = Integer.MIN_VALUE;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > num) {
				num = list.get(i);
			}
		}
		return num;
	}
}
