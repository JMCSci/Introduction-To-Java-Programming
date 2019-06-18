/* Chapter 10.14
 * Class retrieves and displays year, month and day 
 * Data fields represent a date
 * 0 is for January
 */

package myDate;

import java.util.GregorianCalendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	@SuppressWarnings(value = { "unused" }) 
	private long milliseconds;
	GregorianCalendar MyDate = new GregorianCalendar();
	
	
// no-arg constructor create object for current date	
	MyDate() {
		milliseconds = System.currentTimeMillis();
	}
	
// argument constructor -- specified elapsed time since UNIX epoch
	MyDate(long milliseconds) {
		this.milliseconds = milliseconds;		
	}
	
// argument constructor with specified year, month and day
	MyDate(int year, int month, int day) {
		MyDate.set(year, month, day);
	}
	
	
// getter for hour
	public int getMonth() {
		return month = MyDate.get(GregorianCalendar.MONTH);
	}
	
	public int getDay() {
		return day = MyDate.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	public int getYear() {
		return year = MyDate.get(GregorianCalendar.YEAR);
	}
	
// method setDate -- sets a new date for object using the elapsed time
	public void setDate(long elapsedTime) {
		MyDate.setTimeInMillis(elapsedTime);
	}
	
// method getDate -- gets date 
	public void getDate() {
		System.out.println(MyDate.getTime());
	}



}
