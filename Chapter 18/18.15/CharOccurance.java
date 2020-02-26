/* Chapter 18.15
 * Program uses a helper method to find the occurrences of a letter in a string
 */

package charoccurance;

public class CharOccurance {
	static int sum = 0;
	
	public static void main(String[] args) {
		String str = "this a test";
		char a = 't';
		int high = str.length();
		count(str, a, high);
		System.out.println(sum);
	}
	
	public static int count(String str, char a, int high) {
		// BASE CASE -- STOPPING CONDITION
		if(high == 0) {
			return sum;
		}
		if(str.charAt(str.length() - 1) == a) {
			sum += 1;
		}
		return count(str.substring(0, high - 1), a, high - 1);
	}

}
