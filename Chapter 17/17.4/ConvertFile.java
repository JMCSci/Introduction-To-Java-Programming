/* Chapter 17.4
 * Program reads lines of characters from a text file and writes each line as a UTF-8 string binary file
 * Size of text file and binary file is displayed
 */

package convertfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.EOFException;

public class ConvertFile {
	public static void main(String[] args) throws Exception {
		File file = new File("Welcome.txt");
		FileInputStream filein = new FileInputStream(file);
		DataInputStream input = new DataInputStream(filein);
		FileOutputStream fileout = new FileOutputStream("Welcome.utf", false);
		DataOutputStream output = new DataOutputStream(fileout);
		char temp = ' ';
		int readBytes = 0;
		int writeBytes = 0;
		// Estimate of number of bytes remaining in stream
		readBytes = filein.available();
		try {
			while((temp = input.readChar()) != -1) {
				output.writeUTF(Character.toString(temp));
			}
			
		} catch (EOFException ex) {
			System.out.println("All data read\n");
		} finally {
			// Number of bytes written to stream so far
			writeBytes = output.size();
			filein.close();
			input.close();
			fileout.close();
			output.close();
		}
		System.out.println("Size of text file: " + readBytes + " bytes");
		System.out.println("Size of binary file: " + writeBytes + " bytes");
	}

}
