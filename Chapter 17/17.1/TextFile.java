/* Chapter 17.1
 * Program creates a file named Exercise17_01.txt if it does not exist
 * Data is appended if it already exists
 * 100 integers are created randomly into the file using text I/O
 * Integers are separated by a space
 */

package textfile;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class TextFile {
	public static void main(String[] args) throws IOException{
		FileOutputStream output = new FileOutputStream("Exercise17_01.txt", true);
		File file = new File("Exercise17_01.txt");
		FileInputStream input = new FileInputStream(file);
		int num = 0;
		int rand = 0;
		
		// Add random numbers (0-99) to file
		for(int i = 0; i < 100; i++) {
			rand = ThreadLocalRandom.current().nextInt(0, 99);
			output.write(rand);
		}
		// Read numbers from file
		while((num = input.read()) != -1) {
			System.out.println(num);
		}
		output.close();
		input.close();
	}

}
