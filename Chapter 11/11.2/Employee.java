/* Employee class extends Person class
 * An employee has an office, salary, and date hired
 */

package person;

import myDate.MyDate;
import java.util.Date;

public class Employee extends Person {
	private String office;
	private double salary; 
	MyDate dateHired = new MyDate();
	
	Employee() {
		super();
		office = "NO";						// default is "NO"
		salary = 0;
		
	}
	
	Employee(String office, double salary) {
		this.office = office;
		this.salary = salary;
	}

// getter
	
	public String getOffice() {
		return office;
	}
	public String getEmployee() {
		return office;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getDateHired() {
		return dateHired.getDate();
	}
	
// setter
	public void setOffice(String newValue) {
		this.office = newValue;
	}
	
	public void setSalary(double newValue) {
		this.salary = newValue;
	}
	
	public void setDateHired(long newValue) {
		dateHired.setDate(newValue);
	}
	
// toString method
	public String toString() {
		return "Class name: Employee, " + "Person's name: " + getName() + 
				", Office: " + getOffice() + ", Salary: " + getSalary() + ", Date Hired: " + getDateHired();
	}
	

}
