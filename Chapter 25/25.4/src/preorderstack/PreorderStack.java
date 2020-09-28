package preorderstack;

import java.util.Scanner;
import java.util.Stack;

public class PreorderStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeNode tree = new TreeNode();
		System.out.print("Enter 10 integers: ");
		for(int i = 0; i < 10; i++) {
			tree.insert(sc.nextInt());
		}
//		tree.preorder();
		tree.preorderStack();
		sc.close();
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
	TreeNode(){
		
	}
	
	void insert(int value) {
		if(root == null) {
			this.data = value;
			root = this;
			return;
		}
		
		if(value == data) {
			return;
		}
		
		if(value < data) {
			if(left != null) {
				left.insert(value);
			} else {
				left = new TreeNode(value);
			}
		} else if(value > data) {
			if(right != null) {
				right.insert(value);
			} else {
				right = new TreeNode(value);
			}
		}
		
	}
	
	void inorder() {
		if(left != null) {
			left.inorder();
		}
		System.out.print(data + " ");
		if(right != null) {
			right.inorder();
		}
	}
	
	// 1 -3 4 0 -43 4 5 -11 100 3
	void preorder() {
		System.out.print(data + " ");
		if(left != null) {
			left.preorder();
		}
		if(right != null) {
			right.preorder();
		}
	}
	
	// 60 55 100 45 57 67 107 59 101 102
	// 60 55 45 57 59 100 67 107 101 102 
	void preorderStack() {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;
		while(!stack.isEmpty() || current != null) {

			if(current != null) {
			
			} else {
			
			
			}
		}
	}
	
	
}
