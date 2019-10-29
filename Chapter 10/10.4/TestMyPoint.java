/* Client test MyPoint class */

package mypoint;

public class TestMyPoint {
	public static void main(String[] args) {
		MyPoint mypoint1 = new MyPoint();
		MyPoint mypoint2 = new MyPoint(10, 30.5);
		// Finds distance between (0, 0) and (10, 30.5)
		System.out.println(mypoint1.distance(mypoint2.getx1(), mypoint2.gety1()));
	}

}
