package sumintegers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.File;
import java.util.concurrent.ThreadLocalRandom;

public class SumIntegers {
	public static void main(String[] args) throws IOException {
		File file = new File("Exercise17_03.dat");
		DataOutputStream doutput = new DataOutputStream(new FileOutputStream("Exercise17_03.dat", true));
		DataInputStream dinput = new DataInputStream(new FileInputStream(file));
		
		int rand = 0;
		int sum = 0;
		try {
			for(int i = 0; i < 10; i++) {
				rand = ThreadLocalRandom.current().nextInt(1, 99);
				doutput.writeInt(rand);
				//sum += dinput.readInt(); 
			}
			try {
			while((sum += dinput.readInt()) != -1);
			} catch(EOFException ex) {
				System.out.println("The sum of the integers is: " + sum);	
			}
				
		} finally {
			doutput.close();
			dinput.close();
		}
	
	}
	
}
