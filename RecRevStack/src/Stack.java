
public class Stack {
	private int maxSize;
	private int top;
	private long[] arr;
	public Stack(int s){
		maxSize = s;
		top = -1;
		arr = new long[s];
	}
	public void push(long s){
		if(isFull()){
			System.out.println("Stack full");
			return;
		}
		arr[++top]=s;
	}
	public long pop(){
		if(isEmpty()){
			System.out.println("Stack empty");
			return -1;
		}
		return arr[top--];
	}
	public long peek(){
		return arr[top];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull(){
		return (top==maxSize-1);
	}
	
	public void insertAtBottom(long temp){
		if(isEmpty())
			push(temp);
		else{
			long cur = pop();
			insertAtBottom(temp);
			push(cur);
		}
	}
	public void reverse(){
		if(!isEmpty()){
			long temp = pop();
			reverse();
			//insertAtBottom(temp);
			sort(temp);
		}
	}
	public void sort(long temp){
		if(isEmpty() || temp>peek())
			push(temp);
		else
		{
			long cur = pop();
			sort(temp);
			push(cur);
		}
	}
	public static void main(String[] args) {
		int ar[] = {11, 13, 21, 3};
		Stack st = new Stack(ar.length);
		for(int i=0;i<ar.length;i++)
			st.push(ar[i]);
		st.reverse();
		for(int i=0;i<ar.length;i++)
			System.out.println(st.pop());
	}

}
