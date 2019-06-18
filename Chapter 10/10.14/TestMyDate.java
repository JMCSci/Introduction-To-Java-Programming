/* Chapter 10.14
 * Creates objects for MyDate class 
 * Creates objects utilizing constructors and methods from MyDate class
 */


package myDate;

public class TestMyDate {
	public static void main(String[] args) {
		MyDate date1 = new MyDate();						// no-arg object with current time (in milliseconds)
		MyDate date2 = new MyDate(34355555133101L);			// argument object with specified time (in milliseconds)
		MyDate date3 = new MyDate(2000,1,1);				// argument object with specified year, month, day
		System.out.println(date1.getMonth());				// gets the current month
		System.out.println(date1.getDay());					// gets the current day in month
		System.out.println(date1.getYear());				// gets the current year
		date2.setDate(561555550000L);						// specified system time (in milliseconds)
		date1.getDate();									// displays time from object (date1)
		date2.getDate();									// displays time from object (date2)
		date3.getDate();									// displays time from object (date3)

		
	}

}
