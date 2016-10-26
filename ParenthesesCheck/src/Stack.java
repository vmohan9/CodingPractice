import java.util.Scanner;

public class Stack {
	int maxSize,top;
	char[] arr;
	Stack(int s){
		maxSize = s;
		arr = new char[maxSize];
		top = -1;
	}
	public void push(char s){
		if(maxSize-1==top){
			System.out.println("stack full");
			return;
		}
		arr[++top]=s;
	}
	public Character pop(){
		if(top==-1){
			System.out.println("stack empty");
			return null;
		}
		return new Character(arr[top--]);
	}
	public Character peek(){
		if(top==-1){
			System.out.println("stack empty");
			return null;
		}
		return new Character(arr[top]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		Stack st = new Stack(s.length());
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
				st.push(s.charAt(i));
			else if(s.charAt(i)==')')
				if(st.peek()!='(')
				{
					System.out.println("Not balanced");
					System.exit(1);
				}
				else
					st.pop();
			else if(s.charAt(i)=='}')
				if(st.peek()!='{')
				{
					System.out.println("Not balanced");
					System.exit(1);
				}
				else
					st.pop();
			else if(s.charAt(i)==']')
				if(st.peek()!='[')
				{
					System.out.println("Not balanced");
					System.exit(1);
				}
				else
					st.pop();
		}
		if(st.top==-1)System.out.println("Balanced");
		else System.out.println("Not Balanced");
		sc.close();
	}

}
