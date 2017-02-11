
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
	public void nge(int[] ar){
		push(ar[0]);long el,next;
		for(int i=1;i<ar.length;i++){
			next = ar[i];
			if(!isEmpty()){
				el = pop();
				while(el<next){
					System.out.println(el+" ---> "+next);
					if(isEmpty())break;
					el = pop();
				}
				if(el>next)
					push(el);
			}
			push(next);
		}
		while(!isEmpty())
			System.out.println(pop()+" ---> -1");
	}
	public static void main(String[] args) {
		int ar[] = {11, 13, 21, 3};
		Stack st = new Stack(ar.length);
		st.nge(ar);
	}

}
