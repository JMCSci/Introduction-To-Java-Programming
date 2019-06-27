/* Chapter 11.12
 * Sum ArrayList
 */

package sumarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: "); 
// prompts for user input and inserts values into ArrayList
		for(int i = 0; i < 5; i++ ) {
			list.add(input.nextDouble());	
		}
		System.out.println("The sum of the values entered is: " + sum(list)); 
		input.close();
	}

// sum ArrayList	
	public static double sum(ArrayList<Double> list) {
		double x = 0;
		for(int i = 0; i < list.size(); i++) {
			x = list.get(i) + x;
		}
		return x;
	}

}
