/* Event class
 * Contains instance variables and methods for events
 */

package storenumbers;

import java.util.LinkedList;
import java.util.Collections;

public class Event extends Display {
	protected String number = "";
	protected String temp = "";
	protected int tempNum = 0;
	protected boolean duplicate = false;
	protected LinkedList<Integer>list = new LinkedList<Integer>();
	
	Event() {
		
	}
	
	// setNumber: Set instance variable and add to linked list
	public void setNumber(String number) {
		this.number = number;
		tempNum = Integer.parseInt(number);
		checkDuplicate();
		if(duplicate == false) {
			list.add(tempNum);
		}
	}
	
	// getDuplicate: Getter for duplicate instance variable
	public boolean getDuplicate() {
		return duplicate;
	}
	
	// getList: Loops to LinkedList and concatenates elements to a string
	public String getList() {
		for(int num: list) {
			temp = temp + " " + Integer.toString(num);
		}
		return temp;
	}
	
	// sort: Sorts elements in LinkedList
	public void sort() {
		Collections.sort(list);
		getList();
	}
	
	// shuffle: Shuffles elements in LinkedList
	public void shuffle() {
		Collections.shuffle(list);
		getList();
	}
	
	// reverse: Reverses elements in LinkedList
	public void reverse() {
		Collections.reverse(list);
		getList();
	}
	
	// getNum: Getter for tempNum;
	public int getNum() {
		return tempNum;
	}
	
	// clear: Returns an empty string
	public String clear() {
		temp = "";
		return temp;
	}
	
	// checkDuplicate: Checks if LinkedList already contains number
	public void checkDuplicate() {
		if(list.contains(tempNum)) {
			duplicate = true;
		} else {
			duplicate = false;
		}
	}

}
