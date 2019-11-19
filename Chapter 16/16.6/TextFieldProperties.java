/* Chapter 16.6
 * Program sets horizontal alignment and column-size properties of a text field dynamically
 */

package textfieldproperties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class TextFieldProperties extends Application {
	String temp = null;
	
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		// Create HBox for RadioButtons
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10, 10, 10, 10));
		hbox.setSpacing(5);
		hbox.setLayoutY(25);

		// Create Lebel objects
		Label lb1 = new Label("Text Field");
		lb1.setLayoutX(60);
		Label lb2 = new Label("Column Size");
		lb2.setLayoutX(225);
		lb2.setLayoutY(30);
		
		// Create TextField objects
		TextField tf1 = new TextField();
		tf1.setPrefWidth(175);
		tf1.setLayoutX(130);
		TextField tf2 = new TextField();
		tf2.setLayoutX(305);
		tf2.setLayoutY(30);
		tf2.setPrefWidth(50);
		
		// Create RadioButton objects
		RadioButton rb1 = new RadioButton("Left");
		RadioButton rb2 = new RadioButton("Center");
		RadioButton rb3 = new RadioButton("Right");
		
		// Create ToggleGroup object for RadioButtons
		ToggleGroup group = new ToggleGroup();
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb3.setToggleGroup(group);
		
		/* EVENT: Column Size */
		tf2.setOnAction(e -> {
			int columnSize = 0;
			temp = tf2.getText();
			columnSize = Integer.parseInt(temp);
			tf1.setPrefColumnCount(columnSize);
		});
		/* EVENT: Text alignment - LEFT */
		rb1.setOnAction(e -> {
			tf1.setAlignment(Pos.BOTTOM_LEFT);
		});
		/* EVENT: Text alignment - CENTER */
		rb2.setOnAction(e -> {
			tf1.setAlignment(Pos.CENTER);
		});
		/* EVENT: Text alignment - RIGHT */
		rb3.setOnAction(e -> {
			tf1.setAlignment(Pos.BOTTOM_RIGHT);
		});
		
		// Add RadioButtons to HBox
		hbox.getChildren().addAll(rb1, rb2, rb3);
		// Add Label, TextField and HBox to Pane
		pane.getChildren().addAll(lb1, lb2, tf1, tf2, hbox);

		// Create scene
		Scene scene = new Scene(pane, 365, 60);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TextField Properties");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
