package Tree;

public class BinarySearchTree {
	
	static class Node{
		int data ;
		Node left ;
		Node right ;
		
		public Node(int x)
		{
			data = x;
			left = null ;
			right = null; 	
		}
	}
	
	//Root Node of BST
	Node root;
	
	//Constructor
	public BinarySearchTree() {
		 root = null ;
	}
	
	//This method mainly calls insertRec()
	void insert(int data)
	{
		root = insertRec(root,data);
	}
	
	//A recursive function to insert a new key in BST
	public Node insertRec(Node root, int data) {
		
		//If the tree is empty return new Node
		if(root == null)
		{
			root = new Node(data);
			return root;
			
		}
		//otherwise , recur down the tree
		if(data < root.data)
			root.left = insertRec(root.left,data);
		else if(data > root.data)
			root.right = insertRec(root.right,data);
		
		/* return the (unchanged) node pointer */
		return root;
	}

	void searchRec(int data)
	{
		root = search(root, data);
		if (root != null)
			System.out.println(root.data + " Found");
		else
			System.out.println(data + " Not Found");
	}
	
	public Node search(Node root , int data)
	{
		//Base cases : root is null or data is present at root
		if(root == null || root.data == data)
			return root;
		
		//data is smaller than root's data
		if(data < root.data)
			return search(root.left, data);
		else 
			return search(root.right, data);
	}
	
	void inorder()
	{
		inorderRec(root);
	}
	
	private void inorderRec(Node root) {
		
		if(root != null)
		{ 
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
		
	}
	
	// This method mainly calls deleteRec() 
	void deleteKey(int key)
	{
		root = deleteRec(root,key);
	}

	//Recursive Function to delete a Key in BST
	private Node deleteRec(Node root, int data) {
		
		//Base case : If root is null or Tree is Empty , Return root
		if(root == null)
			return root;
		//Otherwise , Recur Down the tree
		if(data < root.data)
			root.left = deleteRec(root.left, data);
		else if(data > root.data)
			root.right = deleteRec(root.right, data);
			
		else //Item to be deleted is found
		{
			//No children
			if(root.left == null && root.right == null)
			{
				root = null ;
				return null;
			}
			
			//One Child
			else if(root.left == null || root.right == null)
			{
				Node temp ;
				if(root.left == null)
					temp = root.right;
				else
					temp = root.left;
					
				
				root = null;
				return temp;
			}
			
			//Two Child
			else
			{
				//Get inorder succesor - smallest in the right subtree
				Node temp = findMinimum(root.right);
				root.data = temp.data;
				root.right = deleteRec(root.right, temp.data);
			}
			
		}
		
		return root;
	}
	
	//method to find minimum value in the right subtree
	private Node findMinimum(Node root) {
		if(root == null)
			return null;
		else if(root.left != null)
			return findMinimum(root.left);
		
		return root;
	}

	public static void main(String[] args) {
	
		 BinarySearchTree tree = new BinarySearchTree();
		 
		 /* Let us create following BST 
		         50 
		      /     \ 
		     30      70 
		    /  \    /  \ 
		  20   40  60   80 
		  
		  */
		 
		   tree.insert(50); 
		   tree.insert(30); 
		   tree.insert(20); 
		   tree.insert(40); 
		   tree.insert(70); 
		   tree.insert(60); 
		   tree.insert(80); 
		   
		// print inorder traversal of the BST
		   System.out.print("Inorder : ");
	       tree.inorder();
	       
	       System.out.println(" ");
	       
	      //Search in BST
	       System.out.print("Search : ");
	       tree.searchRec(50);
	       
	       System.out.println(" ");
	       System.out.println("Delete 20 : ");
	       tree.deleteKey(20);
	       
	       System.out.println("Inorder traversal of the modified tree"); 
	       tree.inorder(); 
	       
	       System.out.println("\n\nDelete 30"); 
	        tree.deleteKey(30); 
	        System.out.println("Inorder traversal of the modified tree"); 
	        tree.inorder(); 
	  
	        System.out.println("\n\nDelete 50"); 
	        tree.deleteKey(50); 
	        System.out.println("Inorder traversal of the modified tree"); 
	        tree.inorder(); 
	       
	       
		
	}

}
