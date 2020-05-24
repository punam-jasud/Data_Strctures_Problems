/*  Java Program to traverse a binary tree using PreOrder traversal.
 * In PreOrder the node value is printed first, followed by visit * to left and right subtree. 
 * input: 
 *   	 1
 *  	/ \ 
 *    2 	5 
 *   / \ 	\ 
 *  3   4 	 6 
  
 output: 1 2 3 4 5 6 */


package Tree;

import java.util.Stack;

public class PreorderTraversal {

	public static void main(String[] args) {
		
		//Construct a binary tree given in a question
		Binary_Tree bt = new Binary_Tree();
		Binary_Tree.TreeNode root = new Binary_Tree.TreeNode(1);
		
		bt.root = root;
		bt.root.left = new Binary_Tree.TreeNode(2);
		bt.root.left.left = new Binary_Tree.TreeNode(3);
		bt.root.left.right = new Binary_Tree.TreeNode(4);
		
		bt.root.right = new Binary_Tree.TreeNode(5);
		bt.root.right.right= new Binary_Tree.TreeNode(6);
		
		//Printing the nodes in recursive preorder traversal algorithm
		System.out.print("Preorder Traversal Using Recursion : ");
		bt.preorder();
		System.out.println(" ");
		
		
		//Traversing bianry tree in preorder without using recursion
		System.out.print("Preorder Traversal Without Using Recursion : ");
		bt.preOrderWithoutRecursion();
		System.out.println(" ");

	}

}
class Binary_Tree{
	
	static class TreeNode{
		int data;
		TreeNode left ;
		TreeNode right ;
		
		public TreeNode(int value)
		{
			data = value;
			left = null ;
			right = null;
		}
		
		boolean isLeaf(){
			
			return left == null ? right == null : false ;
			
		}
		
	}
	
	//root of binary tree
	TreeNode root;
	
	//Java method to print the tree nodes in preorder traversal
	public void preorder()
	{
		preOrderWithRecursion(root);
	}

	private void preOrderWithRecursion(TreeNode node) {
		
		if(node == null){
			return;
		}
		System.out.print(node.data + " ");
		preOrderWithRecursion(node.left);
		preOrderWithRecursion(node.right);
		
		
	}
	
	//java method to traverse tree using iterative approach without recursion using explicit stack
	public void preOrderWithoutRecursion(){
		Stack<TreeNode> nodes = new Stack<>();
		nodes.push(root);
		
		while(!nodes.isEmpty()){
			TreeNode current = nodes.pop();
			System.out.print(current.data + " ");
			
			if(current.right != null){
				nodes.push(current.right);
			}
			
			if(current.left != null){
				nodes.push(current.left);	
			}
		}
	}	
}
