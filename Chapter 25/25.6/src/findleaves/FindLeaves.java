/* Chapter 25.6 */

package findleaves;

import java.util.Stack;

public class FindLeaves {
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(60);
		tree.insert(55);
		tree.insert(100);
		tree.insert(45);
		tree.insert(57);
		tree.insert(67);
		tree.insert(107);
		tree.insert(59);
		tree.insert(101);
		tree.getNumberOfLeaves();
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
    
    int getNumberOfLeaves() {
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode current = root;
    	int leaves = 0;
    	while(!stack.isEmpty() || current != null) {
    		if(current != null) {
    			stack.push(current);
    			current = current.left;
    		} else {    			
    			current = stack.pop();
    			if(current.left == null && current.right == null) {
    				leaves++;
    			}
    			current = current.right;
    		}
    		
    	}
    	System.out.println(leaves);
    	return leaves;
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
        
