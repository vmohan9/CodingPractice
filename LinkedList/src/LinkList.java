
public class LinkList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next = null;
		}
	}
	public void push(int data){
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	public void insertAfter(Node prev,int data){
		Node temp = new Node(data);
		if(prev==null){
			System.out.println("Error");
			return;
		}
		temp.next = prev.next;
		prev.next = temp;
	}
	
	public void append(int data){
		Node temp = new Node(data);
		if(head==null){
			head = new Node(data);
			return;
		}
		Node last = head;
		while(last.next!=null){
			last = last.next;
		}
		last.next = temp;
	}
	
	void delete(int key){
		Node temp = head, prev = null;
		if(temp!=null && temp.data == key){
			head = head.next;
			return;
		}
		while(temp!=null && temp.data!=key){
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)
				return;
		prev.next = temp.next;
	}
	
	public void deletePos(int pos){
		if(head == null) return;
		if(pos==0){
			head=head.next;
			return;
		}
		int i = 0; Node temp = head,prev=null;
		while(i<pos && temp!=null){
			prev = temp;
			temp=temp.next;
			i++;
		}
		if(temp!=null)
		prev.next = temp.next;
	}
	void printList(){
		Node n = head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public int getCountIt()
	{
		Node temp = head;
		int count = 0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public int getCountRec(Node temp)
	{
		if(temp==null)return 0;
		else
			return 1+getCountRec(temp.next);
	}
	
	public void swapNodes(int x,int y){
		if(x==y)return;
		Node temp1 = head, prev1 = null,temp2=head,prev2=null;
		while(temp1!=null && temp1.data!=x){
			prev1 = temp1;
			temp1 = temp1.next;
		}
		while(temp2!=null && temp2.data!=y){
			prev2 = temp2;
			temp2 = temp2.next;
		}
		if(temp1==null||temp2==null)return;
		if(prev1!=null){
			prev1.next = temp2;
		}
		else{
			head=temp2;
		}
		if(prev2!=null){
			prev2.next = temp1;
		}
		else{
			head=temp1;
		}
		Node t = temp1.next;
		temp1.next=temp2.next;
		temp2.next=t;
		
		
		/*while(temp1!=null){
			if(temp1.data==x || temp1.data==y){
				temp2 = temp1.next;
				while(temp2!=null){
					if(temp2.data==x || temp2.data==y){
						prev.next=temp2;
						Node t = temp1.next;
						temp1.next=temp2.next;
						temp2.next=t;
						t.next=temp1;
						break;
					}
					else
					{
						temp2=temp2.next;
					}
				}
				break;
			}
			else{
			prev = temp1;
			temp1=temp1.next;}
		}*/
	}
	public Node reverse(){
		Node curr = head,prev=null,next=null,node=null;
		while(curr!=null){
			next=curr.next;
			curr.next = prev;
			prev = curr;
            curr = next;
        }
        node = prev;
        return node;
	}
	
	public Node sortListrec(Node a,Node b){
		Node res=null;
		if(a==null){
			return b;
		}
		if(b==null){
			return a;
		}
		if(a.data<=b.data){
			res = a;
			res.next = sortListrec(a.next,b);
		}
		else{
			res = b;
			res.next = sortListrec(a,b.next);
		}
		return res;
	}
	
	public Node sortList(Node a,Node b){
		Node head = new Node(0);
		Node p = head;
		while(a!=null || b!=null){
			if(a!=null && b!=null){
				if(a.data<=b.data){
					p.next = a;
					a = a.next;
				}
				else{
					p.next = b;
					b = b.next;
				}
				p=p.next;
			}
			else if(a==null){
				p.next = b;
				break;
			}
			else {
				p.next = a;
				break;
			}
		}
		return head.next;
	}
	
	public Node reverseByK(Node head,int k){
		Node cur = head, prev = null, next = null;
		int count = 0;
		while(count<k && cur!=null){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
			count++;
		}
		if(next!=null){
			head.next = reverseByK(cur,k);
		}
		return prev;
	}
	
	public Node add(Node first,Node sec){
		int carry=0,sum;
		Node res=null,prev=null;
		while(first!=null || sec!=null){
			sum = carry + (first!=null?first.data:0)+ (sec!=null?sec.data:0);
			carry = (sum>=10?1:0);
			sum = sum%10;
			Node t = new Node(sum);
			if(res==null){
				res = t;
				prev = res;
			}
			else{
				prev.next = t;
				prev = prev.next;
			}
			if(first!=null)first=first.next;
			if(sec!=null)sec = sec.next;
			if(carry>0){
				Node temp = new Node(carry);
				prev.next = temp;
			}
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList llist = new LinkList();LinkList llist1=new LinkList();
		 // Insert 6.  So linked list becomes 6->NUllist
        llist.append(1);
 
        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.append(4);
 
        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.append(6);
 
        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(7);
        llist.append(8);
        
        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        //llist.insertAfter(llist.head.next, 8);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
        llist1.append(2);
        
        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist1.append(3);
 
        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist1.append(5);
 
        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist1.append(9);
        System.out.println("\nCreated Linked list is: ");
        llist1.printList();
        System.out.println("\nUpdated Linked list is: ");//+llist.getCountRec(llist.head));
        //llist.getCountIt();
        //llist.swapNodes(7, 6);
      // llist.head = llist.reverse();
       //Node res = llist.sortList(llist.head,llist1.head);
       //LinkList llist2 = new LinkList();llist2.head = res;
        Node res = llist.add(llist.head,llist1.head);
        LinkList llist2 = new LinkList();llist2.head = res;
		llist2.printList();
	}

}
