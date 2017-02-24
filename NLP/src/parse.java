import java.util.Stack;

public class parse {

	
	public static void main(String[] args) {
		Stack<Character> ps = new Stack<Character>();
		Stack<Character> ss = new Stack<Character>();
		//List<String> list = new ArrayList<String>();=
		args= new String[]{"(S (NP (NNP James)) (VP (VBZ is) (NP (NP (DT a)(NN boy)) "+
			"(VP (VBG eating) (NP (NNS sausages))))))"};
		char[] toArray = args[0].toCharArray();
		for (char c : toArray) {
			if(c =='('){
				ps.push('(');
			}else if(c ==')'){
				ps.pop();
				StringBuilder sb = new StringBuilder();
				while(!ss.isEmpty()){
					char s = ss.pop();
					if(s == ' ')
					{//reverse expected
						char[] a = sb.toString().toCharArray();
						for (int i = sb.length()-1; i >=0; i--) 
						{
							System.out.print(a[i]);
						}
						System.out.print(" ");
						ss.clear();
						break;
					}else{
						sb.append(s);
					}
				}
			}else{
				ss.push(c);
			}			
		}
	}
}
