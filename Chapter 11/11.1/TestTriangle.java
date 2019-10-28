/* Chapter 11.1
 * Program prompts user to enter three sides of the triangle, a color, Boolean value if it is filled
 * Triangle object is created with these sides
 * Color and filled properties are then set using input 
 * Program displays the area, perimeter, color, and true or false to indicate whether it is filled
 */

package geometricobject;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1 = 0;
		double side2 = 0;
		double side3 = 0;
		String color = null;
		Boolean fill = null;
		
		System.out.println("Enter the values for three sides of a triangle.\n");
		System.out.print("Side 1: ");
		side1 = input.nextDouble();
		System.out.print("Side 2: ");
		side2 = input.nextDouble();
		System.out.print("Side 3: ");
		side3 = input.nextDouble();
		System.out.println("\nWhat color is the triangle?");
		color = input.next();
		System.out.println("Is the triangle filled? true or false");
		fill = input.hasNext();
		// Triangle object created 
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setFilled(fill);
		triangle.setColor(color);
		// Print object values using custom toString method
		System.out.println(triangle.toString());
		System.out.printf("\nArea = %.2f, Color = %s, Filled = %b", triangle.getArea(), triangle.getColor(), triangle.isFilled());
		input.close();
	}
}
