/* Chapter 16.3
 * Program simulates a traffic lights
 * The program lets the user select one of three lights, red, yellow, or green
 * When radio button is selected the light turns on
 * Only one light can be on at a time
 */

package trafficlights;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TrafficLights extends Application {
	private Boolean redlight = false;
	private Boolean yellowlight = false;
	private Boolean greenlight = false;
	
	public void start(Stage primaryStage) {
		// Pane to hold rectangle
		Pane pane = new Pane();
		
		// BorderPane to hold HBox
		BorderPane bpane = new BorderPane();
		
		// StackPane to hold all panes
		StackPane root = new StackPane();
		
		// HBox to hold RadioButtons
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(12,12,12,12));
		hbox.setStyle("-fx-border-color:black;");
		hbox.setSpacing(20);
		hbox.setAlignment(Pos.BASELINE_CENTER);
		bpane.setBottom(hbox);
		
		// VBox to hold circle objects
		VBox vbox = new VBox();
		vbox.setSpacing(10);
		vbox.setAlignment(Pos.CENTER);
		
		// Create rectangle object for traffic signal
		Rectangle rectangle = new Rectangle(50, 180);
		rectangle.setFill(Color.TRANSPARENT);
		rectangle.setStroke(Color.BLACK);
		rectangle.setLayoutX(175);
		rectangle.setLayoutY(83);
		
		// Create circle object for red light
		Circle circle1 = new Circle(18);
		circle1.setFill(Color.TRANSPARENT);
		circle1.setStroke(Color.BLACK);
		// Create circle object for yellow light
		Circle circle2 = new Circle(18);
		circle2.setFill(Color.TRANSPARENT);
		circle2.setStroke(Color.BLACK);
		// Create circle object for green light
		Circle circle3 = new Circle(18);
		circle3.setFill(Color.TRANSPARENT);
		circle3.setStroke(Color.BLACK);
		
		// Create RadioButton objects 
		RadioButton rb1 = new RadioButton("Red");
		RadioButton rb2 = new RadioButton("Yellow");
		RadioButton rb3 = new RadioButton("Green");
		
		// Create ToggleGroup for radio button objects
		ToggleGroup group = new ToggleGroup();
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb3.setToggleGroup(group);
		
		/*  EVENT: Checks if other two lights are on
		 *  If they are, lights are made transparent 
		 *  If not, light is filled 
		 */
		rb1.setOnAction(e -> {
			if(yellowlight == false || greenlight == false) {
				if(yellowlight == true || greenlight == true) {
					circle2.setFill(Color.TRANSPARENT);
					circle3.setFill(Color.TRANSPARENT);
					yellowlight = false;
					greenlight = false;
				}
				circle1.setFill(Color.RED);
				redlight = true;
			}
		});
		
		rb2.setOnAction(e -> {
			if(redlight == false || greenlight == false) {
				if(redlight == true || greenlight == true) {
					circle1.setFill(Color.TRANSPARENT);
					circle3.setFill(Color.TRANSPARENT);
					redlight = false;
					greenlight = false;
				}
				circle2.setFill(Color.YELLOW);
				yellowlight = true;
			}
			
		});
		
		rb3.setOnAction(e -> {
			if(redlight == false || yellowlight == false) {
				if(redlight == true || yellowlight == true) {
					circle1.setFill(Color.TRANSPARENT);
					circle2.setFill(Color.TRANSPARENT);
					redlight = false;
					yellowlight = false;
				}
				circle3.setFill(Color.GREEN);
				greenlight = true;
			}
		});

		// Add objects to panes
		hbox.getChildren().addAll(rb1, rb2, rb3);
		vbox.getChildren().addAll(circle1, circle2, circle3);
		pane.getChildren().add(rectangle);

		// Add panes to StackPane
		root.getChildren().addAll(vbox, pane, bpane);
		root.setStyle("-fx-background-color:white;");
		
		// Create scene
		Scene scene = new Scene(root, 400, 350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Traffic Light");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
