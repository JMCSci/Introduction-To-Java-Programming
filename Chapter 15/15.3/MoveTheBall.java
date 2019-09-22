/* Chapter 15.3 
 * Program allows user to move a ball within the bounds of a window pane
 * Buttons Left, Right, Up, Down
 */

package movetheball;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MoveTheBall extends Application {
	double circleX;								                          	// used to hold x-coordinate of circle
	double circleY;								                	          // used to hold y-coordinate of circle
	
	public void start(Stage primaryStage) {
		// StackPane to hold all panes
		StackPane root = new StackPane();
		// Pane for circle
		Pane pane = new Pane();
		
		// GridPane to hold buttons
		GridPane grid = new GridPane();
		grid.setHgap(1);
		grid.setVgap(1);
		
		// Create circle object
		Circle ball = new Circle(25, 25, 25);
		ball.setStroke(Color.BLUE);
		ball.setFill(Color.BLUE);
		ball.setLayoutX(220);
		ball.setLayoutY(65);
		pane.getChildren().add(ball);
		
		// Create buttons
		Button leftButton = new Button("Left");
		Button rightButton = new Button("Right");
		Button upButton = new Button("Up");
		Button downButton = new Button("Down");
		grid.add(leftButton, 130, 170);
		grid.add(rightButton, 140, 170);
		grid.add(upButton, 150, 170);
		grid.add(downButton, 160, 170);
		
		// Text object if ball is moved out of bounds
		Text text = new Text();
		text.setLayoutX(50);
		text.setLayoutY(45);
		
		// Lambda -- move ball left event
		leftButton.setOnMouseClicked(e -> {
			circleX = ball.getLayoutX();
			if(circleX > 10) {
				ball.setLayoutX(circleX - 5);
				text.setText("");
			}
			else {
				// Print in pane
				text.setText("Ball cannot be moved out of bounds");
				
			}
			 
		});
		
		// Lambda -- move ball right event
		rightButton.setOnMouseClicked(e -> {
			circleX = ball.getLayoutX();
			if(circleX <= 435) {
				circleX = ball.getLayoutX();
				ball.setLayoutX(circleX + 5);
				text.setText("");
			}
			else {
				// Print in pane
				text.setText("Ball cannot be moved out of bounds");
			}
		});
		
		// Lambda -- move ball up event
		upButton.setOnMouseClicked(e -> {
			circleY = ball.getLayoutY();
			if(circleY > 10) {
				circleY = ball.getLayoutY();
				ball.setLayoutY(circleY - 5);
				text.setText("");
			}
			else {
				// Print in pane
				text.setText("Ball cannot be moved out of bounds");
			}
			
		});
		
		// Lambda -- move ball down event
		downButton.setOnMouseClicked(e -> {
			if(circleY < 140) {
				circleY = ball.getLayoutY();
				ball.setLayoutY(circleY + 5);
				text.setText("");
			}
			else {
				// Print in pane
				text.setText("Ball cannot be moved out of bounds");
			}
		});
		
		root.getChildren().addAll(pane, text, grid);
		
		Scene scene = new Scene(root, 500, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Move Ball");
		primaryStage.setResizable(false);
		primaryStage.show();

	}
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
