package inorderstack;

import java.util.Stack;
import java.util.Scanner;

public class InorderStack {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		TreeNode tree = new TreeNode();
		System.out.print("Enter 10 integers: ");
		for(int i = 0; i < 10; i++) {
			tree.insert(sc.nextInt());
		}
		tree.inorderStack();
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
			root = this;
		}
		TreeNode node = new TreeNode(value);
		TreeNode current = root;
		while(current != null) {
			if(value == current.data) {
				return;
			}
			if(value < current.data && current.left != null) {
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
	
	void inorderStack() {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;
		while(!stack.isEmpty() || current != null) {
			if(current != null) {
				stack.push(current);
				current = current.left;
			} else {
				current = stack.pop();
				System.out.print(current.data + " ");
				current = current.right;
			}
		}
		System.out.println();
	}
	
}
