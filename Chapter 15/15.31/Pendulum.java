/* Chapter 15.31
 * Program animates a pendulum swinging
 * Pressing UP increases the speed; DOWN key to decrease it
 * S key to stop animation; R key to resume animation
 */

package pendulum;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;							
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Pendulum extends Application {
	private double maxRate = 0.50;					                      // Set default pendulum speed 
	private double rate = 0;
	
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		// Line object - rod
		Line rod = new Line();
		rod.setStroke(Color.BLUE);
		// Circle object - pivot
		Circle pivot = new Circle(250, 50, 6);
		pivot.setFill(Color.BLUE);
		// Circle object - bob
		Circle bob = new Circle(15);
		bob.setFill(Color.BLUE);
		
		// Connects top of rod to center of pivot (x-coordinate)
		rod.startXProperty().bind(pivot.centerXProperty());
		// Connects top of rod to center of pivot (y-coordinate)
		rod.startYProperty().bind(pivot.centerYProperty());
		// Connects bottom of rod to center of bob (x-coordinate)
		rod.endXProperty().bind(bob.translateXProperty());
		// Connects bottom of rod to center of bob (y-coordinate)
		rod.endYProperty().bind(bob.translateYProperty());
			
		// Arc object - trajectory
		Arc trajectory = new Arc(250, 160, 240, 250, 230, 80);
		
		// Animation Path - uses arc trajectory
		PathTransition path1 = new PathTransition();
		path1.setPath(trajectory);
		path1.setNode(bob);
		path1.setAutoReverse(true);
		path1.setCycleCount(Timeline.INDEFINITE);
		path1.setRate(maxRate);
		path1.play();
		
		/* EVENT: Allows user to increase and decrease speed
		 * Also, allows user to stop and resume animation
		 */
		EventHandler<KeyEvent> event = new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent e) {
				rate = path1.getRate();
				
				switch (e.getCode()) {
					case UP:  		if(rate >= maxRate) {
					 				break;
								    } else {
								    	path1.setRate(rate + 0.05);
								    }
									break;
					case DOWN: 	    if(rate == 0) {
									break;
									} else {
										path1.setRate(rate - 0.05);
									}
							        break;
					case S:    	    path1.pause();
							        break;
					case R:    	    path1.play();
								    break;
					default:		break;
				}
			}
		};
		
		pane.setOnKeyPressed(event);
		pane.getChildren().addAll(pivot, bob, rod);
		
		Scene scene = new Scene(pane, 500, 500, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pendulum");
		primaryStage.setResizable(false);
		primaryStage.show();
		/* Since bob node animates and rod node binds to it, 
		 * focus tells the program that bob node must receive input focus for event handler
		 */
		bob.requestFocus();
	}
	
	public static void main(String[] args) {
		Application.launch(args);	
	}
}
