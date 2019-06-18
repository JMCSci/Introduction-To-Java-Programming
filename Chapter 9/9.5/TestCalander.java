/* Chapter 9.5 
 * Creates objects for Calendar class 
 * Prints current month, day and year from constructors and methods in Calendar class
 */

package calendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar test = new Calendar();
		System.out.println("Today's date is: " + test.getMonth() + " " + test.getDay() + " " + test.getYear());
		test.setTimeCalendar(1234567898765L);
		System.out.println(test.getTimeCalendar());
		
	}

}
