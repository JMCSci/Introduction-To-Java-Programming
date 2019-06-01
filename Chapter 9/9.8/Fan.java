/* Fan class designed to represent a fan */

package fan;

// blueprint
public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed;	 // specifies speed of fan (default is "slow")
	private Boolean on;      // true specifies fan is on, false specifies off (default is "false")
	private double radius;   // specifies radius of the fan (default is "5")
	public String color;     // specifies color of fan (default is "blue")

// constructor -- creates default fan 
	Fan() {
		speed = SLOW; 
		on = true;
		radius = 5;
		color = "blue";
	}
	
// method -- used ONLY if object contains arguments 
	public Fan (int speed, Boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.speed = 2;
		fan1.on = true;
		fan1.radius = 5;
		fan1.color = "blue";
		fan2.on = false;
		fan2.speed = 3;
		fan2.radius = 10;
		fan2.color = "yellow";
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}
	
// return string description of fan
	public String toString() {
		if(on == true) {
		return "Color: " + color + ", Speed: " + speed + ", Radius: " + radius;
		} else {
			return "FAN IS OFF -- Color: " + color + ", Radius: " + radius;
		}
		
	}
  }
