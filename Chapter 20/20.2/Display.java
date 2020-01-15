/* Display class
 * Graphical User Interface (GUI)
 */

package storenumbers;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class Display extends BorderPane {
	public static BorderPane getPane() {
		Event event = new Event();
		BorderPane bpane = new BorderPane();
		ScrollPane spane = new ScrollPane();
		spane.setPrefWidth(400);
		
		HBox hbox1 = new HBox(10);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2 = new HBox(10);
		hbox2.setAlignment(Pos.CENTER);
		
		Label lb1 = new Label("Enter a number: ");
		
		TextField tf1 = new TextField();
		tf1.setPrefColumnCount(10);
		
		TextArea ta = new TextArea();
		ta.setEditable(false);
		ta.setPrefHeight(80);
		ta.setPrefWidth(400);
		
		Text t1 = new Text("Duplicate entry - Try again");
		t1.setFill(Color.RED);
		
		Button sort = new Button("Sort");
		Button shuffle = new Button("Shuffle");
		Button reverse = new Button("Reverse");
			
		// EVENTS
		tf1.setOnAction(e -> {
			try {
				ta.setText(event.clear());
				event.setNumber(tf1.getText());
				if(event.getDuplicate() == true) {
					ta.setText(event.clear());
					ta.setText("Duplicate entry -- Try again");
				} else {
				ta.setText(event.getList());
				tf1.setText(event.clear());
				}
			} catch(NumberFormatException ex) {
				ta.setText(event.clear());
				ta.setText("Only numbers are allowed -- Try again");
			}
		});
		
		sort.setOnAction(e -> {
			event.sort();
			ta.setText(event.clear());
			ta.setText(event.getList());
		});
		
		shuffle.setOnAction(e -> {
			event.shuffle();
			ta.setText(event.clear());
			ta.setText(event.getList());
		});
		
		reverse.setOnAction(e -> {
			event.reverse();
			ta.setText(event.clear());
			ta.setText(event.getList());
		});

		hbox1.getChildren().addAll(lb1, tf1);
		hbox2.getChildren().addAll(sort, shuffle, reverse);
		spane.setContent(ta);
		bpane.setTop(hbox1);
		bpane.setCenter(spane);
		bpane.setBottom(hbox2);
		
		return bpane;
	}

}
