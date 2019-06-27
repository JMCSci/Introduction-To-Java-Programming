/* Chapter 11.14
 * Combine two ArrayLists
 */

package twolists;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoLists {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
// prompt user input for list 1 and list2
		System.out.println("Enter five integers for list1: ");
		for(int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}
		
		System.out.println("Enter five integers for list2: "); 
		for(int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}

		union(list1, list2);
		printArray(list1);		
		input.close();
	}
	
// combine two ArrayLists
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list1.addAll(list1.size(), list2);
		return list1;
	}
	
// print ArrayList
	public static void printArray(ArrayList<Integer> list1) {
		System.out.print("The combined list is: ");
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
	}

}
