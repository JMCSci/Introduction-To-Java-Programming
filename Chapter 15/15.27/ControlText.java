/* Chapter 15.27
 * Program moves text from left to right circularly
 * When it disappears to the right, it reappears from the left
 * Text freezes when the mouse button is pressed and resumes when it is released 
 */

package conroltext;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.shape.Arc;
import javafx.scene.paint.Color;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ControlText extends Application {
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		// Create text object
		Text text = new Text();
		text.setText("Programming is fun");
		text.setFill(Color.BLUE);
		text.setFont(new Font(20));
		// Create arc -- used for animation 
		Arc arc = new Arc(250, 165, 140, 140, 170, 200);
		arc.setStroke(Color.TRANSPARENT);
		arc.setFill(Color.TRANSPARENT);
		// Create text path (arc)
		PathTransition path = new PathTransition();
		path.setNode(text);
		path.setCycleCount(Timeline.INDEFINITE);
		path.setRate(0.10);
		path.setPath(arc);
		path.play();
		
		/* EVENT: Pauses animation when mouse button is pressed */
		EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				path.pause();
			}
		};
		
		/* EVENT: Animation resumes when mouse button is released */
		EventHandler<MouseEvent> event2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				path.play();
			}
		};
		
		// Activate events over pane
		pane.setOnMousePressed(event1);
		pane.setOnMouseReleased(event2);
		// Add objects to pane
		pane.getChildren().addAll(text, arc);
		// Create scene
		Scene scene = new Scene(pane, 500, 325, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Control Text");
		primaryStage.setResizable(false);
		primaryStage.show();		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
