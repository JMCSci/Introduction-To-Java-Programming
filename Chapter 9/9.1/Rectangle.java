/* Represents a rectangle */

package rectangle;

// blueprint
public class Rectangle {
	public double width;
	public double height;
	
// no argument constructor -- default rectangle	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
// argument constructor 
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height; 
	}

// method returns area of this rectangle
	public double getArea() {
		return width * height;
	}
// method returns perimeter of this rectangle
	public double getPerimeter() {
		return (width + width + height + height);
	}
	
}
