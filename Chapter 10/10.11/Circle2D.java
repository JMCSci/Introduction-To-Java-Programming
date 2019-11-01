/* Chapter 10.11
 * Circle2D class creates a 2D circle 
 */

package circle2d;

public class Circle2D {
	private double x = 0;
	private double y = 0;
	private double radius = 0;
	private final double PI = 3.14;
	
	Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}
	
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	/* METHOD: setX
	 * Sets the value of x variable
	 */
	public void setX(double newValue) {
		x = newValue;
	}
	/* METHOD: setY
	 * Sets the value of y variable
	 */
	public void setY(double newValue) {
		y = newValue;
	}
	/* METHOD: setRadius
	 * Sets the value of radius variable
	 */
	public void setRadius(double newValue) {
		radius = newValue;
	}
	
	/* METHOD: getX
	 * Returns x value
	 */
	public double getX() {
		return x;
	}
	/* METHOD: getY
	 * Returns y value
	 */
	public double getY() {
		return y;
	}
	/* METHOD: getRadius
	 * Returns radius of circle
	 */
	public double getRadius() {
		return radius;
	}
	/* METHOD: getArea
	 * Returns the area of circle
	 */
	public double getArea() {
		return PI * Math.pow(radius, 2);
	}
	/* METHOD: getPerimeter
	 * Returns the perimeter of circle
	 */
	public double getPerimeter() {
		return 2 * (PI * radius);
	}
	
	/* METHOD: contains
	 * If distance between two point is less than the radius, point is inside circle (returns true)
	 */
	protected Boolean contains(double x2, double y2) {
		double distance = 0;
		distance = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
		if(distance < getRadius()) {
			return true;
		}
		return false;
	}
	
	/* METHOD: containsCircle
	 * Returns true if specified circle is inside this circle
	 */
	protected Boolean containsCircle(Circle2D circle) {
		// If contains() method returns true AND,
		// If area of that circle is less than the circle of this circle,
		// Return true
		if(circle.contains(circle.getX(), circle.getY()) == true) {
			if(circle.getArea() < getArea()) {
				return true;
			}
		}
		return false;
	}
	
	/* METHOD: overlaps
	 * Returns true if specified circle overlaps with this circle 
	 */
	protected Boolean overlaps(Circle2D circle) {
		// If contains() method returns true AND,
		// If circumference of that circle is less than the circle of this circle,
		// Return true
		if(circle.contains(circle.getX(), circle.getY()) == true) {
			if(circle.getPerimeter() < getPerimeter()) {
				return true;
			}
		}
		return false;
		
	}
}
