/* Chapter 15.24
 * Program animates a palindrome swing. 
 * When mouse button is pressed, animation pauses
 * When mouse button is released, animation resumes
 */

package animateswing;

import javafx.application.Application;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;


public class AnimateSwing extends Application {
	public void start(Stage primaryStage) {
		// Create pane
		Pane pane = new Pane();
		
		// Create path using arc class
		Arc arc = new Arc(150, 125, 150, 150, 220, 100);
		arc.setType(ArcType.OPEN);
		arc.setFill(Color.TRANSPARENT);
		arc.setStroke(Color.BLACK);
		
		// Create circle
		Circle circle = new Circle(100, 100, 20);
		circle.setFill(Color.BLUE);

		pane.getChildren().addAll(arc, circle);
				
		// Create path transition
		PathTransition path = new PathTransition();
		// Path of ball (arc)
		path.setPath(arc);
		// Object to be animated (circle)
		path.setNode(circle);
		// Duration of animation
		path.setCycleCount(Timeline.INDEFINITE);
		path.setAutoReverse(true);
		path.play();
		
		/* EVENT: Animation pauses when mouse pressed */
		EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				if(e.getButton().equals(MouseButton.PRIMARY)) {
					path.pause();
				}	
			}
		};
		
		/* EVENT: Animation resumes when mouse is released */
		EventHandler<MouseEvent> event2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				if(e.getButton().equals(MouseButton.PRIMARY)) {
					path.play();
				}
			}
		};
		
		pane.setOnMousePressed(event1);
		pane.setOnMouseReleased(event2);
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Animate Swing");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
