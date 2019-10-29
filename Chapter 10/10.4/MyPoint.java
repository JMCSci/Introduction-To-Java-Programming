/* Chapter 10.4
 * Program represents a point with x- and y- coordinates  
 */

package mypoint;

public class MyPoint {
	private double x1 = 0;
	private double y1 = 0;
	
	// no-arg constructor creates point (0, 0)
	MyPoint() {
		x1 = 0;
		y1 = 0;
	}
	
	// argument constructor 
	MyPoint(double x1, double y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	
	// Getter: Return value of x1
	public double getx1() {
		return x1;
	}
	
	// Getter: Return value of y1
	public double gety1() {
		return y1;
	}
	
	// Setter: Set value of x1
	public void setx1(double newValue) {
		x1 = newValue;
	}
	
	// Setter: Set value of y1
	public void sety1(double newValue) {
		y1 = newValue;
	}
	
	/* METHOD: distance
	 * Returns distance from this point to a specified point of the MyPoint type
	 * USES DISTANCE FORMULA
	 */
	public double distance(double x2, double y2) {
		double distance = 0;
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return distance;  
	}
	
	/* METHOD: distance
	 * REturns distance from this point to a specified point with specified x- and y- coordinates
	 * USES DISTANCE FORMULA
	 */
	public double specifiedDistance(double x1, double y1, double x2, double y2) {
		double distance = 0;
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return distance;
	}

}
