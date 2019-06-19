/* Staff class extends Person class
 * Staff has a title
 */

package person;

public class Staff extends Employee {
	private String title;
	
	Staff() {
		super();
		title = null;
	}
	
	Staff(String title) {
		this.title = title;
	}
	
// getter
	
	public String getTitle() {
		return title;
	}
	
// setter
	public void setTitle(String newValue) {
		title = newValue;
	}
	
// toString method
	public String toString() {
		return "Class name: Staff, " + "Person's name: " + getName() + ", Title: " + getTitle();
	}
}

