/* Program tests Time class 
 * Displays hour, minute, and second using arg and no-arg objects
 */

package time;

public class TestTime {
	public static void main(String[] args) {
		Time time1 = new Time();					// no-arg object
		Time time2 = new Time(555550000);			// arg object
		time2 = time2.setTime(time2.second);
		System.out.println(time1.totalHours + ":" + time1.totalMinutes + ":" + time1.totalSeconds);
		System.out.println(time2.totalHours + ":" + time2.totalMinutes + ":" + time2.totalSeconds);

	}

}
