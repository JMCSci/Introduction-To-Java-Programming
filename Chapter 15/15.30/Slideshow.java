/* Chapter 15.30
 * Program automatically displays five slides repeatedly every two seconds
 * Animation pauses when the mouse button is clicked
 * Animation resumes when the mouse button is clicked again
 */

package slideshow;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Slideshow extends Application {
	private int buttonClick = 0;				  	// Binary condition -- used to determine if animation is paused
	private int counter = 0;					// Used for image filename (ex. 0.jpg)
	private String fileNum = null;				    	// Used for image filename conversion to a string
	
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		/* EVENT: Adds image to ImageView 
		 * ImageView then added to pane
		 * When counter resets to 0 when it reaches the number 5
		 */
		EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				fileNum = Integer.toString(counter);
				Image image = new Image("file:" + fileNum + ".jpg");
				ImageView iView = new ImageView(image);
				pane.getChildren().add(iView);
				counter++;
				if(counter == 5) {
					counter = 0;
				}
			}
		};
		
		// Create Timeline object for animation
		Timeline animation = new Timeline();
		// Create keyframe object -- used to determine animation sequence
		KeyFrame key = new KeyFrame(Duration.millis(2000), event1);
		// Add keyframes to ObservableList
		animation.getKeyFrames().add(key);
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		/* EVENT: Animation pauses when mouse button is clicked
		 * Animation resumes when mouse button is clicked a second time
		 */
		EventHandler<MouseEvent> event2 = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				if(buttonClick == 0) {
					animation.pause();
					buttonClick = 1;
				}
				else {
					animation.play();
					buttonClick = 0;
				}
			}
		};
		
		pane.setOnMouseClicked(event2);

		Scene scene = new Scene(pane, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("My Slideshow");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
