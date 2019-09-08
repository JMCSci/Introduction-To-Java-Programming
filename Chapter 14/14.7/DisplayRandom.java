/* Chapter 14.7 
 * Program displays a 10 by 10 square matrix
 * Each element in matrix is either 0 or 1, randomly generated
 * Each number displayed in a text field
 */

package displayrandom;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Random;

public class DisplayRandom extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setVgap(1.0);
		pane.setHgap(1.0);
		pane.setPadding(new Insets(0,0,0,0));
		
		/* 10 X 10 matrix */
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				TextField t1 = new TextField();
				t1.setText(randomBinary());
				// Field cannot be edited
				t1.setEditable(false);
				pane.add(t1, i, j);

			}
		}
		Scene scene = new Scene(pane, 400, 280);
		primaryStage.setTitle("Random Binary Numbers");
		primaryStage.setScene(scene);	
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	/* METHOD: randomBinary 
	 * Randomly returns either a 0 or 1 
	 */
	public static String randomBinary() {
		Random rand = new Random();
		int x = rand.nextInt(2);
		return Integer.toString(x);
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
