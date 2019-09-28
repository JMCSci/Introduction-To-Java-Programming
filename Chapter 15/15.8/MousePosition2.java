/* Chapter 15.8
 * Program displays the mouse position when the mouse is pressed
 * Position disappears when mouse is released
 */

package mousepostion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MousePosition2 extends Application {	
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		// Text object
		Text text = new Text();
		
		/* EVENT1: Display mouse coordinates when mouse is pressed */
		EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				text.setX(e.getX());
				text.setY(e.getY());
				text.setText("(" + text.getX()+ ", " + text.getY() + ")");
			}
			
		};
		
		/* EVENT 2: Removes mouse coordinates when mouse is released */
		EventHandler<MouseEvent> event2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				text.setText(" ");
			}
			
		};
		
		
		pane.setOnMousePressed(event1);
		pane.setOnMouseReleased(event2);
		
		pane.getChildren().add(text);
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		//primaryStage.initStyle(StageStyle.UNDECORATED);		// removes window bar on top
		primaryStage.setTitle("Mouse Position (2)");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

