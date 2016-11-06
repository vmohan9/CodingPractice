import java.util.*;
public class Compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input:");
		String input = in.next(); int j=0,flag=0,i;
		StringBuilder res = new StringBuilder();
		if(input.length()<=0)
			System.out.println("Empty string");
		else if(input.length()==1)
			System.out.println(1+input);
		else{
			for(i=1;i<input.length();i++)
			{
				if((input.charAt(i)==input.charAt(i-1))&& flag==0){
					flag = 1;
					//j = i-1;
				}
				if(input.charAt(i)!=input.charAt(i-1)){
					//System.out.println(input.charAt(i-1));
					res.append(i-j);res.append(input.charAt(i-1));
					flag = 0;
					j=i;
				}
			}
			res.append(i-j);res.append(input.charAt(i-1));
			System.out.println(res.toString());
		}
	
	}

}
