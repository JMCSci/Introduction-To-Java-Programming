/* Chapter 16.10
 * Program displays a text file in a text area. 
 * User enters file name in a text field and clicks the View button 
 * The file is then displayed in a text area
 */

package textviewer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TextViewer extends Application {
	String filename = null;
	
	public void start(Stage primaryStage) throws Exception {
		// Create StackPane object
		StackPane root = new StackPane();
		
		// Create BorderPane object
		BorderPane bpane = new BorderPane();
		
		// Create ScrollPane object
		ScrollPane scroll = new ScrollPane();
		
		// Create HBox to hold Label, TextField and Button objects
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.BASELINE_RIGHT);
		
		// Create TextArea object
		TextArea ta = new TextArea();
		ta.setPrefHeight(300);
		ta.setWrapText(true);
		ta.setEditable(false);
		
		// Create Label object -- Filename
		Label lb1 = new Label("Filename");
		lb1.setAlignment(Pos.BASELINE_LEFT);
		
		// Create Label object -- File not found
		Label lb2 = new Label("File not found");
		
		// Create TextField object
		TextField tf = new TextField();
		tf.setPrefWidth(425);
		
		// Create Button object
		Button b1 = new Button("View");
		
		/* EVENT: View button 
		 * Displays text file in TextArea
		 * ta.clear() clears the text area before displaying text; 
		 */ 
		b1.setOnMouseClicked(e -> {
			ta.clear();
			filename = tf.getText();
			try {
				Scanner sc = new Scanner(new File(filename));
				while(sc.hasNextLine()) {
					// newLine used for line breaks
					// appendText allows next token to be added to existing string
					ta.appendText(sc.nextLine() + "\n");
				}
				sc.close();
			} catch (FileNotFoundException ex) {
				// Displays "File not found" in text area
				scroll.setContent(lb2);
			}
		});		
		
		// Add label, textfield and button to HBox
		hbox.getChildren().addAll(lb1, tf, b1);
		// Add text area to ScrollPane
		scroll.setContent(ta);
		// Add ScrollPane to center of BorderPane
		bpane.setCenter(scroll);
		// Add HBox to bottom of BorderPane
		bpane.setBottom(hbox);
		// Add BorderPane to StackPane
		root.getChildren().add(bpane);
	
		// Create scene
		Scene scene = new Scene(root, 530, 300);
		primaryStage.setTitle("Text Viewer");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
