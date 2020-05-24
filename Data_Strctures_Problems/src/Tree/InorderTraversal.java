/*  Java Program to traverse a binary tree using InOrder traversal.
 * In InOrder traversal first left node is visited , followed by root and right node. 
 * input: 
 *   	 4
 *  	/ \ 
 *    2 	5 
 *   / \ 	\ 
 *  1   3 	 6 
  
 output: 1 2 3 4 5 6 */


package Tree;

import java.util.Stack;

public class InorderTraversal {

	public static void main(String[] args) {
		
		//Construct a binary tree given in a question
		Binary_Tree_Inorder bt = new Binary_Tree_Inorder();
		Binary_Tree_Inorder.TreeNode root = new Binary_Tree_Inorder.TreeNode(4);
		
		bt.root = root;
		bt.root.left = new Binary_Tree_Inorder.TreeNode(2);
		bt.root.left.left = new Binary_Tree_Inorder.TreeNode(1);
		bt.root.left.right = new Binary_Tree_Inorder.TreeNode(3);
		
		bt.root.right = new Binary_Tree_Inorder.TreeNode(5);
		bt.root.right.right= new Binary_Tree_Inorder.TreeNode(6);
		
		//Printing the nodes in recursive inorder traversal algorithm
		System.out.print("Inorder Traversal Using Recursion : ");
		bt.inorder();
		System.out.println(" ");
		
		
		//Traversing bianry tree in inorder without using recursion
		System.out.print("Inorder Traversal Without Using Recursion : ");
		bt.inOrderWithoutRecursion();
		System.out.println(" ");

	}

}
class Binary_Tree_Inorder{
	
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
	
	//Java method to print the tree nodes in inorder traversal
	public void inorder()
	{
		inOrderWithRecursion(root);
	}

	private void inOrderWithRecursion(TreeNode node) {
		
		if(node == null){
			return;
		}
		inOrderWithRecursion(node.left);
		System.out.print(node.data + " ");
		inOrderWithRecursion(node.right);
		
		
	}
	
	//java method to traverse tree using iterative approach without recursion using explicit stack
	public void inOrderWithoutRecursion(){
		Stack<TreeNode> nodes = new Stack<>();
		TreeNode current = root;
		
		while(!nodes.isEmpty() || current != null){
			
			if(current != null){
				nodes.push(current);
				current = current.left;
			}
			else{
				current = nodes.pop();
				System.out.print(current.data + " ");
				current = current.right;
				
			}
			
		}
		
	}
}
