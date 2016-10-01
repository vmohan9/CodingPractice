
public class DoubleLinkList {

	Node head;
	
	static class Node{
		int data;
		Node next,prev;
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	
	public void push(int d){
		Node temp = new Node(d);
		if(head==null){
			head = temp;
		}
		else{
			head.prev = temp;
			temp.next = head;
			head = temp;
		}
	}
	
	public void append(int d){
		Node t = new Node(d);
		if(head == null){
			head = t;
		}
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = t;
			t.prev = temp;
		}
	}
	
	public void insertAfter(Node a,int d){
		Node t = new Node(d);
		if(head == null){
			head = t;
		}
		else{
			Node temp = head;
			while(temp!=a && temp.next!=null){
				temp = temp.next;
			}
			if(temp.next==null){
				temp.next = t;
				t.prev = temp;
			}
			else{
				Node te = temp.next;
				temp.next = t;
				t.prev = temp;
				t.next = te;
				te.prev = t;
			}
		}
	}
	
	public void insertBefore(Node a,int d){
		Node t = new Node(d);
		if(head == null) head = t;
		else{
			Node temp = head,p=null;
			while(temp!=a && temp.next!=null){
				p = temp;
				temp = temp.next;
			}
			p.next = t;
			t.prev = p;
			t.next = temp;
			temp.prev = t;
		}
	}
	public void deleteNode(Node del){
		Node t = head;
		if(head==null || del == null)
			return;
		if(del==head){
			head = head.next;
			head.prev = null;
		}
		else if(del.next==null)
		{
			del.prev.next = del.next;
		}
		else{
			del.prev.next = del.next;
			del.next.prev = del.prev;
		}
	}
	
	public void reverse(){
		Node temp = null, cur = head;
		while(cur!=null){
			temp = cur.prev;
			cur.prev = cur.next;
			cur.next = temp;
			cur = cur.prev;
		}
		if(temp!=null){
			head = temp.prev;
		}
	}
	public void printList(){
		Node t = head;
		while(t!=null){
			System.out.print(t.data+" ");
			t = t.next;
		}
	}

	public static void main(String[] args) {
		DoubleLinkList ll = new DoubleLinkList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.append(40);
		ll.insertAfter(ll.head.next.next,15);
		ll.insertBefore(ll.head.next.next, 23);
		System.out.println("List: ");
		ll.printList();
		ll.deleteNode(ll.head.next.next.next);
		System.out.println("\nUpdated List: ");
		ll.printList();
		ll.reverse();
		System.out.println("\nReversed List: ");
		ll.printList();
	}

}
