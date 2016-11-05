
public class CLL {
	
	Node head,head1,head2;
	
	public static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int data){
		Node temp = new Node(data);Node t;
		if(head==null){
			head = temp;
			head.next = head;
		}
		else
		{
			t = head;
			while(t.next!=head){
				t=t.next;
			}
			t.next = temp;
			temp.next = head;
			head = temp;
		}
	}
	
	public void split(){
		Node slow = head,fast = head;
		while(fast.next!=head && fast.next.next!=head){
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast.next.next==head){
			fast = fast.next;
		}
		head1 = head;
		if(head.next!=head){
		head2 = slow.next;
		fast.next = head2;
		}
		slow.next = head;
		
	}
	
	public void printList(Node h){
		Node temp=h;
		if(h == null) return;
		do {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}while(temp!=h);
	}
	
	public void sortInsert(int d){
		Node t=head,prev=head;
		Node in = new Node(d);
		if(t==null){
			head = in;
			head.next = head;
		}
		else if(d<=head.data){
			while(t.next!=head){
				t = t.next;
			}
			head = in;
			head.next = prev;
			t.next = head;
		}
		else{
			prev=head;
			while(t.next!=head && d>t.data){
				prev = t;
				t = t.next;
			}
			
			if(t.next==head){
				t.next = in;
				in.next = head;
			}
			else{
			prev.next = in;
			in.next = t;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLL ll = new CLL();
		//ll.push(2);
		//ll.push(3);
		//ll.push(4);
		//ll.push(5);
		//ll.push(6);
		ll.sortInsert(2);
		ll.sortInsert(5);
		ll.sortInsert(1);
		ll.sortInsert(7);
		ll.sortInsert(4);
		ll.sortInsert(9);
		System.out.println("List:");
		ll.printList(ll.head);
		//ll.split();
		//System.out.println("\nList1:");
		//ll.printList(ll.head1);
		//System.out.println("\nList2:");
		//ll.printList(ll.head2);
			
	}

}
