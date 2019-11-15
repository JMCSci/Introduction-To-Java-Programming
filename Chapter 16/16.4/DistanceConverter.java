/* Chapter 16.4
 * Program converts miles and kilometers 
 * If a value is entered into the Mile text field, kilometer measurement is displayed in kilometer field
 * If a value is entered into the Kilometer text field, mile measurement is displayed in mile field
 * Enter key used in text field
 */

package distanceconverter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import java.text.DecimalFormat;

public class DistanceConverter extends Application {
	private DecimalFormat decimal = new DecimalFormat("##.000");
	private final double kiloMile = 0.6214;
	private double mile = 0;
	private double kilometer = 0;
	private String conversionValue = null;
	
	public void start(Stage primaryStage) {
		// Create GridPane object
		GridPane gpane = new GridPane();
		gpane.setHgap(20);
		gpane.setVgap(5);
		
		// Create label object and add to GridPane
		Label milab = new Label("Mile");
		gpane.add(milab, 1, 2);
		Label kilolab = new Label("Kilometer");
		gpane.add(kilolab, 1, 3);
		
		// Create textfield objects and add to GridPane
		// Set textfield size specifications and cursor position
		TextField tf1 = new TextField();
		tf1.setAlignment(Pos.BASELINE_RIGHT);
		gpane.add(tf1, 2, 2);
		TextField tf2 = new TextField();
		tf2.setPrefWidth(225);
		tf2.setAlignment(Pos.BASELINE_RIGHT);
		gpane.add(tf2, 2, 3);
		
		// EVENT: Convert miles to kilometers
		tf1.setOnAction(e -> {
			double temp = 0;
			temp = Double.parseDouble(tf1.getText());
			kilometer = temp / kiloMile;
			conversionValue = decimal.format(kilometer);
			tf2.setText(conversionValue);
		});
		
		// EVENT: Convert kilometers to miles
		tf2.setOnAction(e -> {
			double temp = 0;
			temp = Double.parseDouble(tf2.getText());
			mile = temp * kiloMile;
			conversionValue = decimal.format(mile);
			tf1.setText(conversionValue);
		});
		
		// Create scene
		Scene scene = new Scene(gpane, 350, 90);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Distance Converter");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}
}
