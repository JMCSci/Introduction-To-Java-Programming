/* Chapter 13.2 
 * Shuffle an ArrayList of numbers
 */

package shuffleArrayList;
import java.util.ArrayList;
import java.util.Random;

public class ShuffleArrayList {
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Number> list = new ArrayList<>();	
		
		// Insert random numbers
		for(int i = 0; i <= 4; i++) {
			list.add(rand.nextInt(100));
		}
		
		// Display ArrayList numbers
		for(int i = 0; i <= 4; i++) {
			System.out.println(list.get(i));
		}
		
		shuffle(list);
		System.out.println();
		
		
		// Display shuffled ArrayList
		for(int i = 0; i <= 4; i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	// Shuffles an ArrayList of numbers
	public static void shuffle(ArrayList<Number> list) {
		java.util.Collections.shuffle(list);
	}
	
	
}
