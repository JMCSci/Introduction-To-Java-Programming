/* RDisplay class */

package recursiveinteger;

public class RDisplay {
	protected char removed = ' ';
	protected int newInt = 0;
	protected int stringLength = 0;
	protected String reverseNumber = "";
	protected String temp = "";
	protected String charTemp = "";
	
	/* METHOD: reverseDisplay */
	public void reverseDisplay(int value) {
		temp = Integer.toString(value);
		stringLength = temp.length();
		// BASE -- stopping condition
		if(stringLength == 1) {
			reverseNumber = reverseNumber.concat(temp);
			newInt = Integer.parseInt(temp);
			System.out.println(reverseNumber);
		} else {
			// RECURSION - calls reverseDisplay until base condition is met
			removed = temp.charAt(stringLength - 1);
			charTemp = Character.toString(removed);
			reverseNumber = reverseNumber.concat(charTemp);
			newInt = Integer.parseInt(temp.substring(0, stringLength - 1));
			reverseDisplay(newInt);
		}
	}
	
	

}
