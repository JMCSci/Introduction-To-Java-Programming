/* Chapter 16.6
 * Program allows user to select countries from a list
 * User given option to select SINGLE and MULTIPLE countries from ListView
 * Selection is display in bottom of window
 * Program could have been written in a single class
 */

package selectlist;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SelectList extends Application {
	public void start(Stage primaryStage) {
		// Create BorderPane
		BorderPane bpane = new BorderPane();
		
		// Create ListGUI object
		ListGUI lgui = new ListGUI();
		
		// Add pane to BorderPane
		bpane.setCenter(lgui.getPane());
		
		// Create scene
		Scene scene = new Scene(bpane, 380, 150);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Various Countries");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
