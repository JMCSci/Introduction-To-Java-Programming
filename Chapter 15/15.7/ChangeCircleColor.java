/* Chapter 15.7 
 * Program allows user to change the color of circle
 * Color of circle is black when mouse button is pressed
 * Color of circle is white when mouse button is released 
 */

package changecirclecolor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class ChangeCircleColor extends Application {
	private int num = 0;
	
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		
		// Default circle object
		Circle circle = new Circle(100, 100, 100);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		/* EVENT: Mouse button held 
		 * Circle turns black
		 */
		EventHandler <MouseEvent> event1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				if(num == 0) {
					circle.setFill(Color.BLACK);
					num = 1;
				}
			}
			
		};
		
		/* EVENT: Mouse button released 
		 * Circle turns white
		 */
		EventHandler <MouseEvent> event2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				if(num == 1) {
					circle.setFill(Color.WHITE);
					num = 0;	
				}
			}
		};
		
		circle.setOnMousePressed(event1);
		circle.setOnMouseReleased(event2);
		
		pane.setCenter(circle);
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Change Color of Circle");
		primaryStage.show();	
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
