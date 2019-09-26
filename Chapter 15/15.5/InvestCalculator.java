/* Chapter 15.5
 * Program calculates the future value of an investment
 */

package investcalculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class InvestCalculator extends Application {
	double investmentAmount;
	double numberOfYears; 
	double iRate;
	double futureValue;

	public void start(Stage stage) {
		// StackPane 
		StackPane root = new StackPane();
		
		// GridPane
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(5);
		grid.setVgap(25);
		
		// Label objects
		Label label1 = new Label("Investment Amount:");
		Label label2 = new Label("Number of Years:");
		Label label3 = new Label("Annual Interest Rate:");
		Label label4 = new Label("Future value:");
		grid.add(label1, 0, 0);
		grid.add(label2, 0, 1);
		grid.add(label3, 0, 2);
		grid.add(label4, 0, 3);
		
		// TextField objects
		TextField iAmount = new TextField();
		iAmount.setAlignment(Pos.BASELINE_RIGHT);			          	// set text alignment to the right
		TextField numYears = new TextField();
		numYears.setAlignment(Pos.BASELINE_RIGHT);
		TextField aRate = new TextField();
		aRate.setAlignment(Pos.BASELINE_RIGHT);
		TextField fValue = new TextField();
		fValue.setAlignment(Pos.BASELINE_RIGHT);
		fValue.setEditable(false);
		grid.add(iAmount, 1, 0);
		grid.add(numYears, 1, 1);
		grid.add(aRate, 1, 2);
		grid.add(fValue, 1, 3);
		
		// Button object - Calculate
		Button button = new Button("Calculate");
		grid.add(button, 1, 4);
		grid.setHalignment(button, HPos.RIGHT);
				
		// Lambda --  Button events
		button.setOnMouseClicked(e -> {
			investmentAmount = Double.parseDouble(iAmount.getText());
			numberOfYears = Double.parseDouble(numYears.getText());
			iRate = Double.parseDouble(aRate.getText());
			// Create object for CalculateValue class
			CalculateValue value = new CalculateValue();
			value.futureValue(investmentAmount, numberOfYears, iRate);
			// Create DecimalFormat object to convert double to String with two decimal places
			DecimalFormat dec = new DecimalFormat("##.00");
			fValue.setText("$" + dec.format(futureValue));
		});
		
		root.getChildren().addAll(grid);
		
		Scene scene = new Scene(root, 325, 250);
		stage.setScene(scene);
		stage.setTitle("Investment-Value Calculator");
		stage.setResizable(false);
		stage.show();
	}
	
	/* CLASS: CalculateValue
	 */
	class CalculateValue {
		public void futureValue(double investmentAmount, double numberOfYears, double iRate) {
			// Convert percentage to a decimal
			iRate = iRate / 100;			
			futureValue = investmentAmount * Math.pow(1 + (iRate / 12), numberOfYears * 12);
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}




