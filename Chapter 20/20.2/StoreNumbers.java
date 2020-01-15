/* Chapter 20.2
 * Program lets the user enter numbers from a GUI and displays them in a text area
 * A linked list is used to store the numbers
 * Do not store duplicate numbers 
 * Add buttons Sort, Shuffle, and Reverse to sort, shuffle and reverse the list
 */

package storenumbers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class StoreNumbers extends Application{
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		pane.getChildren().add(Display.getPane());
	
		Scene scene = new Scene(pane, 402, 137);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Store Numbers");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String []args) {
		Application.launch(args);
	}

}
