/* Test Circle2D class */

package circle2d;

public class TestPoint2D {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		Circle2D c2 = new Circle2D(4, 5, 10.5);
		Circle2D c3 = new Circle2D(3, 5, 2.3);
		System.out.println("Circle 1: Area = " + c1.getArea() + ", Perimeter = " + c1.getPerimeter());
		System.out.println("Circle 2: Area = " + c2.getArea() + ", Perimeter = " + c2.getPerimeter()); 
		System.out.println("Does Circle 1 contain (3, 3)? " + c1.contains(3, 3));
		System.out.println("Does Circle 1 contain Circle 2? " + c1.containsCircle(c2));
		System.out.println("Does Circle 1 overlap Circle 3? " + c1.overlaps(c3));
	}

}
