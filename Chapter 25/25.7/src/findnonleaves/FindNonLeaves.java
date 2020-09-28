package findnonleaves;

import java.util.Stack;

public class FindNonLeaves {
	public static void main(String[] args) {
		TreeNode tree=  new TreeNode(60);
		tree.insert(55);
		tree.insert(100);
		tree.insert(45);
		tree.insert(57);
		tree.insert(67);
		tree.insert(107);
		tree.insert(59);
		tree.insert(101);
		tree.getNumberOfNonLeaves();
	}

}

class TreeNode {
    int data;
    TreeNode root;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
    	this.data = data;
    	if(root == null) {
    		root = this;
        }
    }
    
    int getNumberOfNonLeaves() {
    	Stack<TreeNode> stack = new Stack<>();
    	int nonLeaves = 0;
    	TreeNode current = root;
    	
    	while(!stack.isEmpty() || current != null) {
    		if(current != null) {
    			stack.push(current);
    			current = current.left;
    		} else {
    			current = stack.pop();
    			if(current.left != null || current.right != null) {
    				nonLeaves++;
    			}
    			current = current.right;
    		}
    	}
    	System.out.println(nonLeaves);
    	return nonLeaves;
    }
    
    void insert(int value){
    	TreeNode current = root;
    	while(current != null){
    		if(value == current.data){
    			return;
    		} else if(value < current.data && current.left != null){
    			current = current.left;
            } else if(value > current.data && current.right != null){
                current = current.right;
            } else{
                break;
            }
         }

        if(value < current.data && current.left == null){
        	current.left = new TreeNode(value);
        } else if(value > current.data && current.right == null){
        	current.right = new TreeNode(value);
        }
    }

    void inorder(){
    	if(left != null){
    		left.inorder();
        }
    	System.out.print(data + " ");
    	if(right != null){
    		right.inorder();
        }
    }
    
}
