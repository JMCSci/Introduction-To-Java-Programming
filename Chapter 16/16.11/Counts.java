/* Counts class
 * Class creates histogram
 */

package letterhistogram;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.collections.ObservableList;
import java.io.File;
import java.util.Scanner;

/* NOTES:
 * HBox will hold rectangles
 * VBox will hold HBox, line and letters 
 * Returns one pane (VBox) 
 */

public class Counts extends Pane {
	protected int [] counts = new int [26];
	protected int sum = 0;
	protected String temp = null;

	protected VBox getPane() throws Exception {
		Scanner input = new Scanner(new File("test.txt"));
		
		while(input.hasNext()) {
			temp = input.next();
			for(int j = 0; j < temp.length(); j++) {
				if(temp.charAt(j) == 'a' || temp.charAt(j) == 'A') {
					sum = sum + 1;
					counts[0] = sum;
				}
				if(temp.charAt(j) == 'b' || temp.charAt(j) == 'B') {
					sum = sum + 1;
					counts[1] = sum;
				}
				if(temp.charAt(j) == 'c' || temp.charAt(j) == 'C') {
					sum = sum + 1;
					counts[2] = sum;
				}
				if(temp.charAt(j) == 'd' || temp.charAt(j) == 'D') {
					sum = sum + 1;
					counts[3] = sum;
				}
				if(temp.charAt(j) == 'e' || temp.charAt(j) == 'E') {
					sum = sum + 1;
					counts[4] = sum;
				}
				if(temp.charAt(j) == 'f' || temp.charAt(j) == 'F') {
					sum = sum + 1;
					counts[5] = sum;
				}
				if(temp.charAt(j) == 'g' || temp.charAt(j) == 'G') {
					sum = sum + 1;
					counts[6] = sum;
				}
				if(temp.charAt(j) == 'h' || temp.charAt(j) == 'H') {
					sum = sum + 1;
					counts[7] = sum;
				}
				if(temp.charAt(j) == 'i' || temp.charAt(j) == 'I') {
					sum = sum + 1;
					counts[8] = sum;
				}
				if(temp.charAt(j) == 'j' || temp.charAt(j) == 'J') {
					sum = sum + 1;
					counts[9] = sum;
				}
				if(temp.charAt(j) == 'k' || temp.charAt(j) == 'K') {
					sum = sum + 1;
					counts[10] = sum;
				}
				if(temp.charAt(j) == 'l' || temp.charAt(j) == 'L') {
					sum = sum + 1;
					counts[11] = sum;
				}
				if(temp.charAt(j) == 'm' || temp.charAt(j) == 'M') {
					sum = sum + 1;
					counts[12] = sum;
				}
				if(temp.charAt(j) == 'n' || temp.charAt(j) == 'N') {
					sum = sum + 1;
					counts[13] = sum;
				}
				if(temp.charAt(j) == 'o' || temp.charAt(j) == 'O') {
					sum = sum + 1;
					counts[14] = sum;
				}
				if(temp.charAt(j) == 'p' || temp.charAt(j) == 'P') {
					sum = sum + 1;
					counts[15] = sum;
				}
				if(temp.charAt(j) == 'q' || temp.charAt(j) == 'Q') {
					sum = sum + 1;
					counts[16] = sum;
				}
				if(temp.charAt(j) == 'r' || temp.charAt(j) == 'R') {
					sum = sum + 1;
					counts[17] = sum;
				}
				if(temp.charAt(j) == 's' || temp.charAt(j) == 'S') {
					sum = sum + 1;
					counts[18] = sum;
				}
				if(temp.charAt(j) == 't' || temp.charAt(j) == 'T') {
					sum = sum + 1;
					counts[19] = sum;
				}
				if(temp.charAt(j) == 'u' || temp.charAt(j) == 'U') {
					sum = sum + 1;
					counts[20] = sum;
				}
				if(temp.charAt(j) == 'v' || temp.charAt(j) == 'V') {
					sum = sum + 1;
					counts[21] = sum;
				}
				if(temp.charAt(j) == 'w' || temp.charAt(j) == 'W') {
					sum = sum + 1;
					counts[22] = sum;
				}
				if(temp.charAt(j) == 'x' || temp.charAt(j) == 'X') {
					sum = sum + 1;
					counts[23] = sum;
				}
				if(temp.charAt(j) == 'y' || temp.charAt(j) == 'Y') {
					sum = sum + 1;
					counts[24] = sum;
				}
				if(temp.charAt(j) == 'z' || temp.charAt(j) == 'Z') {
					sum = sum + 1;
					counts[25] = sum;
				}	
			} 
		}
		
		Line line = new Line(415, 0, 0, 0);
		
		Label lb1 = new Label("A  B  C  D  E  F  G  H  I  J  K  L  M "
				+ " N  O  P  Q  R  S  T  U  V  W  X  Y  Z");
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.BOTTOM_LEFT);
		hbox.setSpacing(5);
		
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.BOTTOM_LEFT);
		vbox.setPadding(new Insets(0,0,50,10));
		
		ObservableList <Node> list = hbox.getChildren();
		
		for(int i = 0; i < counts.length; i++) {
			Rectangle rectangle = new Rectangle(10, counts[i]);
			rectangle.setFill(Color.TRANSPARENT);
			rectangle.setStroke(Color.BLACK);		
			list.add(rectangle);
		}
		
		vbox.getChildren().addAll(hbox, line, lb1);
		input.close();
		
		return vbox;
	}
	
	public void setCounts(int number, int countValue) {
		counts[number] = countValue;
	}
	
	public int getCounts(int number) {
		return counts[number];
	}
	
}
