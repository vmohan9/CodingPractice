
public class Stack {
	int maxSize,top1,top2;
	int[] arr;
	Stack(int s){
		maxSize = s;
		arr = new int[maxSize];
		top1 = -1;
		top2 = maxSize;
	}
	public void push1(int c){
		if(top1<=top2-1){
			arr[++top1]=c;
		}
		else{
			System.out.println("Stack1 full");
		}
	}
	
	public void push2(int c){
		if(top1<top2-1){
			arr[--top2]=c;
		}
		else{
			System.out.println("Stack2 full");
		}
	}
	
	public Integer pop1(){
		if(top1==-1){
			System.out.println("Stack1 empty");
			return null;
		}
		return arr[top1--];
	}
	public Integer pop2(){
		if(top2==maxSize){
			System.out.println("Stack1 empty");
			return null;
		}
		return arr[top2++];
	}
	
	public static void main(String[] args) {
		Stack ts = new Stack(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                           " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                         " stack2 is " + ts.pop2());

	}

}
