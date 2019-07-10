/* Chapter 12.1 (INCOMPLETE)
*  Must be run from Command Prompt or Terminal window
 * java -jar <directory/filename> arg1 arg2 arg3
 * This program uses an exception handler
 */

package calculator;


public class Calculator {
	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
			
		}
		
		int result = 0; 
		
		
		try {
		switch(args[1].charAt(0)) {
		// type in prompt as string -- converts to a integer for calculation
		case '+' : result = Integer.parseInt(args[0]) +
							Integer.parseInt(args[2]);
					break;
		case '-' : result = Integer.parseInt(args[0]) - 
							Integer.parseInt(args[2]); 
					break;
		case '.' : result = Integer.parseInt(args[0]) * 
							Integer.parseInt(args[2]);
					break;
		case '/' : result = Integer.parseInt(args[0]) /
							Integer.parseInt(args[2]);
		}
		
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] +
				" = " + result);
		
		}
		catch (NumberFormatException ex) {
			
			System.out.println("Invalid type: " + ex.getMessage().substring(18, 22));
			
			}
		
		
	}

}
