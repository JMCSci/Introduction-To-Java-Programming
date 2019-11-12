/* Chapter 16.1 
 * Program uses buttons to move message to the left and right 
 * Radio buttons are used to change the color of the message
 */

package radiobuttons;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.geometry.Pos;

public class RadioButtons extends Application {
	double x = 0;
	public void start(Stage primaryStage) {
		BorderPane bpane = new BorderPane();
		
		Pane pane = new Pane();
		
		Text text = new Text("Programming is fun");
		text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
		text.setX(95);
		text.setY(60);
		
		HBox hbox1 = new HBox();
		hbox1.setPadding(new Insets(10,10,10,10));
		hbox1.setSpacing(10);
		
		HBox hbox2 = new HBox();
		hbox2.setPadding(new Insets(10, 10, 10, 10));
		hbox2.setSpacing(10);

		Button left = new Button("<=");
		Button right = new Button("=>");
		
		RadioButton rbutton1 = new RadioButton("Red");
		RadioButton rbutton2 = new RadioButton("Orange");
		RadioButton rbutton3 = new RadioButton("Blue");
		RadioButton rbutton4 = new RadioButton("Black");
		RadioButton rbutton5 = new RadioButton("Green");

		ToggleGroup group = new ToggleGroup();
		rbutton1.setToggleGroup(group);
		rbutton2.setToggleGroup(group);
		rbutton3.setToggleGroup(group);
		rbutton4.setToggleGroup(group);
		rbutton5.setToggleGroup(group);
		
		pane.getChildren().add(text);
		hbox1.getChildren().addAll(left, right);
		hbox1.setAlignment(Pos.BASELINE_CENTER);
		hbox2.getChildren().addAll(rbutton1, rbutton2, rbutton3, rbutton4, rbutton5);
		hbox2.setAlignment(Pos.TOP_CENTER);
		
		rbutton1.setOnAction(e -> {
			text.setFill(Color.RED);
		});
		
		rbutton2.setOnAction(e -> {
			text.setFill(Color.ORANGE);
		});
		
		rbutton3.setOnAction(e -> {
			text.setFill(Color.BLUE);
		});
		
		rbutton4.setOnAction(e -> {
			text.setFill(Color.BLACK);
		});
		
		rbutton5.setOnAction(e -> {
			text.setFill(Color.GREEN);
		});
		
		EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				x = text.getX();
				if(x >= 10) {
					text.setX(x - 10);
				}
				
			}
		};
		
		EventHandler<MouseEvent> event2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				x = text.getX();
				if(x <= 180) {
					text.setX(x + 10);
				}
			}
		};
		
		left.setOnMouseClicked(event1);
		right.setOnMouseClicked(event2);
		
		bpane.setBottom(hbox1);
		bpane.setTop(hbox2);
		bpane.setCenter(pane);
		pane.setStyle("-fx-border-color: black;");
		hbox1.setStyle("-fx-border-color: black;");
		hbox2.setStyle("-fx-border-color: black;");

		Scene scene = new Scene(bpane, 405, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
