package implementmylinkedlist;

public class ImplementLinkedList {
	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<>();	
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.add(7);
		
		System.out.println(list);
		System.out.println(list.contains(5));
		System.out.println(list.get(5));
		System.out.println(list.indexOf(7));
		System.out.println(list.lastIndexOf(7));
		System.out.println(list.set(2, 11));
		System.out.println(list.get(2));
	}

}
