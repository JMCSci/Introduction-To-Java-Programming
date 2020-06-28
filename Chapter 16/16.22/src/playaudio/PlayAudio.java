/* Chapter 16.22
 * Program play and audio clips
 * User can press button to play audio, loop audio, or stop audio
 */

package playaudio;

import javafx.application.Application;

import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PlayAudio extends Application {
	boolean playing = false;

	public void start(Stage primaryStage) {		
		// Create StackPane object
		// StackPane used so children remain centered in pane
		StackPane root = new StackPane();
		
		// Add HBox for buttons
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		
		// Create button objects
		Button b1 = new Button("Play");
		Button b2 = new Button("Loop");
		Button b3 = new Button("Stop");
		
		// Create AudioClip object
		// Uses File class
		AudioClip beat = new AudioClip("file:/Users/jasonmoreau/Desktop/alert.mp3");
		
		// EVENT -- Play audio clip
		b1.setOnAction(e -> {
			if(playing == false) {
				playing = true;
				beat.play();
			} else {
				beat.stop();
				beat.play();
			}
		});
		
		// EVENT -- Loop audio clip
		b2.setOnAction(e -> {
			if(playing == false) {
				playing = true;
				beat.setCycleCount(AudioClip.INDEFINITE);
				beat.play();
			} else {
				beat.stop();
				beat.setCycleCount(AudioClip.INDEFINITE);
				beat.play();
			}
			
		});
		
		// EVENT -- Stop audio clip
		b3.setOnAction(e -> {
			beat.stop();
		});
		
		// Add children to pane
		hbox.getChildren().addAll(b1, b2, b3);
		root.getChildren().add(hbox);
		
		// Create a new scene
		Scene scene = new Scene(root, 250, 60);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Audio Player");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
