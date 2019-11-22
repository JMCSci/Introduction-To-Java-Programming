/* Chapter 16.11
 * Program displays a histogram to show occurrences of each letter in a file
 * File name entered in a text field 
 * Pressing ENTER key in text field causes program to start
 * File is processed and histogram is displayed in center of window
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
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;


/* 
 * NOTES:
 * BorderPane center will hold histogram Pane
 * BorderPane bottom will hold HBox 
 * HBox will hold TextField, Label, Button
 * 
 * Create EVENTS for text field and button
 */

public class LetterHistogram extends Application {
	public void start(Stage primaryStage) throws Exception {
		BorderPane bpane = new BorderPane();
		
		Counts counts = new Counts();
		
		HBox hbox = new HBox();
		hbox.setSpacing(2);
		hbox.setPadding(new Insets(0,0,2,0));
		
		Label lb1 = new Label("Filename");
		
		TextField tf = new TextField();
		tf.setPrefWidth(325);
		
		Button b1 = new Button("View");
		
		hbox.getChildren().addAll(lb1, tf, b1);
		bpane.setCenter(counts.getPane());
		bpane.setBottom(hbox);
		
		Scene scene = new Scene(bpane, 435, 350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Letter Frequency Histogram");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
