package LinkedList;

public class FindStartNodeOfLoop {
	
	Node head ;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	private void display() {
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(" ");
	}
	private void insert(Node node) {
		if(head == null)
		{
			head = node;
			return;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = node;
		}
		
	}
	
	private boolean detectLoop() {
		Node slow_ptr = head;
		Node fast_ptr  = head;
		
		while(fast_ptr != null && fast_ptr.next != null)
		{
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
					
			if(slow_ptr == fast_ptr)
			{
				return true;
			}
		}
		return false;
				
	}
	
	private Node findStartNodeofLoop() {
		
		Node slow_ptr = head;
		Node fast_ptr  = head;
		boolean loopExists = false;
		
		while(fast_ptr != null && fast_ptr.next != null)
		{
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
					
			if(slow_ptr == fast_ptr)
			{
				loopExists = true;
				break;
			}
		}
		if(loopExists)
		{
			slow_ptr = head;
			while(slow_ptr != fast_ptr)
			{
				slow_ptr = slow_ptr.next;
				fast_ptr = fast_ptr.next;
			}
		}
		else
		{
			System.out.println("Loop does not Exists");
			slow_ptr = null;
		}
		return slow_ptr;
	}
	
	public static void main(String[] args) {
		FindStartNodeOfLoop llist = new FindStartNodeOfLoop();
		
		//Create a Linked List Without Loop
		
		llist.insert(new Node(5));
		llist.insert(new Node(6));
		llist.insert(new Node(7));
		llist.insert(new Node(1));
		llist.insert(new Node(2));
		
		llist.display();
		
		//Test if loop existed
		System.out.println("Loop Existed --> " + llist.detectLoop());
		
		System.out.println(" ");
		
		//Create a Linked List With Loop
		
		FindStartNodeOfLoop llist1 = new FindStartNodeOfLoop();
		Node loopNode = new Node(7);
		
		llist1 .insert(new Node(5));
		llist1.insert(new Node(6));
		llist1.insert(loopNode);
		llist1.insert(new Node(1));
		llist1.insert(new Node(2));
		
		llist1.display();
		
		//Create a loop
		llist1.insert(loopNode);
		
		//Test if loop existed
		System.out.println("Loop Existed --> " + llist1.detectLoop());;
		
	
		//Display First node if loop exists
		Node startNode = llist1.findStartNodeofLoop()	;
		
		if(startNode != null)
			System.out.println("Start Node of loop is : " + startNode.data);
		
	}

}
