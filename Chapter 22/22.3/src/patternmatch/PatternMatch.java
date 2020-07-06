/* Chapter 22.3 */

package patternmatch;

import java.util.Scanner;

public class PatternMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String s1;									
		String s2;
		System.out.print("Enter a string s1: ");				// constant	
		s1 = sc.nextLine();										// constant
		System.out.print("Enter a string s1: ");				// constant
		s2 = sc.nextLine();										// constant
		findString(s1, s2);						
		sc.close();
	}
	
	public static void findString(String s1, String s2) {
		int len = s2.length();									// constant - worst case 0(1)
		for(int i = 0; i < s1.length() - 1; i++) {				// linear - worst case O(n) is based on the length (n) of the string
			String temp = s1.substring(i, len + i);				// constant
			if(temp.matches(s2)) {
				System.out.println("Matched at index: " + i);	// constant
				return;
			}
		}
		System.out.println("Substring not found");				// constant
	}

}
