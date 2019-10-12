/* Chapter 15.26
 * The program changes the balls opacity as it swings
 * When the user presses the mouse button the animation pauses
 * When the mouse button is released, the animation resumes
 */

package changeopacity;

import javafx.application.Application;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.FadeTransition;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ChangeOpacity extends Application {
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		// Create circle
		Circle circle = new Circle(100, 100, 20);
		circle.setFill(Color.BLUEVIOLET);
		
		// Create arc
		Arc arc = new Arc(145, 150, 100, 100, 197, 150);
		arc.setFill(Color.TRANSPARENT);
		arc.setStroke(Color.WHITE);
		
		// Create fade object
		// FromValue (opacity starts at 100%) and ToValue (opacity ends at 20%)
		FadeTransition fade = new FadeTransition(Duration.millis(3000), circle);
		fade.setFromValue(1.0);
		fade.setToValue(0.2);
		fade.setCycleCount(Timeline.INDEFINITE);
		fade.setAutoReverse(true);
		fade.play();
		
		// Create animation path
		PathTransition path = new PathTransition();
		path.setNode(circle);
		path.setPath(arc);
		path.setAutoReverse(true);
		path.setCycleCount(Timeline.INDEFINITE);
		// Slows down the animation by 50%
		path.setRate(0.50);
		path.play();
		
		/* EVENT: Animation pauses when mouse button is pressed */
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
		
		pane.setOnMousePressed(event1);
		pane.setOnMouseReleased(event2);
		
		pane.getChildren().addAll(arc, circle);
			
		Scene scene = new Scene(pane, 300, 300, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Change Opacity");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
