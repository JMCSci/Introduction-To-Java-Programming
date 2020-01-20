/* Point class
 * Two data fields x and y to represent x- and y-coordinates
 * Implements the Comparable interface for comparing points on x-coordinates
 * If two points have same x-coordinates compare their y-coordinates
 * Arrays.sort must implement Comparable interface (compareTo method) 
 */

package sortpoints;

import java.text.DecimalFormat;

public class Point implements Comparable<Point>{
	double x = 0;
	double y = 0;
	
	Point() {
		
	}
	
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double newValue) {
		x = newValue;
	}
	
	public void setY(double newValue) {
		y = newValue;
		
	}
	
	public int compareTo(Point point) {
		if(x == point.getX()) {
			return 0;
		} else if(x > point.getX()) {
			return 1;
		} else {
			return -1;
		}

	}
	
	@Override
	public String toString() {
		DecimalFormat decimal = new DecimalFormat("#0.00");
		return "x = " + decimal.format(getX()) + ",\ty = " + decimal.format(getY());
	}
	
}
