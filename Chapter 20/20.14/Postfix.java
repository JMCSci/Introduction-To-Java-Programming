/* Chapter 20.14
 * Evaluate an expression using postfix notation
 * Expression is passed as a command line argument in one string
 */

package postfix;

import java.util.Stack;

public class Postfix {
	public static void main(String[] args) {
		Stack<Integer> operand = new Stack<>();
		String expression = args[0];
		evaluate(expression, operand);
		System.out.println(operand.peek());
	}

	public static void evaluate(String ex, Stack<Integer> operand) {
		int result = 0;
		for(int i = 0; i < ex.length(); i++) {
			// If element contains an operator, perform operation on top two operands
			if(ex.charAt(i) == '+' || ex.charAt(i) == '-' ||
			   ex.charAt(i) == '*' || ex.charAt(i) == '/') {
				if(ex.charAt(i) == '+') {
					result = operand.pop() + operand.pop();
					operand.push(result);
				} if(ex.charAt(i) == '-') {
					result = operand.pop() - operand.pop();
					operand.push(result);
				} if(ex.charAt(i) == '*') {
					result = operand.pop() * operand.pop();
					operand.push(result);
				} if(ex.charAt(i) == '/') {
					result = operand.pop() / operand.pop();
					operand.push(result);
				}
			} else { 
				// Push operand to the top of the stack
				operand.push(Integer.parseInt(Character.toString(ex.charAt(i))));
			}
		}
	}
		
}
