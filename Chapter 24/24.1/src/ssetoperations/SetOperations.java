package ssetoperations;

import java.util.ArrayList;

public class SetOperations {
	public static void main(String[] args) {
		MyArrayList<String> list1 = new MyArrayList<>();
		list1.add("Tom");
		list1.add("George");
		list1.add("Peter");
		list1.add("Jean");
		list1.add("Jane");
		
		MyArrayList<String> list2 = new MyArrayList<>();
		list2.add("Tom");
		list2.add("George");
		list2.add("Michael");
		list2.add("Michelle");
		list2.add("Daniel");
		
		list1.retainAll(list2);
		System.out.println(list1);
	}

}
