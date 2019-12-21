package dynamictext;

import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;

public class SliderGUI extends StackPane {
	protected double red = 0;
	protected double green = 0;
	protected double blue = 0;
	protected double opacity = 1;
	
	public StackPane getPane() {
		// Create StackPane object to hold VBox and GridPane
		StackPane root = new StackPane();
		
		// Create GridPane object
		GridPane gpane = new GridPane();
		gpane.setVgap(5);
		gpane.setHgap(5);
		
		// Create VBox to hold Text object
		VBox vbox = new VBox();
		vbox.setSpacing(10);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(10,0,100,70));
		
		// Create Text object
		Text text = new Text("Show Colors");
		text.setFont(new Font(25));
		
		// Create Label objects
		Label lb1 = new Label("Red");
		Label lb2 = new Label("Green");
		Label lb3 = new Label("Blue");
		Label lb4 = new Label("Opacity");
		
		// Create ScrollBar objects
		ScrollBar s1 = new ScrollBar();
		s1.setOrientation(Orientation.HORIZONTAL);
		s1.setMax(100);
		s1.setMin(0);
		s1.setVisibleAmount(15);
		s1.setMaxWidth(150);
		s1.setUnitIncrement(5);
		
		ScrollBar s2 = new ScrollBar();
		s2.setOrientation(Orientation.HORIZONTAL);
		s2.setMax(100);
		s2.setMin(0);
		s2.setVisibleAmount(15);
		s2.setMaxWidth(150);
		s2.setUnitIncrement(5);
		
		ScrollBar s3 = new ScrollBar();
		s3.setOrientation(Orientation.HORIZONTAL);
		s3.setMax(100);
		s3.setMin(0);
		s3.setVisibleAmount(15);
		s3.setUnitIncrement(10);
		s3.setMaxWidth(150);
		
		ScrollBar s4 = new ScrollBar();
		s4.setOrientation(Orientation.HORIZONTAL);
		s4.setMax(100);
		s4.setMin(0);
		s4.setVisibleAmount(15);
		s4.setUnitIncrement(0.5);
		s4.setMaxWidth(150);
		 
		// EVENT: Red ScrollBar
		s1.valueProperty().addListener(ov -> { 
			red = s1.getValue() / 100;
			text.setFill(Color.color(red, green, blue, opacity));
		});
		
		// EVENT: Green ScrollBar
		s2.valueProperty().addListener(ov -> {
			green = s2.getValue() / 100;
			text.setFill(Color.color(red, green, blue, opacity));
		});
		
		// EVENT: Blue ScrollBar
		s3.valueProperty().addListener(ov -> {
			blue = s3.getValue() / 100;
			text.setFill(Color.color(red, green, blue, opacity));
		});
		
		// EVENT: Opacity ScrollBar
		s4.valueProperty().addListener(ov -> {
			opacity = 1 - s4.getValue() / 100;
			text.setFill(Color.color(red,  green, blue, opacity));
		});
		
		// Add text to VBox
		vbox.getChildren().add(text);
		// Add VBox and GridPane to StackPane
		root.getChildren().addAll(vbox, gpane);
		// Add Label and ScrollBar to GridPane
		gpane.add(lb1, 15, 15);
		gpane.add(s1, 16, 15);
		gpane.add(lb2, 15, 17);
		gpane.add(s2, 16, 17);
		gpane.add(lb3, 15, 19);
		gpane.add(s3, 16, 19);
		gpane.add(lb4, 15, 21);
		gpane.add(s4, 16, 21);
		
		return root;
	}
	

}
