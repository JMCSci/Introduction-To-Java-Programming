/* Chapter 16.2
 * Program draws various geometric figures
 * User selects a figure from a radio button and uses a check box to specify if it is filled
 */

package geometricfigures;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
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
		StackPane root = new StackPane();
		
		BorderPane bpane = new BorderPane();
		
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10,10,10,10));
		hbox.setSpacing(10);
		bpane.setBottom(hbox);
		hbox.setStyle("-fx-border-color:red;");
		hbox.setAlignment(Pos.CENTER);
		
		RadioButton rb1 = new RadioButton("Circle");
		RadioButton rb2 = new RadioButton("Rectangle");
		RadioButton rb3 = new RadioButton("Ellipse");
		
		ToggleGroup group = new ToggleGroup();
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb3.setToggleGroup(group);
		
		CheckBox cb = new CheckBox("Fill");
		
		Circle circle = new Circle(50);
		
		rb1.setOnAction(e -> {
			circle.setFill(Color.TRANSPARENT);
			circle.setStroke(Color.BLUE);
			bpane.setCenter(circle);	
		});
		
		rb2.setOnAction(e -> {
			Rectangle rectangle = new Rectangle(100, 100);
			rectangle.setFill(Color.TRANSPARENT);
			rectangle.setStroke(Color.BLUE);
			bpane.setCenter(rectangle);
		});
		
		rb3.setOnAction(e -> {
			Ellipse ellipse = new Ellipse(50, 50, 75, 50);
			ellipse.setFill(Color.TRANSPARENT);
			ellipse.setStroke(Color.BLUE);
			bpane.setCenter(ellipse);
		});
		
		cb.setOnAction(e -> {
			if(rb1.isSelected() && cb.isSelected() == true) {
				circle.setFill(Color.BLUE);
			}
			if(rb1.isSelected() && cb.isSelected() == false) {
				circle.setFill(Color.TRANSPARENT);
			}
		});
		
		
		hbox.getChildren().addAll(rb1, rb2, rb3, cb);
		root.getChildren().addAll(bpane);
		
		Scene scene = new Scene(root, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
