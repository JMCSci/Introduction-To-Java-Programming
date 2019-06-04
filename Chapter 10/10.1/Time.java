/* Time class */

package time;

// blueprint  
public class Time {
	public long hour;
	public long totalHours;
	public long minute;
	public long totalMinutes;
	public long second;
	public long totalSeconds;
	
// no-arg constructor -- current time 
	Time() {
		second = (System.currentTimeMillis() / 1000);
		totalSeconds = second % 60;
		minute = (second / 60);	
		totalMinutes = minute % 60;
		hour = (minute / 60);
		totalHours = hour % 24;
	}
	
// constructor -- determines specified elapsed time since UNIX epoch	
	public Time(long specifiedTime) {
		second = specifiedTime;
	}

// constructor -- constructs object with specified hour, minute, second
	public Time(long hour, long minute, long second) {
		this.totalHours = hour;
		this.totalMinutes = minute; 
		this.totalSeconds = second;
	}

// getter - hour data field 
	public long getHour() {
		return totalHours;
	}
	
// getter -- minute data field
	public long getMinute() {
		return totalMinutes;
	}
	
// getter -- seconds data field 
	public long getSecond() {
		return totalSeconds;
	}
	
// method -- setTime sets a new time for object using the elapsed time 
	public Time setTime(long elapseTime) {
		Time time3 = new Time();
		time3.second = (elapseTime / 1000);
		time3.totalSeconds = time3.second % 60;
		time3.minute = (time3.second / 60);	
		time3.totalMinutes = time3.minute % 60;
		time3.hour = (time3.minute / 60);
		time3.totalHours = time3.hour % 24;
		return time3;
	}

}
