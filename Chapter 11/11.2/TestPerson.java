/* Chapter 11.2 
 * Test Person, Student, Employee, Faculty, and Staff classes
 */

package person;

public class TestPerson {
	public static void main(String[] args) {
	Person Jane = new Person("Jane", "123 Cove Ln, Wichita, Nebraska", "555-6789", "jane@java.edu");
	Student Peter = new Student(2);
	Employee Carol = new Employee();
	Faculty Tina = new Faculty();
	Staff Steve = new Staff();
	
	Peter.setName("Peter");					// set name of person
	Carol.setName("Carol");
	Tina.setName("Tina");
	Steve.setName("Steve");		
	Carol.setSalary(75000);					// set salary
	Tina.setOfficeHours(5);					// set office hours
	Tina.setRank(10);						// set rank		
	Steve.setTitle("CIO");					// set title
	
	System.out.println(Jane);
	System.out.println(Peter);
	System.out.println(Carol);
	System.out.println(Tina);
	System.out.println(Steve);
	
	}
	

}
