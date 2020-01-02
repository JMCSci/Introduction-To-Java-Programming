// Display class for Address book
// Code for Graphical User Interface (GUI)

package addressbook;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class Display extends GridPane {
	// Static so they can be used globally (specifically in methods)
	static BorderPane bpane = new BorderPane();
	static HBox hbox2 = new HBox(10);
	static HBox hbox3 = new HBox(10);
	
	Display(){
		
	}

	public static BorderPane getPane() {		
		GridPane gpane = new GridPane();
		gpane.setVgap(10);
		gpane.setHgap(10);
		
		HBox hbox1 = new HBox(10);
		hbox1.setAlignment(Pos.CENTER);
		
		hbox2.setAlignment(Pos.CENTER);
		hbox2.setLayoutX(285);
		hbox2.setLayoutY(123);
		
		hbox3.setAlignment(Pos.CENTER);
		hbox3.setLayoutX(285);
		hbox3.setLayoutY(123);
		
		Label name = new Label("Name");
		Label street = new Label("Street");
		Label city = new Label("City");
		Label state = new Label("State");
		Label zip = new Label("Zip");
		
		TextField nametf = new TextField();
		TextField streettf = new TextField();
		TextField citytf = new TextField();
		TextField statetf = new TextField();
		TextField ziptf = new TextField();
		
		nametf.setPrefWidth(300);
		statetf.setPrefWidth(40);
		ziptf.setPrefWidth(60);
		
		Button add = new Button("Add");
		Button first = new Button("First");
		Button next = new Button("Next");
		Button previous = new Button("Previous");
		Button last = new Button("Last");
		Button update = new Button("Update");
		Button newbt = new Button("New");
		
		Text added = new Text("Address added!");
		Text updated = new Text("Address updated!");
		
		added.setFill(Color.RED);
		updated.setFill(Color.RED);
		
	
		try {
			AddressBook address = new AddressBook();
			// Sets the first address entry in window
			address.firstAddress();
			nametf.setText(address.getName());
			streettf.setText(address.getStreet());
			citytf.setText(address.getCity());
			statetf.setText(address.getState());
			ziptf.setText(address.getZip());
			
			
		/*** EVENTS ***/
 
		add.setOnAction(e -> {
			try {
				removeText();
				address.setName(nametf.getText());
				address.setStreet(streettf.getText());
				address.setCity(citytf.getText());
				address.setState(statetf.getText());
				address.setZip(ziptf.getText());
				// ENCODED AS A BYTE ARRAY
				address.setNameByte(address.getName().getBytes());
				address.setStreetByte(address.getStreet().getBytes());
				address.setCityByte(address.getCity().getBytes());
				address.setStateByte(address.getState().getBytes());
				address.setZipByte(address.getZip().getBytes());
				address.addAddress();
				addedText();
				
				// Clear textfield when added to address book
				nametf.setText(clearField());
				streettf.setText(clearField());
				citytf.setText(clearField());
				statetf.setText(clearField());
				ziptf.setText(clearField());		
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
		});
		 
		first.setOnAction(e -> {
			try {
				removeText();
				address.firstAddress();
				nametf.setText(address.getName());
				streettf.setText(address.getStreet());
				citytf.setText(address.getCity());
				statetf.setText(address.getState());
				ziptf.setText(address.getZip());
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
		});
		
		next.setOnAction(e -> {
			try {
				removeText();
				address.nextAddress();
				nametf.setText(address.getName());
				streettf.setText(address.getStreet());
				citytf.setText(address.getCity());
				statetf.setText(address.getState());
				ziptf.setText(address.getZip());
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		});
		
		previous.setOnAction(e -> {
			try {
				removeText();
				address.previousAddress();
				nametf.setText(address.getName());
				streettf.setText(address.getStreet());
				citytf.setText(address.getCity());
				statetf.setText(address.getState());
				ziptf.setText(address.getZip());
			} catch(Exception ex){
				ex.printStackTrace();
			}
			
		});
		
		last.setOnAction(e -> {
			try {
				removeText();
				address.lastAddress();
				nametf.setText(address.getName());
				streettf.setText(address.getStreet());
				citytf.setText(address.getCity());
				statetf.setText(address.getState());
				ziptf.setText(address.getZip());
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			
		});
		
		update.setOnAction(e -> {
			try {
				removeText();
				address.setName(nametf.getText());
				address.setStreet(streettf.getText());
				address.setCity(citytf.getText());
				address.setState(statetf.getText());
				address.setZip(ziptf.getText());
				
				address.setNameByte(address.getName().getBytes());
				address.setStreetByte(address.getStreet().getBytes());
				address.setCityByte(address.getCity().getBytes());
				address.setStateByte(address.getState().getBytes());
				address.setZipByte(address.getZip().getBytes());
				address.updateAddress();
				updateText();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			
		});
		
		// Clears textfield
		newbt.setOnAction(e -> {
			try {
				removeText();
				nametf.setText(clearField());
				streettf.setText(clearField());
				citytf.setText(clearField());
				statetf.setText(clearField());
				ziptf.setText(clearField());
				
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			
		});
				
		} catch(Exception ex) {
			ex.printStackTrace();
		} 

		hbox1.getChildren().addAll(newbt, add, first, next, previous, last, update);
		hbox2.getChildren().add(added);
		hbox3.getChildren().add(updated);
		gpane.add(name, 1, 1);
		gpane.add(nametf, 3, 1);
		gpane.add(street, 1, 2);
		gpane.add(streettf, 3, 2);
		gpane.add(city, 1, 3);
		gpane.add(citytf, 3, 3);
		gpane.add(state, 4, 3);
		gpane.add(statetf, 5, 3);
		gpane.add(zip, 6, 3);
		gpane.add(ziptf, 7, 3);
		bpane.setBottom(hbox1);
		bpane.setCenter(gpane);

		return bpane;
	}
	
	public static String clearField() {
		return "";
	}
	
	public static BorderPane addedText() {
		bpane.getChildren().add(hbox2);
		return bpane;
	}
	
	public static BorderPane updateText() {
		bpane.getChildren().add(hbox3);
		return bpane;
	}
	
	public static BorderPane removeText() {
		bpane.getChildren().remove(hbox2);
		bpane.getChildren().remove(hbox3);
		return bpane;
	}
	

}
