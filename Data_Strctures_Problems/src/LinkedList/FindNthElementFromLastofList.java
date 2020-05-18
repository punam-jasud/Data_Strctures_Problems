package LinkedList;

public class FindNthElementFromLastofList {

static Node head ;
	
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
			System.out.print(" -> " + temp.data);
			temp = temp.next;
		}
		System.out.println(" -> NULL");
	}
	private void insert(int data) {
		Node node = new Node(data);
		if(head == null)
		{
			head = node;
			return;
		}
		node.next = head;
		head = node;
		
	}
	
	private Node findNthNode(Node head2, int n) {
	
		Node slow_ptr = head;
		Node fast_ptr = head;
		
		for (int i = 0; i < n; i++) {
			fast_ptr = fast_ptr.next;
		}
		while(fast_ptr != null)
		{
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next;
		}
		return slow_ptr;
	}
	
	
	public static void main(String[] args) {
		FindNthElementFromLastofList list = new FindNthElementFromLastofList();
		list.insert(10);
		list.insert(12);
		list.insert(11);
		list.insert(11);
		list.insert(12);
		list.insert(11);
		list.insert(10);
		
		System.out.println(" Given List : ");
		list.display();
		
		//Find 3rd Node from Last of Linked List
		Node nthNodeFromTail = list.findNthNode(head,3);
		System.out.println(" The 3rd Node from Tail of List : " + nthNodeFromTail.data);

	}
	
}
