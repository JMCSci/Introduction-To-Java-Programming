package geometricobject;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	// Constructor should be protected because it can only be accessed by the subclass
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	// Constructor should be protected because it can only be accessed by the subclass
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	// Abstract method -- method is referenced here and created in subclass
	// This is because different geometric objects have different formulas for area
	public abstract double getArea();
	
	// Abstract method -- method is referencd here and created in subclass
	public abstract double getPerimeter();
	
	@Override
	public String toString() {
		return "\nCreated on " + dateCreated + "\ncolor: " + color + 
				" and filled: " + filled + " \nperimeter: " + getPerimeter() + 
				" \narea: " + getArea();
	}
	
	

}
