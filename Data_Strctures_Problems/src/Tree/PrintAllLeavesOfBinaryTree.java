/* 
 * Java Program to print all leaf nodes of given binary tree.
 * This program demonstrates both recursive and iterative solution 
 * of this problem. 
 *  input : 
 *  	 50
 *   	/ \ 
 *   25     65 
 *  / \ 	/ \
 * 10 34   43  78
 *  
 *output: 10 34 43 78
 */

package Tree;

import java.util.Stack;

public class PrintAllLeavesOfBinaryTree {

	public static void main(String[] args) {
	
		//Let's create a binary tree
		TreeNode  n10 = new TreeNode(10);
		TreeNode  n34 = new TreeNode(34);
		TreeNode  n43 = new TreeNode(43);
		TreeNode  n78 = new TreeNode(78);
		
		TreeNode  n25 = new TreeNode(25,n10,n34);
		TreeNode  n65 = new TreeNode(65,n43,n78);
		TreeNode  root = new TreeNode(25,n25,n65);
		
		//Print all nodes of binary tree using recursion
		System.out.print("Printing All Nodes of Binary Tree Using Recursion : ");
		printLeafNodes(root);
		System.out.println(" ");
		
		System.out.print("Printing All Nodes of Binary Tree Using Iteration Using Stack : ");
		printLeafsIteratively(root);
		System.out.println(" ");
	}
	
	private static class TreeNode{
		
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int value){
			data = value;
		}
		TreeNode(int value , TreeNode left , TreeNode right){
			
			data = value;
			this.left = left;
			this.right = right;
		}
	}
	
	//Java Method to print leaf nodes using recursion	
	public static void printLeafNodes(TreeNode node){
		
		//base casse
		if(node == null){
			return;
		}
		if(node.left == null && node.right == null){
			System.out.printf("%d " , node.data);
		}
		printLeafNodes(node.left);
		printLeafNodes(node.right);
		
	}
	
	//Java method to print leaf nodes using iteration
	public static void printLeafsIteratively(TreeNode root){
		
		if(root == null){
			return;
		}
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		
		while(!s.isEmpty()){
			TreeNode node = s.pop();
			
			if(node.right != null){
				s.add(node.right);
			}
			
			if(node.left != null){
				s.add(node.left);
			}
			
			if(node.left == null && node.right == null){
				System.out.printf("%d ",node.data);
			}
		}	
	}
}
