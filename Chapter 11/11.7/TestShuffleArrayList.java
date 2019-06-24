/* Chapter 11.7
 * Shuffle ArrayList
 */

package shuffleArrayList;

import java.util.ArrayList;

public class TestShuffleArrayList {
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		// add integers from array into ArrayList
		ShuffleArrayList.addIntegers(list);
		// shuffle ArrayList
		ShuffleArrayList.shuffle(list);
		// view ArrayList
		ShuffleArrayList.viewArrayList(list);
	}

}
