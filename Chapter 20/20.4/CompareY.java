/* CompareY class
 * Implement Comparator<Point>
 * Implement compare method to compare two points on their y-coordinates
 * If two points have same y-coordinates, compare x-coordinates 
 * Comparator compares objects of a class that do not implement Comparable
 * Arrays.sort must implement Comparator interface (compare method) 
 */

package sortpoints;

import java.util.Comparator;

public class CompareY implements Comparator<Point> {
	
	@Override
	public int compare(Point point1, Point point2) {
		double x1 = point1.getX();
		double y1 = point1.getY();
		double x2 = point2.getX();
		double y2 = point2.getY();
		
		if(y1 == y2) {
			if(x1 == x2) {
				return 0;
			} else if(x1 > x2) {
				return 1;
			} else {
				return -1;
			}
		}
		
		if(y1 > y2) {
			return 1;
		} else {
			return -1;
		}
	}
}
