/**
 * Java program to find middle element of linked list in one pass.
 * In order to find middle element of a linked list
 * we need to find the length first but since we can only
 * traverse linked list one time, we will have to use two pointers
 * one which we will increment on each iteration while 
 * other which will be incremented every second iteration.
 * So when the first pointer will point to the end of a
 * linked list, second will be pointing to the middle
 * element of a linked list
 *
 * @author Punam Jasud 
 * Date - 15/5/20
 */

package LinkedList;

public class FindMiddleElementInOnePass {

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
	
	private void findMiddle() {
		Node slow_ptr = head;
		Node fast_ptr  = head;
		
		if(head != null)
		{
			while(fast_ptr != null && fast_ptr.next != null)
			{
				slow_ptr = slow_ptr.next;
				fast_ptr = fast_ptr.next.next;
			}
			System.out.println("Middle Element : " + slow_ptr.data + "\n");
		}
		
	}
	
	public static void main(String[] args) {
		FindMiddleElementInOnePass llist = new FindMiddleElementInOnePass();
		//Initialize Linked List Value
		for(int i = 5 ; i >= 1; i--)
		{
			llist.insert(i);
			llist.display();
			llist.findMiddle();
		}
		

	}
	
}
