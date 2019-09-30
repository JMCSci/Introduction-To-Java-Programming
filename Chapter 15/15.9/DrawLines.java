/* Chapter 15.9 
 * Program allows user to draw line segments using the keypad
 */

package drawlines;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class DrawLines extends Application {
	private int indexX = 0;
	private int indexY = 1;
	private double startX = 0;
	private double startY = 0;
	
	@SuppressWarnings("incomplete-switch")
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
	
		// Create Polyline object 
		Polyline poly = new Polyline();
		
		// Create ObservableList array
		// List that allows listeners to track when changes occur
		ObservableList<Double> list = poly.getPoints();
		list.add(200.0);										                                     	// x-coordinate
		list.add(200.0);									                        		            // y-coordinate

		/* EVENT: Use keypad to create lines in pane 
		 * startX and startY variables used to get x and y values from array
		 * Example: startX(0) and startY(1), startX(2) and startY(3), etc.
		 */
		poly.setOnKeyPressed(e -> { 
			startX = list.get(indexX);								                              // save x-coordinate to variable
			startY = list.get(indexY);							                              	// save y-coordinate to variable
			
			// Switch conditional gets KeyCode (UP, DOWN, LEFT, or RIGHT)
			switch(e.getCode()) {	
			case UP:    startY = startY - 5;						
					    poly.getPoints().addAll(startX, startY);	                      // add lines to pane
					    indexX += 2;								                                    // increases x-coordinate index by 2 
					    indexY += 2; break;				                                			// increases y-coordinate index by 2
			case DOWN:  startY = startY + 5;
					    poly.getPoints().addAll(startX, startY);
					    indexX += 2;
					    indexY += 2; break;
			case LEFT:  startX = startX - 5;
					    poly.getPoints().addAll(startX, startY);
					    indexX += 2; 
					    indexY += 2; break;
			case RIGHT: startX = startX + 5;
						poly.getPoints().addAll(startX, startY);
						indexX += 2;
						indexY += 2; break;
			}	
		});

		pane.getChildren().add(poly);
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Draw Lines");
		primaryStage.setResizable(false);
		primaryStage.show();
		
    // Allows object to receive key input    
		poly.requestFocus();                                                     // must be used after stage is set       
	}
	
	public static void main(String[] args) {
		Application.launch(args);	
	}

}
