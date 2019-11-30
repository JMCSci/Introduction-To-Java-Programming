/* Chapter 16.14
 * Program dynamically changes the font of a text in a label displayed in StackPane
 * Text can be displayed in bold and italic at the same time
 * User can select the font name or font size from combo boxes
 * Font size is initialized with numbers from 1 to 100
 */

package dynamicfont;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DynamicFont extends Application {
	public void start(Stage primaryStage) {
		// Create BorderPane object
		BorderPane bpane = new BorderPane();
		
		// Create FontGUI object
		FontGUI fontgui = new FontGUI();
		
		// Set pane (from FontGUI class) to center of BorderPane
		bpane.setCenter(fontgui.getPane());
		
		// Create a new Scene
		Scene scene = new Scene(bpane, 800, 200);
		primaryStage.setTitle("Dynamic Font");
		primaryStage.setScene(scene);
		primaryStage.setResizable(true);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
