/*  Java Program to traverse a binary tree using postOrder traversal.
 * In PostOrder traversal first left node is visited , followed right node and then root. 
 * input: 
 *   	 4
 *  	/ \ 
 *    2 	5 
 *   / \ 	 \ 
 *  1   3 	  6 
  
 output: 1 3 2 6 5 4 */			


package Tree;

import java.util.Stack;

public class PostorderTraversal {

	public static void main(String[] args) {
		
		//Construct a binary tree given in a question
		Binary_Tree_Postorder bt = new Binary_Tree_Postorder();
		Binary_Tree_Postorder.TreeNode root = new Binary_Tree_Postorder.TreeNode(4);
		
		bt.root = root;
		bt.root.left = new Binary_Tree_Postorder.TreeNode(2);
		bt.root.left.left = new Binary_Tree_Postorder.TreeNode(1);
		bt.root.left.right = new Binary_Tree_Postorder.TreeNode(3);
		
		bt.root.right = new Binary_Tree_Postorder.TreeNode(5);
		bt.root.right.right= new Binary_Tree_Postorder.TreeNode(6);
		
		//Printing the nodes in recursive postorder traversal algorithm
		System.out.print("Postorder Traversal Using Recursion : ");
		bt.postorder();
		System.out.println(" ");
		
		
		//Traversing bianry tree in postorder without using recursion - Two Stacks
		System.out.print("Postorder Traversal Without Using Recursion : ");
		bt.postOrderWithoutRecursion();
		System.out.println(" ");

		//Traversing bianry tree in postorder without using recursion - one Stack
		System.out.print("Postorder Traversal Without Using Recursion - 1 Stack: ");
		bt.postOrderWithoutRecursionOneStack();
		System.out.println(" ");

	}

}
class Binary_Tree_Postorder{
	
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
	
	//Java method to print the tree nodes in postorder traversal
	public void postorder()
	{
		postOrderWithRecursion(root);
	}

	private void postOrderWithRecursion(TreeNode node) {
		
		if(node == null){
			return;
		}
		postOrderWithRecursion(node.left);
		postOrderWithRecursion(node.right);
		System.out.print(node.data + " ");
		
	}
	
	//java method to traverse tree using iterative approach without recursion using explicit stack
	public void postOrderWithoutRecursion(){
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		
		//Push the root Node into the first stack
		s1.push(root);
		while(s1.empty() == false)
		{
			//Take out root and insert into second stack 
			TreeNode temp = s1.pop();
			s2.push(temp);
			
			//Now we have root , Push left and right child of root onto first stack
			if(temp.left != null)
				s1.push(temp.left);
			
			if(temp.right != null)
				s1.push(temp.right);
		}
		
		//once the all node are traversed, 
		//take out the nodes from second stack and print it
		while(s2.isEmpty() == false){
			TreeNode temp = s2.pop();
			System.out.print(temp.data + " ");
		}
	}
	public void postOrderWithoutRecursionOneStack(){
	
		Stack<TreeNode> nodes = new Stack<>();
		nodes.push(root);
		
		while(!nodes.isEmpty()){
			
			TreeNode current = 	nodes.peek();
			
			if(current.isLeaf()){
				
				TreeNode node = nodes.pop();
				System.out.printf("%s" , node.data + " ");
			}
			else{
				
				if(current.right != null)
				{
					nodes.push(current.right);
					current.right = null;
				}
				
				if(current.left != null)
				{
					nodes.push(current.left);
					current.left = null;
				}
			}	
		}		
	}
}
