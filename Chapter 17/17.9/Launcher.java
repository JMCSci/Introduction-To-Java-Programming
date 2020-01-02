/* Chapter 17.9
 * GUI application
 * Program stores, retrieves, adds, and updates addresses in an address book
 * Uses I/O streams to handle data input and output (Random Access Files)
 */

package addressbook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class Launcher extends Application {
	public void start(Stage primaryStage) {
		// StackPane used so everything stays centered
		StackPane root = new StackPane();
		
		root.getChildren().add(Display.getPane());
		
		Scene scene = new Scene(root, 570, 165);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Address Book");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}
