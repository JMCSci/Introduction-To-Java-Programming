/* FontGUI class
 * Class creates GUI and handles events
 */

package dynamicfont;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class FontGUI extends BorderPane {
	protected double fontSize = 0;
	protected String fontName = null;
	protected Boolean fontWeight = false;
	protected Boolean fontPosture = false;
	
	public StackPane getPane() {
		// Create StackPane object
		StackPane root = new StackPane();
		
		// Create VBox object to hold 
		// Binds VBox alignment to StackPane 
		VBox vbox = new VBox();
		vbox.setSpacing(150);
		vbox.alignmentProperty().bind(root.alignmentProperty());
		
		// HBox for Font Name, Font Size (labels and combo box)
		HBox hbox1 = new HBox();
		hbox1.setAlignment(Pos.TOP_CENTER);
		hbox1.setSpacing(10);
		
		// HBox for Bold and Italic check box
		HBox hbox2 = new HBox();
		hbox2.setAlignment(Pos.BOTTOM_CENTER);
		hbox2.setSpacing(10);
		hbox2.setPadding(new Insets(2, 2, 2, 2));
		
		// Create Label object for message
		Label lb1 = new Label("Programming is fun");
		fontName = lb1.getFont().getName();
		fontSize = lb1.getFont().getSize();
				
		// Create Label object for "Font Name" text
		Label lb2 = new Label("Font Name");
		
		// Create Label object for "Font Size" text
		Label lb3 = new Label("Font Size");
		
		// Create CheckBox objects Bold and Italic
		CheckBox cb1 = new CheckBox("Bold");
		CheckBox cb2 = new CheckBox("Italic");
		
		// Create ComboBox list items
		ComboBox <String> combo1 = new ComboBox <String>();
		combo1.getItems().addAll(Font.getFamilies());
		ComboBox <Integer> combo2 = new ComboBox <Integer>();
		combo2.getItems().addAll(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		
		/* EVENT -- Bold CheckBox */
		cb1.setOnAction(e -> {
			if(fontWeight == false && fontPosture == false) {
				lb1.setFont(Font.font(fontName, FontWeight.EXTRA_BOLD, FontPosture.REGULAR, fontSize));
				fontPosture = false;
				fontWeight = true;
			}
				else if(fontWeight == true && fontPosture == false) {
					lb1.setFont(Font.font(fontName, FontWeight.NORMAL, FontPosture.REGULAR, fontSize));
					fontPosture = false;
					fontWeight = false;
				}
					else if(fontWeight == false & fontPosture == true) {
						lb1.setFont(Font.font(fontName, FontWeight.EXTRA_BOLD, FontPosture.ITALIC, fontSize));
						fontPosture = true;
						fontWeight = true;
					}
						else if(fontWeight == true && fontPosture == true) {
							lb1.setFont(Font.font(fontName, FontWeight.NORMAL, FontPosture.ITALIC, fontSize));
							fontPosture = true;
							fontWeight = false;
						}
		});
		
		/* EVENT -- Italic CheckBox */
		cb2.setOnAction(e -> {
			if(fontPosture == false && fontWeight == false) {
				lb1.setFont(Font.font(fontName, FontWeight.NORMAL, FontPosture.ITALIC, fontSize));
				fontWeight = false;
				fontPosture = true;
			}
				else if(fontPosture == true && fontWeight == false) {
					lb1.setFont(Font.font(fontName, FontWeight.NORMAL, FontPosture.REGULAR, fontSize));
					fontWeight = false;
					fontPosture = false;
				}
					else if (fontPosture == false && fontWeight == true) {
						lb1.setFont(Font.font(fontName, FontWeight.EXTRA_BOLD, FontPosture.ITALIC, fontSize));
						fontWeight = true;
						fontPosture = true;
				}
					   else if(fontPosture == true && fontWeight == true) {
						   lb1.setFont(Font.font(fontName, FontWeight.EXTRA_BOLD, FontPosture.REGULAR, fontSize));
						   fontWeight = true;
						   fontPosture = false;
					}
		});
		
		/* EVENT -- Font name */
		combo1.setOnAction(e -> {
			fontName = combo1.getValue();
			lb1.setFont(Font.font(fontName, fontSize));
		});
		
		/* EVENT -- Font Size */
		combo2.setOnAction(e -> {
			fontSize = combo2.getValue();
			lb1.setFont(Font.font(fontName, fontSize));
		});
		
		// Add nodes to panes
		hbox1.getChildren().addAll(lb2, combo1, lb3, combo2);
		hbox2.getChildren().addAll(cb1, cb2);
		vbox.getChildren().addAll(hbox1, hbox2);
		
		// Add nodes to StackPane
		root.getChildren().addAll(lb1, vbox);
		
		// Static reference to StackPane class
		// Manually set node alignment in StackPane
		StackPane.setAlignment(lb1, Pos.CENTER);
		StackPane.setAlignment(hbox1, Pos.BOTTOM_CENTER);
		StackPane.setAlignment(hbox2, Pos.TOP_CENTER);

		// Return StackPane to main
		return root;
	}

}
