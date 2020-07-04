/* Chapter 21.9 */

package guesscapitals;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;

public class GuessCapitals {
	public static void main(String[] args) throws Exception {
		TreeMap<String, String> map = new TreeMap<>();
		readHTML(map);
		guessCapitals(map);
	}
	
	// readHTML: Gets states and capitals from Wikipedia and stores them in a TreeMap
	public static void readHTML(TreeMap<String, String >map) throws Exception {
		String wikipedia = "https://en.wikipedia.org/wiki/List_of_capitals_in_the_United_States";
		String line = "";
		String state = "";
		String capital = "";
		URL url = new URL(wikipedia);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.getContent();
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		while((line = reader.readLine()) != null) {
			// reader each line 
			if(line.contains("</a></b> <a href=\"/wiki/")) {
				if(line.contains("D.C.")) {
					continue;	
				} else {
					// Get state
					String delimeter1 = "a href=\"/wiki/";
					String delimeter2 = "\"";
					String [] tokens1 = line.split(delimeter1);
					String [] tokens2 = tokens1[1].split(delimeter2);
					state = tokens2[0].toUpperCase();
					if(state.contains("_")) {
						state = tokens2[0].replace("_", " ");
					}
					if(state.contains("(")) {
						state = state.replaceAll("\\(.*\\)", ""); 
					}
					if(state.endsWith(" ")) {
						state = state.substring(0, state.length() - 1);
					}
					// Get city
					String delimiter3 = ">";
					String delimiter4 = "<";
					
					String [] tokens3 = tokens1[2].split(delimiter3);
					String [] tokens4 = tokens3[1].split(delimiter4);
					capital = tokens4[0];
					if(capital.endsWith(" ")) {
						capital = capital.substring(0, capital.length() - 1);
					}
					// Add state, capital pairs in TreeMap
					map.put(state, capital);
				}
			}
			if(line.contains("Territories:")) {
				break;
			}
		}
		reader.close();
	}
	
	public static void guessCapitals(TreeMap<String, String> map) {
		Scanner sc = new Scanner(System.in);
		String enterState = "";
		String selection = "";
		boolean playAgain = true;

		while(playAgain) {
			System.out.print("Enter a state: ");
			enterState = sc.nextLine();
			enterState = enterState.toUpperCase();
			if(map.get(enterState) != null) { 
			System.out.println("The capital of " + enterState + " is " + map.get(enterState));
			} else {
				System.out.println("State does not exist");
				continue;
			}
			System.out.print("Do you want to play again? Enter Yes or No? ");
			selection = sc.next();
			selection = selection.toUpperCase();
			if(selection.matches("YES") || selection.matches("Y")) {
				playAgain = true;
			} else {
				playAgain = false;
			}
			sc.nextLine();
		}
		System.out.println("Goodbye");
		sc.close();	
		}
	
}