/* Chapter 20.3
 * Program prompts user to enter a capital for a state
 */

package guesscapitals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class GuessCapitals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean keepPlaying = true;
		String capitalAnswer = null;
		String userSelection = "";
		int totalCorrect = 0;
		int totalIncorrect = 0;
		int rounds = 0;
		ArrayList<String> state = new ArrayList<>(Arrays.asList("Alabama", "Alaska", "Arizona", 
				"Arkansas", "California","Colorado", "Connecticut", "Delaware","Florida","Georgia", "Hawaii",
				"Idaho","Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", 
				"Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", 
				"Nevada", "New Hampshire", "New Jersey","New Mexico", "New York", "North Carolina", "North Dakota", 
				"Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", 
				"Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin",
				"Wyoming"));
		ArrayList<String> capital = new ArrayList<>(Arrays.asList("Montgomery", "Juneau", "Phoenix", "Little Rock", 
				"Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise","Springfield", 
				"Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", 
				"Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", 
				"Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", 
				"Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", 
				"Olympia", "Charleston", "Madison", "Cheyenne"));
		int generateNum = 0;
		
		while(keepPlaying) {
			rounds++;
			generateNum = ThreadLocalRandom.current().nextInt(0, 50);
			System.out.println("What is the capital of " + state.get(generateNum) + "?");
			capitalAnswer = input.nextLine();
			if(capitalAnswer.equalsIgnoreCase(capital.get(generateNum))) {
				System.out.println("Correct!");
				totalCorrect++;
			} else {
				System.out.println("Incorrect.");
				System.out.println("The correct answer is " + capital.get(generateNum) + ".");
				totalIncorrect++;
			}
			System.out.println("\nContinue playing? Y or N");
			userSelection = input.nextLine();
			if(userSelection.equalsIgnoreCase("y") || userSelection.equalsIgnoreCase("yes")) {
				continue;
			} else {
				keepPlaying = false;
			}			
		}
		
		if(totalCorrect > rounds / 2) {
			System.out.println("\nGreat job!!!");
		} else {
			System.out.println("\nNice try. I hope you do better next time.");
		}
		System.out.println("\nTotal rounds: " + rounds);
		System.out.println("Total correct: " + totalCorrect);
		System.out.println("Total incorrect: " + totalIncorrect);

		input.close();
	}

}
