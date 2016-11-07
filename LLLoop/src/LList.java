
public class LList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
		  data = d;
		  next = null;
		}
	}
	
	public void printList(){
		Node t = head;
		while(t!=null){
			System.out.print(t.data+" ");
			t = t.next;
		}
	}
	
	public int detectLoop(){
		Node fast = head,slow = head;
		while(slow!=null && fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow){
				removeLoop(slow,head);
				return 1;
			}
		}
		return 0;
	}
	
	public void removeLoop(Node meet,Node head){
		Node ptr1=head,ptr2;
		while(1==1){
			ptr2 = meet;
			while(ptr2.next!=meet && ptr2.next!=ptr1){
				ptr2 = ptr2.next;
			}
			if(ptr2.next==ptr1)
				break;
			ptr1=ptr1.next;
		}
		ptr2.next = null;
	}
	
	public void detectRemoveLoop(){
		Node slow = head, fast = head.next;
		while(slow!=null && fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast){
				System.out.println("Loop detected");
				break;}
		}
		if(slow==fast){
			slow = head;
			System.out.println(slow.data+" "+fast.data);
			while(slow!=fast.next){
				
				slow = slow.next;
				fast = fast.next;
				
			}
			System.out.println("Loop detected again");
			fast.next = null;
			System.out.println("Linked List after removing loop : ");
			printList();
		}
	}
	
	public static void main(String[] args) {
		LList ll = new LList();
		ll.head = new Node(50);
		ll.head.next = new Node(20);
		ll.head.next.next = new Node(15);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(10);
        ll.head.next.next.next.next.next = ll.head.next.next;
        ll.detectRemoveLoop();
        
        //ll.printList();
        
	}

}
