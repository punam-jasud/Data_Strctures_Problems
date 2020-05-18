package LinkedList;

public class FindLengthOfLinkedList {

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
	
	private  void findLength() {
		
		Node temp = head;
		int count = 0;
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		System.out.println("\nLength of List : " + count);
		
	}
	
	private int findLengthRecursion(Node head) {
		
		if(head == null) //base case
		{
			return 0;
		}
		return 1 + findLengthRecursion(head.next);
		
	}
	
	public static void main(String[] args) {
		FindLengthOfLinkedList list = new FindLengthOfLinkedList();
		list.insert(10);
		list.insert(12);
		list.insert(11);
		list.insert(11);
		list.insert(12);
		list.insert(11);
		list.insert(10);
		
		
		System.out.println("Given Linked List : ");
		list.display();
		
		list.findLength();
		int len = list.findLengthRecursion(head);
		System.out.println("\nLength of List using Recursive Approach : " + len);
		
	}
	
}
