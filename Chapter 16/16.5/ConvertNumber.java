/* Chapter 16.5
 * Program converts between decimal, hex, and binary numbers
 * Corresponding hex and binary numbers are displayed in two text fields
 * User enters values in other fields and converts accordingly
 */

package convertnumbers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class ConvertNumbers extends Application {
	private int decimal = 0;
	private String dec = null;
	private String hex = null;
	private String binary = null;
	
	public void start(Stage primaryStage) {
		// Create GridPane
		GridPane gpane = new GridPane();
		gpane.setHgap(10);
		gpane.setVgap(5);
		
		// Create label objects
		Label lab1 = new Label("Decimal");
		Label lab2 = new Label("Hex");
		Label lab3 = new Label("Binary");
		gpane.add(lab1, 2, 1);
		gpane.add(lab2, 2, 2);
		gpane.add(lab3, 2, 3);
		
		// Create TextField objects and add them to GridPane
		TextField dtf = new TextField();
		TextField htf = new TextField();
		TextField btf = new TextField();
		dtf.setAlignment(Pos.BASELINE_RIGHT);
		htf.setAlignment(Pos.BASELINE_RIGHT);
		btf.setAlignment(Pos.BASELINE_RIGHT);
		dtf.setPrefWidth(200);
		gpane.add(dtf, 3, 1);
		gpane.add(htf, 3, 2);
		gpane.add(btf, 3, 3);
		
		/* EVENT: Converts value to hexadecimal and binary */
		dtf.setOnAction(e -> {
			String temp = null;
			temp = dtf.getText();
			// Convert decimal to an integer
			decimal = Integer.parseInt(temp);
			// Convert integer to hexadecimal
			hex = Integer.toHexString(decimal);
			// Convert integer to binary
			binary = Integer.toBinaryString(decimal);
			htf.setText(hex);
			btf.setText(binary);
		});
		
		/* EVENT: Converts value to decimal and binary */
		htf.setOnAction(e -> {
			String temp = null;
			temp = htf.getText();
			// Hash eliminates whitespace which would cause a NumberFormatException
			decimal = Integer.decode("#" + temp);		
			binary = Integer.toBinaryString(decimal);
			dec = Integer.toString(decimal);
			dtf.setText(dec);
			btf.setText(binary);
		});
		
		/* EVENT: Converts value to decimal and hexadecimal */
		btf.setOnAction(e -> {
			binary = btf.getText();
			// Parses string to specified radix (in this case binary [base 2])
			decimal = Integer.parseInt(binary, 2);
			hex = Integer.toHexString(decimal);
			dec = Integer.toString(decimal);
			dtf.setText(dec);
			htf.setText(hex);
		});
		
		// Create scene
		Scene scene = new Scene(gpane, 300, 110);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Number Systems Converter");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
