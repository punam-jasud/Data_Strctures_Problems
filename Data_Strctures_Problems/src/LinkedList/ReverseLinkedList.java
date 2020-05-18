package LinkedList;

public class ReverseLinkedList {

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
		
		private void reverseList() {
			
			Node prevNode = null;
			Node nextNode = null;
			Node currentNode = head;
			
			while(currentNode != null)
			{
				nextNode = currentNode.next;
				currentNode.next = prevNode;
				prevNode = currentNode;
				currentNode = nextNode;
				
			}
			head = prevNode;
			
		}
		
		public static void main(String[] args) {
			ReverseLinkedList llist = new ReverseLinkedList();
			//Initialize Linked List Value
			for(int i = 5 ; i >= 1; i--)
			{
				llist.insert(i);
				llist.display();
				
			}
			System.out.println(" ");
			System.out.println("Reverse Linked List : \n");
			llist.reverseList();
			llist.display();
			

		}
}
