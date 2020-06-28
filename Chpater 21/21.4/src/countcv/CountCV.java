package countcv;

import java.io.File;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class CountCV {
	public static void main(String[] args) throws Exception {
		LinkedHashSet<String> vowels = new LinkedHashSet<>(Arrays.asList("A", "E", "I", "O", "U"));
		LinkedHashSet<String> p = new LinkedHashSet<>(Arrays.asList("[", "]", ".", "(", ")"));
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		int numberOfVowels = 0;
		int numberOfConsonants = 0;
		if(file.exists() == true) {
			String delimiter = "[ \n\t\r.,;:\"\'?(){]";
			while(sc.hasNext()) {
				/* Read line of text
				 * Add it to string variable 
				 */
				String temp = sc.nextLine();
				temp = temp.toUpperCase();	// convert to uppercase
				String [] tokens = temp.split(delimiter);	// split each line into tokens with a delimiter
				/* Iterate through string looking for vowels
			 	 * Anything other than a vowel or punctuation mark is a consonant
				 */
				for(int i = 0; i < tokens.length; i++) {
					/* Iterate through each letter in each token */
					for(int j = 0; j < temp.length(); j++) {
						if(vowels.contains(Character.toString(temp.charAt(j)))) {
							numberOfVowels += 1;
						} else if(Character.toString(temp.charAt(j)).isBlank()){
							continue;
						} else if(p.contains(Character.toString(temp.charAt(j)))){
							continue;
						} else{
							numberOfConsonants += 1;
						}						
					}
				}
			}
			System.out.println("The text file contains the following vowels and consonants:");
			System.out.println("Vowels: " + numberOfVowels);
			System.out.println("Consonants: " + numberOfConsonants);
		} else {
			System.out.println("File does not exist");
		}
		sc.close();
	}

}
