/* Chapter 16.11
 * Program displays a histogram to show occurrences of each letter in a file
 * File name entered in a text field 
 * Pressing VIEW button causes program to start
 * File is processed and histogram is displayed in center of window
 * Shows how to create a GUI in another class and send pane to main method
 */

/* INSTRUCTIONS
 * Define a class named Histogram that extends Pane
 * The class contains the property counts that is an array of 26 elements
 * counts[0] stores the number of A, counts[1] the number of B and so on
 * Class contains a setter method for setting a new counts and displaying the histogram for new counts
 * 
 */

package letterhistogram;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;


/* 
 * NOTES:
 * BorderPane center will hold histogram Pane
 * BorderPane bottom will hold HBox 
 * HBox will hold TextField, Label, Button
 */

public class LetterHistogram extends Application {
	public void start(Stage primaryStage) throws Exception {
		BorderPane bpane = new BorderPane();
		
		// Create counts object
		Counts counts = new Counts();
	
		// Set BorderPane center with pane created in Counts class
		bpane.setCenter(counts.getPane());
		
		// Create a new scene
		Scene scene = new Scene(bpane, 435, 350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Letter Frequency Histogram");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
