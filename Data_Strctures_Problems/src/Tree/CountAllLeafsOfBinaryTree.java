/* 
 * Java Program to count all leaf nodes of given binary tree.
 * This program demonstrates both recursive and iterative solution 
 * of this problem. 
 *  input : 
 *  	 50
 *   	/ \ 
 *   25     65 
 *  / \ 	/ \
 * 10 34   43  78
 *  
 *output: 4
 */

package Tree;

import java.util.Stack;

public class CountAllLeafsOfBinaryTree {

	public static void main(String[] args) {
	
		//Let's create a binary tree
		TreeNode  n10 = new TreeNode(10);
		TreeNode  n34 = new TreeNode(34);
		TreeNode  n43 = new TreeNode(43);
		TreeNode  n78 = new TreeNode(78);
		
		TreeNode  n25 = new TreeNode(25,n10,n34);
		TreeNode  n65 = new TreeNode(65,n43,n78);
		TreeNode  root = new TreeNode(25,n25,n65);
		
		//Count all nodes of binary tree using recursion
		System.out.print("Counting All Nodes of Binary Tree Using Recursion : " + countLeafNodes(root));
		System.out.println(" ");
		
		System.out.print("Counting All Nodes of Binary Tree Using Iteration Using Stack : " + countLeafsIteratively(root));
		System.out.println(" ");
	}
	
	private static class TreeNode{
		
		@SuppressWarnings("unused")
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int value){
			this.data = value;
		}
		TreeNode(int value , TreeNode left , TreeNode right){
			
			this.data = value;
			this.left = left;
			this.right = right;
		}
	}
	
	//Java Method to count leaf nodes using recursion	
	public static int countLeafNodes(TreeNode node){
		
		//base casse
		if(node == null){
			return 0;
		}
		if(node.left == null && node.right == null){
			return 1;
		}
		else{
			return countLeafNodes(node.left) + countLeafNodes(node.right);
		}
		
	}
	
	//Java method to count leaf nodes using iteration
	public static int countLeafsIteratively(TreeNode root){
		
		if(root == null){
			return 0;
		}
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		int count = 0 ; 
		
		while(!s.isEmpty()){
			TreeNode node = s.pop();
			
			if(node.right != null){
				s.add(node.right);
			}
			
			if(node.left != null){
				s.add(node.left);
			}
			
			if(node.left == null && node.right == null){
				count++;
			}
		}
		return count;
	}
}
