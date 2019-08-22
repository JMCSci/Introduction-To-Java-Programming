/* Chapter 14.1
 * Display images horizontally
 */

package displayimages;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DisplayImages extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new HBox(25);														// spacing between images
		pane.setPadding(new Insets(10,10,10,10));										// spacing around pane
		Image image1 = new Image("file:usa.png");										// has to point to a file
		ImageView imageView1 = new ImageView(image1);									// creates image customization object
		imageView1.setFitHeight(100);													// adjust height
		imageView1.setFitWidth(100);													// adjust width
		pane.getChildren().add(imageView1);												// add image with adjustments to pane
		
		Image image2 = new Image("file:uk.png");
		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100);
		pane.getChildren().add(imageView2);
		
		Image image3 = new Image("file:china.png");
		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(100);
		imageView3.setFitWidth(100);
		pane.getChildren().add(imageView3);
		
		Image image4 = new Image("file:ca.jpg");
		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(100);
		imageView4.setFitWidth(100);
		pane.getChildren().add(imageView4);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Flags");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
