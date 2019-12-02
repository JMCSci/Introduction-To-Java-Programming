package geometricobject;

public class Triangle extends GeometricObject {
	protected double sideA = 0;					
	protected double sideB = 0;					
	protected double sideC = 0;					
	protected double perimeter = 0;
	protected double area = 0;
	protected double height = 0;
	
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setSideA(double newValue) {
		sideA = newValue;
	}
	
	public void setSideB(double newValue) {
		sideB = newValue;
	}
	
	public void setSideC(double newValue) {
		sideC = newValue;
	}
	
	public void setPerimeter(double value1, double value2, double value3) {
		sideA = value1;
		sideB = value2;
		sideC = value3;
	}
	
	public void setArea(double newValue) {
		area = newValue;
	}
	
	public void findPerimeter() {
		perimeter = sideA + sideB + sideC;
	}
	
	public void findArea() {
		height = Math.pow(sideA, 2) + Math.pow(sideB, 2); 
		area = sideB * height / 2;
	}

}
