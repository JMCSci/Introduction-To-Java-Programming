/* Chapter 15.6
 * Program alternates between two messages with user clicks mouse button
 */

package alternatemessage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AlternateMessage extends Application {
	private int num = 0;
	
	public void start(Stage primaryStage) {
		// BorderPane object
		BorderPane pane = new BorderPane();
		// Text object
		Text text1 = new Text("Java is fun");
		
		// EVENT: Mouse clicked to alternate between messages using if-statement
		text1.setOnMouseClicked(e -> {
			if(num == 0) {
				text1.setText("");
				text1.setText("Java is powerful");
				num = 1;
			}
			else {
				text1.setText("");
				text1.setText("Java is fun");
				num = 0;
			}
		});
		
		pane.setCenter(text1);
		
		Scene scene = new Scene(pane, 300 ,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Alternate Message");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
