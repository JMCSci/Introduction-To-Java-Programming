/* Triangle class */

package geometricobject;

public class Triangle extends GeometricObject {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	private double semiperimeter = 0;
	private double area = 0;
	private double perimeter = 0;
	
	// no-arg constructor
	Triangle() {
		
	}
	
	// argument constructor
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public void setSide1(double newValue) {
		side1 = newValue;
	}
	
	public void setSide2(double newValue) {
		side2 = newValue;
	}
	
	public void setSide3(double newValue) {
		side3 = newValue;
	}
	// Area using Heron's formula
	public double getArea() {
		double s = 0;
		semiperimeter = 0.5 * (side1 + side2 + side3);
		s = semiperimeter;
		area =  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public double getPerimeter() {
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	@Override
	public String toString() {
		return "Triange: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
	}
	

}
