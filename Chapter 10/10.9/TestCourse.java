/* Chapter 10.9 and 11.5
 * I combined these two exercises since they both use the same class
 */

package course;

public class TestCourse {
	public static void main(String[] args) {
		// new course objects
		Course csTest = new Course("Computer Science"); 
		Course mathTest = new Course("Math");
		// checks # of currently in course
		csTest.getStudents();
		System.out.println(csTest.getNumberOfStudents());
		// adds students to CS and Math courses
		csTest.addStudent("Jill");
		csTest.addStudent("John");
		mathTest.addStudent("Mike");
		mathTest.addStudent("Donna");
		mathTest.addStudent("Jasmine");
		// checks # of students in course
		System.out.println("Students in CS: " + csTest.getNumberOfStudents());
		System.out.println("Students in Math: " + mathTest.getNumberOfStudents());
		// uses ArrayList to replace array
		csTest.replaceArray();
		mathTest.replaceArray();
		// tests ArrayList at specified element
		System.out.println(csTest.getArrayList(1));
		System.out.println(mathTest.getArrayList(1));
		// drop student from course
		csTest.dropStudent("John");
		// check if student dropped at element 0
		System.out.println(csTest.checkStudent(1));
		// check if number students updated
		System.out.println(csTest.getNumberOfStudents());
		// remove all students from courses
		csTest.clear();
		mathTest.clear(); 
		// check if students removed 
		System.out.println(csTest.checkStudent(1));
		System.out.println(mathTest.checkStudent(1));
		// check if number students has been updated
		System.out.println(csTest.getNumberOfStudents());
		System.out.println(mathTest.getNumberOfStudents());
		// check array and ArrayList @ element 1
		System.out.println(csTest.checkStudent(1));
		System.out.println(mathTest.checkStudent(1));
		System.out.println(csTest.getArrayList(1));
		System.out.println(mathTest.getArrayList(1));
		
	}
}
