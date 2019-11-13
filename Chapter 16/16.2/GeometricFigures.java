/* Chapter 16.2
 * Program draws various geometric figures
 * User selects a figure from radio button and uses a check box to specify if it is filled
 */

package geometricfigures;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class GeometricFigures extends Application {
	public void start(Stage primaryStage) {
		// StackPane object to hold HBox and BorderPane
		StackPane root = new StackPane();
		// BorderPane object
		BorderPane bpane = new BorderPane();
		// HBox to hold RadioButtons and CheckBox
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10,10,10,10));
		hbox.setSpacing(10);
		bpane.setBottom(hbox);
		hbox.setStyle("-fx-border-color:black;");
		hbox.setAlignment(Pos.CENTER);
		// RadioButton objects
		RadioButton rb1 = new RadioButton("Circle");
		RadioButton rb2 = new RadioButton("Rectangle");
		RadioButton rb3 = new RadioButton("Ellipse");
		// ToggleGroup to group RadioButtons
		ToggleGroup group = new ToggleGroup();
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb3.setToggleGroup(group);
		// CheckBox object
		CheckBox cb = new CheckBox("Fill");
		// Shape objects (circle, rectangle, ellipse)
		Circle circle = new Circle(50);
		Rectangle rectangle = new Rectangle(100, 100);
		Ellipse ellipse = new Ellipse(50, 50, 75, 50);
		// Event handler for shapes when RadioButton is selected
		rb1.setOnAction(e -> {
			circle.setFill(Color.TRANSPARENT);
			circle.setStroke(Color.BLUE);
			bpane.setCenter(circle);	
		});
		rb2.setOnAction(e -> {
			rectangle.setFill(Color.TRANSPARENT);
			rectangle.setStroke(Color.BLUE);
			bpane.setCenter(rectangle);
		});
		rb3.setOnAction(e -> {
			ellipse.setFill(Color.TRANSPARENT);
			ellipse.setStroke(Color.BLUE);
			bpane.setCenter(ellipse);
		});
		// Event handlers for CheckBox (fill)
		cb.setOnAction(e -> {
			if(rb1.isSelected() && cb.isSelected() == true) {
				circle.setFill(Color.BLUE);
			}
			if(rb1.isSelected() && cb.isSelected() == false) {
				circle.setFill(Color.TRANSPARENT);
			}
			if(rb2.isSelected() && cb.isSelected() == true) {
				rectangle.setFill(Color.BLUE);
			}
			if(rb2.isSelected() && cb.isSelected() == false) {
				rectangle.setFill(Color.TRANSPARENT);
			}
			if(rb3.isSelected() && cb.isSelected() == true) {
				ellipse.setFill(Color.BLUE);
			}
			if(rb3.isSelected() && cb.isSelected() == false) {
				ellipse.setFill(Color.TRANSPARENT);
			}
			
		});
		// Add objects to ObservableList (HBox and StackPane)
		hbox.getChildren().addAll(rb1, rb2, rb3, cb);
		root.getChildren().addAll(bpane);
		// Add StackPane to scene
		Scene scene = new Scene(root, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Geometric Figures");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
