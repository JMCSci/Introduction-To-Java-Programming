/* Chapter 14.6 
 * Program displays a checkerboard in which white and black cell is a Rectangle
 * 8 X 8 black & red matrix
 * x-variable counts matrix squares
 */

package checkerboard;

import javafx.application.Application; 
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkerboard extends Application {
	@Override 
	public void start(Stage primaryStage) {
		int x = 0;
		GridPane pane = new GridPane();
		pane.setVgap(0.0);
		pane.setHgap(0.0);
		pane.setPadding(new Insets(1, 1, 1, 1));

		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				x = x + 1;
				// DEVELOPER: view count								
				/* Signify the bottom of the board
				 * When x is divisible by 9, add one to x-variable
				 * Top of board -- number skipped will be either even (black) or odd (red)  
				 */
				if(x % 9 == 0) {
					x = x + 1;
				}
				System.out.println(x);
			if(x % 2 == 0) {
				Rectangle r1 = new Rectangle(50, 50);
				r1.setStroke(Color.BLACK);
				r1.setFill(Color.BLACK);
				pane.add(r1, i, j);
			}
			else {
				Rectangle r2 = new Rectangle(50,50);
				r2.setStroke(Color.BLACK);
				r2.setFill(Color.RED);
				pane.add(r2, i, j);	
			}
			}			
		}
		
		Scene scene = new Scene(pane, 410,410);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Checkerboard");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}


