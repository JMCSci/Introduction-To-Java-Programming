/* Chapter 15.10
 * Program receives a string from keyboard and displays it in a pane
 * Enter key signals the end of a string
 * Whenever a new string is entered, it is displayed on the pane
 * ADDED CONSTRAINT: String length MUST be less than 38
 */

package displaystring;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayString extends Application {
	public String userInput = null;							
	public final int MAXSTRING = 38;					                                		// String length constant
	
	public void start(Stage primaryStage) {
		// Create pane objects
		BorderPane bPane = new BorderPane();
		Pane pane1 = new Pane();
		Pane pane2 = new Pane();
		StackPane root = new StackPane();
	
		// Create TextField object
		TextField tf = new TextField();
		tf.setMaxWidth(200);
		
		// Create Text object
		// User created string
		Text text1 = new Text();
		text1.setLayoutX(90);
		text1.setLayoutY(250);
		
		// Create second Text object
		// Displays string length constraint
		Text text2 = new Text();
		text2.setLayoutX(95);
		text2.setLayoutY(250);
		text2.setFill(Color.RED);
		
		/* EVENT: Displays user entered string when ENTER is pressed*/
		tf.setOnKeyPressed(e -> {
			if(e.getCode().equals(KeyCode.ENTER)) {
				text1.setText("");
				text2.setText("");
				userInput = tf.getText();
				if(userInput.length() > MAXSTRING) {
					text1.setText("");
					text2.setText("String length must be less than 38");
				} else {
				text1.setText("");
				text2.setText("");
				text1.setText(userInput);
				}
			}
			
		});
		
		// Move BorderPane (TextField) to center of pane
		bPane.setCenter(tf);
		// Add text objects to pane
		pane1.getChildren().addAll(text1, text2);
		// Add panes to StackPane
		root.getChildren().addAll(pane1, pane2, bPane);
				
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Display String");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}

