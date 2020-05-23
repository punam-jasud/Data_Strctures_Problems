//https://www.codesdope.com/blog/article/binary-tree-in-java-traversals-finding-height-of-n/
package Tree;

class Node{
	
	private String data;
	private Node left;
	private Node right;
	
	public Node(String element)
	{
		data = element;
		left = null;
		right = null;
	}
	
	public void setRightChild(Node n) 	 	
	{
		right = n;
	}
	public void setLeftChild(Node n) 	 	
	{
		left = n;
	}
	public Node getRightChild()
	{
		return right;
	}
	public Node getLeftChild()
	{
		return left;
	}
	public String getData()
	{
		return data;
	}
}


public class BinaryTree {
	
	//method for preorder traversal
	public static void preorder(Node root)
	{
		if(root != null)   //checking if root is not equal to null
		{
			System.out.print(" "+root.getData()+" ");  //Printing data at root
			preorder(root.getLeftChild());  //Visiting left Child
			preorder(root.getRightChild());  //Visiting right Child
		}
	}
	
	//method for inorder traversal
		public static void inorder(Node root)
		{
			if(root != null)   //checking if root is not equal to null
			{
				
				inorder(root.getLeftChild());  //Visiting left Child
				System.out.print(" "+root.getData()+" ");  //Printing data at root
				inorder(root.getRightChild());  //Visiting right Child
			}
		}
			
		
	//method for postorder traversal
	public static void postorder(Node root) {
		
		if(root != null)   //checking if root is not equal to null
		{
			postorder(root.getLeftChild());  //Visiting left Child
			postorder(root.getRightChild());  //Visiting right Child
			System.out.print(" "+root.getData()+" ");  //Printing data at root
			
		}
		
	}
	
	//method to check if node is leaf or not
	public static boolean isLeaf(Node n)
	{
		if(n.getLeftChild() ==  null && n.getRightChild() == null)
			return true ;
		return false;
	}
	
	//Function to return maximum of two numbers
	public static int getMax(int a , int b)
	{
		return (a > b ) ? a : b ;
	}
	
	//Function to get height of tree or node
	public static int getHeight(Node n)
	{
		if(n == null || isLeaf(n))   // height will be 0 if the node is leaf or null
			return 0;
		//height of a node will be 1+ greater among height of right subtree and height of left subtree
		return (getMax(getHeight(n.getLeftChild()),getHeight(n.getLeftChild())) + 1 );
	}
	
	public static void main(String[] args) {
	
		Node root = new Node("D");     //root
	
		root.setLeftChild(new Node("A")); //left child of root
		root.setRightChild(new Node("F")); //right child of root
		
		root.getLeftChild().setLeftChild(new Node("E"));
		root.getLeftChild().setRightChild(new Node("B"));

		System.out.print("Preorder :");
		preorder(root);
		
		System.out.println(" ");
		
		System.out.print("Inorder :");
		inorder(root);
		
		System.out.println(" ");
		
		System.out.print("Postorder :");
		postorder(root);
		
		System.out.println(" ");
		System.out.println("Height of Tree : " + getHeight(root));
		
	}

}
