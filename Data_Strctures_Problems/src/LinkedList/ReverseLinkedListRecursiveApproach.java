package LinkedList;

public class ReverseLinkedListRecursiveApproach {

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
		
		private void display(Node head) {
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
		
		private Node reverseList(Node curr) {
			
			if(curr == null)
			{
				return null;
			}
			else if(curr.next == null)
			{
				return curr;
			}
			else
			{
				Node newHead = reverseList(curr.next);
				curr.next.next = curr;
				curr.next = null;
				return newHead;
			}
		}
		
		public static void main(String[] args) {
			ReverseLinkedListRecursiveApproach llist = new ReverseLinkedListRecursiveApproach();
			//Initialize Linked List Value
			for(int i = 5 ; i >= 1; i--)
			{
				llist.insert(i);
				llist.display(head);
				
			}
			System.out.println(" ");
			System.out.println("Reverse Linked List : \n");
			Node newHead = llist.reverseList(head);
			llist.display(newHead);
			

		}
}
