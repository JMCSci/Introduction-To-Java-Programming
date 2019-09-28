/* Chapter 15.8
 * Program displays the mouse position when the mouse is clicked
 */

package mousepostion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MousePosition1 extends Application {	
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		// Text object
		Text text = new Text();
		
		/* EVENT: Display mouse coordinates when mouse is clicked */
		EventHandler<MouseEvent> event = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				text.setX(e.getX());
				text.setY(e.getY());
				text.setText("(" + text.getX()+ ", " + text.getY() + ")");
			}
			
		};
		
		pane.setOnMouseClicked(event);
		
		pane.getChildren().add(text);
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Mouse Position (1)");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
