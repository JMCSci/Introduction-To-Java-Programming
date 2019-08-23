/* Chapter 14.3
 * Display three cards from a deck of 54 cards (52 including two Jokers) 
 * All three cards are distinct and selected randomly
 */

package threecards;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ThreeCards extends Application {
	@Override
	public void start(Stage primaryStage) {
		ArrayList<Integer> num = new ArrayList<>();
		String card1, card2, card3;									
		insertNumbers(num);		
		shuffleArray(num);
		card1 = Integer.toString(num.get(0));				    // Changes integer to a String
		card2 = Integer.toString(num.get(1));			            // Changes integer to a String
		card3 = Integer.toString(num.get(2));			            // Changes integer to a String
		
		Pane pane = new HBox(5);					    // Image spacing
		pane.setPadding(new Insets(10,10,10,10));			    // Spacing around pane
		
		Image image1 = new Image("file:Cards/" + card1 + ".png"); 	    // Uses String variable a for numbered file name
		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitHeight(175);
		imageView1.setFitWidth(125);
		pane.getChildren().add(imageView1);		 		    // Adds image to pane
		
		Image image2 = new Image("file:Cards/" + card2 + ".png"); 	    // Uses String variable a for numbered file name
		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(175);
		imageView2.setFitWidth(125);
		pane.getChildren().add(imageView2);				   // Adds image to pane

		Image image3 = new Image("file:Cards/" + card3 + ".png");	   // Uses String variable a for numbered file name
		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(175);
		imageView3.setFitWidth(125);	
		pane.getChildren().add(imageView3);			 	   // Adds image to pane
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Three Cards");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	/* Method: addNumbers inserts numbers 1-54 into ArrayList */
	public static void insertNumbers(ArrayList<Integer> num) {
		for(int i = 1; i <= 54; i++) {
			num.add(i);
		}
	}
	
	/* Method: shuffleArray shuffles numbers in ArrayList */
	public static void shuffleArray(ArrayList<Integer> num) {
		java.util.Collections.shuffle(num);	
	}

}
