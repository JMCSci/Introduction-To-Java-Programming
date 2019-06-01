/* Test Stopwatch class 
 * Program will calculated elapsed time to fill array with 100000 random numbers
 */

package stopwatch;

import java.util.Random;

public class TestStopWatch {

	public static void main(String[] args) {
		Stopwatch Time = new Stopwatch();
		int [] testArray = new int [100000];
		System.out.println("Fill array will 100000 random numbers.");
		Time.start();
		fillArray(testArray);
		Time.stop();
		System.out.printf("\nElapsed time: %01d millisecond(s)", Time.getElapsedTime());
	}
// method to fill array
	public static void fillArray(int testArray[]) {
		Random num = new Random();
		for(int i = 0; i < testArray.length; i++) {
			testArray[i] = num.nextInt();
		}
	}
}
