/* ListGUI class -- creates GUI and event */

package selectlist;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;

public class ListGUI extends BorderPane {
	protected boolean singleSelection = true;
	String y = "";
	ObservableList<String> country = FXCollections.observableArrayList("China" , "Korea", "India", 
			"Malaysia", "Vietnam");
	
	public BorderPane getPane() {
		BorderPane bpane = new BorderPane();
		
		// Create ListView object 
		// Contains ObservableList elements
		ListView<String> lv = new ListView<String>(country);

		// Holds Label and ComboBox
		HBox hbox1 = new HBox();
		hbox1.setSpacing(105);
		hbox1.setPadding(new Insets(10,0,0,5));
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2 = new HBox();
		hbox2.setAlignment(Pos.BASELINE_LEFT);
		hbox2.setSpacing(10);
		hbox2.setStyle("-fx-background-color:lightgray;");
		
		// Create label objects
		Label lb1 = new Label("Choose Selection Mode: ");
		Label lb2 = new Label("Selected items are: ");
		Label lb3 = new Label();
		
		// Create ComboBox objects
		ComboBox<String> cmb = new ComboBox<String>();
		cmb.getItems().add("SINGLE");
		cmb.getItems().add("MULTIPLE");
		cmb.setValue("SINGLE");
		
		// EVENT -- ListView
		lv.setOnMouseClicked(e -> {
			if(singleSelection == true) {
				lb3.setText(country.get(lv.getSelectionModel().getSelectedIndex()));
			} else {
				for(String x : lv.getSelectionModel().getSelectedItems()) {
					y += x + " ";
					lb3.setText(y);
				}
				clearLabel();
			}
			
		});
		
		// EVENT -- ComboBox
		cmb.setOnAction(e -> {
			if(cmb.getSelectionModel().getSelectedItem().matches("SINGLE")) {
				lv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
				singleSelection = true;
			}
			else if(cmb.getSelectionModel().getSelectedItem().matches("MULTIPLE")) {
				lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
				singleSelection = false;
			}
		});
	
		// Add object to panes
		hbox1.getChildren().addAll(lb1, cmb);
		hbox2.getChildren().addAll(lb2, lb3);
		bpane.setTop(hbox1);
		bpane.setCenter(lv);
		bpane.setBottom(hbox2);

		return bpane;
	}
	
	/* METHOD : clearLabel
	 * Clears string for next label event
	 */
	public void clearLabel() {
		y = "";
	}

}
