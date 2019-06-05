/* Test MyInteger class
 */

package myInteger;

public class TestInteger {
	/*  MAIN */
	public static void main(String[] args) {
		MyInteger test1 = new MyInteger(1);			     // argument object 
		MyInteger test2 = new MyInteger("13");	     // argument object
		MyInteger test3 = new MyInteger();			     // no-argument object
		char [] charArray = {'9', '4', '3'};	       // character array
		int x, y;								                	   // variables for function return values
    System.out.println(test1.getValue());	       // value returned from getter
		System.out.println(test1.equals(test1));	   // true/false returned
		System.out.println(test1.isPrime());	    	 // true/false returned
		System.out.println(MyInteger.isPrime(11));	 // true/false returned
		System.out.println(test1.isEven(6));	  	   // true/false returned
		System.out.println(test1.isOdd(22));	    	 // true/false returned
		System.out.println(test3.equals(55));	    	 // true/false returned
		x = MyInteger.parseInt(test2.objStr);	    	 // converts string into integer
		System.out.println(x);						           // prints converted string
		y = MyInteger.parseInt(charArray);		    	 // converts char array into integer
		System.out.println(y);					          	 // prints converted array
		
	}

}
