/* Chapter 14.2
 * Tic Tac Toe board
 * Image placement is chosen randomly
 */

package tictactoe;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;

public class TicTacToe extends Application {
	@Override
	public void start(Stage primaryStage) {
		int x = 0;
		GridPane pane = new GridPane();
		pane.setVgap(10.0);
		pane.setHgap(10.0);
		pane.setPadding(new Insets(25,25,25,25));
		
		// Loop iterates through grid (3 x 3)
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				x = generateNum(x);
				if(x == 0) {
					/* Image for X */
					Image image1 = new Image("file:X.jpg");
					ImageView imageView1 = new ImageView(image1);
					imageView1.setFitHeight(100);
					imageView1.setFitWidth(100);
					pane.add(imageView1, i, j);
				}
				else if(x == 1) {
					/* Image for O */
					Image image2 = new Image("file:O.png");
					ImageView imageView2 = new ImageView(image2);
					imageView2.setFitHeight(80);
					imageView2.setFitWidth(80);
					pane.add(imageView2, i, j);
				}
				else if(x == 2) {
					/* Image for Blank */
					Image image3 = new Image("file:Blank.png");
					ImageView imageView3 = new ImageView(image3);
					imageView3.setFitHeight(100);
					imageView3.setFitWidth(100);
					pane.add(imageView3, i, j);
					
				}
			}
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Tic Tac Toe");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	
	}
/* Method generateNum -- generates a random number between 0 and 1 */
	public static int generateNum(int num) {
		Random rand = new Random();
		int low = 0;
		int high = 3;
		int x = rand.nextInt(high - low) + low;
		System.out.println(x);					                    	// Display number to developer
		return x;	
	}
	
}




