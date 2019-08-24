/* Chapter 14.4
 * Program displays text vertically 
 * Color and opacity of text is set randomly in code 
 */

package colorandfont;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorAndFont extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new HBox(15);
		pane.setPadding(new Insets(35,10,10,10));
		
		Text text1 = new Text();		                      	// no argument 
		text1.setText("JAVA");	
		text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		text1.setRotate(90);
		text1.setFill(Color.RED);
		pane.getChildren().add(text1);
		
		Text text2 = new Text("JAVA");	                  	// add text as constructor argument
		text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		text2.setRotate(90);
		text2.setFill(Color.BLUE);
		text2.setOpacity(0.75);				                      // opacity is from 0.00 to 1.00
		pane.getChildren().add(text2);
		
		Text text3 = new Text("JAVA");
		text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		text3.setRotate(90);
		text3.setFill(Color.DARKGREEN);
		text3.setOpacity(0.50);						
		pane.getChildren().add(text3);
		
		Text text4 = new Text("JAVA");
		text4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		text4.setRotate(90);
		text4.setFill(Color.ORANGE);
		text4.setOpacity(1.00);
		pane.getChildren().add(text4);
		
		Text text5 = new Text("JAVA");
		text5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		text5.setRotate(90);
		text5.setFill(Color.MAGENTA);
		pane.getChildren().add(text5);
		
		
		Scene scene = new Scene(pane, 350, 100);						// create scene and window size
		primaryStage.setTitle("Color and Font");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
