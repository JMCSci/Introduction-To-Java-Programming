/* Course class
 */

package course;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private ArrayList<String> replaceStudents = new ArrayList<>();		// new ArrayList; replaces old array 
	private int numberOfStudents;										// initial value is 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
		
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	  }
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}

// replaces array with ArrayList
	public void replaceArray() {
		for(int i = 0; i < students.length; i++) {
		replaceStudents.add(students[i]);
		}
	}

// returns ArrayList at specified element
	public String getArrayList(int x) {
		return replaceStudents.get(x);
	}
	
// drops student -- counter increments when condition met
// if statement used because of empty String array elements (null)
// counter used if there are multiple students with the same first name; both will be dropped in this program
// can change else array element in else/if to "null" if needed
// "NA" seems more appropriate since there was a student in that element previously
	public void dropStudent(String student) {
		int counter = 0;
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				break;
			} else if(students[i].equalsIgnoreCase(student)) {
			students[i] = "NA";
			counter++;
		}
	  }
		System.out.println(counter);
		numberOfStudents = numberOfStudents - counter;
	}
	
	public String checkStudent(int x) {
		return students[x];
	}
	
// method clear() removes all students in a course
// for loop does not check entire array -- stops if next element is null
// "NA" can be replaced with null 
	public void clear() {
		int counter = 0;
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				break;
// student was previously dropped and should not be counted	
			} if(students[i].contains("NA")) {		
				counter--;
// all active students removed
			} else
			students[i] = "NA";
			counter++;
		}
		numberOfStudents = numberOfStudents - counter;
	}
	
}
