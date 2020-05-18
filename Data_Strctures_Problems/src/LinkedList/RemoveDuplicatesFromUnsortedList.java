package LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedList {
	
	Node head = null;
	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
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
	
	private void removeDuplicate() {
		HashSet<Integer> set = new HashSet<>();
		
		Node currentNode = head;
		Node prevNode = null;
		
		while(currentNode != null)
		{	
			//If current value is seen before then delete the current node
			if(set.contains(currentNode.data))
			{
				prevNode.next = currentNode.next;
			}
			else
			{
				set.add(currentNode.data);
				prevNode = currentNode;
			}
			currentNode = currentNode.next;
		}
		
	}

	
	public static void main(String[] args) {
		
		RemoveDuplicatesFromUnsortedList list = new RemoveDuplicatesFromUnsortedList();
		list.insert(10);
		list.insert(12);
		list.insert(11);
		list.insert(11);
		list.insert(12);
		list.insert(11);
		list.insert(10);
		
		System.out.println("List Before Removing Duplicates : ");
		list.display();
		
		System.out.println("List After Removing Duplicates : ");
		list.removeDuplicate();
		list.display();

	}
	
}
