package LinkedList;

public class DetectLoopInLinkedList {

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
		
		public static void main(String[] args) {
			DetectLoopInLinkedList llist = new DetectLoopInLinkedList();
			
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
			
			DetectLoopInLinkedList llist1 = new DetectLoopInLinkedList();
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
			System.out.println("Loop Existed --> " + llist1.detectLoop());
			
	}

}
