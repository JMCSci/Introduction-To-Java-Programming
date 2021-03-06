/* Chapter 24.1 */

package ssetoperations;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E>{
	public static final int INITIAL_CAPACITY = 16;
	private E[] data = (E[]) new Object[INITIAL_CAPACITY];
	
	public MyArrayList() {
		
	}
	
	public MyArrayList(E[] objects) {
		for(int i = 0; i < objects.length; i++) {
			add(objects[i]);
		}
	}
	
	public void add(int index, E e) {
		ensureCapacity();
		
		for(int i = size - 1; i >= index; i--) {
			data[i + 1] = data[i];
		}
		data[index] = e;
		size++;
	}
	
	public void ensureCapacity() {
		if(size >= data.length) {
			E[] newData = (E[])(new Object[size * 2 + 1]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}
	
	public void clear() {
		data = (E[]) new Object[INITIAL_CAPACITY];
		size = 0;
	}
	
	public boolean contains(E e) {
		for(int i = 0; i < size; i++) {
			if(e.equals(data[i])) {
				return true;
			}
		}
		return false;
	}
	
	public E get(int index) {
		checkIndex(index);
		return data[index];
	}
	
	public void checkIndex(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index " + index + " out of bounds");
		}
	}
	
	public int lastIndexOf(E e) {
		for(int i = size - 1; i >= 0; i--) {
			if(e.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public E remove(int index) {
		checkIndex(index);
		
		E e = data[index];
		
		for(int j = index; j < size - 1; j++) {
			data[j] = data[j + 1];
		}
		
		data[size - 1] = null;
		
		size--;
		return e;
	}
	
	public E set(int index, E e) {
		checkIndex(index);
		E old = data[index];
		data[index] = e;
		return old;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		
		for(int i = 0; i < size; i++) {
			result.append(data[i]);
			if(i < size - 1) result.append(", ");
		}
		
		return result.toString() + "]";
	}
	
	public void trimToSize() {
		if(size != data.length) {
			E[] newData = (E[])(new Object[size]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}
	
	public java.util.Iterator<E> iterator(){
		return new ArrayListIterator();
	}
	
	public class ArrayListIterator implements java.util.Iterator<E>{
		private int current = 0;
		
		public boolean hasNext() {
			return (current < size);
		}
		
		public E next() {
			return data[current++];
		}
		
		public void remove() {
			MyArrayList.this.remove(current);
		}
		
	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int index(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	// Adds elements that are missing from this list (Union)
	public boolean addAll(MyList<E> otherList) {
		for(int i = 0; i < otherList.size(); i++) {
			add(otherList.get(i));
			if(i == otherList.size() - 1) {
				return true;
			}
		}
		return false;
	}

	@Override
	// Removes elements that are in both lists (Difference)
	// Array size is not dynamic
	public boolean removeAll(MyList<E> otherList) {
		int length = otherList.size();
		int j = 0;
		E [] newData = (E[]) new Object[INITIAL_CAPACITY];
		// Add items in current list to a new list
		for(int i = 0; i < size; i++) {
			newData[j++] = data[i];
		}
		// Check current list and other list
		// Add items that not in current list
		for(int i = 0; i < length; i++) {
			if(!newData[i].equals(otherList.get(i))) {
				newData[j++] = otherList.get(i);
				size++;
			}
			if(i == length - 1) {
				data = newData;
			}
		}
		return true;
	}

	@Override
	// Only contains the elements that are in BOTH lists (Intersection)
	// Array size is not dynamic
	public boolean retainAll(MyList<E> otherList) {
		int length = otherList.size();
		E [] newData = (E[]) new Object[INITIAL_CAPACITY];
		int k = 0;
		size = 0;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(data[i].equals(otherList.get(j))) {
					newData[k++] = otherList.get(j);
					size++;
				} 
			}
		}
		data = newData;
		return true;
	}

}
