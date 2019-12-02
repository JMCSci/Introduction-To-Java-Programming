/* Chapter 13.1
 * Triangle class extends the abstract GeometricObject class
 * Program prompts user to enter three sides of the triangle, a color, and a Boolean filled value
 * Triangle is created with these sides and set color and fill properties using the input
 * Program displays area, perimeter, color, and true of false to indicate whether or not it is filled
 */

package geometricobject;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangle triangle = new Triangle();
		System.out.print("Enter value of side A: ");
		triangle.setSideA(input.nextDouble());
		System.out.print("Enter value of side B: ");
		triangle.setSideB(input.nextDouble());
		System.out.print("Enter value of side C: ");
		triangle.setSideC(input.nextDouble());
		triangle.findPerimeter();
		triangle.findArea();
		System.out.print("Is the triangle filled? ");
		triangle.setFilled(input.nextBoolean());
		System.out.print("What color is the triangle? ");
		triangle.setColor(input.next());
		System.out.println(triangle.toString());
		input.close();
	}
}
