/*	Extends ArrayList
 *	
 */

package mystack;

import java.util.ArrayList;

public class NewStack extends ArrayList<Object> {
		
		public int getSize() {
			return size();
		}
		
		public Object peek() {
			return get(getSize() - 1);
		}
		
// removes first object in ArrayList
		public Object pop() {
			Object o = get(getSize() - 1); 
			remove(getSize() - 1);
			return o;
		}
// add object to bottom of ArrayList 
		public void push(Object o) {
			add(o); 
		}
		
		@Override
		public String toString() {
			return "stack: " + toString();
		}

}
