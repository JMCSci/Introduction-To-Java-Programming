/* Locate maximum value and its location in a 2-D array 
 * Tested with File library and data file 
 * Changed code so that user can enter their own data into array 
 */

package location;

import java.util.Scanner;

// blueprint
public class Location {
	public int row;
	public int column;
	public double maxValue;
	
// constructor -- default values
	Location() {
		row = 0;
		column = 0;
		maxValue = 0;
	}

/* MAIN */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Location location1 = new Location();		
		System.out.print("Enter the number of rows and columns in the array: ");
		location1.row = userInput.nextInt(); 
		location1.column = userInput.nextInt();
		double [][] array = new double [location1.row][location1.column];
		System.out.println("Enter the array:" );
// fill array
		for(int i = 0; i < location1.row; i++) {
			for(int j = 0; j < location1.column; j++)
			array[i][j] = userInput.nextDouble();
		}
		location1 = Location.locateLargest(array, location1); 
		System.out.println("The location of the largest element is " + location1.maxValue + " at (" + location1.row + ", " + location1.column + ")");
	}
	public static Location locateLargest(double a[][], Location b) {
// new object created to be returned
		Location location2 = new Location();
// scan array for largest value	
			for(int i = 0; i < b.row; i++) {
				for(int j = 0; j < b.column; j++) {
					if(location2.maxValue < a[i][j]) {
						location2.maxValue = a[i][j];
						location2.row = i;
						location2.column = j;
					}
				}
			}
		return location2;
	}
}
