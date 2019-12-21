/* Chapter 16.17
 * Program uses ScrollBar to select color for text
 * SliderGUI class contains GUI and event handling
 */

package dynamictext;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DynamicText extends Application {
	public void start(Stage primaryStage) {
		// Create SliderGUI object
		SliderGUI sliderGUI = new SliderGUI();
		
		// Create pane to hold SliderGUI pane
		Pane pane = new Pane();
		pane.getChildren().add(sliderGUI.getPane());
		
		// Create scene
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setTitle("Dynamic Text");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
