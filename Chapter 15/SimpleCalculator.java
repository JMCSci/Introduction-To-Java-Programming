/* Chapter 15.4
 * Program performs addition, subtraction, multiplication and division
 */

package simplecalculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
	public double num1;
	public double num2;
	public double result;
	public String tempNum1;
	public String tempNum2;
	public String tempResult;
	
	
	public void start (Stage stage) {
		// StackPane to hold all gridpanes
		StackPane root = new StackPane();
		
		// GridPane for TextField
		GridPane grid1 = new GridPane();
		grid1.setPadding(new Insets(5,0,0,5));
		grid1.setHgap(1);
		grid1.setVgap(20);
		
		// Label next to TextField
		Label label1 = new Label("Number 1:");
		grid1.add(label1, 0, 0);
		Label label2 = new Label("Number 2:");
		grid1.add(label2, 2, 0);
		Label label3 = new Label("Result:");
		grid1.add(label3, 4, 0);
		
		// TextField object for numbers and result
		TextField tfNum1 = new TextField();
		tfNum1.setPrefColumnCount(4);
		grid1.add(tfNum1, 1, 0);
		TextField tfNum2 = new TextField();
		tfNum2.setPrefColumnCount(4);
		grid1.add(tfNum2,  3, 0);
		TextField tfResult = new TextField();
		tfResult.setPrefColumnCount(4);
		tfResult.setEditable(false);
		grid1.add(tfResult, 5, 0);
		
		// Button object - Add
		Button add = new Button("Add");
		add.setPrefWidth(75);
		grid1.add(add, 1, 2);
		Button subtract = new Button("Subtract");
		grid1.add(subtract, 2, 2);
		Button multiply = new Button("Multiply");
		grid1.add(multiply, 3, 2);
		Button divide = new Button("Divide");
		grid1.add(divide, 4, 2);
		
		// Button and TextField event handlers
		add.setOnMouseClicked(e -> { 
			tempNum1 = tfNum1.getText();
			tempNum2 = tfNum2.getText();
			num1 = Double.parseDouble(tempNum1);
			num2 = Double.parseDouble(tempNum2);
			result = num1 + num2;
			tempResult = Double.toString(result);
			tfResult.setText(tempResult);
		});
		
		subtract.setOnMouseClicked(e -> {
			tempNum1 = tfNum1.getText();
			tempNum2 = tfNum2.getText();
			num1 = Double.parseDouble(tempNum1);
			num2 = Double.parseDouble(tempNum2);
			result = num1 - num2;
			tempResult = Double.toString(result);
			tfResult.setText(tempResult);
			
		});
		
		multiply.setOnMouseClicked(e -> {
			tempNum1 = tfNum1.getText();
			tempNum2 = tfNum2.getText();
			num1 = Double.parseDouble(tempNum1);
			num2 = Double.parseDouble(tempNum2);
			result = num1 * num2;
			tempResult = Double.toString(result);
			tfResult.setText(tempResult);
		});
		
		divide.setOnMouseClicked(e -> {
			tempNum1 = tfNum1.getText();
			tempNum2 = tfNum2.getText();
			num1 = Double.parseDouble(tempNum1);
			num2 = Double.parseDouble(tempNum2);
			result = num1 / num2;
			tempResult = Double.toString(result);
			tfResult.setText(tempResult);
		});
		
		root.getChildren().addAll(grid1);
		
		Scene scene = new Scene(root, 415, 105);
		stage.setScene(scene);
		stage.setTitle("Simple Calculator");
		stage.setResizable(false);
		stage.show();
	}
	
	public static void main (String[] args) {
		Application.launch(args);

	}

}
