/* Chapter 15.1 
 * Pick Four Cards
 * Program allows user to click the "Refresh" button to display four new cards
 */

package pickfourcards;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PickFourCards extends Application {
	public void start(Stage primaryStage) {
		// Used to stack GridPane with BorderPane
		StackPane root = new StackPane();
		// Used for cards
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setVgap(10);
		pane.setHgap(10);
		// Object creates cards in Cards class (ArrayList) 
		Card card = new Card();
		card.drawCards();	
		card.shuffleCards();
		// Add images to Image object
		Image image1 = new Image("file:Cards/" + card.getCards(0) +  ".png");
		Image image2 = new Image("file:Cards/" + card.getCards(1) +  ".png");
		Image image3 = new Image("file:Cards/" + card.getCards(2) +  ".png");
		Image image4 = new Image("file:Cards/" + card.getCards(3) +  ".png");
		// Add images to ImageView node and adjust size
		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitHeight(150);
		imageView1.setFitWidth(125);
		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(150);
		imageView2.setFitWidth(125);
		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(150);
		imageView3.setFitWidth(125);
		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(150);
		imageView4.setFitWidth(125);
		// Create Button object
		Button button = new Button("Refresh");
		// HBox Used as a container for button in pane
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.BOTTOM_CENTER);
		hbox.setPadding(new Insets(0,10,10,0));
		// Button added to container
		hbox.getChildren().add(button);
		
		// REFRESH button event
		button.setOnMouseClicked(e -> {
			card.drawCards();
			card.shuffleCards();
			card.setCards();
			
			Image newCard1 = new Image("file:Cards/" + card.getCards(0) +  ".png");
			Image newCard2 = new Image("file:Cards/" + card.getCards(1) +  ".png");
			Image newCard3 = new Image("file:Cards/" + card.getCards(2) +  ".png");
			Image newCard4 = new Image("file:Cards/" + card.getCards(3) +  ".png");
			
			ImageView newIV1 = new ImageView(newCard1);
			newIV1.setFitHeight(150);
			newIV1.setFitWidth(125);
			ImageView newIV2 = new ImageView(newCard2);
			newIV2.setFitHeight(150);
			newIV2.setFitWidth(125);
			ImageView newIV3 = new ImageView(newCard3);
			newIV3.setFitHeight(150);
			newIV3.setFitWidth(125);
			ImageView newIV4 = new ImageView(newCard4);
			newIV4.setFitHeight(150);
			newIV4.setFitWidth(125);
			
			pane.add(newIV1, 1, 0);
			pane.add(newIV2, 2, 0);
			pane.add(newIV3, 3, 0);
			pane.add(newIV4, 4, 0);
		});
	
		// Add images to pane
		pane.add(imageView1, 1, 0);
		pane.add(imageView2, 2, 0);
		pane.add(imageView3, 3, 0);
		pane.add(imageView4, 4, 0);
		
		// Add panes to StackPane
		root.getChildren().addAll(pane, hbox);
		
		Scene scene = new Scene(root, 575, 215);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pick Four Cards");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	/* Class: Card 
	 * Creates cards and shuffle cards
	 */
	public class Card {
		public int card; 
		ArrayList<Integer> deck = new ArrayList<Integer>();
		
		/* METHOD: drawCards
		 * Deck of cards
		 * Place numbers 1 - 54 into an ArrayList
		 * 
		 */
		public void drawCards () {
			for(int i = 0; i < 54; i++) {
				deck.add(i + 1);			 // i + 1 takes variable and raises it by one			
			}		
		}
		/* METHOD: shuffleArray
		 * Shuffle ArrayList
		 */
		public void shuffleCards (){
			java.util.Collections.shuffle(deck);
		}
		
		/* METHOD: setCards
		 * Take first fours numbers in shuffled ArrayList and sets it as first four numbers in new array
		 * Used in "REFRESH" button event
		 */
		public void setCards () {
			deck.set(0, deck.get(0));
			deck.set(1, deck.get(1));
			deck.set(2, deck.get(2));
			deck.set(3, deck.get(3));
		}

		/* METHOD: getCards
		 * Return card numbers as a String
		 */
		public String getCards (int num) {
			card = deck.get(num);
			return Integer.toString(card);
		}

	}
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}
}
