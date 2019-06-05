/* Class named MyInteger
 * Various instructions 
 * See comments below
 */

package myInteger;

// blueprint
public class MyInteger {
	public int value;
	public char[] num;
	public String objStr;
	
// no-arg constructor	
	MyInteger() {
		value = 0;
	}

// arg integer constructor	
	MyInteger(int value) {
		this.value = value;
	}
	
// arg String constructor	
	MyInteger(String objStr){
		this.objStr = objStr;
	}
	
// getter for value data field 
	public int getValue() {
		return value;
	}
	
// method isEven returns true if value in object is even
	public Boolean isEven(int value) {
		if(value % 2 == 0) {
			return true;
		} else
			
		return false;
	}

// method isOdd returns true if value in object is odd
	public Boolean isOdd(int value) {
		if(value % 2 != 0  ) {
			return true; 
		} else
			return false;
	}

// method isPrime returns true if value in object is a prime number 
	public Boolean isPrime() {
		if(value % 2 != 0 && value % 3 != 0) {
			return true;
		} else 
			return false;
	}

// static method isPrime returns true if value in object is a prime number 
	public static Boolean isPrime(int value) {
		if(value % 2 != 0 && value % 3 != 0) {
			return true;
		} else 
			return false;
	}
	
// method equals returns true if value in object is equal to specified value
	public Boolean equals(int specifiedValue) {
		if(specifiedValue == value) {
			return true;
		} else
			return false;
	}

// method equals returns true if value in object is equal to specified value
	public Boolean equals(MyInteger x) {
		MyInteger test = new MyInteger(4); 
		if(test.value == value) {								
				return true;				
			} else
				return false;
	}
	
// method parseInt converts an array of numeric characters to a int value
	public static int parseInt(char num []) {
		int intValue = Integer.parseInt(String.valueOf(num));		
		return intValue;
	}

// method parseInt converts a string into an into a int value 
	public static int parseInt(String x) {
		int intValue = Integer.parseInt(x);
		return intValue;
	}

}
