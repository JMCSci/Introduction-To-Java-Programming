/* Faculty class extends Person class
 * Faculty has office hours and a rank
 */

package person;

public class Faculty extends Employee {
	private double officeHours;
	private int rank;
	
	Faculty() {
		super();
		officeHours = 0;
		rank = 0;
	}
	
	Faculty(double officeHours, int rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
// getter
	public double getOfficeHours() {
		return officeHours;
	}
	
	public int getRank() {
		return rank;
	}
	
// setter
	
	public void setOfficeHours(double newValue) {
		officeHours = newValue;
	}
	
	public void setRank(int newValue) {
		rank = newValue;
	}
	
// toString method
	public String toString() {
		return "Class name: Faculty, " + "Perons's name: " + getName() + ", Office Hours: " + getOfficeHours() + ", Rank: " + getRank();
	}

}
