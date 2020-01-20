/* Chapter 20.4
 * Randomly create 100 points and apply Arrays.sort method
 * Display the points in increasing order of x-coordinates and y-coordinates, respectively
 */

package sortpoints;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;

public class TestPoints {
	public static void main(String[] args) {
		Point [] pointArray = new Point[100];
		double x;
		double y;
		
		for(int i = 0; i < pointArray.length; i++) {
			x = ThreadLocalRandom.current().nextDouble(-50, 50);
			y = ThreadLocalRandom.current().nextDouble(-50, 50);
			pointArray[i] = new Point(x, y);
		} 
		
		Arrays.sort(pointArray);
		List<Point> list = Arrays.asList(pointArray);
		// Uses Arrays.sort uses compareTo method in Point class
		System.out.println("x-coordinates arranged in ascending order");
		for(Point temp: list) {
			System.out.println(temp);
		}
		System.out.println();
		System.out.println("y-coordinates arranged in ascending order");
		// Uses Arrays.sort uses compare method in CompareY class
		Arrays.sort(pointArray, new CompareY());
		for(Point temp: list) {
			System.out.println(temp);
		}
		
		
	
	}

}
