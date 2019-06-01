/* Stopwatch class */

package stopwatch;

public class Stopwatch {
	private long startTime;
	private long endTime;
	
// initialize startTime to current time
	Stopwatch() {
		long millSec = System.currentTimeMillis();
		startTime = millSec;
	}
	
	public Stopwatch(long startTime, long endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
// resets the startTime to the current time	
		public long start() {
			startTime = System.currentTimeMillis();
			return startTime;
		}
		
// sets endTime to the current time
		public long stop() {
			endTime = System.currentTimeMillis();
			return endTime;
		}
// returns elapsed time for Stopwatch in milliseconds
		public long getElapsedTime() {
			return endTime - startTime;
		}	
}

