package maxsubstring;

import java.util.Scanner;
import java.util.HashMap;

public class MaxSubstring {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String myString = "";
		System.out.print("Enter a string: ");
		myString = sc.nextLine();
		findSubstring(myString);
	}
	
	public static void findSubstring(String myString) throws Exception {
		HashMap<Integer, String> map = new HashMap<>();
		int max = 0;
		int maximumString = 0;
		String found = "";
		// walk through each character of string
		for(int i = 0; i < myString.length() - 1; i++) {
			if(i == 0) {
				found = Character.toString(myString.charAt(i));
				max += 1;
			}
			// if next character is greater than next letter in alphabet, add it to string
			if(myString.charAt(i + 1) > myString.charAt(i)) {
					found += Character.toString(myString.charAt(i + 1));
					max += 1;
					if(max > maximumString) {
						maximumString = max;
					}
					map.put(max, found);
			// if it isnt, start over and create a new string
			} else {
				maximumString = max;
				found = Character.toString(myString.charAt(i + 1));  // start over
				max = 1;	// reset max
			}
				
		}
		System.out.println(map.get(maximumString));
	}

}