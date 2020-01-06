/* Test ReviseGeneric 
 * TestGeneric is long b/c I tested every contingency 
 */

package revisegeneric;

public class TestGeneric {
	public static void main(String[] args) {
		// Static methods and instance variables so class is accessed in static way
		ReviseGeneric generic = new ReviseGeneric();
		System.out.println("Current array values: ");
		ReviseGeneric.printArray();
		System.out.println();
		System.out.println("Peek: " + ReviseGeneric.peek());
		System.out.println();
		System.out.println("Array size: " + ReviseGeneric.getSize());
		ReviseGeneric.push("Madrid");
		System.out.println();
		System.out.println("Array size: " + ReviseGeneric.getSize());
		System.out.println();
		System.out.println("New array values after push: ");
		ReviseGeneric.printArray();
		System.out.println();
		ReviseGeneric.push("Venice");
		System.out.println();
		System.out.println("New array values after push: ");
		ReviseGeneric.printArray();
		ReviseGeneric.push("Stockholm");
		System.out.println();
		System.out.println("New array values after push: ");
		ReviseGeneric.printArray();
		ReviseGeneric.push("Warsaw");
		System.out.println();
		System.out.println("New array values after push: ");
		ReviseGeneric.printArray();
		System.out.println();
		ReviseGeneric.push("Prague");
		System.out.println();
		System.out.println("New array values after push: ");
		ReviseGeneric.printArray();
		System.out.println();
		System.out.println("Pop value: " + ReviseGeneric.pop());
		System.out.println();
		System.out.println("New array values after pop:");
		ReviseGeneric.printArray();
		System.out.println();
		System.out.println("Pop value: " + ReviseGeneric.pop());
		System.out.println();
		System.out.println("New array values after pop:");
		ReviseGeneric.printArray();
	}

}
