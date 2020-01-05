/* Test ReviseGeneric */

package revisegeneric;

public class TestGeneric {
	public static void main(String[] args) {
		ReviseGeneric generic = new ReviseGeneric();
		System.out.println("Current array values: ");
		ReviseGeneric.printArray();
		System.out.println();
		System.out.println("Array size: " + ReviseGeneric.getSize());
		ReviseGeneric.newArray();
		System.out.println("Array size: " + ReviseGeneric.getSize());
		System.out.println();
		ReviseGeneric.push("Madrid");
		System.out.println("New array values after push: ");
		ReviseGeneric.printArray();
		System.out.println();
		System.out.println("Pop value: " + ReviseGeneric.pop());
		System.out.println();
		System.out.println("New array values after pop:");
		ReviseGeneric.printArray();
	}

}
