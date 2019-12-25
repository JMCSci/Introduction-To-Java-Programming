/* Chapter 17.2
 * Program creates a file named Exercise17_02.dat if it does not exist
 * Data is appended if it already exists
 * 100 integers are created randomly into the file using binary I/O
 */

package binaryfile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class BinaryFile {
	public static void main(String[] args) throws IOException {
		// FileNotFoundException would be thrown if file does not exist in directory
		// Input stream only used so that I can tell if program is running correctly
		File file = new File("Exercise17_02.dat");
		FileInputStream input = new FileInputStream(file);
		// Create FileOutputStream object
		FileOutputStream output = new FileOutputStream("Exercise17_02.dat", true);
		try {
			int rand = 0;
			int num = 0;
			// Write to file -- 100 random numbers from 0 - 99
			for(int i = 0; i < 100; i++) {
				rand = ThreadLocalRandom.current().nextInt(0,99);
				output.write(rand);
			}
			// Read from file
			while((num = input.read()) != -1) {
				System.out.println(num);
			}
		// Finally used to ensure that program closes streams	
		} finally {
			input.close();
			output.close();
		}

	}

}
