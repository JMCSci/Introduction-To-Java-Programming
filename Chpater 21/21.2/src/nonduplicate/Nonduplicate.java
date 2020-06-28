/* Chapter 21.2 */

package nonduplicate;

import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class Nonduplicate {
	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		TreeSet <String> words = new TreeSet<>();
		if(file.exists() == true) {
			String delimiter = "[ 1234567890\n\t\r.,;:!?() {-]";
			while(sc.hasNext()) {
				String [] tokens = sc.next().split(delimiter);
				for(int i = 0; i < tokens.length; i++) {
					String word = tokens[i].toLowerCase();
					words.add(word);
				}
			}
			System.out.println("All nonduplicate words from this text file: ");
			for(String text: words) {
				System.out.println(text);
			}
		} else {
			System.out.println("File does not exists");
		}
		sc.close();
	}
}
