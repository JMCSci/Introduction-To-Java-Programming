/* Chapter 17.5
 * Program stores an array of five integer values, Date object for current time, double value 5.5 to a file 
 * Filename: Exercise17_05.dat
 */

package storeobjects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

import java.util.Date;

public class StoreObjects {
	public static void main(String[] args) throws Exception, FileNotFoundException{
		int [] array = {1, 2, 3, 4, 5};
		Date date = new Date();
		double num = 5.5;
		// Create ObjectStream I/O objects
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat", false));
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_05.dat"));
		
		try {
			// Add objects to file
			output.writeObject(array);
			output.writeObject(date);
			output.writeObject(num);
			// Call displayObject method
			displayObjects(input, array, date, num);
		} finally {	
			// Close stream I/O stream
			input.close();
			output.close();
		}

	}
	
	// METHOD: displayObjects
	// Input stream to display file contents
	public static void displayObjects(ObjectInputStream input, int array[], Date date, double num) throws Exception {
		// Create array file contents to be stored -- read later
		int [] newArray = (int[])(input.readObject());
		String newDate = input.readObject().toString();
		double newNum = (double)input.readObject();
		
		// For-loops used to display contents
		for(int i = 0; i < array.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 1; i++) {
			System.out.println(newDate + " ");
		}
		
		for(int i = 0; i < 1; i++) {
			System.out.println(newNum + " ");
		}
		
	}

}
