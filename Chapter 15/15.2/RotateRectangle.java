/* Chapter 15.2
 * Program rotates a rectangle 15 degrees when Rotate button is clicked
 */

package rotaterectangle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class RotateRectangle extends Application {
	double rotation;
	
	public void start(Stage primaryStage) {
		// Pane to place HBox and BorderPane
		StackPane root = new StackPane();
		
		// Pane for Text object
		Pane pane = new Pane();
		
		// Container for button BorderPane
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(0, 10, 10, 0));
		hbox.setAlignment(Pos.BOTTOM_CENTER);
		
		// BorderPane for rectangle and button
		BorderPane bPane = new BorderPane();
		BorderPane rPane = new BorderPane();
		
		// Text object
		Text t1 = new Text("Rotate the rectangle by clicking the Rotate button");
		t1.setLayoutX(50);
		t1.setLayoutY(50);
		pane.getChildren().add(t1);
		
		// Rectangle object
		Rectangle rectangle = new Rectangle(200, 100);
		rectangle.setStroke(Color.RED);
		rectangle.setFill(Color.TRANSPARENT);
		rPane.setCenter(rectangle);
		
		// Button object
		Button button = new Button("Rotate");
		bPane.setCenter(button);
		hbox.getChildren().add(button);
		
		// Lambda - Button event
		button.setOnMouseClicked(e -> {
			rotation = rectangle.getRotate();
			rectangle.setRotate(rotation - 15);
		});
		
		// StackPane 
		root.getChildren().addAll(bPane, rPane, pane, hbox);
		
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Rotate Rectangle");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
