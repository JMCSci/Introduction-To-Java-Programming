package setoperations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;

public class SetOperations {
	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList("Jim", "John", "Blake", 
				"Kevin", "Michael"));
		LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", 
				"Michelle", "Ryan"));
	
		LinkedHashSet<String> clone1 = (LinkedHashSet<String>)set1.clone();
		LinkedHashSet<String> clone2 = (LinkedHashSet<String>)set2.clone();
		
		// Union
		clone1.addAll(clone2);
		System.out.println("Union: " + clone1.toString().replace("[", "").replace("]", ""));
		
		// Intersection
		clone1.retainAll(clone2);
		System.out.println("Intersection: " + clone1.toString().replace("[", "").replace("]", ""));
		
		// Difference
		clone1.removeAll(clone2);
		System.out.println("Difference: " + clone1.toString().replace("[", "").replace("]", ""));
	}

}
