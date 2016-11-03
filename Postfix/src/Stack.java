
public class Stack {
	private int maxSize;
	private int top;
	private int[] arr;
	public Stack(int s){
		maxSize = s;
		top = -1;
		arr = new int[s];
	}
	public void push(int s){
		if(isFull()){
			System.out.println("Stack full");
			return;
		}
		arr[++top]=s;
	}
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack empty");
		}
		return arr[top--];
	}
	public int peek(){
		return arr[top];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull(){
		return (top==maxSize-1);
	}
	boolean isOperand(char a){
	 return ((a>='a'&&a<='z') || (a>='A'&&a<='Z'));	
	}
	int prec(char ch){
		switch(ch){
		case '+':
		case '-': return 1;
		case '*':
		case '/': return 2;
		case '^': return 3;
		}
		return -1;
	}
	/*public int infixToPostfix(String s){
		char[] exp = s.toCharArray();int i,j;
		StringBuilder op = new StringBuilder("");
		if(arr==null)return -1;
		for(i=0,j=-1;i<s.length();i++){
			if(isOperand(exp[i]))
				op.append(exp[i]);
			else if(exp[i]=='(')
				push(exp[i]);
			else if(exp[i]==')')
				{
					
					while(peek()!='(' && !isEmpty()){
						op.append(pop());
					}
					if(isEmpty()) return -1;
					pop();
				}
				
			else{
				while(!isEmpty() && prec(exp[i])<=prec(peek()))
				{
					op.append(pop());
				}	
				push(exp[i]);
			}
		}
		
		while(!isEmpty())
			op.append(pop());
		System.out.println(op);
		return 0;
		
	}
	*/
	public void eval(String s){
		char[] e = s.toCharArray();
		for(int i=0;i<s.length();i++){
			System.out.println(e[i]);
			
			if(Character.getNumericValue(e[i])>=0 && Character.getNumericValue(e[i])<=9){
				
				System.out.println("match");
				push(Character.getNumericValue(e[i]));
				
			}
				
			else
			{
				int a = pop(); int b = pop();
				System.out.println("a & b "+a+" "+b);
				switch(e[i]){
				case '+' : System.out.println("value:"+(a+b));push((a+b));break;
				case '-' : System.out.println("value:"+(a-b));push((a-b));break;
				case '*' : System.out.println("value:"+(a*b));push((a*b));break;
				case '/' : System.out.println("value:"+(a/b));push((a/b));break;
				}
			}
		}
		System.out.println(pop());
	}
	public static void main(String[] args) {
		String s = "a+b*(c^d-e)^(f+g*h)-i";
		String exp = "231*+9-";
		Stack st = new Stack(exp.length());
		st.eval(exp);
	    //st.infixToPostfix(s);
		}
	}


