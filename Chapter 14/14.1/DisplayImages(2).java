/* Chapter 14.1
 * Display images in a grid pane
 */

package displayimages;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
 
public class DisplayImages extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();							      // create object to set images in a grid formation
		pane.setVgap(10.0);								              	// vertical spacing between images
		pane.setHgap(10.0);									            	// horizontal spacing between images
		pane.setPadding(new Insets(10,10,10,10));			  	// spacing around pane
		Image image1 = new Image("file:usa.png");			  	// argument must point to a file
		ImageView imageView1 = new ImageView(image1);			// creates image customization object
		imageView1.setFitHeight(200);						        	// adjust height
		imageView1.setFitWidth(300);						        	// adjust width
		pane.add(imageView1, 0, 0);						        		// add image with adjustments to pane w/ column and row arguments
		
		Image image2 = new Image("file:uk.png");
		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(200);
		imageView2.setFitWidth(300);
		pane.add(imageView2, 1, 0);
		
		Image image3 = new Image("file:china.png");
		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(200);
		imageView3.setFitWidth(300);
		pane.add(imageView3, 0, 1);
		
		Image image4 = new Image("file:ca.jpg");
		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(200);
		imageView4.setFitWidth(300);
		pane.add(imageView4, 1, 1);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Flags");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
