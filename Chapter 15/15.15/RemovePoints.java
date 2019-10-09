/* Chapter 15.15
 * Program enables user to add and remove points in a 2-D plane dynamically
 * When the user left clicks the mouse button. a point is created
 * The user must right click point to remove the point
 */

package removepoints;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.collections.ObservableList;

public class RemovePoints extends Application {
	public double x = 0;
	public double y = 0;
	
	public void start(Stage primaryStage) {
		// StackPane: ALL PANES
		Pane pane = new Pane();
	
		// ObservableList for pane node
		ObservableList <Node> list = pane.getChildren();
			
		/* EVENT: Add Circles */
		EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				// Add circles
				// x, y coordinates is the center point, radius is the distance from the point
				// Set mouse coordinates as circle coordinates in pane -- centerX, centerY, radius = 10 
				// Add circle object to ObservableList
				if(e.getButton().equals(MouseButton.PRIMARY)) {
					Circle circle1 = new Circle(e.getX(), e.getY(), 10);
					circle1.setStroke(Color.BLACK);
					circle1.setFill(Color.RED);
					list.add(circle1);	
				}
				// If user clicks within circle, the circle is removed
				else if(e.getButton().equals(MouseButton.SECONDARY)) {
					x = e.getX();
					y = e.getY();
					for(int i = 0; i < list.size(); i++) {
						// Iterate through array -- searching for object in list
						// x, y coordinate for circle remains static
						// If object contains x, y coordinate for circle, remove it (circle)
						if(list.get(i).contains(x, y)) {
							list.remove(i); 
							break;
						}
					}

				}
					
			}
		
		};
		
		pane.setOnMouseClicked(event1);
		
		Scene scene = new Scene(pane, 450, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Remove Points");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
		
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
