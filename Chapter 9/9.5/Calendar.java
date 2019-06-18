/* Calendar class 
 */

package calendar;

import java.util.GregorianCalendar;
import java.util.Date;

public class Calendar {
	private int year;
	private int month;
	private int day;
	GregorianCalendar calendar = new GregorianCalendar();
	Date date = new Date();
	
// no-arg constructor -- current year, month and day
	public Calendar() {
			year = calendar.get(GregorianCalendar.YEAR);
			month = calendar.get(GregorianCalendar.MONTH);
			day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		}
	
// getter
		public int getMonth() {
			return month;
		}
		
		public int getDay() {
			return day;
		}
		
		public int getYear() {
			return year;
		}

// method returns time in milliseconds
		public Date getTimeCalendar() {
			return calendar.getTime();
		}

// method sets time in milliseconds
		public void setTimeCalendar(long time) {
		  calendar.setTimeInMillis(time);
		}
		

}
