/* TextPane class
 * Creates GUI and events
 */

package demotextarea;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;

public class TextPane extends BorderPane {
	protected Boolean editableArmed = false;
	protected Boolean wrapArmed = false;
	
	public BorderPane getPane() {
		// Create BorderPane
		BorderPane bpane = new BorderPane();
		
		// Create ScrollPane
		ScrollPane scroll = new ScrollPane();
		
		// Create HBox to hold CheckBox objects
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.BASELINE_CENTER);
		hbox.setPadding(new Insets(5,5,5,5));
		hbox.setSpacing(10);
		
		// Create TextArea
		TextArea tarea = new TextArea();
		tarea.setPrefRowCount(20);
		tarea.setEditable(false);
		
		// Create CheckBox object -- Editable
		CheckBox cbox1 = new CheckBox("Editable");
		// Create CheckBox object -- Wrap
		CheckBox cbox2 = new CheckBox("Wrap");
		
		/* EVENT: CheckBox (EDITABLE) */
		cbox1.setOnAction(e -> {
			if(editableArmed == false) {
				tarea.setEditable(true);
				editableArmed = true;
			}
			else if(editableArmed == true) {
				tarea.setEditable(false);
				editableArmed = false;
			}
		});
		/* EVENT: CheckBox (WRAP) */
		cbox2.setOnAction(e -> {
			if(wrapArmed == false) {
				tarea.setWrapText(true);
				wrapArmed = true;
			}
			else if(wrapArmed == true) {
				tarea.setWrapText(false);
				wrapArmed = false;
			}
		});
		
		hbox.getChildren().addAll(cbox1, cbox2);
		scroll.setContent(tarea);
		bpane.setCenter(scroll);
		bpane.setBottom(hbox);
		
		return bpane;
	}
	

}
