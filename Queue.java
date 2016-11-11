
public class Queue {
	Node rear,front;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void enqueue(int d){
		Node t = new Node(d);
		if(front==null){
			rear=front=t;
		}
		else{
			rear.next = t;
			rear = t;
		}
	}
	public Node dequeue(){
	  	Node t;
	  	if(front!=null)
	  	{
	  		t = front;
	  		front = front.next;
	  		return t;
	  	}
	  	else
	  		return null;
	  	
	}
	public boolean isEmpty()
	{
		boolean t = (front==null)? true : false;
		return t;
	}

	public static void main(String[] args){
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println("dequeued elements: ");
		while(q.isEmpty()!=true){
			System.out.print(q.dequeue().data + " ");
		}
	}
}
