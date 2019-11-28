/* Chapter 16.12
 * Program demonstrates the properties of a text area. 
 * Program uses a check box to indicate whether the text is wrapped onto next line
 */

package demotextarea;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DemoTextArea extends Application {
	public void start(Stage primaryStage) {
		// Create TextPane object to access TextPane class
		TextPane tpane = new TextPane();
		
		// Create BorderPane 
		BorderPane bpane = new BorderPane();
		bpane.setCenter(tpane.getPane());
				
		// Create new Scene
		Scene scene = new Scene(bpane, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Demo TextArea");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
