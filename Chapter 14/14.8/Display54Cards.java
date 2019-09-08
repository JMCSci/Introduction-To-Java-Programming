/* Chapter 14.8
 * Display all 54 cards in a deck of cards
 * 6 X 9 matrix
 * 9 cards per row
 */

package display54cards;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.scene.image.Image;

public class Display54Cards extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setVgap(1.0);
		pane.setHgap(1.0);
		pane.setPadding(new Insets(1,1,1,1));
		// iterate through grid while adding cards 
		String cardNum = null;
		int counter = 1;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 9; j++) {
				// beginning of loop converts number into a string for filename
				cardNum = Integer.toString(counter);
				Image image = new Image("file:Cards/" + cardNum + ".png");
				ImageView card = new ImageView(image);
				card.setImage(image);
				card.setFitHeight(87);
				card.setFitWidth(90);
				pane.add(card, i, j);
				// variable used as a counter
				counter = counter + 1;
			}
		}

		Scene scene = new Scene(pane, 550, 800);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Full Deck Of Cards");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	

}
