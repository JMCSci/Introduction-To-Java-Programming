/* Student class is a subclass of Person
 * Student has a class status (ex. Freshman, Sophomore, Junior, Senior)
 * Class status is a constant
 */

package person;

public class Student extends Person {
	int statusCode;
	private final String [] STATUS = new String [4];
	
	Student() {
		super();				// can now access the parent class constructor
	}
	
	Student(int x) {
		super();
		if(x == 0) {
		 STATUS[0] = "FRESHMAN";
		 statusCode = 0;
		} else if (x == 1) {
		 STATUS[1] = "SOPHOMORE";
		 statusCode = 1;
		} else if (x == 2) {
		 STATUS[2] = "JUNIOR";	
		 statusCode = 2;
		} else if (x == 3) {
		 STATUS[3] = "SENIOR";
		 statusCode = 3;
		}
		
	}
	
// getter
	public String getStudent() {
		return STATUS[statusCode];
	}
	
// setter
	public void setStudent(int x) {
		if(x == 0) {
			 STATUS[0] = "FRESHMAN";
			 statusCode = 0;
			} else if (x == 1) {
			 STATUS[1] = "SOPHOMORE";
			 statusCode = 1;
			} else if (x == 2) {
			 STATUS[2] = "JUNIOR";	
			 statusCode = 2;
			} else if (x == 3) {
			 STATUS[3] = "SENIOR";
			 statusCode = 3;
			}
	}
	
// to String method
	public String toString() {
		return "Class name: Student, " + "Person's name: " + getName() + 
				", Class status: " + STATUS[statusCode];
	}
	
}
