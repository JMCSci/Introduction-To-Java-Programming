package newmethods;

import java.util.ArrayDeque;
import java.util.Queue;

public class NewMethods {
	public static void main(String[] args) {
	TreeNode tree = new TreeNode(60);
	int height;
	tree.insert(55);
	tree.insert(100);
	tree.insert(45);
	tree.insert(57);
	tree.insert(67);
	tree.insert(107);
	tree.insert(59);
	tree.insert(101);
	tree.breadthFirstTraversal();	
	height = tree.height();
	System.out.println("Height: " + height);
	}	

}

class TreeNode {
	int data;
	TreeNode root;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data = data;
		if(root == null) {
			root = this;
		}
	}
	
	void insert(int value) {
		TreeNode node = new TreeNode(value);
		TreeNode current = root;
		while(current != null) {
			if(value == current.data) {
				return;
			} else if(value < current.data && current.left != null) {
				current = current.left;
			} else if(value > current.data && current.right != null) {
				current = current.right;
			} else {
				break;
			}
		}
		
		if(value < current.data && current.left == null) {
			current.left = node;
		} else if(value > current.data && current.right == null) {
			current.right = node;
		}
	}
	
	void inorder() {
		if(left != null) {
			left.inorder();
		}
		System.out.println(data);
		if(right != null) {
			right.inorder();
		}
	}
	
	void breadthFirstTraversal() {
		// First root node is visited
		// Then all the children from left to right
		// Than grandchildren of the root from left to right
		// And so on
		Queue<TreeNode> queue = new ArrayDeque<>();
		TreeNode current = root;
		while(!queue.isEmpty() || current != null) {
			if(current == root) {
				System.out.println(current.data);
			}
			if(current.left != null) {
				queue.add(current.left);
			}
			if(current.right != null) {
				queue.add(current.right);
			}
			
			if(!queue.isEmpty()) {
				current = queue.poll();
				System.out.println(current.data);
			} else {
				current = null;
			}
		}
	}
	
	// Find maximum depth from root to leaf
	// Find the deepest ACCESSABLE leaf node
	int height() {
		int height = 0;
		if(root == null) {
			return -1;
		} else {
			if(left != null) {
				System.out.println("LEFT");
				height = 1 + left.height();
			}
			
			if(right != null) {
				System.out.println("RIGHT");
				height = 1 + right.height();
			}
						
		}	
		return height;
		
	}
}
